package com.bluapp.kotlinview.Button

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.bluapp.kotlinview.R
import android.graphics.Color.parseColor
import androidx.core.graphics.drawable.DrawableCompat
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable



class ButtonActivity19 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button19)
        val tintBtn = findViewById<AppCompatButton>(R.id.tintBtn)
        var drawable: Drawable = ColorDrawable(parseColor("#ffffff"))
        drawable = DrawableCompat.wrap(drawable)
        DrawableCompat.setTint(drawable, parseColor("#939393"))
        tintBtn.setBackground(drawable)

    }
}
