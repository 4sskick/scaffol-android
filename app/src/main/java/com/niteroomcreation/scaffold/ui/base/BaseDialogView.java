package com.niteroomcreation.scaffold.ui.base;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.View;

/**
 * Created by Septian Adi Wijaya on 06/09/19
 */
public abstract class BaseDialogView extends DialogFragment implements IBaseDialogView {


    protected abstract int parentLayout();

    protected abstract int contentLayout();

    protected abstract String getDialogTitle();

    protected abstract String getDialogSubTitle();

    protected abstract void initComponent();

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    @Override
    public void onDismissDialog(String dialogTag) {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public boolean isShownLoading() {
        return false;
    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public void showErrorMessage(int messageRes, int messageResAction) {

    }

    @Override
    public void showEmptyState() {

    }

    @Override
    public void hideEmptyState() {

    }
}
