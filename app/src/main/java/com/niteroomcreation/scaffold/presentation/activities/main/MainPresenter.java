package com.niteroomcreation.scaffold.presentation.activities.main;

import android.content.Context;

import com.niteroomcreation.scaffold.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 03/09/19
 */
public class MainPresenter extends BasePresenter<MainContract.View> implements MainContract.Presenter {

    public MainPresenter(MainContract.View view, Context context) {
        super.onViewActive(view, context);
    }

}
