package com.iCornerHappiness.commons;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by user on 2017/3/10.
 */
public class CPropertiesTools {

    private static Properties props;
    static {

        props = new Properties();
        try {
            props.loadFromXML(new FileInputStream("properties.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String getProperties(String key){
        return props.getProperty(key);
    }
}
