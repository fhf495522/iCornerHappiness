package com.iCornerHappiness.enumeration;

/**
 * Created by user on 2017/3/10.
 */
public enum EZodiac {
    Zodiac1("鼠"),
    Zodiac2("牛"),
    Zodiac3("虎"),
    Zodiac4("兔"),
    Zodiac5("龍"),
    Zodiac6("蛇"),
    Zodiac7("馬"),
    Zodiac8("羊"),
    Zodiac9("猴"),
    Zodiac10("雞"),
    Zodiac11("狗"),
    Zodiac12("豬"),
    ;

    private String name;
    EZodiac(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
