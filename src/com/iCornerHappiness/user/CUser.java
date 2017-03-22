package com.iCornerHappiness.user;

import com.iCornerHappiness.commons.CSqlTools;
import com.iCornerHappiness.commons.CSqlView;
import com.iCornerHappiness.commons.CommonsException;
import com.iCornerHappiness.db.CSqlMapping;
import com.iCornerHappiness.processer.PUserQueryView;
import com.iCornerHappiness.processer.PUserView;

import java.sql.Connection;
import java.util.ArrayList;

/**
 * Created by user on 2017/3/16.
 */
public class CUser {
    private final static String tbluser = CSqlMapping.TBLUSER;
    public CUserView login(Connection conn, String userId, String password) {
        
        
        return null;
    }

    public void addUser(Connection conn, CUserView cUserView) throws CommonsException {
        CSqlView insertView = new CSqlView(tbluser);
        insertView.setFieldView(CSqlMapping.FLDCONTENT, cUserView.toString());
        CSqlTools.insertSql(conn, insertView);

    }


    public ArrayList<CUserView> getUserList(Connection conn, CUserQueryView cUserQueryView) {

        return null;
    }
}
