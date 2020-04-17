package com.niteroomcreation.scaffold.presentation.activities.intro;

import com.niteroomcreation.scaffold.base.BaseFragmentView;
import com.niteroomcreation.scaffold.base.IBasePresenter;
import com.niteroomcreation.scaffold.base.IBaseView;

import java.util.List;

/**
 * Created by Septian Adi Wijaya on 17/04/2020.
 * please be sure to add credential if you use people's code
 */
public interface IntroContract {

    interface View extends IBaseView {

    }

    interface Presenter extends IBasePresenter<View> {
        List<BaseFragmentView> constructFragmentIntro();
    }

}
