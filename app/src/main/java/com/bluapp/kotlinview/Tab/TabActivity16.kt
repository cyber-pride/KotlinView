package com.bluapp.kotlinview.Tab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.bluapp.kotlinview.R


class TabActivity16 : AppCompatActivity() {
    private val Tag = "Home"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab16)
        val mFragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = mFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame, TabFragment2(), Tag).commit()
    }
}
