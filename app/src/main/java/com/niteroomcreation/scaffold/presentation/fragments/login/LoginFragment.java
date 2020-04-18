package com.niteroomcreation.scaffold.presentation.fragments.login;

import android.view.View;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseFragmentView;

/**
 * Created by Septian Adi Wijaya on 18/04/2020.
 * please be sure to add credential if you use people's code
 */
public class LoginFragment extends BaseFragmentView implements LoginContract.View {

    private static final String TAG = LoginFragment.class.getSimpleName();

    public static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Override
    protected int contentLayout() {
        return R.layout.f_login;
    }

    @Override
    protected void initComponents(View view) {

    }
}
