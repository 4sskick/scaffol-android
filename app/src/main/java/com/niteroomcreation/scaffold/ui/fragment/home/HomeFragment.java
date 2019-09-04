package com.niteroomcreation.scaffold.ui.fragment.home;

import android.widget.TextView;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.ui.base.BaseFragmentView;

import butterknife.BindView;

/**
 * Created by Septian Adi Wijaya on 04/09/19
 */
public class HomeFragment extends BaseFragmentView implements HomeContract.View {


    @BindView(R.id.tv_dummy)
    TextView tvDummy;

    public static HomeFragment newInstance() {
        setFragmentTitle(HomeFragment.class.getSimpleName());
        return new HomeFragment();
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
