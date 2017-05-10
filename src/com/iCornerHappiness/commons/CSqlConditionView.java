package com.iCornerHappiness.commons;

public class CSqlConditionView {
    private String fieldName;
    private String value;
    private EOperator operator = EOperator.EQ;
    private String minValue;
    private String maxValue;
    private String[] values;

    public CSqlConditionView(String fieldName, EOperator operator, String value) {
        this.fieldName = fieldName;
        this.operator = operator;
        this.value = value;
    }

    public CSqlConditionView(String fieldName, EOperator operator, String minValue, String maxValue) {
        this.fieldName = fieldName;
        this.operator = operator;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public CSqlConditionView(String fieldName, EOperator operator, String[] values) {
        this.fieldName = fieldName;
        this.operator = operator;
        setValues(values);
    }

    public CSqlConditionView(String fieldName, EOperator operator, int value) {
        this.fieldName = fieldName;
        this.operator = operator;
        this.value = String.valueOf(value);
    }

    public CSqlConditionView(String fieldName, EOperator operator, float value) {
        this.fieldName = fieldName;
        this.operator = operator;
        this.value = String.valueOf(value);
    }

    public CSqlConditionView(String fieldName, EOperator operator, long value) {
        this.fieldName = fieldName;
        this.operator = operator;
        this.value = String.valueOf(value);
    }

    public CSqlConditionView(String fieldName, EOperator operator, double value) {
        this.fieldName = fieldName;
        this.operator = operator;
        this.value = String.valueOf(value);
    }

    public CSqlConditionView(String fieldName, EOperator operator, boolean value) {
        this.fieldName = fieldName;
        this.operator = operator;
        this.value = String.valueOf(value);
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    private EOperator getOperator() {
        return operator;
    }

    public void setOperator(EOperator operator) {
        this.operator = operator;
    }

    private String getMinValue() {
        return minValue;
    }

    public void setMinValue(String minValue) {
        this.minValue = minValue;
    }

    private String getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(String maxValue) {
        this.maxValue = maxValue;
    }

    private String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public StringBuffer getValues() {
        StringBuffer valuesSql = new StringBuffer();
        int i = 0;
        for(String value : values){
            if (i != 0){
                valuesSql.append(",");
            }
            valuesSql.append("'").append(value).append("'");
            i++;
        }
        return valuesSql;
    }

    public void setValues(String... values) {
        this.values = values;
    }

    public String getSql() {
        StringBuilder sql = new StringBuilder();
        switch (operator){
            case EQ:
            case GE:
            case GT:
            case LE:
            case LT:
                sql.append(getFieldName()).append(operator.getSymbol()).append("'").append(getValue()).append("'").append(" ");
                break;
            case BETWEEN:
                sql.append(getFieldName()).append(operator.getSymbol()).append("'").append(getMinValue()).append("'")
                        .append(" and ").append("'").append(getMaxValue()).append("'").append(" ");
                break;
            case LIKE:
                sql.append(getFieldName()).append(operator.getSymbol()).append("'%").append(getValue()).append("%'").append(" ");
                break;
            case IN:
                sql.append(getFieldName()).append(operator.getSymbol()).append("(").append(getValues()).append(")").append(" ");
                break;
        }
        return sql.toString();
    }
}
