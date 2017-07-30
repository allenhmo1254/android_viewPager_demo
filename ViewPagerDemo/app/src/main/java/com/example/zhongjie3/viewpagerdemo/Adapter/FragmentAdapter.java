package com.example.zhongjie3.viewpagerdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by zhongjie3 on 2017/7/30.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    private List<MainFragment> fragmentList;

    public FragmentAdapter(FragmentManager fm, List<MainFragment> fragmentList)
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
        return fragmentList.get(position).getBean().getTitle();
    }
}
