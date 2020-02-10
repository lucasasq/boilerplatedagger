package com.example.boilerplatemvvm.di;

import androidx.lifecycle.ViewModelProvider;

import com.example.boilerplatemvvm.viewModels.providerFactory.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule
{
    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelProviderFactory);
}
