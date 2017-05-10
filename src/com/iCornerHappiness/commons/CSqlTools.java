package com.iCornerHappiness.commons;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by 025329 on 2015/9/25.
 */
public class CSqlTools {

    public static Integer getMaxField(Connection conn, CSqlView queryMaxView) throws CommonsException {
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        try {
            StringBuffer strSql = new StringBuffer();
            strSql.append(" SELECT MAX(" + queryMaxView.getQueryFields()[0] + ") AS " + queryMaxView.getQueryFields()[0]);
            strSql.append(" FROM ").append(queryMaxView.getTableName()).append(" WHERE 1=1 ");
            for (CSqlConditionView cSqlConditionView : queryMaxView.getWhereConditions()) {
                strSql.append(" AND ").append(cSqlConditionView.getSql());
            }
            stmt = conn.prepareStatement(strSql.toString());
            resultSet = stmt.executeQuery();
            if (resultSet.next()) {
               return resultSet.getInt(queryMaxView.getQueryFields()[0]);
            }

        } catch (SQLException e) {
            throw new CommonsException(e);
        } finally {
            CDBTools.close(stmt, resultSet);
        }
        return 0;

    }

    public static ArrayList selectList(Class listObjClass, Connection conn, CSqlView sqlQueryView) throws CommonsException {
        PreparedStatement stmt = null;
        ResultSet resultSet = null;
        ArrayList list = new ArrayList<CView>();
        try {
            StringBuffer strSql = new StringBuffer();
            if (sqlQueryView.isQueryAll()) {
                strSql.append(" SELECT * ");
            } else {
                strSql.append(" SELECT 1");
                for (String queryField : sqlQueryView.getQueryFields()) {
                    strSql.append(",").append(queryField);
                }
            }
            strSql.append(" FROM ").append(sqlQueryView.getTableName()).append(" WHERE 1=1 ");
            for (CSqlConditionView sqlConditionView : sqlQueryView.getWhereConditions()) {
                strSql.append(" AND ").append(sqlConditionView.getSql());
            }
            strSql.append(" ORDER BY NULL");
            for (CSqlOrderView sqlOrderView : sqlQueryView.getSqlOrderViews()) {
                strSql.append(",").append(sqlOrderView.getFieldName()).append(" ").append(sqlOrderView.getOrderType());
            }
            System.out.println("sql = " + strSql.toString());
            stmt = conn.prepareStatement(strSql.toString());
            resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                Method method = listObjClass.getDeclaredMethod("decodeResult", ResultSet.class);
                list.add(method.invoke(listObjClass.newInstance(), new Object[]{resultSet}));
            }

            return list;
        } catch (IllegalAccessException e) {
            throw new CommonsException(e);
        } catch (InstantiationException e) {
            throw new CommonsException(e);
        } catch (SQLException e) {
            throw new CommonsException(e);
        } catch (NoSuchMethodException e) {
            throw new CommonsException(e);
        } catch (InvocationTargetException e) {
            throw new CommonsException(e);
        } finally {
            CDBTools.close(stmt, resultSet);
        }
    }

    public static void insertSql(Connection conn, CSqlView sqlQueryView) throws CommonsException {
        PreparedStatement stmt = null;
        try {
            // 新增
            StringBuffer strSql = new StringBuffer();
            strSql.append(" INSERT INTO " + sqlQueryView.getTableName() + " ( " + getFieldsStr(sqlQueryView.getFieldViews()) + " ) ");
            strSql.append(" VALUES ( ");
            for (int idx = 0; idx < sqlQueryView.getFieldViews().size(); idx++) {
                if (idx != 0) {
                    strSql.append(", ");
                }
                strSql.append("?");
            }
            strSql.append(" )");

            stmt = conn.prepareStatement(strSql.toString());
            int idx = 0;
            for (CSqlFieldView sqlFieldView : sqlQueryView.getFieldViews()) {
                decodeStatementParameter(stmt, ++idx, sqlFieldView);
            }

            stmt.execute();

        } catch (SQLException e) {
            throw new CommonsException(e);
        } finally {
            CDBTools.closeStatement(stmt);
        }
    }

    public static void updateSql(Connection conn, CSqlView updateView) throws CommonsException {
        PreparedStatement stmt = null;
        try {
            // 新增
            StringBuffer strSql = new StringBuffer();
            strSql.append(" UPDATE " + updateView.getTableName() + " SET ");
            int idx = 0;
            for (CSqlFieldView fieldView : updateView.getFieldViews()) {
                if (idx != 0) {
                    strSql.append("  , ");
                }
                strSql.append(fieldView.getFieldName() + " = ? ");
                idx++;
            }

            strSql.append("  WHERE 1=1 ");
            for (CSqlConditionView whereField : updateView.getWhereConditions()) {
                strSql.append(" AND ").append(whereField.getSql());
            }

            stmt = conn.prepareStatement(strSql.toString());
            idx = 0;
            for (CSqlFieldView cSqlFieldView : updateView.getFieldViews()) {
                decodeStatementParameter(stmt, ++idx, cSqlFieldView);
            }

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new CommonsException(e);
        } finally {
            CDBTools.closeStatement(stmt);
        }
    }

    private static void decodeStatementParameter(PreparedStatement stmt, int idx, CSqlFieldView sqlFieldView) throws CommonsException {

        try {
            EDataType dataType = sqlFieldView.getDataType();
            switch (dataType) {
                case BOOLEAN:
                    stmt.setBoolean(idx, Boolean.valueOf(sqlFieldView.getValue()));
                    break;
                case INT:
                    stmt.setInt(idx, Integer.valueOf(sqlFieldView.getValue()));
                    break;
                case LONG:
                    stmt.setLong(idx, Long.valueOf(sqlFieldView.getValue()));
                    break;
                case FLOAT:
                    stmt.setFloat(idx, Float.valueOf(sqlFieldView.getValue()));
                    break;
                case DOUBLE:
                    stmt.setDouble(idx, Double.valueOf(sqlFieldView.getValue()));
                    break;
                case STRING:
                    stmt.setString(idx, sqlFieldView.getValue());
                    break;
                default:
                    throw new CommonsException("sql field has wrong data type :" + dataType);
            }

        } catch (SQLException e) {
            throw new CommonsException(e);
        }
    }

    private static String getFieldsStr(ArrayList<CSqlFieldView> sqlFieldViews) {
        String rtnStr = "";
        boolean isFirst = true;
        for (CSqlFieldView sqlFieldView : sqlFieldViews) {
            if (isFirst) isFirst = false;
            else rtnStr += ", ";
            rtnStr += sqlFieldView.getFieldName();
        }
        return rtnStr;
    }


    public static void deleteSql(Connection conn, CSqlView deleteView) throws CommonsException {
        PreparedStatement stmt = null;
        try {
            StringBuffer strSql = new StringBuffer();
            strSql.append(" DELETE FROM " + deleteView.getTableName());
            strSql.append("  WHERE 1=1 ");
            int idx = 0;
            for (CSqlConditionView whereField : deleteView.getWhereConditions()) {
                strSql.append(whereField.getSql());

            }

            stmt = conn.prepareStatement(strSql.toString());
            stmt.execute();

        } catch (SQLException e) {
            throw new CommonsException(e);
        } finally {
            CDBTools.closeStatement(stmt);
        }
    }
}
