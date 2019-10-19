package com.bluapp.kotlinview.TextViewAndRadioButton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import com.bluapp.kotlinview.R

class TextViewAndRadioButtonActivity20 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view_and_radio_button20)
        val radioGroup = findViewById(R.id.radioGroup) as RadioGroup
        val getRadioBtn = findViewById(R.id.getRadioBtn) as Button
        getRadioBtn.setOnClickListener {
            val selectedId = radioGroup.checkedRadioButtonId
            val radioButton = findViewById(selectedId) as RadioButton
            Toast.makeText(this@TextViewAndRadioButtonActivity20, "Selected RadioButton: "+radioButton.text, Toast.LENGTH_LONG).show()
        }
    }
}
