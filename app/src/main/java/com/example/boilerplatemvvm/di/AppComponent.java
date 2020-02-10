package com.example.boilerplatemvvm.di;

import android.app.Application;

import com.example.boilerplatemvvm.BaseApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        FragmentBuildersModule.class,
        ViewModelsBuildersModule.class,
        ActivityBuildersModule.class,
        ViewModelFactoryModule.class
})
@Singleton
public interface AppComponent extends AndroidInjector<BaseApplication>
{
    Application application();

    @Component.Builder
    interface Builder
    {
        @BindsInstance
        Builder builder(Application application);
        AppComponent appComponent();
    }
}
