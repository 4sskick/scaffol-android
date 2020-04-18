package com.niteroomcreation.scaffold.presentation.activities.account_setup;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseView;
import com.niteroomcreation.scaffold.presentation.fragments.login.LoginFragment;
import com.niteroomcreation.scaffold.presentation.fragments.register.RegisterFragment;
import com.niteroomcreation.scaffold.utils.LogHelper;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Septian Adi Wijaya on 18/04/2020.
 * please be sure to add credential if you use people's code
 */
public class AccountSetupActivity extends BaseView implements AccountSetupContract.View {

    private static final String TAG = AccountSetupActivity.class.getSimpleName();

    @BindView(R.id.fl_account_setup)
    FrameLayout flAccountSetup;
    @BindView(R.id.txt_account_setup_label)
    TextView txtAccountSetupLabel;
    @BindView(R.id.txt_account_setup_label_state)
    TextView txtAccountSetupLabelState;

    @Override
    protected int parentLayout() {
        return 0;
    }

    @Override
    protected int contentLayout() {
        return R.layout.a_account_setup;
    }

    @Override
    protected void initComponents(@Nullable Bundle savedInstanceState) {
        moveToFragment(flAccountSetup.getId()
                , LoginFragment.newInstance()
                , LoginFragment.class.getSimpleName());

        setupBannerState();
    }

    @OnClick({R.id.layout_account_setup_bottom})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.layout_account_setup_bottom:

                if (setupBannerState() instanceof LoginFragment)
                    moveToFragment(flAccountSetup.getId()
                            , RegisterFragment.newInstance()
                            , RegisterFragment.class.getSimpleName());
                else if (setupBannerState() instanceof RegisterFragment) {
                    moveToFragment(flAccountSetup.getId()
                            , LoginFragment.newInstance()
                            , LoginFragment.class.getSimpleName());
                }
                setupBannerState();
                break;
        }
    }

    private Fragment setupBannerState() {

        Fragment f = getSupportFragmentManager().findFragmentById(flAccountSetup.getId());

        if (f instanceof RegisterFragment) {
            LogHelper.e(TAG, "login");

            txtAccountSetupLabel.setText(getResources().getString(R.string.str_need_register));
            txtAccountSetupLabelState.setText(getResources().getString(R.string.str_register));

        } else if (f instanceof LoginFragment) {
            LogHelper.e(TAG, "register");

            txtAccountSetupLabel.setText(getResources().getString(R.string.str_need_login));
            txtAccountSetupLabelState.setText(getResources().getString(R.string.str_login));

        }

        return f;
    }
}
