package com.bluapp.kotlinview.Button

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.bluapp.kotlinview.R

class ButtonActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button2)
        val startActivityBtn = findViewById<AppCompatButton>(R.id.startActivityBtn) as AppCompatButton
        startActivityBtn.setOnClickListener {
            startActivity(Intent(this@ButtonActivity2, ButtonActivity1::class.java))
        }
    }
}
