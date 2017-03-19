package com.iCornerHappiness.commons;

/**
 * Created by 025329 on 2015/9/16.
 */
public class CValidateTools {

    public static boolean isBlankOrNull(String value) {
        return value == null || value.trim().length() == 0;
    }

    public static boolean isZero(int value) {
        return value == 0;
    }

    public static int getInt(String value){
        if (isBlankOrNull(value))
            return 0;
        else
            return Integer.valueOf(value);
    }
}
