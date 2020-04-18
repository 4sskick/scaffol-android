package com.niteroomcreation.scaffold.presentation.activities.language;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseView;
import com.niteroomcreation.scaffold.utils.LogHelper;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Septian Adi Wijaya on 18/04/2020.
 * please be sure to add credential if you use people's code
 */
public class LanguageActivity extends BaseView implements LanguageContract.View {

    private static final String TAG = LanguageActivity.class.getSimpleName();

    @BindView(R.id.radio_language_id)
    RadioButton radioLanguageId;
    @BindView(R.id.radio_language_en)
    RadioButton radioLanguageEn;
    @BindView(R.id.radio_language)
    RadioGroup radioLanguage;

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

        radioLanguage.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton radioButton = (RadioButton) group.findViewById(checkedId);

                LogHelper.e(TAG, radioButton.getText().toString());
            }
        });

    }

    @OnClick({R.id.radio_language_id
            , R.id.radio_language_en
            , R.id.btn_language_save})
    public void onViewClicked(View view) {

        boolean checked = false;
        if (view instanceof RadioButton)
            checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.radio_language_id:
                radioLanguageId.setChecked(checked);
                break;
            case R.id.radio_language_en:
                radioLanguageEn.setChecked(checked);
                break;
            case R.id.btn_language_save:
//                NavigationUtils.directToAccountSetup(this);

                LogHelper.e(TAG,
                        "with checked button " + ((RadioButton) radioLanguage.findViewById(radioLanguage.getCheckedRadioButtonId())).getText().toString());

                break;
        }
    }
}
