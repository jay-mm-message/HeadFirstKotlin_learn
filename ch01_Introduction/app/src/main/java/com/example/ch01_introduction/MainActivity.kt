package com.example.ch01_introduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    var TAG: String = "ch01_Introduction";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //p()
        p1()
    }

    fun p() {
        Log.e(TAG, "POW!")
    }

    fun p1() {
        var x = 1
        Log.e(TAG,"Before the loop. x = ${x}")
        while( x < 4) {
            Log.e(TAG,"In the loop. x = ${x}")
            x = x + 1
        }
        Log.e(TAG, "After the loop. x = ${x}")
    }
 }