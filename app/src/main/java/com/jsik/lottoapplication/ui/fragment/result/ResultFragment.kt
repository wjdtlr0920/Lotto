package com.jsik.lottoapplication.ui.fragment.result

import com.jsik.lottoapplication.R
import com.jsik.lottoapplication.base.ui.fragment.BaseFragment
import com.jsik.lottoapplication.databinding.FragmentResultBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class ResultFragment() : BaseFragment<FragmentResultBinding, ResultViewModel>(R.layout.fragment_result) {

  private val resultViewModel : ResultViewModel by viewModel()
  override fun getViewModel() = resultViewModel

  override fun initView() {

  }

  override fun initObserver() {}

}