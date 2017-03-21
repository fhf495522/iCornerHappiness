package com.iCornerHappiness.commons;

import com.iCornerHappiness.exception.CornerException;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by user on 2017/3/13.
 */
public abstract class CView {
    public CView decodeResult(ResultSet resultSet) throws CornerException, SQLException {
        return null;
    }
}
