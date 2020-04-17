package com.niteroomcreation.scaffold.ui.activity.splash;

import com.niteroomcreation.scaffold.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 17/04/2020.
 * please be sure to add credential if you use people's code
 */
public class SplashPresenter extends BasePresenter<SplashContract.View> implements SplashContract.Presenter {

    public SplashPresenter(SplashContract.View view) {
        onViewActive(view);
    }

}
