package com.iCornerHappiness.user;

import com.iCornerHappiness.commons.*;
import com.iCornerHappiness.db.CSqlMapping;
import com.iCornerHappiness.processer.PUserQueryView;
import com.iCornerHappiness.processer.PUserView;

import java.sql.Connection;
import java.util.ArrayList;

/**
 * Created by user on 2017/3/16.
 */
public class CUser {
    private final static String table = CSqlMapping.TBLUSER;
    Class obj = CUserView.class;

    public CUserView login(Connection conn, String userId, String password) throws CommonsException {
        CUserView cUserView;
        CSqlView queryView = new CSqlView(table);
        // query field (all)
//        queryView.setQueryFields();
        // where
        queryView.setWhereCondition(CSqlMapping.FLDUSEDID, userId);
        queryView.setWhereCondition(CSqlMapping.FLDPASSWORD, password);
        ArrayList<CUserView> cUserViews = CSqlTools.selectList(obj, conn, queryView);
        cUserView = cUserViews.get(0);
        return cUserView;
    }

    public void addUser(Connection conn, CUserView cUserView) throws CommonsException {
        CSqlView insertView = new CSqlView(table);
        insertView.setFieldView(CSqlMapping.FLDCONTENT, cUserView.toString());
        CSqlTools.insertSql(conn, insertView);

    }


    public ArrayList<CUserView> getUserList(Connection conn, CUserQueryView cUserQueryView) {

        return null;
    }
}
