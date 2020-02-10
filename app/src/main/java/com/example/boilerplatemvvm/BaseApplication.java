package com.example.boilerplatemvvm;

import com.example.boilerplatemvvm.di.DaggerAppComponent;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class BaseApplication extends DaggerApplication {
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector()
    {
        return DaggerAppComponent.builder().builder(this).appComponent();
    }
}
