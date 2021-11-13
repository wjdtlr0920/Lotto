package com.jsik.lottoapplication.ui.dialog

import android.content.Context
import com.jsik.lottoapplication.R
import com.jsik.lottoapplication.base.ui.dialog.BaseDialog
import com.jsik.lottoapplication.databinding.DialogLoadingBinding

class LoadingDialog(private val ctx: Context) : BaseDialog<DialogLoadingBinding>(ctx = ctx, trans = 0.5f, layoutId = R.layout.dialog_loading) {
    override fun initView() {

    }
}