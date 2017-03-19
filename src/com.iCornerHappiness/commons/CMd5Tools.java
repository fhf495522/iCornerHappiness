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
        md.update(s.getBytes()); //MD5盞衡猭琌?才??τぃ琌才﹃?︽盞?衡眔璶盞?禜
        byte[] bs=md.digest();   //?︽盞?衡才??
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<bs.length;i++){    //?????Θせ?才﹃Θ程?盞ゅ
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
