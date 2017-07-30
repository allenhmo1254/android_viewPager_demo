package com.example.zhongjie3.viewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by zhongjie3 on 2017/7/30.
 */

public class FragmentStateAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragmentList;

    public FragmentStateAdapter(FragmentManager fm, List<Fragment> fragmentList)
    {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) //必须实现
    {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() //必须实现
    {
        return fragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) //选择性实现
    {
        return fragmentList.get(position).getClass().getSimpleName();
    }
}
