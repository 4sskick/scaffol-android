package com.niteroomcreation.scaffold.base;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.AppCompatImageView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.utils.LocalLangHelper;
import com.niteroomcreation.scaffold.utils.LogHelper;
import com.niteroomcreation.scaffold.utils.PrefKeys;
import com.pixplicity.easyprefs.library.Prefs;

import java.util.Locale;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Optional;

/**
 * Created by Septian Adi Wijaya on 06/09/19
 */
public abstract class BaseDialogView extends DialogFragment implements IBaseDialogView {

    private static final String TAG = BaseDialogView.class.getSimpleName();
    public static final int MODE_DEFAULT = 0;
    public static final int MODE_CUSTOM = 1;

    @Nullable
    @BindView(R.id.b_dialog_content)
    FrameLayout bDialogContent;

    @Nullable
    @BindView(R.id.b_dialog_ic_close)
    AppCompatImageView bDialogIcClose;

    @Nullable
    @BindView(R.id.b_dialog_parent)
    ConstraintLayout bDialogParent;

    private boolean dismissible;
    private BaseView mActivity;

    protected abstract int parentLayout();

    protected abstract int contentLayout();

    protected abstract void initComponent(View view);

    protected abstract int getDialogMode();

    @Override
    public void onAttach(Context context) {
        super.onAttach(LocalLangHelper.wrap(context
                , Prefs.getString(PrefKeys.KEY_LOCAL_LANG_SELECTED
                        , Locale.getDefault().getLanguage())));

        LogHelper.e(TAG, Prefs.getString(PrefKeys.KEY_LOCAL_LANG_SELECTED
                , Locale.getDefault().getLanguage()));

        if (context instanceof BaseView) {
            BaseView act = (BaseView) context;
            this.mActivity = act;
            act.onFragmentAttached();
        }

    }

    @Override
    public void onDetach() {
        mActivity = null;
        super.onDetach();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mActivity = (BaseView) getDialog().getOwnerActivity();
//        mActivity = (BaseView) getActivity();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_FRAME, R.style.AppTheme_DialogFullscreen);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getDialogMode() == MODE_DEFAULT ?
                        R.layout.b_dialog_fragment : parentLayout()
                , container
                , false);

        if (getDialogMode() == MODE_DEFAULT) {
            bDialogContent = view.findViewById(R.id.b_dialog_content);

            if (contentLayout() != 0 && bDialogContent != null) {
                View innerView = inflater.inflate(contentLayout(), null);
                bDialogContent.addView(innerView);
            }
        }

        ButterKnife.bind(this, view);

        initComponent(view);
        return view;
    }

    @Optional
    @OnClick({R.id.b_dialog_dismiss_area, R.id.b_dialog_ic_close})
    public void onViewClicked(View view) {

        if (getDismissible()) {
            switch (view.getId()) {
                case R.id.b_dialog_dismiss_area:
                case R.id.b_dialog_ic_close:
                    dismiss();
                    break;
            }
        }
    }

    public void setDismissible(boolean dismissible) {
        this.dismissible = dismissible;
    }

    public boolean getDismissible() {
        return dismissible;
    }

    public BaseView getParentActivity() {
        return mActivity;
    }

    @Override
    public void dismiss() {
        try {
            dismissAllowingStateLoss();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onDismissDialog(String dialogTag) {
        dismiss();
        getParentActivity().onFragmentDetached(dialogTag);
    }

    @Override
    public void showLoading() {
        if (getParentActivity() != null)
            getParentActivity().showLoading();
    }

    @Override
    public void hideLoading() {
        if (getParentActivity() != null)
            getParentActivity().hideLoading();
    }

    @Override
    public boolean isShownLoading() {
        return getParentActivity() != null && getParentActivity().isShownLoading();
    }

    @Override
    public void showMessage(String message) {
        if (getParentActivity() != null)
            getParentActivity().showMessage(message);
    }

    @Override
    public void showErrorMessage(int messageRes, int messageResAction) {
        if (getParentActivity() != null)
            getParentActivity().showErrorMessage(messageRes, messageResAction);
    }

    @Override
    public void showEmptyState() {
        if (getParentActivity() != null)
            getParentActivity().showEmptyState();
    }

    @Override
    public void hideEmptyState() {
        if (getParentActivity() != null)
            getParentActivity().hideEmptyState();
    }
}
