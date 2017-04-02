package com.iCornerHappiness.processer;

import com.iCornerHappiness.user.CUserQueryView;
import com.iCornerHappiness.user.CUserView;

/**
 * Created by user on 2017/3/22.
 */
public class PUserQueryView {
    private CUserQueryView view;

    public PUserQueryView() {
        view = new CUserQueryView();
    }

    public CUserQueryView getView() {
        return view;
    }
}
