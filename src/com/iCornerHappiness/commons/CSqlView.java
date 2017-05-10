package com.iCornerHappiness.commons;

import com.iCornerHappiness.exception.CornerException;

import java.util.ArrayList;

/**
 * Created by 025329 on 2015/9/25.
 */
public class CSqlView {
    private String tableName;
    private String[] queryFields;
    private ArrayList<CSqlFieldView> fieldViews = new ArrayList<CSqlFieldView>();
    private ArrayList<CSqlConditionView> whereConditions = new ArrayList<>();
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
        return queryFields==null || queryFields.length == 0;
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

    public void setFieldView(String fieldName, Boolean value) {
        this.fieldViews.add(new CSqlFieldView(fieldName, value));
    }

    protected ArrayList<CSqlConditionView> getWhereConditions() {
        return whereConditions;
    }

    public void setWhereCondition(String fieldName, String value) {
        this.whereConditions.add(new CSqlConditionView(fieldName, EOperator.EQ, value));
    }

    public void setWhereCondition(String fieldName, int value) {
        this.whereConditions.add(new CSqlConditionView(fieldName, EOperator.EQ, value));
    }

    public void setWhereCondition(String fieldName, EOperator operator, String value) {
        this.whereConditions.add(new CSqlConditionView(fieldName, operator, value));
    }

    public void setWhereCondition(String fieldName, EOperator operator, int value) {
        this.whereConditions.add(new CSqlConditionView(fieldName, operator, value));
    }

    public void setWhereCondition(String fieldName, EOperator operator, String[] values) throws CornerException {
        if (operator != EOperator.IN){
            throw new CornerException(fieldName + " must have operator" + EOperator.IN);
        }
        this.whereConditions.add(new CSqlConditionView(fieldName, operator, values));
    }

    public void setWhereCondition(String fieldName, EOperator operator, String minValues, String maxValues) throws CornerException {
        if (operator != EOperator.BETWEEN){
            throw new CornerException(fieldName + " must have operator" + EOperator.BETWEEN);
        }
        this.whereConditions.add(new CSqlConditionView(fieldName, operator, minValues, maxValues));
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
