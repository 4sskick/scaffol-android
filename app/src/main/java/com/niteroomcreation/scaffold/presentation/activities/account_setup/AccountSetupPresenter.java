package com.niteroomcreation.scaffold.presentation.activities.account_setup;

import android.content.Context;

import com.niteroomcreation.scaffold.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 18/04/2020.
 * please be sure to add credential if you use people's code
 */
public class AccountSetupPresenter extends BasePresenter<AccountSetupContract.View> implements AccountSetupContract.Presenter {

    AccountSetupPresenter(AccountSetupContract.View view, Context context) {
        super.onViewActive(view, context);
    }
}
