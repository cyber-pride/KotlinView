package com.bluapp.kotlinview.CheckBox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import com.bluapp.kotlinview.R

class CheckBoxActivity14 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box14)
        val checkBox = findViewById(R.id.checkBox) as CheckBox
        val enableCheckBtn = findViewById(R.id.enableCheckBtn) as Button
        val disableCheckBtn = findViewById(R.id.disableCheckBtn) as Button
        enableCheckBtn.setOnClickListener {
            checkBox.isEnabled=true
        }
        disableCheckBtn.setOnClickListener {
            checkBox.isEnabled=false
        }
    }
}
