package com.niteroomcreation.scaffold.base;

import android.content.Context;

/**
 * Created by Septian Adi Wijaya on 03/09/19
 */
public class BasePresenter<ViewT> implements IBasePresenter<ViewT> {

    protected ViewT mView;
    protected Context mContext;

    @Override
    public void onViewActive(ViewT view, Context mContext) {
        this.mView = view;
        this.mContext = mContext;
    }

    @Override
    public void onViewInactive() {
        this.mView = null;
        this.mContext = null;
    }
}
