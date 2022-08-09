package com.testsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.testingmodule.utils.TestingToast


class MainActivity : AppCompatActivity() {

    private var btnTest: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnTest = findViewById(R.id.btnTest)

        btnTest?.setOnClickListener {
            TestingToast.showLongToast(this, "Testing Toast")
        }
    }

}