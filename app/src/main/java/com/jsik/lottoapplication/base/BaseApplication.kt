package com.jsik.lottoapplication.base

import android.app.Application
import com.jsik.lottoapplication.di.database.databaseModule
import com.jsik.lottoapplication.di.database.sharedModule
import com.jsik.lottoapplication.di.network.apiModule
import com.jsik.lottoapplication.di.network.networkModule
import com.jsik.lottoapplication.di.viewmodel.viewModelModule
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
            modules(apiModule, sharedModule, networkModule, viewModelModule, databaseModule)
        }

    }
}