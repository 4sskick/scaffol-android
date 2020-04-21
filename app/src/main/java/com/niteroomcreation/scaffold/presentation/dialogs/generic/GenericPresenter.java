package com.niteroomcreation.scaffold.presentation.dialogs.generic;

import android.content.Context;

import com.niteroomcreation.scaffold.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 21/04/2020.
 * please be sure to add credential if you use people's code
 */
public class GenericPresenter extends BasePresenter<GenericContract.View> implements GenericContract.Presenter {

    private static final String TAG = GenericPresenter.class.getSimpleName();

    GenericPresenter(GenericContract.View view, Context context) {
        super.onViewActive(view, context);
    }
}
