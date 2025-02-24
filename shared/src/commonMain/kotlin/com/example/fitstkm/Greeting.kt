package com.example.fitstkm

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello prafaru, ${platform.name}!"
    }
}