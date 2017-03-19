package com.iCornerHappiness.commons;

/**
 * Created by user on 2017/3/13.
 */
public class CSqlOrderView {
    private String fieldName;
    private EOrderType orderType;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public EOrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(EOrderType orderType) {
        this.orderType = orderType;
    }
}
