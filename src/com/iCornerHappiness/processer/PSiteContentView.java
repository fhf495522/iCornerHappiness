package com.iCornerHappiness.processer;

import com.iCornerHappiness.enumeration.EContent;
import com.iCornerHappiness.enumeration.EContentType;
import com.iCornerHappiness.site.CSiteContentView;

/**
 * Created by user on 2017/3/12.
 */
public class PSiteContentView {
    private CSiteContentView view;

    public PSiteContentView(){
        view = new CSiteContentView();
    }

    public PSiteContentView(CSiteContentView view) {
        this.view = view;
    }

    public CSiteContentView getView() {
        return view;
    }

    public EContent getContent() {
        return view.getContent();
    }

    public void setContent(EContent content) {
        view.setContent(content);
    }

    public void setTitle(String title) {
        view.setTitle(title);
    }

    public void setContentOrder(int contentOrder) {
        view.setContentOrder(contentOrder);
    }

    public String getTitle() {
        return view.getTitle();
    }

    public int getContentOrder() {
        return view.getContentOrder();
    }

    public void setValue(String value) {
        view.setValue(value);
    }

    public String getValue() {
        return view.getValue();
    }
}
