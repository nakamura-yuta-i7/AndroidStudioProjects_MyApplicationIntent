package com.nkmr.myapplicationintent

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun onGoNextActivityButton(v: View) {
        (application as MyApplication).goNextActivity(this)
    }
}
