package com.iCornerHappiness.enumeration;

/**
 * Created by user on 2017/3/10.
 */
public enum EContentType {
    PARAGRAPH("�q��"),
    ORDERED("���Ǹ��C��"),
    UNORDERED("�L�Ǹ��C��"),;

    private String name;
    EContentType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
