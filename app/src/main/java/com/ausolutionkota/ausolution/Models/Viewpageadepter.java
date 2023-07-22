package com.ausolutionkota.ausolution.Models;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Viewpageadepter extends FragmentPagerAdapter {
/** this adepter for tabe view main page(manage navigation activity ke liye h.*/
    private final ArrayList<Fragment> fragmentslist =new ArrayList<>();
    private final ArrayList<String> fragmentTitale = new ArrayList<>();

    public Viewpageadepter(@NonNull @NotNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @NotNull
    @Override
    public Fragment getItem(int position) {
        return fragmentslist.get(position);
    }

    @Override
    public int getCount() {
        return fragmentslist.size();
    }

    public void addFragment(Fragment fragment,String Titale){
        fragmentslist.add(fragment);
        fragmentTitale.add(Titale);
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitale.get(position);
    }
}
