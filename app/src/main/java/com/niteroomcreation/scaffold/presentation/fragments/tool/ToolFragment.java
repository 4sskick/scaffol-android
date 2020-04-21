package com.niteroomcreation.scaffold.presentation.fragments.tool;

import android.view.View;
import android.widget.TextView;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseFragmentView;

import butterknife.BindView;

/**
 * Created by Septian Adi Wijaya on 04/09/19
 */
public class ToolFragment extends BaseFragmentView implements ToolContract.View {

    @BindView(R.id.tv_dummy)
    TextView tvDummy;

    public static ToolFragment newInstance() {
        return new ToolFragment();
    }

    @Override
    protected int contentLayout() {
        return R.layout.f_home;
    }

    @Override
    protected void initComponents(View view) {
        setFragmentTitle(getResources().getString(R.string.menu_tools));
        tvDummy.setText(getFragmentTitle());
    }
}
