package com.bluapp.kotlinview.TextViewAndRadioButton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import com.bluapp.kotlinview.R

class TextViewAndRadioButtonActivity16 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view_and_radio_button16)
        val radioGroup = findViewById(R.id.radioGroup) as RadioGroup
        val clearRadioGrp = findViewById(R.id.clearRadioGrp) as Button
        clearRadioGrp.setOnClickListener {
            Toast.makeText(this@TextViewAndRadioButtonActivity16, "Radio Group Cleared", Toast.LENGTH_LONG).show()
            radioGroup.clearCheck()
        }
    }
}
