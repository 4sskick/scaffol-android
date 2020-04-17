package com.niteroomcreation.scaffold.presentation.fragments.intro;

import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;
import android.widget.TextView;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseFragmentView;
import com.niteroomcreation.scaffold.data.model.intro.Intro;

import butterknife.BindView;

/**
 * Created by Septian Adi Wijaya on 18/04/2020.
 * please be sure to add credential if you use people's code
 */
public class IntroFragment extends BaseFragmentView implements IntroContract.View {

    private static final String TAG = IntroFragment.class.getSimpleName();
    @BindView(R.id.img_intro)
    AppCompatImageView imgIntro;
    @BindView(R.id.txt_intro)
    TextView txtIntro;
    @BindView(R.id.txt_intro_sub)
    AppCompatTextView txtIntroSub;

    private Intro model;

    public static IntroFragment newInstance(Intro model) {
        IntroFragment f = new IntroFragment();

        Bundle b = new Bundle();
        b.putParcelable("introParcel", model);

        f.setArguments(b);
        return f;
    }

    @Override
    protected int contentLayout() {
        return R.layout.f_intro;
    }

    @Override
    protected void initComponents(View view) {
        if(getArguments()!= null)
            model = getArguments().getParcelable("introParcel");

        if(model!=null) {
            txtIntro.setText(model.getTitle());
        }
    }

}
