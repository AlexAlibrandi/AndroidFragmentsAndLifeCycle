package com.android.fragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Message", "First activity onCreate")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "First activity onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "First activity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "First activity onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "First activity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "First activity onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "First activity onRestart")
    }
}