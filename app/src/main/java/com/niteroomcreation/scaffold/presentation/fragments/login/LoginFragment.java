package com.niteroomcreation.scaffold.presentation.fragments.login;

import android.content.Context;
import android.view.View;
import android.widget.EditText;

import com.mobsandgeeks.saripaar.annotation.Email;
import com.mobsandgeeks.saripaar.annotation.Password;
import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseFragmentView;
import com.niteroomcreation.scaffold.presentation.activities.account_setup.AccountSetupListener;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by Septian Adi Wijaya on 18/04/2020.
 * please be sure to add credential if you use people's code
 */
public class LoginFragment extends BaseFragmentView implements LoginContract.View {

    private static final String TAG = LoginFragment.class.getSimpleName();

    @Email
    @BindView(R.id.edit_login_email)
    EditText editLoginEmail;
    @Password
    @BindView(R.id.edit_login_passw)
    EditText editLoginPassw;

    private AccountSetupListener mListener;
    private LoginPresenter presenter = new LoginPresenter(this, getContext());

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

    @OnClick({R.id.btn_login
            , R.id.btn_login_w_fb
            , R.id.btn_login_w_gl})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_login:
                mListener.onLoginAction();
                break;
            case R.id.btn_login_w_fb:
                mListener.onFbLogin();
                break;
            case R.id.btn_login_w_gl:
                mListener.onGoglLogin();
                break;
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof AccountSetupListener) {
            mListener = (AccountSetupListener) context;
        } else
            throw new RuntimeException(context + " must implement AccountSetupListener");
    }

    @Override
    public void onDetach() {
        mListener = null;
        super.onDetach();
    }
}
