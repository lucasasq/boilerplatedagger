package com.example.boilerplatemvvm.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.boilerplatemvvm.BaseActivity;
import com.example.boilerplatemvvm.R;

public class MainActivity extends BaseActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        commitFragment(R.id.main_container, new MainFragment());
    }
}
