package com.cootek.remoteapp

import android.app.Application
import com.tencent.bugly.crashreport.CrashReport

/**
 * @author yanjun.zhao
 * @time 2021/1/11 7:52 PM
 * @desc
 */
public class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        //初始化自定义 crash 捕捉
        CrashUtil.getInstance().init(this)

        //初始化 bugly
        CrashReport.initCrashReport(this, "8210c56a02", true)
    }
}