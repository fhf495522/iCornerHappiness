package com.iCornerHappiness.processer;

import com.iCornerHappiness.commons.CommonsException;
import com.iCornerHappiness.enumeration.EContent;
import com.iCornerHappiness.site.CSiteContent;
import com.iCornerHappiness.commons.CDBTools;
import com.iCornerHappiness.exception.CornerException;
import com.iCornerHappiness.site.CSiteContentView;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by user on 2017/3/12.
 */
public class PSiteManager {
    public static ArrayList<PSiteContentView> getSiteContentList(EContent content) {
        Connection conn = null;
        ArrayList<PSiteContentView> pList = null;
        try {
            conn = CDBTools.getConnection();
            ArrayList<CSiteContentView> cSiteContentViews = new CSiteContent().getSiteContentList(conn, content);
            if (cSiteContentViews!=null && cSiteContentViews.size()!=0){
                pList = new ArrayList<>();
                for (CSiteContentView cView : cSiteContentViews){
                    pList.add(new PSiteContentView(cView));
                }
            }
        } catch (CommonsException | CornerException e) {
            e.printStackTrace();
        } finally {
            CDBTools.closeConnection(conn);
        }
        return pList;
    }

    public static void setSiteContentList(ArrayList<PSiteContentView> pViews) {
        Connection conn = null;
        try {
            conn = CDBTools.getConnection();
            for(PSiteContentView pView : pViews){
                new CSiteContent().setSiteContentList(conn, pView.getView());
            }
            conn.commit();
        } catch (CommonsException | CornerException | SQLException e) {
            e.printStackTrace();
        } finally {
            CDBTools.closeConnection(conn);
        }
    }

    public static void addContent(EContent content) {
        Connection conn = null;
        try {
            conn = CDBTools.getConnection();
            new CSiteContent().addContent(conn, content);
            conn.commit();
        } catch (CommonsException | CornerException | SQLException e) {
            e.printStackTrace();
        } finally {
            CDBTools.closeConnection(conn);
        }
    }

    public static void deleteContent(EContent content, int contentOrder) {
        Connection conn = null;
        try {
            conn = CDBTools.getConnection();
            new CSiteContent().deleteContent(conn, content, contentOrder);
            conn.commit();
        } catch (CommonsException | CornerException | SQLException e) {
            e.printStackTrace();
        } finally {
            CDBTools.closeConnection(conn);
        }
    }
}
