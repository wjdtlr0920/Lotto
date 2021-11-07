package com.jsik.lottoapplication.base

import android.app.Application
import com.jsik.lottoapplication.di.data.sharedModule
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.Logger
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext.startKoin

class BaseApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        Logger.addLogAdapter(AndroidLogAdapter())

        startKoin{
            androidLogger()
            androidContext(this@BaseApplication)
            modules(sharedModule)
        }

    }
}