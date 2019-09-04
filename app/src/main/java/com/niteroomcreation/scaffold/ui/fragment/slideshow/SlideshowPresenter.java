package com.niteroomcreation.scaffold.ui.fragment.slideshow;

import com.niteroomcreation.scaffold.ui.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 04/09/19
 */
public class SlideshowPresenter extends BasePresenter<SlideshowContract.View> implements SlideshowContract.Presenter {

    public SlideshowPresenter(SlideshowContract.View view) {
        this.mView = view;
    }

    @Override
    public void onViewActive(SlideshowContract.View view) {

    }

    @Override
    public void onViewInactive() {

    }
}
