package com.bluapp.kotlinview.Button

import android.content.res.ColorStateList
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.bluapp.kotlinview.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ButtonActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button4)
        val faBtn = findViewById<FloatingActionButton>(R.id.faBtn) as FloatingActionButton
        faBtn.backgroundTintList= ColorStateList.valueOf(getColor(R.color.colorPrimaryDark))
    }
}
