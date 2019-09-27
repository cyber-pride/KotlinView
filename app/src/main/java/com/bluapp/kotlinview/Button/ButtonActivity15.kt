package com.bluapp.kotlinview.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.bluapp.kotlinview.R

class ButtonActivity15 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button15)
        val changeTextBtn = findViewById<AppCompatButton>(R.id.changeTextBtn);
        changeTextBtn.setOnClickListener {
            changeTextBtn.text = "Text Change"
        }
    }
}
