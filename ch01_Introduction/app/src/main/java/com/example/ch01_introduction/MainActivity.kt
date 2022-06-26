package com.example.ch01_introduction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private var TAG: String = "ch01_Introduction"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //p()
        //p1()
        //p2()
        p3()
    }

    private fun p() {
        Log.e(TAG, "POW!")
    }

    private fun p1() {
        var x1 = 1
        Log.e(TAG,"Before the loop. x = $x1")
        while( x1 < 4) {
            Log.e(TAG,"In the loop. x = $x1")
            x1 += 1
        }
        Log.e(TAG, "After the loop. x = $x1")
    }

    private fun p2() {
        val x2 = 3
        val y2 = 4
        if (x2 < y2) {
            Log.e(TAG, "$x2 < $y2")
        }
    }

    private fun p3() {
        val x3 = 1
        val y3 = 2

        if (x3 < y3) {
            Log.e(TAG, "$x3 < $y3")
        } else {
            Log.e(TAG, "$x3 > $y3")
        }
        Log.e(TAG, "This line runs no matter what")
    }
 }