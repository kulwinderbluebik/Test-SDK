package com.example.testingmodule.utils

import android.content.Context
import android.widget.Toast


object TestingToast : ToastInterface {

    override fun showLongToast(context: Context, toast: String) {
        Toast.makeText(context, toast, Toast.LENGTH_LONG).show()
    }


    override fun showShortToast(context: Context, toast: String) {
        Toast.makeText(context, toast, Toast.LENGTH_SHORT).show()
    }

}