package com.niteroomcreation.scaffold.presentation.adapters;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.niteroomcreation.scaffold.base.BaseFragmentView;

import java.util.List;

/**
 * Created by Septian Adi Wijaya on 17/04/2020.
 * please be sure to add credential if you use people's code
 */
public class GenericPagerAdapter extends FragmentStatePagerAdapter {

    private List<BaseFragmentView> fragments;

    public GenericPagerAdapter(FragmentManager fm, List<BaseFragmentView> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragments.get(position).getFragmentTitle();
    }

    public void setFragments(List<BaseFragmentView> fragments) {
        this.fragments = fragments;
        notifyDataSetChanged();
    }

    public List<BaseFragmentView> getFragments() {
        return fragments;
    }

    public void setFragmentTitle(List<String> titles) {
        for (int i = 0; i < getCount(); i++) {
            getFragments().get(i).setFragmentTitle(titles.get(i));
        }
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        // refresh all fragments when data set changed
        return FragmentStatePagerAdapter.POSITION_NONE;
    }
}
