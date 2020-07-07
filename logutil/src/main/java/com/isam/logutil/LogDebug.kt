package com.isam.logutil

import android.util.Log

object LogDebug {
    private const val tag = "SAM_DEBUG"

    fun d(message: String?) {
        Log.d(tag, message ?: "")
    }
}
