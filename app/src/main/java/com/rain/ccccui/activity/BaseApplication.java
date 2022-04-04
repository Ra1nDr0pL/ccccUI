package com.rain.ccccui.activity;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class BaseApplication extends Application implements Application.ActivityLifecycleCallbacks {

    @Keep
    private static Context mContext;


    @Override
    public void onCreate() {
        super.onCreate();
        registerActivityLifecycleCallbacks(this);
        mContext = getApplicationContext();

    }

    @Override
    public String getPackageResourcePath() {
        return super.getPackageResourcePath();
    }

    @Override
    public String getPackageCodePath() {
        return super.getPackageCodePath();
    }

    public static Context getContext(){
        return mContext;
    }


    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle savedInstanceState) {

    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {

    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {
        ActivityManager.getInstance().setCurrentActivity(activity);
    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {

    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {
        ActivityManager.getInstance().removeActivity(activity);
    }

}
