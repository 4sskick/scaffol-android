package com.niteroomcreation.scaffold.ui.fragment.gallery;

import android.widget.TextView;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.ui.base.BaseFragmentView;

import butterknife.BindView;

/**
 * Created by Septian Adi Wijaya on 04/09/19
 */
public class GalleryFragment extends BaseFragmentView implements GalleryContract.View {

    @BindView(R.id.tv_dummy)
    TextView tvDummy;

    public static GalleryFragment newInstance() {
        setFragmentTitle(GalleryFragment.class.getSimpleName());
        return new GalleryFragment();
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
