package com.niteroomcreation.scaffold.presentation.fragments.register;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseFragmentView;
import com.niteroomcreation.scaffold.presentation.activities.account_setup.AccountSetupListener;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Septian Adi Wijaya on 18/04/2020.
 * please be sure to add credential if you use people's code
 */
public class RegisterFragment extends BaseFragmentView implements RegisterContract.View {

    private static final String TAG = RegisterFragment.class.getSimpleName();

    @BindView(R.id.edit_register_username)
    EditText editRegisterUsername;
    @BindView(R.id.edit_register_email)
    EditText editRegisterEmail;
    @BindView(R.id.edit_register_phone)
    EditText editRegisterPhone;
    @BindView(R.id.edit_register_passw)
    EditText editRegisterPassw;

    private AccountSetupListener mListener;
    private RegisterPresenter presenter = new RegisterPresenter(this, getContext());

    public static RegisterFragment newInstance() {
        return new RegisterFragment();
    }

    @Override
    protected int contentLayout() {
        return R.layout.f_register;
    }

    @Override
    protected void initComponents(View view) {

    }

    @OnClick({R.id.btn_register, R.id.btn_register_w_fb, R.id.btn_register_w_gl})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_register:
                mListener.onRegisterAction();
                break;
            case R.id.btn_register_w_fb:
                mListener.onFbRegister();
                break;
            case R.id.btn_register_w_gl:
                mListener.onGoglRegister();
                break;
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        if (context instanceof AccountSetupListener)
            mListener = (AccountSetupListener) context;
        else
            throw new RuntimeException(context + " must implement AccountSetupListener");
    }

    @Override
    public void onDetach() {
        mListener = null;
        super.onDetach();
    }
}
