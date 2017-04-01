package com.iCornerHappiness.enumeration;

/**
 * Created by user on 2017/3/10.
 */
public enum EReligion {
    Religion1("道教"),
    Religion2("佛教"),
    Religion3("基督教"),
    Religion4("天主教"),
    Religion5("民間信仰"),

    Religion9("其他"),
    ;

    private String name;
    EReligion(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
