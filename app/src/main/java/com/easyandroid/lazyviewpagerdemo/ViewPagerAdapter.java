package com.easyandroid.lazyviewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * package: com.easyandroid.lazyviewpagerdemo.ViewPagerAdapter
 * author: gyc
 * description:
 * time: create at 2017/4/13 10:12
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> mList;

    public ViewPagerAdapter(FragmentManager fm, List<Fragment> mList) {
        super(fm);
        this.mList = mList;
    }

    @Override
    public Fragment getItem(int position) {
        return mList.get(position);
    }

    @Override
    public int getCount() {
        return mList.size();
    }
}
