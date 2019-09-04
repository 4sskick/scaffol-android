package com.niteroomcreation.scaffold.ui.fragment.tool;

import android.widget.TextView;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.ui.base.BaseFragmentView;

import butterknife.BindView;

/**
 * Created by Septian Adi Wijaya on 04/09/19
 */
public class ToolFragment extends BaseFragmentView implements ToolContract.View {

    @BindView(R.id.tv_dummy)
    TextView tvDummy;

    public static ToolFragment newInstance() {
        setFragmentTitle(ToolFragment.class.getSimpleName());
        return new ToolFragment();
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
