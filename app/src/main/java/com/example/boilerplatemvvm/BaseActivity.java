package com.example.boilerplatemvvm;

import android.os.Bundle;

import androidx.annotation.Nullable;

import dagger.android.support.DaggerAppCompatActivity;

public class BaseActivity extends DaggerAppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    public void commitFragment(int main_container, BaseFragment fragmentClass)
    {
        getSupportFragmentManager().beginTransaction().replace(main_container, fragmentClass)
                .addToBackStack(null)
                .commit();
    }
}
