package com.niteroomcreation.scaffold.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.utils.LocalLangHelper;
import com.niteroomcreation.scaffold.utils.LogHelper;
import com.niteroomcreation.scaffold.utils.PrefKeys;
import com.niteroomcreation.scaffold.view.GenericStateView;
import com.pixplicity.easyprefs.library.Prefs;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Septian Adi Wijaya on 03/09/19
 */
public abstract class BaseView extends AppCompatActivity implements IBaseView,
        BaseFragmentView.BaseFragmentCallback {

    private static final String TAG = BaseView.class.getSimpleName();

    public static final int EMPTY_LAYOUT = 0;

    @BindView(R.id.layout_content)
    RelativeLayout layoutContent;
    @BindView(R.id.layout_empty)
    GenericStateView layoutEmpty;

    private Activity mActivity;
    private FragmentManager fragmentManager;
    private Toast mToast;

    protected abstract int parentLayout();

    protected abstract int contentLayout();

    protected abstract void initComponents(@Nullable Bundle savedInstanceState);

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(LocalLangHelper.wrap(newBase
                , Prefs.getString(PrefKeys.KEY_LOCAL_LANG_SELECTED, Locale.getDefault()
                        .getLanguage())));


        LogHelper.e(TAG, Prefs.getString(PrefKeys.KEY_LOCAL_LANG_SELECTED, Locale.getDefault()
                .getLanguage()));
    }

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
                LayoutInflater inflater =
                        (LayoutInflater) this.getSystemService(LAYOUT_INFLATER_SERVICE);
                inflater.inflate(contentLayout(), layoutContent);
            } catch (Exception e) {
                throw new IllegalStateException("Inflating contentLayout() failed on " + this.getClass().getSimpleName());
            }
        else
            throw new IllegalStateException("contentLayout() can't be EMPTY " + this.getClass().getSimpleName());

        ButterKnife.bind(this);
        mActivity = this;
        fragmentManager = ((BaseView) mActivity).getSupportFragmentManager();
        hideEmptyState();
        initComponents(savedInstanceState);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
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
        if (mToast != null) {
            mToast.cancel();
            mToast = null;
        }

        if (message != null && !message.isEmpty()) {
            mToast = Toast.makeText(this, message, Toast.LENGTH_LONG);
            mToast.show();
        }
    }

    @Override
    public void showErrorMessage(int messageRes, int messageResAction) {
        //should be use toast with action button
    }

    @Override
    public void showEmptyState() {
        hideEmptyState();
        layoutEmpty.setListener(new GenericStateView.GenericStateListener() {
            @Override
            public void onActionClicked() {
                Log.e("tagTes", "onActionClicked: callng me? onActionClicked()");
            }

            @Override
            public void onFooterClicked() {
                Log.e("tagTes", "onActionClicked: callng me? onFooterClicked()");
            }
        });
        layoutEmpty.showState();
    }

    @Override
    public void hideEmptyState() {
        layoutEmpty.hideAll();
    }

    @Override
    public void onFragmentAttached() {

    }

    @Override
    public void onFragmentDetached(String tag) {

    }

    public void moveToFragment(int viewIdFrameLayout, BaseFragmentView fragment,
                               String fragmentTag) {
        try {
            fragmentManager.beginTransaction()
                    .replace(viewIdFrameLayout, fragment, fragmentTag)
                    .commit();
        } catch (Exception e) {
            throw new IllegalStateException(String.format("Seems like fragmentManager isn't " +
                    "initialized %s", e.getMessage()));
        }
    }

    public FragmentManager getBaseMainFragmentManager() {
        return fragmentManager;
    }
}
