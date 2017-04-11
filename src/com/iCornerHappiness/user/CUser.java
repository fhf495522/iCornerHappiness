package com.iCornerHappiness.user;

import com.iCornerHappiness.commons.*;
import com.iCornerHappiness.db.CSqlMapping;
import com.iCornerHappiness.enumeration.EBloodType;
import com.iCornerHappiness.enumeration.ECareer;
import com.iCornerHappiness.enumeration.EEducation;
import com.iCornerHappiness.enumeration.EZodiac;
import com.iCornerHappiness.exception.CornerException;


import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by user on 2017/3/16.
 */
public class CUser {
    private final static String table = CSqlMapping.TBLUSER;
    Class obj = CUserView.class;

    public CUserView login(Connection conn, String userId, String password) throws CommonsException {
        CUserView cUserView;
        CSqlView queryView = new CSqlView(table);
        // query field (all)
//        queryView.setQueryFields();
        // where
        queryView.setWhereCondition(CSqlMapping.FLDUSEDID, userId);
        queryView.setWhereCondition(CSqlMapping.FLDPASSWORD, CMd5Tools.encode(password));
        ArrayList<CUserView> cUserViews = CSqlTools.selectList(obj, conn, queryView);
        if (cUserViews.size() == 0) {
            cUserView = null;
        } else {
            cUserView = cUserViews.get(0);
        }
        return cUserView;
    }

    public void addUser(Connection conn, CUserView cUserView) throws CommonsException {
        CSqlView insertView = new CSqlView(table);
        insertView.setFieldView(CSqlMapping.FLDACCOUNT, cUserView.getAccount());
        insertView.setFieldView(CSqlMapping.FLDUSERNAME, cUserView.getUserName());
        insertView.setFieldView(CSqlMapping.FLDUSEDID, cUserView.getUserId());
        insertView.setFieldView(CSqlMapping.FLDPASSWORD, CMd5Tools.encode(cUserView.getPassword()));
        insertView.setFieldView(CSqlMapping.FLDGENDER, cUserView.getGender() == null ? null : cUserView.getGender().toString());
        insertView.setFieldView(CSqlMapping.FLDPHONE, cUserView.getPhone());
        insertView.setFieldView(CSqlMapping.FLDMOBILE, cUserView.getMobile());
        insertView.setFieldView(CSqlMapping.FLDADDRESS, cUserView.getAddress());
        insertView.setFieldView(CSqlMapping.FLDHOME, cUserView.getHome());
        insertView.setFieldView(CSqlMapping.FLDBIRTHDAY, CDateTools.getStrDate(cUserView.getBirthday()));
        insertView.setFieldView(CSqlMapping.FLDHEIGHT, cUserView.getHeight());
        insertView.setFieldView(CSqlMapping.FLDWEIGHT, cUserView.getWeight());
        insertView.setFieldView(CSqlMapping.FLDBLOODTYPE, cUserView.getBloodType() == null ? null : cUserView.getBloodType().toString());
        insertView.setFieldView(CSqlMapping.FLDISSMOKING, cUserView.isSmoking());
        insertView.setFieldView(CSqlMapping.FLDISVEGETARIAN, cUserView.isVegetarian());
        insertView.setFieldView(CSqlMapping.FLDISDRINKING, cUserView.isDrinking());
        insertView.setFieldView(CSqlMapping.FLDZODIAC, cUserView.getZodiac() == null ? null : cUserView.getZodiac().toString());
        insertView.setFieldView(CSqlMapping.FLDRELIGION, cUserView.getReligion() == null ? null : cUserView.getReligion().toString());
        insertView.setFieldView(CSqlMapping.FLDEDUCATION, cUserView.getEducation() == null ? null : cUserView.getEducation().toString());
        insertView.setFieldView(CSqlMapping.FLDGRADUATESCHOOL, cUserView.getGraduateSchool());
        insertView.setFieldView(CSqlMapping.FLDGRADUATEDEPART, cUserView.getGraduateDepart());
        insertView.setFieldView(CSqlMapping.FLDCAREER, cUserView.getCareer() == null ? null : cUserView.getCareer().toString());
        insertView.setFieldView(CSqlMapping.FLDWORKCITY, cUserView.getWorkCity() == null ? null : cUserView.getWorkCity().toString());
        insertView.setFieldView(CSqlMapping.FLDCOMPANY, cUserView.getCompany());
        insertView.setFieldView(CSqlMapping.FLDPOSITION, cUserView.getPosition());
        insertView.setFieldView(CSqlMapping.FLDISLIVETOGETHER, cUserView.isLiveTogether());
        insertView.setFieldView(CSqlMapping.FLDLINEID, cUserView.getLineId());
        insertView.setFieldView(CSqlMapping.FLDEMAIL, cUserView.getEmail());
        insertView.setFieldView(CSqlMapping.FLDHOBBIES, cUserView.getHobbies());
        CSqlTools.insertSql(conn, insertView);
    }


    public ArrayList<CUserView> getUserList(Connection conn, CUserQueryView cUserQueryView) throws CommonsException, CornerException {
        CSqlView queryView = new CSqlView(table);
        ArrayList<CUserView> cUserViews = null;

        // query field (all)
        queryView.setQueryFields(CSqlMapping.FLDUSERNAME, CSqlMapping.FLDGENDER, CSqlMapping.FLDBIRTHDAY,
                CSqlMapping.FLDHEIGHT, CSqlMapping.FLDWEIGHT, CSqlMapping.FLDBLOODTYPE, CSqlMapping.FLDEDUCATION,
                CSqlMapping.FLDADDRESS, CSqlMapping.FLDWORKCITY);
        // todo where
        // 範例
//        queryView.setWhereCondition(CSqlMapping.FLDWORKCITY, EOperator.IN, new String[]{ECity.City1.toString(),ECity.City2.toString()});
//        queryView.setWhereCondition(CSqlMapping.FLDUSEDID, EOperator.LIKE, "22");
//        queryView.setWhereCondition(CSqlMapping.FLDBIRTHDAY, EOperator.BETWEEN, "2017-01-01", "2017-05-01");

        if (cUserQueryView.getAccount() != 0) {
            queryView.setWhereCondition(CSqlMapping.FLDACCOUNT, cUserQueryView.getAccount());
        }
        if (cUserQueryView.getUpBoundOfHeight() != 0) {
            queryView.setWhereCondition(CSqlMapping.FLDHEIGHT, EOperator.BETWEEN, Integer.toString(cUserQueryView.getLowerBoundOfHeight()),
                    Integer.toString(cUserQueryView.getUpBoundOfHeight()));
        } else {
            queryView.setWhereCondition(CSqlMapping.FLDHEIGHT, EOperator.GE, Integer.toString(cUserQueryView.getLowerBoundOfHeight()));
        }
        if (cUserQueryView.getUpBoundOfWeight() != 0) {
            queryView.setWhereCondition(CSqlMapping.FLDWEIGHT, EOperator.BETWEEN, Integer.toString(cUserQueryView.getLowerBoundOfWeight()),
                    Integer.toString(cUserQueryView.getUpBoundOfWeight()));
        } else {
            queryView.setWhereCondition(CSqlMapping.FLDWEIGHT, EOperator.GE, Integer.toString(cUserQueryView.getLowerBoundOfWeight()));
        }
        if (cUserQueryView.getBloodTypes() != null && cUserQueryView.getBloodTypes().size() != 0) {
            EBloodType[] eBloodTypesTemp = cUserQueryView.getBloodTypes().toArray(new EBloodType[0]);
            String[] eBloodTypes = new String[eBloodTypesTemp.length];
            for (int i = 0; i < eBloodTypesTemp.length; i++) {
                eBloodTypes[i] = eBloodTypesTemp[i].toString();
            }
            queryView.setWhereCondition(CSqlMapping.FLDBLOODTYPE, EOperator.IN, eBloodTypes);
        }
        if (cUserQueryView.getZodiacs() != null && cUserQueryView.getZodiacs().size() != 0) {
            EZodiac[] eZodiacsTemp = cUserQueryView.getZodiacs().toArray(new EZodiac[0]);
            String[] eZodiacs = new String[eZodiacsTemp.length];
            for (int i = 0; i < eZodiacsTemp.length; i++) {
                eZodiacs[i] = eZodiacsTemp[i].toString();
            }
            queryView.setWhereCondition(CSqlMapping.FLDZODIAC, EOperator.IN, eZodiacs);
        }
        if (cUserQueryView.getEducations() != null && cUserQueryView.getEducations().size() != 0) {
            EEducation[] eEducationsTemp = cUserQueryView.getEducations().toArray(new EEducation[0]);
            String[] eEducations = new String[eEducationsTemp.length];
            for (int i = 0; i < eEducationsTemp.length; i++) {
                eEducations[i] = eEducationsTemp[i].toString();
            }
            queryView.setWhereCondition(CSqlMapping.FLDEDUCATION, EOperator.IN, eEducations);
        }
        if (cUserQueryView.getNowLivingInCity() != null) {
            queryView.setWhereCondition(CSqlMapping.FLDADDRESS, EOperator.LIKE, cUserQueryView.getNowLivingInCity().toString().substring(0, 2));
        }
        if (cUserQueryView.getWorkCity() != null) {
            queryView.setWhereCondition(CSqlMapping.FLDWORKCITY, cUserQueryView.getWorkCity().toString());
        }
        if (cUserQueryView.getCareers() != null) {
            ECareer[] eCareersTemp = cUserQueryView.getCareers().toArray(new ECareer[0]);
            String[] eCareers = new String[eCareersTemp.length];
            for (int i = 0; i < eCareersTemp.length; i++) {
                eCareers[i] = eCareersTemp[i].toString();
            }
            queryView.setWhereCondition(CSqlMapping.FLDCAREER, EOperator.IN, eCareers);
        }
        ArrayList<CUserView> cUserViewsTemp = CSqlTools.selectList(obj, conn, queryView);
        if (cUserViewsTemp != null && cUserViewsTemp.size() != 0) {
            cUserViews = new ArrayList<>();
            for (CUserView cView : cUserViewsTemp) {
                if (cUserQueryView.getAstrologicals() != null && cUserQueryView.getAstrologicals().contains(cView.getAstrological())) {
                    if (cUserQueryView.getUpBoundOfAge() != 0 && cUserQueryView.getUpBoundOfAge() >= cUserQueryView.getLowerBoundOfAge()) {
                        if (cView.getAge() >= cUserQueryView.getLowerBoundOfAge() && cView.getAge() <= cUserQueryView.getUpBoundOfAge()) {
                            cUserViews.add(cView);
                        }
                    } else if (cUserQueryView.getUpBoundOfAge() == 0 && cView.getAge() >= cUserQueryView.getLowerBoundOfAge()) {
                        cUserViews.add(cView);
                    }
                }
            }
        }
        return cUserViews;
    }

    public void update(Connection conn, CUserView userView) throws CommonsException {
        CSqlView updateView = new CSqlView(table);
        updateView.setFieldView(CSqlMapping.FLDUSERNAME, userView.getUserName());
        updateView.setFieldView(CSqlMapping.FLDUSEDID, userView.getUserId());
//        updateView.setFieldView(CSqlMapping.FLDPASSWORD, userView.getPassword());
        updateView.setFieldView(CSqlMapping.FLDGENDER, userView.getGender() == null ? null : userView.getGender().toString());
        updateView.setFieldView(CSqlMapping.FLDPHONE, userView.getPhone());
        updateView.setFieldView(CSqlMapping.FLDMOBILE, userView.getMobile());
        updateView.setFieldView(CSqlMapping.FLDADDRESS, userView.getAddress());
        updateView.setFieldView(CSqlMapping.FLDHOME, userView.getHome());
        updateView.setFieldView(CSqlMapping.FLDBIRTHDAY, CDateTools.getStrDate(userView.getBirthday()));
        updateView.setFieldView(CSqlMapping.FLDHEIGHT, userView.getHeight());
        updateView.setFieldView(CSqlMapping.FLDWEIGHT, userView.getWeight());
        updateView.setFieldView(CSqlMapping.FLDBLOODTYPE, userView.getBloodType() == null ? null : userView.getBloodType().toString());
        updateView.setFieldView(CSqlMapping.FLDISSMOKING, userView.isSmoking());
        updateView.setFieldView(CSqlMapping.FLDISVEGETARIAN, userView.isVegetarian());
        updateView.setFieldView(CSqlMapping.FLDISDRINKING, userView.isDrinking());
        updateView.setFieldView(CSqlMapping.FLDZODIAC, userView.getZodiac() == null ? null : userView.getZodiac().toString());
        updateView.setFieldView(CSqlMapping.FLDRELIGION, userView.getReligion() == null ? null : userView.getReligion().toString());
//        updateView.setFieldView(CSqlMapping.FLDEDUCATION, userView.getEducation() == null ? null : userView.getEducation().toString());
//        updateView.setFieldView(CSqlMapping.FLDGRADUATESCHOOL, userView.getGraduateSchool());
//        updateView.setFieldView(CSqlMapping.FLDGRADUATEDEPART, userView.getGraduateDepart());
//        updateView.setFieldView(CSqlMapping.FLDCAREER, userView.getCareer() == null ? null : userView.getCareer().toString());
//        updateView.setFieldView(CSqlMapping.FLDWORKCITY, userView.getWorkCity() == null ? null : userView.getWorkCity().toString());
//        updateView.setFieldView(CSqlMapping.FLDCOMPANY, userView.getCompany());
//        updateView.setFieldView(CSqlMapping.FLDPOSITION, userView.getPosition());
//        updateView.setFieldView(CSqlMapping.FLDISLIVETOGETHER, userView.isLiveTogether());
//        updateView.setFieldView(CSqlMapping.FLDLINEID, userView.getLineId());
//        updateView.setFieldView(CSqlMapping.FLDEMAIL, userView.getEmail());
//        updateView.setFieldView(CSqlMapping.FLDHOBBIES, userView.getHobbies());
        updateView.setWhereCondition(CSqlMapping.FLDACCOUNT, userView.getAccount());
        CSqlTools.updateSql(conn, updateView);
    }
}
