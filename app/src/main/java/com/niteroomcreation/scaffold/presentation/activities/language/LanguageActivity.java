package com.niteroomcreation.scaffold.presentation.activities.language;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseView;
import com.niteroomcreation.scaffold.utils.LogHelper;

import butterknife.OnClick;

/**
 * Created by Septian Adi Wijaya on 18/04/2020.
 * please be sure to add credential if you use people's code
 */
public class LanguageActivity extends BaseView implements LanguageContract.View {

    private static final String TAG = LanguageActivity.class.getSimpleName();

    @Override
    protected int parentLayout() {
        return 0;
    }

    @Override
    protected int contentLayout() {
        return R.layout.a_language;
    }

    @Override
    protected void initComponents(@Nullable Bundle savedInstanceState) {

    }

    @OnClick({R.id.btn_language_save})
    void onVieClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_language_save:
                break;
        }
    }
}
