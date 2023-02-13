package com.example.recyclerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvData;

    private TabLayout mTabLayout;
    private ViewPager mViewPaper;

    private RecyclerView rcvUser;
    private UserAdapter mUserAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        mTabLayout = findViewById(R.id.tab_layout);
        mViewPaper = findViewById(R.id.view_paper);

        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPaper.setAdapter(viewPageAdapter);

        mTabLayout.setupWithViewPager(mViewPaper);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mUserAdapter != null){
            mUserAdapter.release();
        }
    }
}