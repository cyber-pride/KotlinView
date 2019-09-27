package com.bluapp.kotlinview.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.bluapp.kotlinview.R
import android.view.animation.AnimationUtils.loadAnimation
import android.view.animation.Animation
import android.view.animation.AnimationUtils


class ButtonActivity18 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button18)
        val animateBtn = findViewById<AppCompatButton>(R.id.animateBtn)
        animateBtn.setOnClickListener {
            animateBtn.setText("Loading.....")
            val anim = AnimationUtils.loadAnimation(this@ButtonActivity18, R.anim.blink)
            animateBtn.startAnimation(anim)

        }
    }
}
