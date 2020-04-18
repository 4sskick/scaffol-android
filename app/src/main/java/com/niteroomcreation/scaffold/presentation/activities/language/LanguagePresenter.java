package com.niteroomcreation.scaffold.presentation.activities.language;

import com.niteroomcreation.scaffold.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 18/04/2020.
 * please be sure to add credential if you use people's code
 */
public class LanguagePresenter extends BasePresenter<LanguageContract.View> implements LanguageContract.Presenter {

    LanguagePresenter(LanguageContract.View view) {
        super.onViewActive(view);
    }
}
