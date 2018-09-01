package com.forward.myproject.config;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

public class MyProjectApplication extends Application {

    public static final String APP_ID = "5bebdf64c3";

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            CrashReport.UserStrategy strategy = new CrashReport.UserStrategy(this);
            strategy.setAppPackageName(getPackageName());
            strategy.setAppChannel("" + getApplicationInfo().loadLabel(getPackageManager()));
            CrashReport.initCrashReport(getApplicationContext(), APP_ID, true);
        } else {
            throw new RuntimeException("MyProjectApplication must be on debug mode");
        }
    }
}
