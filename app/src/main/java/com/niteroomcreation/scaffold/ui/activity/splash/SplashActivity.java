package com.niteroomcreation.scaffold.ui.activity.splash;

import android.os.Handler;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseView;
import com.niteroomcreation.scaffold.utils.NavigationUtils;

/**
 * Created by Septian Adi Wijaya on 17/04/2020.
 * please be sure to add credential if you use people's code
 */
public class SplashActivity extends BaseView implements SplashContract.View {
    @Override
    protected int parentLayout() {
        return 0;
    }

    @Override
    protected int contentLayout() {
        return R.layout.a_splash;
    }

    @Override
    protected void initComponents() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                NavigationUtils.directToMainScreen(SplashActivity.this);
            }
        }, 1000);
    }
}
