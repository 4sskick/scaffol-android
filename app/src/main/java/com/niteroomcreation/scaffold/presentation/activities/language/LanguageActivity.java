package com.niteroomcreation.scaffold.presentation.activities.language;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseView;
import com.niteroomcreation.scaffold.utils.LogHelper;
import com.niteroomcreation.scaffold.utils.NavigationUtils;
import com.niteroomcreation.scaffold.utils.PrefKeys;
import com.niteroomcreation.scaffold.utils.Utils;
import com.pixplicity.easyprefs.library.Prefs;

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

    private String langCode = null;

    @Override
    protected int parentLayout() {
        return 0;
    }

    @Override
    protected int contentLayout() {
        return R.layout.a_language;
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

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

        if (Prefs.getString(PrefKeys.KEY_LOCAL_LANG_SELECTED, "in").equals("en"))
            radioLanguageEn.performClick();
        else
            radioLanguageId.performClick();

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
                langCode = "in";
                break;
            case R.id.radio_language_en:
                radioLanguageEn.setChecked(checked);
                langCode = "en";
                break;
            case R.id.btn_language_save:
                Prefs.putString(PrefKeys.KEY_LOCAL_LANG_SELECTED, langCode);

                LogHelper.e(TAG,
                        "with checked button " + ((RadioButton) radioLanguage.findViewById(radioLanguage.getCheckedRadioButtonId())).getText().toString()
                                + "\non lang code " + langCode);

                NavigationUtils.directToAccountSetup(this);
                break;
        }
    }
}
