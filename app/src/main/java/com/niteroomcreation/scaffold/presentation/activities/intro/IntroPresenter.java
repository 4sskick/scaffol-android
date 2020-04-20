package com.niteroomcreation.scaffold.presentation.activities.intro;

import android.content.Context;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseFragmentView;
import com.niteroomcreation.scaffold.base.BasePresenter;
import com.niteroomcreation.scaffold.data.model.intro.Intro;
import com.niteroomcreation.scaffold.presentation.fragments.intro.IntroFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Septian Adi Wijaya on 17/04/2020.
 * please be sure to add credential if you use people's code
 */
public class IntroPresenter extends BasePresenter<IntroContract.View> implements IntroContract.Presenter {

    IntroPresenter(IntroContract.View view, Context context) {
        super.onViewActive(view, context);
    }

    public List<BaseFragmentView> constructFragmentIntro() {

        List<BaseFragmentView> f = new ArrayList<>();
        f.add(IntroFragment.newInstance(new Intro(/*"Bukan Platform Biasa"*/mContext.getResources().getString(R.string.menu_home))));
        f.add(IntroFragment.newInstance(new Intro(/*"Pick Up Service"*/mContext.getResources().getString(R.string.str_register))));
        f.add(IntroFragment.newInstance(new Intro(/*"Cari Kamarmu Lebih Mudah"*/mContext.getResources().getString(R.string.menu_gallery))));

        return f;
    }

}
