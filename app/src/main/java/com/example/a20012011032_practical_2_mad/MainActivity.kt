package com.example.a20012011032_practical_2_mad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(applicationContext,"onCreate Function Called!!", Toast.LENGTH_SHORT).show()
        Log.i(tag,"onCreate Function Called!!")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(applicationContext, "onStart Function Called!!", Toast.LENGTH_SHORT).show()
        Log.i(tag,"onStart Function Called!!")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "onResume Function Called!!", Toast.LENGTH_SHORT).show()
        Log.i(tag,"onResume Function Called!!")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "onPause Function Called!!", Toast.LENGTH_SHORT).show()
        Log.i(tag,"onPause Function Called!!")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "onStop Function Called!!", Toast.LENGTH_SHORT).show()
        Log.i(tag,"onStop Function Called!!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "onDestroy Function Called!!", Toast.LENGTH_SHORT).show()
        Log.i(tag,"onDestroy Function Called!!")
    }
}