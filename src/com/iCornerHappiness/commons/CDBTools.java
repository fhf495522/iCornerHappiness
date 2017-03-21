package com.iCornerHappiness.commons;

import com.iCornerHappiness.enumeration.EContent;
import com.iCornerHappiness.exception.CornerException;
import com.iCornerHappiness.processer.PSiteContentView;
import com.iCornerHappiness.processer.PSiteManager;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.*;
import java.util.*;

/**
 * Created by 025329 on 2015/9/16.
 */
public class CDBTools {
    public static Connection getConnection() throws CornerException {
        Connection conn = null;
        System.out.println(new java.util.Date());
        try {
            Class.forName("com.mysql.jdbc.Driver");
//            String host = CPropertiesTools.getProperties("HOST");
//            String port = CPropertiesTools.getProperties("PORT");
//            String database = CPropertiesTools.getProperties("DATABASE");
//            String user = CPropertiesTools.getProperties("USER");
//            String password = CPropertiesTools.getProperties("PASSWORD");
//            String jdbcUrl = "jdbc:mysql://" + host + ":" + port + "/" + database + "?user=" + user + "&password=" + password;

            // for dev
            String jdbcUrl = "jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12164614";
            conn = DriverManager.getConnection(jdbcUrl, "sql12164614", "NSV2gUu7ue");
            conn.setAutoCommit(false);
            System.out.println(new java.util.Date());

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void close(Statement stmt, ResultSet rset) {
        closeStatement(stmt);
        closeResultSet(rset);
    }

    public static void close(Connection conn, Statement stmt, ResultSet rset) {
        closeConnection(conn);
        closeStatement(stmt);
        closeResultSet(rset);
    }

    public static void closeConnection(Connection conn) {
        if (conn != null) {
            try {
                if (!conn.isClosed()) {
                    conn.rollback();
                    conn.close();
                }
            } catch (SQLException e) {
                System.err.println("Error:" + e.getMessage());
            }
        }
    }

    public static void closeStatement(Statement stmt) {
        if (stmt != null) {
            try {

                stmt.close();
                stmt = null;
            } catch (SQLException e) {
                System.err.println("Error:" + e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet rset) {
        if (rset != null) {
            try {
                rset.close();
                rset = null;
            } catch (SQLException e) {
                System.err.println("Error:" + e.getMessage());
            }
        }
    }

}
