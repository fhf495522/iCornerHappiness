package com.iCornerHappiness.processer;

import com.iCornerHappiness.enumeration.*;
import com.iCornerHappiness.user.CUserView;

import java.util.Date;

/**
 * Created by user on 2017/3/22.
 */
public class PUserView {
    private CUserView userView;
    private boolean isLoginSuccess;

    public PUserView() {
        userView = new CUserView();
    }

    public PUserView(CUserView userView) {
        this.userView = userView;
    }

    public CUserView getUserView() {
        return userView;
    }

    public void setUserView(CUserView userView) {
        this.userView = userView;
    }

    public boolean isLoginSuccess() {
        return isLoginSuccess;
    }

    public void setLoginSuccess(boolean loginSuccess) {
        isLoginSuccess = loginSuccess;
    }

    public int getAccount() {
        return userView.getAccount();
    }

    public void setAccount(int account) {
        userView.setAccount(account);
    }

    public String getUserName() {
        return userView.getUserName();
    }

    public void setUserName(String userName) {
        userView.setUserName(userName);
    }

    public String getUserId() {
        return userView.getUserId();
    }

    public void setUserId(String userId) {
        userView.setUserId(userId);
    }

    public String getPassword() {
        return userView.getPassword();
    }

    public void setPassword(String password) {
        userView.setPassword(password);
    }

    public EGender getGender() {
        return userView.getGender();
    }

    public void setGender(EGender gender) {
        userView.setGender(gender);
    }

    public String getPhone() {
        return userView.getPhone();
    }

    public void setPhone(String phone) {
        userView.setPhone(phone);
    }

    public String getMobile() {
        return userView.getMobile();
    }

    public void setMobile(String mobile) {
        userView.setMobile(mobile);
    }

    public String getAddress() {
        return userView.getAddress();
    }

    public void setAddress(String address) {
        userView.setAddress(address);
    }

    public String getHome() {
        return userView.getHome();
    }

    public void setHome(String home) {
        userView.setHome(home);
    }

    public Date getBirthday() {
        return userView.getBirthday();
    }

    public void setBirthday(Date birthday) {
        userView.setBirthday(birthday);
    }

    public int getHeight() {
        return userView.getHeight();
    }

    public void setHeight(int height) {
        userView.setHeight(height);
    }

    public int getWeight() {
        return userView.getWeight();
    }

    public void setWeight(int weight) {
        userView.setWeight(weight);
    }

    public EBloodType getBloodType() {
        return userView.getBloodType();
    }

    public void setBloodType(EBloodType bloodType) {
        userView.setBloodType(bloodType);
    }

    public boolean isSmoking() {
        return userView.isSmoking();
    }

    public void setSmoking(boolean isSmoking) {
        userView.setSmoking(isSmoking);
    }

    public boolean isVegetarian() {
        return userView.isVegetarian();
    }

    public void setVegetarian(boolean isVegetarian) {
        userView.setVegetarian(isVegetarian);
    }

    public boolean isDrinking() {
        return userView.isDrinking();
    }

    public void setDrinking(boolean isDrinking) {
        userView.setDrinking(isDrinking);
    }

    public EZodiac getZodiac() {
        return userView.getZodiac();
    }

    public void setZodiac(EZodiac zodiac) {
        userView.setZodiac(zodiac);
    }

    public EReligion getReligion() {
        return userView.getReligion();
    }

    public void setReligion(EReligion religion) {
        userView.setReligion(religion);
    }

    public EEducation getEducation() {
        return userView.getEducation();
    }

    public void setEducation(EEducation education) {
        userView.setEducation(education);
    }

    public String getGraduateSchool() {
        return userView.getGraduateSchool();
    }

    public void setGraduateSchool(String graduateSchool) {
        userView.setGraduateSchool(graduateSchool);
    }

    public String getGraduateDepart() {
        return userView.getGraduateDepart();
    }

    public void setGraduateDepart(String graduateDepart) {
        userView.setGraduateDepart(graduateDepart);
    }

    public ECareer getCareer() {
        return userView.getCareer();
    }

    public void setCareer(ECareer career) {
        userView.setCareer(career);
    }

    public ECity getWorkCity() {
        return userView.getWorkCity();
    }

    public void setWorkCity(ECity workCity) {
        userView.setWorkCity(workCity);
    }

    public String getCompany() {
        return userView.getCompany();
    }

    public void setCompany(String company) {
        userView.setCompany(company);
    }

    public String getPosition() {
        return userView.getPosition();
    }

    public void setPosition(String position) {
        userView.setPosition(position);
    }

    public boolean isLiveTogether() {
        return userView.isLiveTogether();
    }

    public void setLiveTogether(boolean isLiveTogether) {
        userView.setLiveTogether(isLiveTogether);
    }

    public String getLineId() {
        return userView.getLineId();
    }

    public void setLineId(String lineId) {
        userView.setLineId(lineId);
    }

    public String getEmail() {
        return userView.getEmail();
    }

    public void setEmail(String email) {
        userView.setEmail(email);
    }

    public String getHobbies() {
        return userView.getHobbies();
    }

    public void setHobbies(String hobbies) {
        userView.setHobbies(hobbies);
    }

    public String getPersonality() {
        return userView.getPersonality();
    }

    public void setPersonality(String personality) {
        userView.setPersonality(personality);
    }

    public String getAdvantage() {
        return userView.getAdvantage();
    }

    public void setAdvantage(String advantage) {
        userView.setAdvantage(advantage);
    }

    public String getDisadvantages() {
        return userView.getDisadvantages();
    }

    public void setDisadvantages(String disadvantages) {
        userView.setDisadvantages(disadvantages);
    }

    public String getPrerequisitesDesc() {
        return userView.getPrerequisitesDesc();
    }

    public void setPrerequisitesDesc(String prerequisitesDesc) {
        userView.setPrerequisitesDesc(prerequisitesDesc);
    }

    public String getIdealConditionDesc() {
        return userView.getIdealConditionDesc();
    }

    public void setIdealConditionDesc(String idealConditionDesc) {
        userView.setIdealConditionDesc(idealConditionDesc);
    }

    public String getOtherDesc() {
        return userView.getOtherDesc();
    }

    public void setOtherDesc(String otherDesc) {
        userView.setOtherDesc(otherDesc);
    }

    public Date getCreateDate() {
        return userView.getCreateDate();
    }

    public void setCreateDate(Date createDate) {
        userView.setCreateDate(createDate);
    }

    public Date getModifiedDate() {
        return userView.getModifiedDate();
    }

    public void setModifiedDate(Date modifiedDate) {
        userView.setModifiedDate(modifiedDate);
    }

    public String getModifiedBy() {
        return userView.getModifiedBy();
    }

    public void setModifiedBy(String modifiedBy) {
        userView.setModifiedBy(modifiedBy);
    }

    public String getImage() {
        return userView.getImage();
    }

    public void setImage(String image) {
        userView.setImage(image);
    }

    public int getAge() {
        return userView.getAge();
    }

    public EAstrological getAstrological() {
        return userView.getAstrological();
    }
}
