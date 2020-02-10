package com.example.boilerplatemvvm.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;

import com.example.boilerplatemvvm.BaseFragment;
import com.example.boilerplatemvvm.R;
import com.example.boilerplatemvvm.databinding.MainFragmentBinding;
import com.example.boilerplatemvvm.viewModels.InfoViewModel;

import javax.inject.Inject;

public class MainFragment extends BaseFragment
{
    @Inject
    InfoViewModel viewModel;

    MainFragmentBinding fragmentBinding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        fragmentBinding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false);
        return fragmentBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState)
    {

    }
}
