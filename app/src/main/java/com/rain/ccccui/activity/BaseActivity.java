package com.rain.ccccui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //StatusBarUtil.setStatusBarMode(getWindow(),true);
    }

    public abstract Context getContext();

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);

    }



}
