package com.example.testingmodule.utils

import android.content.Context
import android.widget.Toast


object TestingToast : ToastInterface {

    override fun showLongToast(context: Context) {
        Toast.makeText(context, "Testing Long Toast", Toast.LENGTH_LONG).show()
    }


    override fun showShortToast(context: Context) {
        Toast.makeText(context, "Testing Short Toast", Toast.LENGTH_SHORT).show()
    }

}