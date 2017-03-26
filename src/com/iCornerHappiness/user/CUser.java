package com.iCornerHappiness.user;

import com.iCornerHappiness.commons.*;
import com.iCornerHappiness.db.CSqlMapping;
import com.iCornerHappiness.processer.PUserQueryView;
import com.iCornerHappiness.processer.PUserView;

import java.sql.Connection;
import java.util.ArrayList;

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
        queryView.setWhereCondition(CSqlMapping.FLDPASSWORD, password);
        ArrayList<CUserView> cUserViews = CSqlTools.selectList(obj, conn, queryView);
        if (cUserViews.size() == 0){
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
        insertView.setFieldView(CSqlMapping.FLDPASSWORD, cUserView.getPassword());
        insertView.setFieldView(CSqlMapping.FLDGENDER, cUserView.getGender().toString());
        insertView.setFieldView(CSqlMapping.FLDPHONE, cUserView.getPhone());
        insertView.setFieldView(CSqlMapping.FLDMOBILE, cUserView.getMobile());
        insertView.setFieldView(CSqlMapping.FLDADDRESS, cUserView.getAddress());
        insertView.setFieldView(CSqlMapping.FLDHOME, cUserView.getHome());
        insertView.setFieldView(CSqlMapping.FLDBIRTHDAT, CDateTools.getStrDate(cUserView.getBirthday()));
        insertView.setFieldView(CSqlMapping.FLDHEIGHT, cUserView.getHeight());
        insertView.setFieldView(CSqlMapping.FLDWEIGHT, cUserView.getWeight());
        insertView.setFieldView(CSqlMapping.FLDBLOODTYPE, cUserView.getBloodType().toString());
        insertView.setFieldView(CSqlMapping.FLDISSMOKING, Boolean.valueOf(cUserView.isSmoking()).compareTo(false));
        insertView.setFieldView(CSqlMapping.FLDISVEGETARIAN, Boolean.valueOf(cUserView.isVegetarian()).compareTo(false));
        insertView.setFieldView(CSqlMapping.FLDISDRINKING, Boolean.valueOf(cUserView.isDrinking()).compareTo(false));
        insertView.setFieldView(CSqlMapping.FLDZODIAC, cUserView.getZodiac().toString());
        insertView.setFieldView(CSqlMapping.FLDRELIGION, cUserView.getReligion().toString());
        insertView.setFieldView(CSqlMapping.FLDEDUCATION, cUserView.getEducation().toString());
        insertView.setFieldView(CSqlMapping.FLDGRADUATESCHOOL, cUserView.getGraduateSchool());
        insertView.setFieldView(CSqlMapping.FLDGRADUATEDEPART, cUserView.getGraduateDepart());
        insertView.setFieldView(CSqlMapping.FLDCAREER, cUserView.getCareer().toString());
        insertView.setFieldView(CSqlMapping.FLDWORKCITY, cUserView.getWorkCity().toString());
        insertView.setFieldView(CSqlMapping.FLDCOMPANY, cUserView.getCompany());
        insertView.setFieldView(CSqlMapping.FLDPOSITION, cUserView.getPosition());
        insertView.setFieldView(CSqlMapping.FLDISLIVETOGETHER, Boolean.valueOf(cUserView.isLiveTogether()).compareTo(false));
        insertView.setFieldView(CSqlMapping.FLDLINEID, cUserView.getLineId());
        insertView.setFieldView(CSqlMapping.FLDEMAIL, cUserView.getEmail());
        insertView.setFieldView(CSqlMapping.FLDHOBBIES, cUserView.getHobbies());
        CSqlTools.insertSql(conn, insertView);
    }


    public ArrayList<CUserView> getUserList(Connection conn, CUserQueryView cUserQueryView) {

        return null;
    }
}
