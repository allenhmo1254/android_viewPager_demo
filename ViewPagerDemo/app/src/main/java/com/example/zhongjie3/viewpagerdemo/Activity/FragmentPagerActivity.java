package com.example.zhongjie3.viewpagerdemo;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class FragmentPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<MainFragment> fragmentList;
    private FragmentAdapter fragmentAdapter;
    private FragmentStateAdapter fragmentStateAdapter;
    private FragmentManager fragmentManager;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_pager);

        initData();
        initView();
    }

    private void initData() {
        fragmentList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            MainFragment fragment = new MainFragment();
            MainBean bean = new MainBean();
            bean.setTitle("第" + i + "页");
            fragment.setBean(bean);
            fragmentList.add(fragment);
        }
    }

    private void initView() {
        initViewPager();
        initTabLayout();
    }

    private void initViewPager()
    {
        fragmentManager = getSupportFragmentManager();
        viewPager = (ViewPager) findViewById(R.id.fragment_pager);
        fragmentAdapter = new FragmentAdapter(fragmentManager, fragmentList);
        viewPager.setAdapter(fragmentAdapter);
    }

    private void initTabLayout()
    {
        mTabLayout = (TabLayout)findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(viewPager);
    }
}
