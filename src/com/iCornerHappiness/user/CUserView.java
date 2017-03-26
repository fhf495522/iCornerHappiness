package com.iCornerHappiness.user;

import com.iCornerHappiness.commons.CMd5Tools;
import com.iCornerHappiness.commons.CSqlTools;
import com.iCornerHappiness.commons.CView;
import com.iCornerHappiness.db.CSqlMapping;
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
    private int account;                // 會員編號
    private String userName;            // 姓名
    private String userId;              // 身分證字號
    private String password;            // 密碼
    private EGender gender;             // 性別
    private String phone;               // 住家電話
    private String mobile;              // 手機號碼
    private String address;             // 現居地址
    private String home;                // 戶籍地址
    private Date birthday;              // 出生年月日(年齡.星座)
    private int height;                 // 身高
    private int weight;                 // 體重
    private EBloodType bloodType;       // 血型
    private boolean isSmoking;          // 是否吸菸
    private boolean isVegetarian;       // 是否吃素
    private boolean isDrinking;         // 是否飲酒
    private EZodiac zodiac;             // 生肖
    private EReligion religion;         // 宗教信仰
    private EEducation education;       // 最高學歷
    private String graduateSchool;      // 畢業學校
    private String graduateDepart;      // 畢業科系
    private ECareer career;             // 職業別
    private ECity workCity;             // 工作地
    private String company;             // 服務機關
    private String position;            // 職稱
    private boolean isLiveTogether;     // 是否與公婆同住
    private String lineId;              // Line Id
    private String email;               // email
    private String hobbies;             // 興趣
    private String personality;         // 自身個性
    private String advantage;           // 自身優點
    private String disadvantages;       // 自身缺點
    private String prerequisitesDesc;   // 必備條件描述
    private String idealConditionDesc;  // 理想條件描述
    private String otherDesc;           // 其他描述
    private Date createDate;            // 建立日期
    private Date modifiedDate;          // 修改日期
    private String modifiedBy;          // 修改人員
    private String image;               // 照片   // todo

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
        this.password = CMd5Tools.encode(password);
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
    public CUserView decodeResult(ResultSet resultSet) throws SQLException {
        setAccount(resultSet.getInt(CSqlMapping.FLDACCOUNT));
        setUserName(resultSet.getNString(CSqlMapping.FLDUSERNAME));
        setUserId(resultSet.getString(CSqlMapping.FLDUSEDID));
        setPassword(resultSet.getString(CSqlMapping.FLDPASSWORD));
        setGender(EGender.valueOf(resultSet.getString(CSqlMapping.FLDGENDER)));
        setPhone(resultSet.getString(CSqlMapping.FLDPHONE));
        setMobile(resultSet.getString(CSqlMapping.FLDMOBILE));
        setAddress(resultSet.getString(CSqlMapping.FLDADDRESS));
        setHome(resultSet.getString(CSqlMapping.FLDHOME));
        setBirthday(resultSet.getDate(CSqlMapping.FLDBIRTHDAT));
        setHeight(resultSet.getInt(CSqlMapping.FLDHEIGHT));
        setWeight(resultSet.getInt(CSqlMapping.FLDWEIGHT));
        setBloodType(EBloodType.valueOf(resultSet.getString(CSqlMapping.FLDBLOODTYPE)));
        setSmoking(resultSet.getBoolean(CSqlMapping.FLDISSMOKING));
        setVegetarian(resultSet.getBoolean(CSqlMapping.FLDISVEGETARIAN));
        setDrinking(resultSet.getBoolean(CSqlMapping.FLDISDRINKING));
        setZodiac(EZodiac.valueOf(resultSet.getString(CSqlMapping.FLDZODIAC)));
        setReligion(EReligion.valueOf(resultSet.getString(CSqlMapping.FLDRELIGION)));
        setEducation(EEducation.valueOf(resultSet.getString(CSqlMapping.FLDEDUCATION)));
        setGraduateSchool(resultSet.getString(CSqlMapping.FLDGRADUATESCHOOL));
        setGraduateDepart(resultSet.getString(CSqlMapping.FLDGRADUATEDEPART));
        setCareer(ECareer.valueOf(resultSet.getString(CSqlMapping.FLDCAREER)));
        setWorkCity(ECity.valueOf(resultSet.getString(CSqlMapping.FLDWORKCITY)));
        setCompany(resultSet.getString(CSqlMapping.FLDCOMPANY));
        setPosition(resultSet.getString(CSqlMapping.FLDPOSITION));
        setLiveTogether(resultSet.getBoolean(CSqlMapping.FLDISLIVETOGETHER));
        setLineId(resultSet.getString(CSqlMapping.FLDLINEID));
        setEmail(resultSet.getString(CSqlMapping.FLDEMAIL));
        setHobbies(resultSet.getString(CSqlMapping.FLDHOBBIES));
        return this;
    }
}
