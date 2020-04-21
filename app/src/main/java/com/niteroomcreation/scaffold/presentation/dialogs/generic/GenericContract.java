package com.niteroomcreation.scaffold.presentation.dialogs.generic;

import com.niteroomcreation.scaffold.base.IBaseDialogView;
import com.niteroomcreation.scaffold.base.IBasePresenter;

/**
 * Created by Septian Adi Wijaya on 21/04/2020.
 * please be sure to add credential if you use people's code
 */
public interface GenericContract {

    interface View extends IBaseDialogView {

    }

    interface Presenter extends IBasePresenter<View> {

    }

}
