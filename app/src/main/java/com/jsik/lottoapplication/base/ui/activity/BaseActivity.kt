package com.jsik.lottoapplication.base.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.jsik.lottoapplication.base.viewmodel.BaseViewModel
import com.jsik.lottoapplication.ui.dialog.LoadingDialog

abstract class BaseActivity<T : ViewDataBinding, V : BaseViewModel>(@LayoutRes val layoutId: Int) : AppCompatActivity() {

    private val loadingDialog : LoadingDialog by lazy {
        LoadingDialog(this)
    }

    lateinit var binding: T
    abstract fun getViewModel() : V

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
        setContentView(binding.root)
        initView()
        baseObserver()
        initObserver()

    }


    abstract fun initView()


    abstract fun initObserver()


    /**
     * 로딩바 등 베이스 옵저버 등록
     * */
    private fun baseObserver(){
        getViewModel().isLoading.observe(this) {
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