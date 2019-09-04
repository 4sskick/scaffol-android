package com.niteroomcreation.scaffold.ui.fragment.tool;

import com.niteroomcreation.scaffold.ui.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 04/09/19
 */
public class ToolPresenter extends BasePresenter<ToolContract.View> implements ToolContract.Presenter {

    public ToolPresenter(ToolContract.View view) {
        this.mView = view;
    }

    @Override
    public void onViewActive(ToolContract.View view) {

    }

    @Override
    public void onViewInactive() {

    }
}
