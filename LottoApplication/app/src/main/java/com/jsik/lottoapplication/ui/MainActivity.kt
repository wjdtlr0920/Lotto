package com.jsik.lottoapplication.ui

import android.content.SharedPreferences
import android.os.Bundle
import com.jsik.lottoapplication.R
import com.jsik.lottoapplication.base.ui.activity.BaseActivity
import com.jsik.lottoapplication.databinding.ActivityMainBinding
import com.orhanobut.logger.Logger
import org.koin.android.ext.android.inject

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val shared : SharedPreferences by inject()
    private val sharedEditor : SharedPreferences.Editor by inject()

    override fun initView() {

        sharedEditor.putInt("123", 1919)
        sharedEditor.apply()

        shared.getInt("123", 100)?.let { Logger.e(it) }

    }

}