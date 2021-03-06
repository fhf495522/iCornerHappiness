package com.iCornerHappiness.enumeration;

/**
 * Created by user on 2017/3/10.
 */
public enum  EAstrological {
    Astro1("魔羯座"),
    Astro2("水瓶座"),
    Astro3("雙魚座"),
    Astro4("牡羊座"),
    Astro5("金牛座"),
    Astro6("雙子座"),
    Astro7("巨蟹座"),
    Astro8("獅子座"),
    Astro9("處女座"),
    Astro10("天秤座"),
    Astro11("天蠍座"),
    Astro12("射手座"),
    ;

    private String name;
    EAstrological(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public static EAstrological getAstrological(int month, int day) {
        EAstrological[] allAstrological =EAstrological.values();
        int[] DayArr = {22, 20, 19, 21, 21, 21, 22, 23, 23, 23, 23, 22};  // 十二星座分割日
        int index = month;
        // 所查詢日期在分割日之前，索引-1，否則不變
        if (day < DayArr[month - 1]) {
            index = index - 1;
        }
        // 返回索引指向的星座string
        return allAstrological[index];
    }

}
