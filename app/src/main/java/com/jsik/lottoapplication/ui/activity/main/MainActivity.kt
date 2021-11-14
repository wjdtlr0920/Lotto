package com.jsik.lottoapplication.ui.activity.main

import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.jsik.lottoapplication.R
import com.jsik.lottoapplication.base.ui.activity.BaseActivity
import com.jsik.lottoapplication.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {

  private val mainViewModel : MainViewModel by viewModel()

  override fun getViewModel() = mainViewModel
  override fun initView() {

    val navFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as NavHostFragment
    val navController = navFragment.navController
    NavigationUI.setupWithNavController(binding.bottomNav, navController)

//    mainViewModel.getLottoResult()
  }

  override fun initObserver() {

  }



}