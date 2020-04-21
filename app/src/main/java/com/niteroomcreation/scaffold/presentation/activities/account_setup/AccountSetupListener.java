package com.niteroomcreation.scaffold.presentation.activities.account_setup;

/**
 * Created by Septian Adi Wijaya on 21/04/2020.
 * please be sure to add credential if you use people's code
 */
public interface AccountSetupListener {
    void onLoginAction();

    void onFbLogin();

    void onGoglLogin();

    void onRegisterAction();

    void onFbRegister();

    void onGoglRegister();
}
