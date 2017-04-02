package com.iCornerHappiness.user;

import com.iCornerHappiness.commons.*;
import com.iCornerHappiness.db.CSqlMapping;
import com.iCornerHappiness.enumeration.ECity;
import com.iCornerHappiness.exception.CornerException;

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
        queryView.setWhereCondition(CSqlMapping.FLDPASSWORD, CMd5Tools.encode(password));
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
        insertView.setFieldView(CSqlMapping.FLDGENDER, cUserView.getGender()==null?null:cUserView.getGender().toString());
        insertView.setFieldView(CSqlMapping.FLDPHONE, cUserView.getPhone());
        insertView.setFieldView(CSqlMapping.FLDMOBILE, cUserView.getMobile());
        insertView.setFieldView(CSqlMapping.FLDADDRESS, cUserView.getAddress());
        insertView.setFieldView(CSqlMapping.FLDHOME, cUserView.getHome());
        insertView.setFieldView(CSqlMapping.FLDBIRTHDAT, CDateTools.getStrDate(cUserView.getBirthday()));
        insertView.setFieldView(CSqlMapping.FLDHEIGHT, cUserView.getHeight());
        insertView.setFieldView(CSqlMapping.FLDWEIGHT, cUserView.getWeight());
        insertView.setFieldView(CSqlMapping.FLDBLOODTYPE, cUserView.getBloodType()==null?null:cUserView.getBloodType().toString());
        insertView.setFieldView(CSqlMapping.FLDISSMOKING, cUserView.isSmoking());
        insertView.setFieldView(CSqlMapping.FLDISVEGETARIAN, cUserView.isVegetarian());
        insertView.setFieldView(CSqlMapping.FLDISDRINKING, cUserView.isDrinking());
        insertView.setFieldView(CSqlMapping.FLDZODIAC, cUserView.getZodiac()==null?null:cUserView.getZodiac().toString());
        insertView.setFieldView(CSqlMapping.FLDRELIGION, cUserView.getReligion()==null?null:cUserView.getReligion().toString());
        insertView.setFieldView(CSqlMapping.FLDEDUCATION, cUserView.getEducation()==null?null:cUserView.getEducation().toString());
        insertView.setFieldView(CSqlMapping.FLDGRADUATESCHOOL, cUserView.getGraduateSchool());
        insertView.setFieldView(CSqlMapping.FLDGRADUATEDEPART, cUserView.getGraduateDepart());
        insertView.setFieldView(CSqlMapping.FLDCAREER, cUserView.getCareer()==null?null:cUserView.getCareer().toString());
        insertView.setFieldView(CSqlMapping.FLDWORKCITY, cUserView.getWorkCity()==null?null:cUserView.getWorkCity().toString());
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
        // query field (all)
//        queryView.setQueryFields();
        // todo where
        // 範例
        queryView.setWhereCondition(CSqlMapping.FLDWORKCITY, EOperator.IN, new String[]{ECity.City1.toString(),ECity.City2.toString()});
        queryView.setWhereCondition(CSqlMapping.FLDUSEDID, EOperator.LIKE, "22");
        queryView.setWhereCondition(CSqlMapping.FLDBIRTHDAT, EOperator.BETWEEN, "2017-01-01", "2017-05-01");

        ArrayList<CUserView> cUserViews = CSqlTools.selectList(obj, conn, queryView);
        return cUserViews;
    }
}
