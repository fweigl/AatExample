package com.example.aatthrowaway;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {
    public MyAdapter(final FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(final int position) {
        return new MyFragment();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
