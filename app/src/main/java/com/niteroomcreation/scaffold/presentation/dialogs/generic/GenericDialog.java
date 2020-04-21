package com.niteroomcreation.scaffold.presentation.dialogs.generic;

import android.view.View;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseDialogView;

/**
 * Created by Septian Adi Wijaya on 21/04/2020.
 * please be sure to add credential if you use people's code
 */
public class GenericDialog extends BaseDialogView implements GenericContract.View {

    private static final String TAG = GenericDialog.class.getSimpleName();

    @Override
    protected int parentLayout() {
        return 0;
    }

    @Override
    protected int contentLayout() {
        return R.layout.d_generic;
    }

    @Override
    protected void initComponent(View view) {
        setDismissible(true);
    }

    @Override
    protected int getDialogMode() {
        return MODE_DEFAULT;
    }
}
