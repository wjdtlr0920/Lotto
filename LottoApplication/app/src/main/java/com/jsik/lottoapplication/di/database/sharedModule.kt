package com.jsik.lottoapplication.di.database

import android.content.Context
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val sharedModule = module {

    single {
        androidApplication().getSharedPreferences("default", Context.MODE_PRIVATE)
    }

    single {
        androidApplication().getSharedPreferences("default", Context.MODE_PRIVATE).edit()
    }
}