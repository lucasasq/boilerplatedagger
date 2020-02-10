package com.example.boilerplatemvvm.di;

import androidx.lifecycle.ViewModel;

import com.example.boilerplatemvvm.viewModels.InfoViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class ViewModelsBuildersModule
{
    @Binds
    @IntoMap
    @ViewModelKey(InfoViewModel.class)
    public abstract ViewModel bindViewModel(InfoViewModel viewModel);
}
