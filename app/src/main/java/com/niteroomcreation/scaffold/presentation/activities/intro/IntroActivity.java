package com.niteroomcreation.scaffold.presentation.activities.intro;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.niteroomcreation.scaffold.R;
import com.niteroomcreation.scaffold.base.BaseFragmentView;
import com.niteroomcreation.scaffold.base.BaseView;
import com.niteroomcreation.scaffold.presentation.adapters.GenericPagerAdapter;
import com.niteroomcreation.scaffold.utils.NavigationUtils;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import butterknife.BindView;
import butterknife.OnClick;
import me.relex.circleindicator.CircleIndicator;

/**
 * Created by Septian Adi Wijaya on 17/04/2020.
 * please be sure to add credential if you use people's code
 */
public class IntroActivity extends BaseView implements IntroContract.View {

    private static final String TAG = IntroActivity.class.getSimpleName();

    @BindView(R.id.layout_view_pager)
    ViewPager viewPager;
    @BindView(R.id.indicator)
    CircleIndicator indicator;

    private GenericPagerAdapter genericPagerAdapter;
    private ViewPager.OnPageChangeListener onPageChangeListener;

    private IntroContract.Presenter presenter = new IntroPresenter(this, this);

    @Override
    protected int parentLayout() {
        return 0;
    }

    @Override
    protected int contentLayout() {
        return R.layout.a_intro;
    }

    @Override
    protected void initComponents(Bundle savedInstanceState) {
        initViewPager();
    }

    private void initViewPager() {
        List<BaseFragmentView> fragments = presenter.constructFragmentIntro();
        genericPagerAdapter = new GenericPagerAdapter(getSupportFragmentManager(), fragments);
        viewPager.setAdapter(genericPagerAdapter);
        indicator.setViewPager(viewPager);

        onPageChangeListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        };

        viewPager.addOnPageChangeListener(onPageChangeListener);
        viewPager.setCurrentItem(0);
        viewPager.post(new Runnable() {
            @Override
            public void run() {
                onPageChangeListener.onPageSelected(viewPager.getCurrentItem());
            }
        });

        // https://medium.com/techsuzu/auto-slider-with-indicator-in-android-a28153d42125
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new SliderTimer(), 3000, 1000);
    }

    private class SliderTimer extends TimerTask {
        @Override
        public void run() {
            runOnUiThread(() -> {
                if (viewPager.getCurrentItem() < genericPagerAdapter.getCount() - 1) {
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
                } else {
                    viewPager.setCurrentItem(0);
                }
            });
        }
    }

    @OnClick({R.id.btn_intro_next, R.id.btn_intro_skip})
    void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_intro_skip:
            case R.id.btn_intro_next:
                NavigationUtils.directToChooseLanguageScreen(this);
                break;
        }
    }

}
