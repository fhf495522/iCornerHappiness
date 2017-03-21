package com.iCornerHappiness.commons;

import java.util.ArrayList;
import java.util.Optional;

/**
 * Created by 025329 on 2015/9/25.
 */
public class CSqlView {
    private String tableName;
    private String[] queryFields;
    private ArrayList<CSqlFieldView> fieldViews = new ArrayList<CSqlFieldView>();
    private ArrayList<CSqlFieldView> whereConditions = new ArrayList<CSqlFieldView>();
    private ArrayList<CSqlOrderView> sqlOrderViews = new ArrayList<CSqlOrderView>();

    public CSqlView(String tableName) {
        this.tableName = tableName;
    }

    protected String getTableName() {
        return tableName;
    }

//    public void setTableName(String tableName) {
//        this.tableName = tableName;
//    }

    protected String[] getQueryFields() {
        return queryFields;
    }

    public void setQueryFields(String... queryFields) {
        this.queryFields = queryFields;
    }

    protected boolean isQueryAll() {
        return queryFields.length == 0;
    }

    public ArrayList<CSqlFieldView> getFieldViews() {
        return fieldViews;
    }

    public void setFieldView(String fieldName, String value) {
        this.fieldViews.add(new CSqlFieldView(fieldName, value));
    }

    public void setFieldView(String fieldName, int value) {
        this.fieldViews.add(new CSqlFieldView(fieldName, value));
    }

    protected ArrayList<CSqlFieldView> getWhereConditions() {
        return whereConditions;
    }

    public void setWhereCondition(String fieldName, String value) {
        this.whereConditions.add(new CSqlFieldView(fieldName, value));
    }

    public void setWhereCondition(String fieldName, int value) {
        this.whereConditions.add(new CSqlFieldView(fieldName, value));
    }

    protected boolean isWhereCondition() {
        return whereConditions.size() != 0;
    }

    protected ArrayList<CSqlOrderView> getSqlOrderViews() {
        return sqlOrderViews;
    }

    public void setOrder(EOrderType orderType, String orderField) {
        CSqlOrderView sqlOrderView = new CSqlOrderView();
        sqlOrderView.setFieldName(orderField);
        sqlOrderView.setOrderType(orderType);
        this.sqlOrderViews.add(sqlOrderView);
    }
}
