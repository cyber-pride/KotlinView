package com.bluapp.kotlinview.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.bluapp.kotlinview.R

class ButtonActivity21 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button21)
        val onclickBtn = findViewById<AppCompatButton>(R.id.onclickBtn)
        onclickBtn.setOnClickListener {
            Toast.makeText(this@ButtonActivity21, "Button was click", Toast.LENGTH_SHORT).show()
        }
    }
}
