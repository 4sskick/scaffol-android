package com.niteroomcreation.scaffold.ui.activity.main;

import com.niteroomcreation.scaffold.ui.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 03/09/19
 */
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    public MainPresenter(MainContract.View view){
        this.mView = view;
    }

    @Override
    public void onViewActive(MainContract.View view) {

    }

    @Override
    public void onViewInactive() {

    }
}
