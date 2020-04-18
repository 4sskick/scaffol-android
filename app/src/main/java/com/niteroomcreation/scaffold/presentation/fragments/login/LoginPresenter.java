package com.niteroomcreation.scaffold.presentation.fragments.login;

import com.niteroomcreation.scaffold.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 18/04/2020.
 * please be sure to add credential if you use people's code
 */
public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter {

    LoginPresenter(LoginContract.View view){
        super.onViewActive(view);
    }
}
