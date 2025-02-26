package com.example.fitstkm

import kotlinx.coroutines.CoroutineScope


public open expect class BaseViewModel(){
   val scope:CoroutineScope
}