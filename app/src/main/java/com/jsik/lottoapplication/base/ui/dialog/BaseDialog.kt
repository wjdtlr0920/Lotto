package com.jsik.lottoapplication.base.ui.dialog

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.WindowManager
import androidx.annotation.LayoutRes
import androidx.annotation.StyleRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding


/**
 * Dialog 상속 버전
 * */
abstract class BaseDialog <T : ViewDataBinding> (
    private val ctx: Context,
    private val trans: Float = 1.0f,
    @StyleRes val styleId : Int = android.R.style.Theme_Translucent_NoTitleBar,
    @LayoutRes val layoutId: Int
) : Dialog(ctx, styleId) {

    lateinit var binding : T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.inflate(LayoutInflater.from(ctx), layoutId, null, false )

        window?.attributes = WindowManager.LayoutParams().apply {
            flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND
            dimAmount = trans
        }
        setContentView(binding.root)
        initView()
    }

    abstract fun initView()

    override fun show() {
        if (!(ctx as Activity).isDestroyed && !isShowing) {
            super.show()
        }
    }

    override fun dismiss() {
        if (!(ctx as Activity).isDestroyed && isShowing) {
            super.dismiss()
        }
    }

}