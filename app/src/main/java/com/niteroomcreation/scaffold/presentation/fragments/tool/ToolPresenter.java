package com.niteroomcreation.scaffold.presentation.fragments.tool;

import android.content.Context;

import com.niteroomcreation.scaffold.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 04/09/19
 */
public class ToolPresenter extends BasePresenter<ToolContract.View> implements ToolContract.Presenter {

    public ToolPresenter(ToolContract.View view, Context context) {
        super.onViewActive(view, context);
    }

}
