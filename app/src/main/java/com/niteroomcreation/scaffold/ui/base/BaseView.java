package com.niteroomcreation.scaffold.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.niteroomcreation.scaffold.R;

/**
 * Created by Septian Adi Wijaya on 03/09/19
 */
public abstract class BaseView extends AppCompatActivity implements IBaseView {

    abstract protected void initComponents();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.b_activity);

        initComponents();
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
}
