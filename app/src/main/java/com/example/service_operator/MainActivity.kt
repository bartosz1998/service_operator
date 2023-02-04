package com.example.service_operator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.fragment.app.Fragment
import com.example.service_operator.fragment.LargeNewsFragment
import com.example.service_operator.fragment.LoginActivityFragment
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

//        replaceFragment(LargeNewsFragment())
        supportFragmentManager.beginTransaction().replace(R.id.frame_layout, LoginActivityFragment()).commit()

    }

//    private fun replaceFragment(largeNewsFragment: Fragment) {
//
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.frame_layout, largeNewsFragment)
//        fragmentTransaction.commit()
//
//    }
}