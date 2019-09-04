package com.niteroomcreation.scaffold.ui.fragment.gallery;

import com.niteroomcreation.scaffold.ui.base.BasePresenter;

/**
 * Created by Septian Adi Wijaya on 04/09/19
 */
public class GalleryPresenter extends BasePresenter<GalleryContract.View> implements GalleryContract.Presenter {

    public GalleryPresenter(GalleryContract.View view) {
        this.mView = view;
    }

    @Override
    public void onViewActive(GalleryContract.View view) {

    }

    @Override
    public void onViewInactive() {

    }
}
