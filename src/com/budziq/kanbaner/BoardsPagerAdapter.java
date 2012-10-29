package com.budziq.kanbaner;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class BoardsPagerAdapter extends FragmentPagerAdapter {

    private static final String[] CONTENT = new String[] { "This", "Is", "A", "First", "Attempt" };

    public BoardsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int arg0) {
        Fragment f = BoardListFragment.newInstance(CONTENT[arg0]);
        return f;
    }

    @Override
    public int getCount() {
        return CONTENT.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return CONTENT[position];
    }


}
