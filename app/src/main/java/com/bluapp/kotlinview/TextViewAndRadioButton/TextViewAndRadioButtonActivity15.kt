package com.bluapp.kotlinview.TextViewAndRadioButton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import com.bluapp.kotlinview.R

class TextViewAndRadioButtonActivity15 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view_and_radio_button15)
        val radioGroup = findViewById(R.id.radioGroup) as RadioGroup
        val enableRadioBtn = findViewById(R.id.enableRadioBtn) as Button
        val disableRadioBtn = findViewById(R.id.disableRadioBtn) as Button
        enableRadioBtn.setOnClickListener {
            for(i in 0 until radioGroup.childCount){
                radioGroup.getChildAt(i).isEnabled = true
            }
        }
        disableRadioBtn.setOnClickListener {
            for(i in 0 until radioGroup.childCount){
                radioGroup.getChildAt(i).isEnabled = false
            }
        }
    }
}
