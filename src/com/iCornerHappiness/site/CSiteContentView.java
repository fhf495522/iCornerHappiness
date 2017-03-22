package com.iCornerHappiness.site;

import com.iCornerHappiness.commons.CView;
import com.iCornerHappiness.enumeration.EContent;
import com.iCornerHappiness.enumeration.EContentType;
import com.iCornerHappiness.db.CSqlMapping;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by user on 2017/3/10.
 */
public class CSiteContentView extends CView {
    private EContent content;
    private int contentOrder;
    private String title;
    private String value;
    private String memo;

    public EContent getContent() {
        return content;
    }

    public void setContent(EContent content) {
        this.content = content;
    }

    public int getContentOrder() {
        return contentOrder;
    }

    public void setContentOrder(int contentOrder) {
        this.contentOrder = contentOrder;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public CSiteContentView decodeResult(ResultSet resultSet) throws SQLException {
        setContent(EContent.valueOf(resultSet.getString(CSqlMapping.FLDCONTENT)));
        setContentOrder(resultSet.getInt(CSqlMapping.FLDCONTENTORDER));
        setTitle(resultSet.getString(CSqlMapping.FLDTITLE));
        setValue(resultSet.getString(CSqlMapping.FLDVALUE));
        setMemo(resultSet.getString(CSqlMapping.FLDMEMO));
        return this;
    }
}
