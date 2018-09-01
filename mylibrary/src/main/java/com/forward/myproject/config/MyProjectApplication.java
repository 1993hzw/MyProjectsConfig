package com.forward.myproject.config;

import android.app.Application;
import android.widget.Toast;

import com.tencent.bugly.crashreport.CrashReport;

public class MyProjectApplication extends Application {

    public static final String APP_ID = "5bebdf64c3";

    @Override
    public void onCreate() {
        super.onCreate();
        CrashReport.UserStrategy strategy = new CrashReport.UserStrategy(this);
        strategy.setAppChannel("" + getApplicationInfo().loadLabel(getPackageManager()));
        CrashReport.initCrashReport(getApplicationContext(), APP_ID, true, strategy);
        Toast.makeText(this, "MyProjectApplication", Toast.LENGTH_LONG).show();
    }
}
