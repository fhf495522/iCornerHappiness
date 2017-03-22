package com.iCornerHappiness.site;

import com.iCornerHappiness.commons.*;
import com.iCornerHappiness.db.CSqlMapping;
import com.iCornerHappiness.enumeration.EContent;

import java.sql.Connection;
import java.util.ArrayList;

/**
 * Created by user on 2017/3/12.
 */
public class CSiteContent {
    private final static String table = CSqlMapping.TBLSITECONTENT;
    Class obj = CSiteContentView.class;

    public ArrayList<CSiteContentView> getSiteContentList(Connection conn, EContent content) throws CommonsException {
        CSqlView queryView = new CSqlView(table);
        // query field (all)
//        queryView.setQueryFields();
        // where
        queryView.setWhereCondition(CSqlMapping.FLDCONTENT, content.toString());
        // order
        queryView.setOrder(EOrderType.ASC, CSqlMapping.FLDCONTENTORDER);
        return CSqlTools.selectList(obj, conn, queryView);
    }

    public void setSiteContentList(Connection conn, CSiteContentView view) throws CommonsException {
        CSqlView updateView = new CSqlView(table);
        updateView.setFieldView(CSqlMapping.FLDTITLE, view.getTitle());
        updateView.setFieldView(CSqlMapping.FLDVALUE, view.getValue());
        updateView.setFieldView(CSqlMapping.FLDMEMO, view.getMemo());
        updateView.setWhereCondition(CSqlMapping.FLDCONTENT, view.getContent().toString());
        updateView.setWhereCondition(CSqlMapping.FLDCONTENTORDER, view.getContentOrder());
        CSqlTools.updateSql(conn, updateView);
    }

    public void addContent(Connection conn, EContent content) throws CommonsException {
        CSqlView queryView = new CSqlView(table);
        queryView.setQueryFields(CSqlMapping.FLDCONTENTORDER);
        queryView.setWhereCondition(CSqlMapping.FLDCONTENT, content.toString());
        int maxOrder = CSqlTools.getMaxField(conn, queryView);
        CSqlView insertView = new CSqlView(table);
        insertView.setFieldView(CSqlMapping.FLDCONTENT, content.toString());
        insertView.setFieldView(CSqlMapping.FLDCONTENTORDER, maxOrder+1);
        CSqlTools.insertSql(conn, insertView);
    }

    public void deleteContent(Connection conn, EContent content, int contentOrder) throws CommonsException {
        CSqlView deleteView = new CSqlView(table);
        deleteView.setWhereCondition(CSqlMapping.FLDCONTENT, content.toString());
        deleteView.setWhereCondition(CSqlMapping.FLDCONTENTORDER, contentOrder);
        CSqlTools.deleteSql(conn, deleteView);
    }
}
