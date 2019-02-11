package com.example.alunom13.lesson1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class HomeActivity : AppCompatActivity() {
    var mCount:Int=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun showToast() {
        mCount += 1;

    }


}
