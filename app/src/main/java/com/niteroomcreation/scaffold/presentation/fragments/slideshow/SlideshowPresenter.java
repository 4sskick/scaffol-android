package com.niteroomcreation.scaffold.presentation.fragments.slideshow;

import android.content.Context;

import com.niteroomcreation.scaffold.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 04/09/19
 */
public class SlideshowPresenter extends BasePresenter<SlideshowContract.View> implements SlideshowContract.Presenter {

    public SlideshowPresenter(SlideshowContract.View view, Context context) {
        super.onViewActive(view, context);
    }

}
