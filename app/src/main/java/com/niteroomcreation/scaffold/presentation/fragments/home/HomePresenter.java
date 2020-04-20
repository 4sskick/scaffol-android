package com.niteroomcreation.scaffold.presentation.fragments.home;

import android.content.Context;

import com.niteroomcreation.scaffold.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 04/09/19
 */
public class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {

    public HomePresenter(HomeContract.View view, Context context) {
        super.onViewActive(view, context);
    }

}
