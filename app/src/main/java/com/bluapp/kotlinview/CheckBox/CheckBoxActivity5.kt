package com.bluapp.kotlinview.CheckBox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.bluapp.kotlinview.R
import kotlinx.android.synthetic.main.activity_check_box5.*

class CheckBoxActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box5)
        val checkBox = findViewById(R.id.checkbox) as CheckBox
        val valueButton = findViewById(R.id.checkboxValue) as Button
        valueButton.setOnClickListener {
            if(checkBox.isChecked){
                Toast.makeText(this@CheckBoxActivity5, "CheckBox Value: "+checkBox.text, Toast.LENGTH_LONG).show()
            }
        }
    }
}
