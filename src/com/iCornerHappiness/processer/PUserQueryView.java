package com.iCornerHappiness.processer;

import com.iCornerHappiness.enumeration.*;
import com.iCornerHappiness.user.CUserQueryView;

import java.util.ArrayList;

/**
 * Created by user on 2017/3/22.
 */
public class PUserQueryView {
    private CUserQueryView userQueryView;

    public PUserQueryView(CUserQueryView userQueryView) {
        this.userQueryView = userQueryView;
    }

    public CUserQueryView getUserQueryView() {
        return userQueryView;
    }

    public void setUserQueryView(CUserQueryView userQueryView) {
        this.userQueryView = userQueryView;
    }

    public int getAccount() {
        return userQueryView.getAccount();
    }

    public void setAccount(int account) {
        userQueryView.setAccount(account);
    }

    public int getUpBoundOfHeight() {
        return userQueryView.getUpBoundOfHeight();
    }

    public void setUpBoundOfHeight(int upBoundOfHeight) {
        userQueryView.setUpBoundOfHeight(upBoundOfHeight);
    }

    public int getLowerBoundOfHeight() {
        return userQueryView.getLowerBoundOfHeight();
    }

    public void setLowerBoundOfHeight(int lowerBoundOfHeight) {
        userQueryView.setLowerBoundOfHeight(lowerBoundOfHeight);
    }

    public int getUpBoundOfWeight() {
        return userQueryView.getUpBoundOfWeight();
    }

    public void setUpBoundOfWeight(int upBoundOfWeight) {
        userQueryView.setUpBoundOfWeight(upBoundOfWeight);
    }

    public int getLowerBoundOfWeight() {
        return userQueryView.getLowerBoundOfWeight();
    }

    public void setLowerBoundOfWeight(int lowerBoundOfWeight) {
        userQueryView.setLowerBoundOfWeight(lowerBoundOfWeight);
    }

    public int getUpBoundOfAge() {
        return userQueryView.getUpBoundOfAge();
    }

    public void setUpBoundOfAge(int upBoundOfAge) {
        userQueryView.setUpBoundOfAge(upBoundOfAge);
    }

    public int getLowerBoundOfAge() {
        return userQueryView.getLowerBoundOfAge();
    }

    public void setLowerBoundOfAge(int lowerBoundOfAge) {
        userQueryView.setLowerBoundOfAge(lowerBoundOfAge);
    }

    public ArrayList<EAstrological> getAstrological() {
        return userQueryView.getAstrologicals();
    }

    public void setAstrological(ArrayList<EAstrological> astrological) {
        userQueryView.setAstrologicals(astrological);
    }

    public ArrayList<EBloodType> getBloodType() {
        return userQueryView.getBloodTypes();
    }

    public void setBloodType(ArrayList<EBloodType> bloodType) {
        userQueryView.setBloodTypes(bloodType);
    }

    public ArrayList<EZodiac> getZodiac() {
        return userQueryView.getZodiacs();
    }

    public void setZodiac(ArrayList<EZodiac> zodiac) {
        userQueryView.setZodiacs(zodiac);
    }

    public ArrayList<EEducation> getEducation() {
        return userQueryView.getEducations();
    }

    public void setEducation(ArrayList<EEducation> education) {
        userQueryView.setEducations(education);
    }

    public ECity getNowLivingInCity() {
        return userQueryView.getNowLivingInCity();
    }

    public void setNowLivingInCity(ECity nowLivingInCity) {
        userQueryView.setNowLivingInCity(nowLivingInCity);
    }

    public ECity getWorkCity() {
        return userQueryView.getWorkCity();
    }

    public void setWorkCity(ECity workCity) {
        userQueryView.setWorkCity(workCity);
    }

    public ArrayList<ECareer> getCareer() {
        return userQueryView.getCareers();
    }

    public void setCareer(ArrayList<ECareer> career) {
        userQueryView.setCareers(career);
    }
}
