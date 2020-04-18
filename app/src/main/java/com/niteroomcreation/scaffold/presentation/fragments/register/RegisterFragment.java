package com.niteroomcreation.scaffold.presentation.fragments.register;

import android.view.View;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseFragmentView;

/**
 * Created by Septian Adi Wijaya on 18/04/2020.
 * please be sure to add credential if you use people's code
 */
public class RegisterFragment extends BaseFragmentView implements RegisterContract.View {

    private static final String TAG = RegisterFragment.class.getSimpleName();

    public static RegisterFragment newInstance(){
        return new RegisterFragment();
    }

    @Override
    protected int contentLayout() {
        return R.layout.f_register;
    }

    @Override
    protected void initComponents(View view) {

    }
}
