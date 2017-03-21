package com.iCornerHappiness.enumeration;

/**
 * Created by user on 2017/3/10.
 */
public enum EContent {
    FOUNDER("�п�H����", EContentType.PARAGRAPH),
    PERSIST("�ڭ̪����", EContentType.ORDERED),
    MILESTONE("�j�ưO", EContentType.UNORDERED),
    OFFER("�п��u�f", EContentType.PARAGRAPH),
    QUALIFICATION("���W���", EContentType.ORDERED),
    DATETYPE("�p�˺���", EContentType.ORDERED),
    DATEFLOW("�p�ˬy�{", EContentType.ORDERED),
    NOTICE("�`�N�ƶ�", EContentType.ORDERED),
    ;

    private String name;
    private EContentType contentType;
    EContent(String name, EContentType contentType) {
        this.name = name;
        this.contentType = contentType;
    }

    public String getName() {
        return name;
    }

    public EContentType getContentType() {
        return contentType;
    }
}
