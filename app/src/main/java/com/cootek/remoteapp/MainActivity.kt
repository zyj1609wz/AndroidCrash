package com.cootek.remoteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.bt).setOnClickListener {
            makeCrash()
        }
    }

    /**
     * 制造一个crash
     */
    fun makeCrash() {
        5 / 0
    }
}