package com.nkmr.myapplicationintent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onTappedGoNextButton(v: View) {
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
    }
}
