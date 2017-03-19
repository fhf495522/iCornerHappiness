package com.iCornerHappiness.enumeration;

/**
 * Created by user on 2017/3/10.
 */
public enum EContent {
    FOUNDER("創辦人的話", EContentType.PARAGRAPH),
    PERSIST("我們的堅持", EContentType.ORDERED),
    MILESTONE("大事記", EContentType.UNORDERED),
    OFFER("創辦優惠", EContentType.PARAGRAPH),
    QUALIFICATION("報名資格", EContentType.ORDERED),
    DATETYPE("聯誼種類", EContentType.ORDERED),
    DATEFLOW("聯誼流程", EContentType.ORDERED),
    NOTICE("注意事項", EContentType.ORDERED),
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
