package com.iCornerHappiness.commons;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by 025329 on 2015/9/25.
 */
public class CUtilTools {

    public static String transferArrayList2String(ArrayList<String> list) {
        String str = list.toString();
        return str.substring(1, str.length()-1);
    }

    public static String transCollection2Str(Collection list) {
        String str = list.toString();
        return str.substring(1, str.length()-1);
    }


}
