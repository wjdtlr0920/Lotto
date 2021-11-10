package com.jsik.lottoapplication.ui.activity.main

import com.jsik.lottoapplication.R
import com.jsik.lottoapplication.base.ui.activity.BaseActivity
import com.jsik.lottoapplication.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

  private val mainViewModel : MainViewModel by viewModel()

  override fun initView() {
    mainViewModel.getLottoResult(callback)
  }

  // TODO: 2021-11-10  콜백함수 만들어야함
  private val callback : () -> Unit = {

  }



}