package com.iCornerHappiness.commons;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Vanna on 2015/11/30.
 */
public class CMd5Tools {
    public static String encode(String s){
        MessageDigest md=null;
        try {
            md=MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        md.update(s.getBytes()); //MD5�[�K��k�u�O?�r��??�Ӥ��O�r�Ŧ�?��[�K?��A�o��n�[�K��?�H
        byte[] bs=md.digest();   //?��[�K?��}��^�r��??
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<bs.length;i++){    //�r?????���Q��?��r�Ŧ�A�Φ���?���K��
            int v=bs[i]&0xff;
            if(v<16){
                sb.append(0);
            }else{
                sb.append(Integer.toHexString(v));
            }
        }
       return sb.toString();
    }
}
