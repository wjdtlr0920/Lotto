package com.jsik.lottoapplication.base.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel

abstract class BaseActivity<T : ViewDataBinding>(@LayoutRes val layoutId: Int) : AppCompatActivity() {

    // TODO: 2021-11-10  로딩 다이얼로그 만들어야함
//    private val loadingDialog :

    lateinit var binding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
        setContentView(binding.root)
        initView()

    }

    abstract fun initView()



}