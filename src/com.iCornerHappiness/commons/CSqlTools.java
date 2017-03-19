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
            for (CSqlFieldView sqlFieldView : queryMaxView.getWhereConditions()) {
                strSql.append(" AND ").append(sqlFieldView.getFieldName()).append(" = '").append(sqlFieldView.getValue()).append("'");
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
            strSql.append(" SELECT 1");
            if (sqlQueryView.isQueryAll()) {
                strSql.append(" ,* ");
            } else {
                for (String queryField : sqlQueryView.getQueryFields()) {
                    strSql.append(",").append(queryField);
                }
            }
            strSql.append(" FROM ").append(sqlQueryView.getTableName()).append(" WHERE 1=1 ");
            for (CSqlFieldView sqlFieldView : sqlQueryView.getWhereConditions()) {
                strSql.append(" AND ").append(sqlFieldView.getFieldName()).append(" = '").append(sqlFieldView.getValue()).append("'");
            }
            strSql.append(" ORDER BY NULL");
            for (CSqlOrderView sqlOrderView : sqlQueryView.getSqlOrderViews()) {
                strSql.append(",").append(sqlOrderView.getFieldName()).append(" ").append(sqlOrderView.getOrderType());
            }
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

            strSql.append("  WHERE ");
            idx = 0;
            for (CSqlFieldView whereField : updateView.getWhereConditions()) {
                if (idx != 0) {
                    strSql.append("  AND ");
                }
                strSql.append(whereField.getFieldName() + " = ? ");
                idx++;
            }

            stmt = conn.prepareStatement(strSql.toString());
            idx = 0;
            for (CSqlFieldView fieldName : updateView.getFieldViews()) {
                decodeStatementParameter(stmt, ++idx, fieldName);
            }
            for (CSqlFieldView fieldName : updateView.getWhereConditions()) {
                decodeStatementParameter(stmt, ++idx, fieldName);
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
            strSql.append("  WHERE ");
            int idx = 0;
            for (CSqlFieldView whereField : deleteView.getWhereConditions()) {
                if (idx != 0) {
                    strSql.append("  AND ");
                }
                strSql.append(whereField.getFieldName() + " = ? ");
                idx++;
            }

            stmt = conn.prepareStatement(strSql.toString());
            idx = 0;
            for (CSqlFieldView fieldName : deleteView.getWhereConditions()) {
                decodeStatementParameter(stmt, ++idx, fieldName);
            }

            stmt.execute();

        } catch (SQLException e) {
            throw new CommonsException(e);
        } finally {
            CDBTools.closeStatement(stmt);
        }
    }
}
