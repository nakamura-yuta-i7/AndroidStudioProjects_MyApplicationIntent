package com.nkmr.myapplicationintent

import android.app.Activity
import android.app.Application
import android.content.Intent



class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
    }

    fun goNextActivity(activity: Activity) {
        activity.finish()
        val intent = Intent(this, NextActivity::class.java)
        startActivity(intent)
    }
}