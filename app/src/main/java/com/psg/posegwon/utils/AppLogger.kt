package com.psg.posegwon.utils

import android.util.Log

object AppLogger {
    fun d(tag:String,msg:String){
        if (Constants.DEBUG){
            Log.d(tag, msg)
        }
    }

    fun i(tag:String,msg:String){
        if (Constants.DEBUG){
            Log.i(tag, msg)
        }
    }

    fun p(msg:String){
        if (Constants.DEBUG){
            println(msg)
        }
    }
}