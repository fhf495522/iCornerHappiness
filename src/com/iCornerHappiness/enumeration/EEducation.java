package com.iCornerHappiness.enumeration;

/**
 * Created by user on 2017/3/10.
 */
public enum  EEducation {
    Education1("博士"),
    Education2("碩士"),
    Education3("大學"),
    Education4("專科"),
    ;

    private String name;
    EEducation(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
