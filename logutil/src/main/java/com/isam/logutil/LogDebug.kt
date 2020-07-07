package com.isam.logutil

import android.util.Log

public class LogDebug {

    private val tag = "SAM_DEBUG"

    public fun d(message:String){
        Log.d(tag, message)
    }

}