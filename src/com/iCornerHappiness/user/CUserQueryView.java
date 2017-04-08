package com.iCornerHappiness.user;

import com.iCornerHappiness.enumeration.*;

import java.util.ArrayList;


/**
 * Created by user on 2017/3/22.
 */
public class CUserQueryView {
    private int account;                                // 會員編號
    private int upBoundOfHeight;                        // 身高上限
    private int lowerBoundOfHeight;                     // 身高下限
    private int upBoundOfWeight;                        // 體重上限
    private int lowerBoundOfWeight;                     // 體重下限
    private int upBoundOfAge;                           // 年齡上限
    private int lowerBoundOfAge;                        // 年齡下限
    private ArrayList<EAstrological> astrologicals;     // 星座
    private ArrayList<EBloodType> bloodTypes;           // 血型
    private ArrayList<EZodiac> zodiacs;                 // 生肖
    private ArrayList<EEducation> educations;           // 最高學歷
    private ECity nowLivingInCity;                      // 現居地
    private ECity workCity;                             // 工作地
    private ArrayList<ECareer> careers;                 // 職業別

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getUpBoundOfHeight() {
        return upBoundOfHeight;
    }

    public void setUpBoundOfHeight(int upBoundOfHeight) {
        this.upBoundOfHeight = upBoundOfHeight;
    }

    public int getLowerBoundOfHeight() {
        return lowerBoundOfHeight;
    }

    public void setLowerBoundOfHeight(int lowerBoundOfHeight) {
        this.lowerBoundOfHeight = lowerBoundOfHeight;
    }

    public int getUpBoundOfWeight() {
        return upBoundOfWeight;
    }

    public void setUpBoundOfWeight(int upBoundOfWeight) {
        this.upBoundOfWeight = upBoundOfWeight;
    }

    public int getLowerBoundOfWeight() {
        return lowerBoundOfWeight;
    }

    public void setLowerBoundOfWeight(int lowerBoundOfWeight) {
        this.lowerBoundOfWeight = lowerBoundOfWeight;
    }

    public int getUpBoundOfAge() {
        return upBoundOfAge;
    }

    public void setUpBoundOfAge(int upBoundOfAge) {
        this.upBoundOfAge = upBoundOfAge;
    }

    public int getLowerBoundOfAge() {
        return lowerBoundOfAge;
    }

    public void setLowerBoundOfAge(int lowerBoundOfAge) {
        this.lowerBoundOfAge = lowerBoundOfAge;
    }

    public ArrayList<EAstrological> getAstrologicals() {
        return astrologicals;
    }

    public void setAstrologicals(ArrayList<EAstrological> astrologicals) {
        this.astrologicals = astrologicals;
    }

    public ArrayList<EBloodType> getBloodTypes() {
        return bloodTypes;
    }

    public void setBloodTypes(ArrayList<EBloodType> bloodTypes) {
        this.bloodTypes = bloodTypes;
    }

    public ArrayList<EZodiac> getZodiacs() {
        return zodiacs;
    }

    public void setZodiacs(ArrayList<EZodiac> zodiacs) {
        this.zodiacs = zodiacs;
    }

    public ArrayList<EEducation> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<EEducation> educations) {
        this.educations = educations;
    }

    public ECity getNowLivingInCity() {
        return nowLivingInCity;
    }

    public void setNowLivingInCity(ECity nowLivingInCity) {
        this.nowLivingInCity = nowLivingInCity;
    }

    public ECity getWorkCity() {
        return workCity;
    }

    public void setWorkCity(ECity workCity) {
        this.workCity = workCity;
    }

    public ArrayList<ECareer> getCareers() {
        return careers;
    }

    public void setCareers(ArrayList<ECareer> careers) {
        this.careers = careers;
    }
}
