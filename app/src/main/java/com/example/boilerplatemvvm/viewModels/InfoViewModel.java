package com.example.boilerplatemvvm.viewModels;

import android.app.Application;

import androidx.lifecycle.ViewModel;

import com.example.boilerplatemvvm.viewModels.providerFactory.ViewModelProviderFactory;

import javax.inject.Inject;

public class InfoViewModel extends ViewModel
{
    Application application;

    @Inject
    public InfoViewModel(Application application)
    {
        this.application = application;
    }
}
