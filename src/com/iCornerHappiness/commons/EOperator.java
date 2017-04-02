package com.iCornerHappiness.commons;

/**
 * Created by user on 2017/4/1.
 */
public enum EOperator {
    EQ(" = "),
    GT(" > "),
    GE(" >= "),
    LT(" < "),
    LE(" <= "),
    LIKE(" like "),
    EXIST("exist"),
    BETWEEN(" between "),
    IN(" in "),
    ;

    private String symbol;
    EOperator(String operator) {
        this.symbol = operator;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
