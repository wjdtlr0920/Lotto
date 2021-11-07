package com.jsik.lottoapplication.di.data

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