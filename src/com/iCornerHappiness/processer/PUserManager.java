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

    // todo login
    public static PUserView login(String userId, String password){
        // 依照帳密取得 CUserView
        // 找不到則登入失敗
        Connection conn = null;
        PUserView pUserView = null;
        try {
            conn = CDBTools.getConnection();

            CUserView cUserView = new CUser().login(conn, userId, password);
            pUserView = new PUserView(cUserView);


        } catch (CornerException e) {
            e.printStackTrace();
        } finally {
            CDBTools.closeConnection(conn);
        }
        return pUserView;
    }

    // todo add User
    public static void addUser(PUserView pUserView){
        // insert to db
        Connection conn = null;
        try {
            conn = CDBTools.getConnection();
            new CUser().addUser(conn, pUserView);
            conn.commit();
        } catch (CornerException | SQLException e) {
            e.printStackTrace();
        } finally {
            CDBTools.closeConnection(conn);
        }
    }

    // todo search for match
    public static ArrayList<PUserView> getUserList(PUserQueryView pUserQueryView){
        Connection conn = null;
        ArrayList<PUserView> pUserList = null;
//        try {
//            conn = CDBTools.getConnection();
//            ArrayList<PUserView> PUserViews = new PUserView().getSiteContentList(conn, pUserQueryView);
//            if (PUserViews!=null && PUserViews.size()!=0){
//                pUserList = new ArrayList<>();
//                for (PUserView cView : PUserViews){
//                    pUserList.add(new PSiteContentView(cView));
//                }
//            }
//        } catch (CommonsException | CornerException e) {
//            e.printStackTrace();
//        } finally {
//            CDBTools.closeConnection(conn);
//        }
//        return pUserList;


        return null;
    }
}