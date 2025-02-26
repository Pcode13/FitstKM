package com.example.fitstkm

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val nameData: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()