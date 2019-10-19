package com.bluapp.kotlinview.TextViewAndRadioButton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import com.bluapp.kotlinview.R

class TextViewAndRadioButtonActivity17 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view_and_radio_button17)
        val radioGroup = findViewById(R.id.radioGroup) as RadioGroup
        radioGroup.setOnCheckedChangeListener(RadioGroup.OnCheckedChangeListener { radioGroup, i ->
            if(i == R.id.maleBtn){
                Toast.makeText(this@TextViewAndRadioButtonActivity17, "Male Selected", Toast.LENGTH_LONG).show()
            }else if(i == R.id.femaleBtn){
                Toast.makeText(this@TextViewAndRadioButtonActivity17, "Female Selected", Toast.LENGTH_LONG).show()
            }
        })
    }
}
