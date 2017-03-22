package com.iCornerHappiness.enumeration;

/**
 * Created by user on 2017/3/10.
 */
public enum EContentType {
    PARAGRAPH("段落"),
    ORDERED("有序號列表"),
    UNORDERED("無序號列表"),;

    private String name;
    EContentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
