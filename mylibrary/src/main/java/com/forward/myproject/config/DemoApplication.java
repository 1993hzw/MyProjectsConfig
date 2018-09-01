package com.forward.myproject.config;

import android.app.Application;

import com.tencent.bugly.crashreport.CrashReport;

public class DemoApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        CrashReport.UserStrategy strategy = new CrashReport.UserStrategy(this);
        strategy.setAppPackageName(getPackageName());
        strategy.setAppPackageName(""+getApplicationInfo().loadLabel(getPackageManager()));
        CrashReport.initCrashReport(getApplicationContext(), "5bebdf64c3", true);
    }
}
