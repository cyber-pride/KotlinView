package com.bluapp.kotlinview.CheckBox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.bluapp.kotlinview.R

class CheckBoxActivity9 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box9)
        val checkBox = findViewById(R.id.checkbox) as CheckBox
        val valueButton = findViewById(R.id.checkboxValue) as Button
        valueButton.setOnClickListener {
                Toast.makeText(this@CheckBoxActivity9, "CheckBox Value: "+checkBox.text, Toast.LENGTH_LONG).show()
        }
    }
}
