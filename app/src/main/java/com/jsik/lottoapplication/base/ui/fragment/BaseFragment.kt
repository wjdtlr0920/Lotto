package com.jsik.lottoapplication.base.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.jsik.lottoapplication.base.viewmodel.BaseViewModel
import com.jsik.lottoapplication.ui.dialog.LoadingDialog

abstract class BaseFragment < T : ViewDataBinding, V : BaseViewModel>(@LayoutRes private val layoutId : Int) : Fragment() {

  private val loadingDialog : LoadingDialog by lazy {
    LoadingDialog(requireContext())
  }

  lateinit var binding : T

  abstract fun getViewModel() : V
  abstract fun initView()

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    binding = DataBindingUtil.inflate(layoutInflater, layoutId, container,false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    initView()
    baseObserver()
  }

  private fun baseObserver(){
    getViewModel().isLoading.observe(viewLifecycleOwner) {
      when(it){
        true -> {
          loadingDialog.show()
        }
        false -> {
          loadingDialog.dismiss()
        }
      }
    }
  }
}