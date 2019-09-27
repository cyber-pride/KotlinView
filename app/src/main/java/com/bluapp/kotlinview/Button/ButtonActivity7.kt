package com.bluapp.kotlinview.Button

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import com.bluapp.kotlinview.R



class ButtonActivity7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button7)
        val materialeffBtn = findViewById<AppCompatButton>(R.id.materialeffBtn)
        val colorstatelist = ColorStateList(
            arrayOf(
                intArrayOf(android.R.attr.state_pressed),
                intArrayOf(android.R.attr.enabled),
                intArrayOf()
            ),
            intArrayOf(Color.RED, Color.BLACK, Color.BLACK)
        )
        ViewCompat.setBackgroundTintList(materialeffBtn, colorstatelist);
    }
}
