package com.iCornerHappiness.commons;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式轉換
 * Created by 025329 on 2015/9/16.
 */
public class CDateTools {
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

    public static String getStrYearMonth(Date date){
        simpleDateFormat.applyPattern("yyyyMM");
        return simpleDateFormat.format(date);
    }

    public static String getStrDate(Date date){
        simpleDateFormat.applyPattern("yyyyMMdd");
        return simpleDateFormat.format(date);
    }

    public static String getShowDate(String strDate, String split){
        if (strDate.length()>=8){
            return strDate.substring(0,4)+split+strDate.substring(4,6)+split+strDate.substring(6,8);
        } else {
            return "";
        }
    }
}
