package com.example.zhongjie3.viewpagerdemo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<View> viewList;
    private ViewPagerAdapter viewPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        initData();
        initView();
    }

    private void initData()
    {
        viewList = new ArrayList<>();

        View view1 = new View(this);
        view1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        viewList.add(view1);

        View view2 = new View(this);
        view2.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        viewList.add(view2);

        View view3 = new View(this);
        view3.setBackgroundColor(getResources().getColor(R.color.colorYellow));
        viewList.add(view3);
    }

    private void initView()
    {
        viewPager = (ViewPager)findViewById(R.id.view_pager);
        viewPagerAdapter = new ViewPagerAdapter(viewList);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setPageTransformer(false, new MainPageTransformer());
    }
}
