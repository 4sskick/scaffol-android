package com.niteroomcreation.scaffold.presentation.fragments.gallery;

import android.content.Context;

import com.niteroomcreation.scaffold.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 04/09/19
 */
public class GalleryPresenter extends BasePresenter<GalleryContract.View> implements GalleryContract.Presenter {

    public GalleryPresenter(GalleryContract.View view, Context context) {
        super.onViewActive(view, context);
    }

}
