package com.niteroomcreation.scaffold.presentation.fragments.slideshow;

import android.view.View;
import android.widget.TextView;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseFragmentView;

import butterknife.BindView;

/**
 * Created by Septian Adi Wijaya on 04/09/19
 */
public class SlideshowFragment extends BaseFragmentView implements SlideshowContract.View {

    @BindView(R.id.tv_dummy)
    TextView tvDummy;

    public static SlideshowFragment newInstance() {
        return new SlideshowFragment();
    }

    @Override
    protected int contentLayout() {
        return R.layout.f_home;
    }

    @Override
    protected void initComponents(View view) {
        tvDummy.setText(getFragmentTitle());
    }
}
