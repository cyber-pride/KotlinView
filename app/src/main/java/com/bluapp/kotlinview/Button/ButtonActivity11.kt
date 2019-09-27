package com.bluapp.kotlinview.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.bluapp.kotlinview.R

class ButtonActivity11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button11)
        val lowercaseBtn = findViewById<AppCompatButton>(R.id.lowercaseBtn);
        lowercaseBtn.isAllCaps = false
    }
}
