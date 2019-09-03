package com.niteroomcreation.scaffold.ui.base;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.view.GenericStateView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Septian Adi Wijaya on 03/09/19
 */
public abstract class BaseView extends AppCompatActivity implements IBaseView {

    private static final int EMPTY_LAYOUT = 0;

    @BindView(R.id.layout_content)
    RelativeLayout layoutContent;
    @BindView(R.id.layout_empty)
    GenericStateView layoutEmpty;

    private Activity mActivity;

    protected abstract int parentLayout();

    protected abstract int contentLayout();

    abstract protected void initComponents();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (parentLayout() != EMPTY_LAYOUT)
            setContentView(parentLayout());
        else
            setContentView(R.layout.b_activity);

        if (contentLayout() != EMPTY_LAYOUT)
            try {
                layoutContent = findViewById(R.id.layout_content);
                LayoutInflater inflater = (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
                inflater.inflate(contentLayout(), layoutContent);
            } catch (Exception e) {
                throw new IllegalStateException("Inflating contentLayout() failed on " + this.getClass().getSimpleName());
            }

        ButterKnife.bind(this);
        mActivity = this;
        hideEmptyState();
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

    @Override
    public void showEmptyState() {
        hideEmptyState();
        layoutEmpty.showState();
    }

    @Override
    public void hideEmptyState() {
        layoutEmpty.hideAll();
    }
}
