package com.niteroomcreation.scaffold.ui.fragment.home;

import com.niteroomcreation.scaffold.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 04/09/19
 */
public class HomePresenter extends BasePresenter<HomeContract.View> implements HomeContract.Presenter {

    public HomePresenter(HomeContract.View view) {
        this.mView = view;
    }

    @Override
    public void onViewActive(HomeContract.View view) {

    }

    @Override
    public void onViewInactive() {

    }
}
