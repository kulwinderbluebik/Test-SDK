package com.example.testingmodule.utils

import android.content.Context


interface ToastInterface {

    fun showLongToast(context: Context, toast: String)
    fun showShortToast(context: Context, toast: String)

}