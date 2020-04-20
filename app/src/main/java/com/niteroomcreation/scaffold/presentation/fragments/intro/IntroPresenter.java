package com.niteroomcreation.scaffold.presentation.fragments.intro;

import android.content.Context;

import com.niteroomcreation.scaffold.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 18/04/2020.
 * please be sure to add credential if you use people's code
 */
public class IntroPresenter extends BasePresenter<IntroContract.View> implements IntroContract.Presenter {

    IntroPresenter(IntroContract.View view, Context context) {
        super.onViewActive(view, context);
    }

}
