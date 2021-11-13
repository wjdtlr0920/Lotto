package com.jsik.lottoapplication.ui.activity.main

import com.jsik.lottoapplication.R
import com.jsik.lottoapplication.base.ui.activity.BaseActivity
import com.jsik.lottoapplication.databinding.ActivityMainBinding
import com.jsik.lottoapplication.ui.dialog.LoadingDialog
import com.jsik.lottoapplication.ui.dialog.TestFragmentDialog
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

  private val mainViewModel : MainViewModel by viewModel()

  override fun initView() {

    binding.testButton.setOnClickListener {

      TestFragmentDialog().show(supportFragmentManager, "fffff")

//      LoadingDialog(this).show()
    }


//    mainViewModel.getLottoResult()
  }

}