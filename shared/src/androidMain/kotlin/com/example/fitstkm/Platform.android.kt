package com.example.fitstkm

import android.content.res.Resources
import android.os.Build
import android.util.Log
import kotlin.math.round

actual class Platform actual constructor() {

    actual val osName: String
        get() = "Android"

    actual val deviceModel: String
        get() = "${Build.MANUFACTURER} ${Build.MODEL}"

    actual val osVersion: String
        get() = Build.VERSION.RELEASE ?: "${Build.VERSION.SDK_INT}"

    actual val density: Int
        get() = round(Resources.getSystem().displayMetrics.density).toInt()

    actual fun logSystemInfo() {
        Log.d("SystemInfo", "OS Name: $osName, OS Version: $osVersion, Device Model: $deviceModel, Density: $density")
    }
}