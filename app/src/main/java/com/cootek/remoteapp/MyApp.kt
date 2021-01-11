package com.cootek.remoteapp

import android.app.Application

/**
 * @author yanjun.zhao
 * @time 2021/1/11 7:52 PM
 * @desc
 */
public class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        CrashUtil.getInstance().init(this)

    }
}