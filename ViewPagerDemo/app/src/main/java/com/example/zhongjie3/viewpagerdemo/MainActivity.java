package com.example.zhongjie3.viewpagerdemo;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button viewPagerButton;
    private Button fragmentPagerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();
        initView();
    }

    private void initData() {

    }

    private void initView() {
        viewPagerButton = (Button)findViewById(R.id.viewPagerButton);
        viewPagerButton.setOnClickListener(this);
        fragmentPagerButton = (Button)findViewById(R.id.fragmentPagerButton);
        fragmentPagerButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        Intent intent = null;
        switch (viewId)
        {
            case R.id.viewPagerButton:
                intent = new Intent(MainActivity.this, ViewPagerActivity.class);
                break;
            case R.id.fragmentPagerButton:
                intent = new Intent(MainActivity.this, FragmentPagerActivity.class);
                break;
        }
        if (intent != null)
        {
            startActivity(intent);
        }
    }
}
