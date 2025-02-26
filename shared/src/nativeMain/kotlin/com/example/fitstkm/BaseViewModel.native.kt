package com.example.fitstkm

import kotlinx.coroutines.CoroutineScope

public actual open class BaseViewModel actual constructor() {
    actual val scope: CoroutineScope
        get() = TODO("Not yet implemented")
}