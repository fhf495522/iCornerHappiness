package com.iCornerHappiness.commons;

/**
 * Created by 025329 on 2015/9/25.
 */
public class CSqlFieldView {
    private String fieldName;
    private EDataType dataType;
    private String value;

    public CSqlFieldView(String fieldName, String value) {
        this.fieldName = fieldName;
        this.dataType = EDataType.STRING;
        this.value = value;
    }

    public CSqlFieldView(String fieldName, int value) {
        this.fieldName = fieldName;
        this.dataType = EDataType.INT;
        this.value = String.valueOf(value);
    }

    public CSqlFieldView(String fieldName, float value) {
        this.fieldName = fieldName;
        this.dataType = EDataType.FLOAT;
        this.value = String.valueOf(value);
    }

    public CSqlFieldView(String fieldName, long value) {
        this.fieldName = fieldName;
        this.dataType = EDataType.LONG;
        this.value = String.valueOf(value);
    }

    public CSqlFieldView(String fieldName, double value) {
        this.fieldName = fieldName;
        this.dataType = EDataType.DOUBLE;
        this.value = String.valueOf(value);
    }

    public CSqlFieldView(String fieldName, boolean value) {
        this.fieldName = fieldName;
        this.dataType = EDataType.BOOLEAN;
        this.value = String.valueOf(value);
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public EDataType getDataType() {
        return dataType;
    }

    public void setDataType(EDataType dataType) {
        this.dataType = dataType;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
