package com.iCornerHappiness.enumeration;

/**
 * Created by user on 2017/3/10.
 */
public enum  EAstrological {
    Astro1("�]�~�y"),
    Astro2("���~�y"),
    Astro3("��?�y"),
    Astro4("�d�Ϯy"),
    Astro5("�����y"),
    Astro6("���l�y"),
    Astro7("���ɮy"),
    Astro8("?�l�y"),
    Astro9("�B�k�y"),
    Astro10("�ѯ��y"),
    Astro11("���Ȯy"),
    Astro12("�g��y"),
    ;

    EAstrological(String name) {

    }


    public static EAstrological getAstrological(int month, int day) {
        EAstrological[] allAstrological =EAstrological.values();
        int[] DayArr = {22, 20, 19, 21, 21, 21, 22, 23, 23, 23, 23, 22};  // ??�P�y���Τ�
        int index = month;
        // �Ҭd?����b���Τ餧�e�A����-1�A�_?��?
        if (day < DayArr[month - 1]) {
            index = index - 1;
        }
        // ��^���ޫ��V���P�ystring
        return allAstrological[index];
    }

}
