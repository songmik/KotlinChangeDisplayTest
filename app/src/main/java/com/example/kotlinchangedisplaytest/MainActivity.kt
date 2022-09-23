package com.example.kotlinchangedisplaytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeFragment(1)
    }

    fun changeFragment(index: Int) {
        when (index) {
            1 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.mainFrameLayout, OneFragment())
                    .commit()
            }

            2 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.mainFrameLayout, TwoFragment())
                    .commit()
            }

            3 -> {
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.mainFrameLayout, ThreeFragment())
                    .commit()
            }
        }
    }
}