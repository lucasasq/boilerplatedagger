package com.example.boilerplatemvvm.di;

import com.example.boilerplatemvvm.BaseActivity;
import com.example.boilerplatemvvm.ui.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule
{
   @ContributesAndroidInjector()
   abstract BaseActivity contributesBaseActivity();

    @ContributesAndroidInjector()
    abstract MainActivity contributesMainActivity();
}
