package com.example.activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e( "onCreate", "Calisti" )

    }

    override fun onStart() {
        super.onStart()
        Log.e( "onStart", "Calisti" )
    }

    override fun onResume() {
        super.onResume()
        Log.e( "onResume", "Calisti" )
    }

    override fun onPause() {
        super.onPause()
        Log.e( "onPause", "Calisti" )
    }

    override fun onStop() {
        super.onStop()
        Log.e( "onStop", "Calisti" )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e( "onDestroy", "Calisti" )
    }
}