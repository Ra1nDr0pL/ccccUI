package com.rain.ccccui.activity;



import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.rain.ccccui.R;
import com.rain.ccccui.activity.BaseActivity;


public class ChatSettingActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_setting);
    }

    @Override
    public Context getContext() {
        return this;
    }
}
