package com.example.boilerplatemvvm.di;

import com.example.boilerplatemvvm.BaseFragment;
import com.example.boilerplatemvvm.ui.MainFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class FragmentBuildersModule
{
    @ContributesAndroidInjector()
    abstract BaseFragment contributesBaseFragment();

    @ContributesAndroidInjector()
    abstract MainFragment contributesMainFragment();
}
