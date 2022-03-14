package com.psg.posegwon.views.base

import android.os.Bundle
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.psg.posegwon.utils.AppLogger

abstract class BaseActivity<B: ViewDataBinding>(@LayoutRes val res: Int): AppCompatActivity() {

    lateinit var binding: B
    abstract val tag: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, res)
        AppLogger.i(tag,"onCreate")
    }

    open fun initView(){

    }

    open fun showToast(msg:String) = Toast.makeText(this ,msg, Toast.LENGTH_SHORT).show()

}