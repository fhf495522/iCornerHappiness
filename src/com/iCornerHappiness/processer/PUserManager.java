package com.iCornerHappiness.processer;

import com.iCornerHappiness.commons.CDBTools;
import com.iCornerHappiness.commons.CommonsException;
import com.iCornerHappiness.exception.CornerException;
import com.iCornerHappiness.user.CUser;
import com.iCornerHappiness.user.CUserView;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by user on 2017/3/22.
 */
public class PUserManager {

    // login
    public static PUserView login(String userId, String password){
        // 依照帳密取得 CUserView
        // 找不到則登入失敗
        Connection conn = null;
        PUserView pUserView = null;
        try {
            conn = CDBTools.getConnection();
            CUserView cUserView = new CUser().login(conn, userId, password);
            pUserView = new PUserView(cUserView);
            if (cUserView!=null){
                pUserView.setLoginSuccess(true);
            }else {
                pUserView.setLoginSuccess(false);
            }
        } catch (CommonsException | CornerException e) {
            e.printStackTrace();
        } finally {
            CDBTools.closeConnection(conn);
        }
        return pUserView;
    }

    // add User
    public static void addUser(PUserView pUserView){
        // insert to db
        Connection conn = null;
        try {
            conn = CDBTools.getConnection();
            new CUser().addUser(conn, pUserView.getUserView());
            conn.commit();
        } catch (CommonsException | CornerException | SQLException e) {
            e.printStackTrace();
        } finally {
            CDBTools.closeConnection(conn);
        }
    }

    // todo search for match
    public static ArrayList<PUserView> getUserList(PUserQueryView pUserQueryView){
        Connection conn = null;
        ArrayList<PUserView> pUserList = null;
        try {
            conn = CDBTools.getConnection();
            ArrayList<CUserView> cUserViews = new CUser().getUserList(conn, pUserQueryView.getView());
            if (cUserViews!=null && cUserViews.size()!=0){
                pUserList = new ArrayList<>();
                for (CUserView cView : cUserViews){
                    pUserList.add(new PUserView(cView));
                }
            }
        } catch (CommonsException | CornerException  e) {
            e.printStackTrace();
        } finally {
            CDBTools.closeConnection(conn);
        }
        return pUserList;
    }

    // todo 更新會員資料
    public PUserView update(PUserView pUserView){

        return pUserView;
    }
}
