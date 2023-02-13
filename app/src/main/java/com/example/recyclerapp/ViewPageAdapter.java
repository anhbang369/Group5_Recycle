package com.example.recyclerapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPageAdapter extends FragmentStatePagerAdapter {

    public ViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FeaturedFragment();
            case 1:
                return new DealsFragment();
            case 2:
                return new CategoriesFragment();
            default:
                return new FeaturedFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Featured";
                break;
            case 1:
                title = "Deals";
                break;
            case 2:
                title = "Categories";
                break;
        }
        return title;
    }
}
