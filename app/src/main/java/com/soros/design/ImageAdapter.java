package com.soros.design;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Dev-04 on 2016/9/5 0005.
 */

public class ImageAdapter extends FragmentPagerAdapter {

    private List<String> mUrls;
    public ImageAdapter(FragmentManager manager, List<String> urls) {
        super(manager);
        this.mUrls = urls;
    }

    @Override
    public Fragment getItem(int position) {
        return ImageFragment.getInstance(mUrls.get(position));
    }

    @Override
    public int getCount() {
        return mUrls.size();
    }
}
