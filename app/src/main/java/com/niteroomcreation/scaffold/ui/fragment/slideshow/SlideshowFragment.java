package com.niteroomcreation.scaffold.ui.fragment.slideshow;

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
        setFragmentTitle(SlideshowFragment.class.getSimpleName());
        return new SlideshowFragment();
    }

    @Override
    protected int contentLayout() {
        return R.layout.f_home;
    }

    @Override
    protected void initComponents() {
        tvDummy.setText(getFragmentTitle());
    }
}
