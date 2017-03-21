package com.iCornerHappiness.user;

import com.iCornerHappiness.commons.CView;
import com.iCornerHappiness.enumeration.*;
import com.iCornerHappiness.exception.CornerException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by user on 2017/3/10.
 */
public class CUserView extends CView {
    private int account;                // �|���s��
    private String userName;            // �m�W
    private String userId;              // �����Ҧr��
    private String password;            // �K�X
    private EGender gender;             // �ʧO
    private String phone;               // ��a�q��
    private String mobile;              // ������X
    private String address;             // �{�~�a�}
    private String home;                // ���y�a�}
    private Date birthday;              // �X�ͦ~���(�~��.�P�y)
    private int height;                 // ����
    private int weight;                 // �魫
    private EBloodType bloodType;       // �嫬
    private boolean isSmoking;          // �O�_�l��
    private boolean isVegetarian;       // �O�_�Y��
    private boolean isDrinking;         // �O�_���s
    private EZodiac zodiac;             // �ͨv
    private EReligion religion;         // �v�ЫH��
    private EEducation education;       // �̰��Ǿ�
    private String graduateSchool;      // ���~�Ǯ�
    private String graduateDepart;      // ���~��t
    private ECareer career;             // ¾�~�O
    private ECity workCity;             // �u�@�a
    private String company;             // �A�Ⱦ���
    private String position;            // ¾��
    private boolean isLiveTogether;     // �O�_�P���C�P��
    private String lineId;              // Line Id
    private String email;               // email
    private String hobbies;             // ����
    private String personality;         // �ۨ��ө�
    private String advantage;           // �ۨ��u�I
    private String disadvantages;       // �ۨ����I
    private String prerequisitesDesc;   // ���Ʊ���y�z
    private String idealConditionDesc;  // �z�Q����y�z
    private String otherDesc;           // ��L�y�z
    private Date createDate;            // �إߤ��
    private Date modifiedDate;          // �ק���
    private String modifiedBy;          // �ק�H��
    private String image;               // �Ӥ�   // todo

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public EGender getGender() {
        return gender;
    }

    public void setGender(EGender gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public EBloodType getBloodType() {
        return bloodType;
    }

    public void setBloodType(EBloodType bloodType) {
        this.bloodType = bloodType;
    }

    public boolean isSmoking() {
        return isSmoking;
    }

    public void setSmoking(boolean isSmoking) {
        this.isSmoking = isSmoking;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public boolean isDrinking() {
        return isDrinking;
    }

    public void setDrinking(boolean isDrinking) {
        this.isDrinking = isDrinking;
    }

    public EZodiac getZodiac() {
        return zodiac;
    }

    public void setZodiac(EZodiac zodiac) {
        this.zodiac = zodiac;
    }

    public EReligion getReligion() {
        return religion;
    }

    public void setReligion(EReligion religion) {
        this.religion = religion;
    }

    public EEducation getEducation() {
        return education;
    }

    public void setEducation(EEducation education) {
        this.education = education;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    public String getGraduateDepart() {
        return graduateDepart;
    }

    public void setGraduateDepart(String graduateDepart) {
        this.graduateDepart = graduateDepart;
    }

    public ECareer getCareer() {
        return career;
    }

    public void setCareer(ECareer career) {
        this.career = career;
    }

    public ECity getWorkCity() {
        return workCity;
    }

    public void setWorkCity(ECity workCity) {
        this.workCity = workCity;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isLiveTogether() {
        return isLiveTogether;
    }

    public void setLiveTogether(boolean isLiveTogether) {
        this.isLiveTogether = isLiveTogether;
    }

    public String getLineId() {
        return lineId;
    }

    public void setLineId(String lineId) {
        this.lineId = lineId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getPersonality() {
        return personality;
    }

    public void setPersonality(String personality) {
        this.personality = personality;
    }

    public String getAdvantage() {
        return advantage;
    }

    public void setAdvantage(String advantage) {
        this.advantage = advantage;
    }

    public String getDisadvantages() {
        return disadvantages;
    }

    public void setDisadvantages(String disadvantages) {
        this.disadvantages = disadvantages;
    }

    public String getPrerequisitesDesc() {
        return prerequisitesDesc;
    }

    public void setPrerequisitesDesc(String prerequisitesDesc) {
        this.prerequisitesDesc = prerequisitesDesc;
    }

    public String getIdealConditionDesc() {
        return idealConditionDesc;
    }

    public void setIdealConditionDesc(String idealConditionDesc) {
        this.idealConditionDesc = idealConditionDesc;
    }

    public String getOtherDesc() {
        return otherDesc;
    }

    public void setOtherDesc(String otherDesc) {
        this.otherDesc = otherDesc;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getAge(){
        Calendar cal = Calendar.getInstance();
        int yearNow = cal.YEAR;
        int monthNow = cal.MONTH+1;
        int dayNow = cal.DATE;

        cal.setTime(birthday);
        int year = cal.YEAR;
        int month = cal.MONTH+1;
        int day = cal.DATE;

        if( monthNow > month )
            return yearNow - year ;
        else if( (monthNow == month) && (dayNow>=day) )
            return yearNow - year;
        else
            return yearNow - year - 1  ;

    }

    public EAstrological getAstrological(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(birthday);

        return EAstrological.getAstrological(cal.MONTH, cal.DATE);
    }

    @Override
    public CView decodeResult(ResultSet resultSet) throws CornerException {
        try {
            this.setAccount(resultSet.getInt("account"));


        } catch (SQLException e) {
            throw new CornerException("decodeResult Exception");
        }
        return null;
    }
}
