package com.bluapp.kotlinview.CheckBox

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.bluapp.kotlinview.R

class CheckBoxActivity12 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box12)
        val checkBox = findViewById(R.id.checkbox) as CheckBox
        val valueButton = findViewById(R.id.checkboxValue) as Button
        checkBox.isChecked = loadCheckBox(checkBox.text.toString())
        valueButton.setOnClickListener {
                Toast.makeText(this@CheckBoxActivity12, "CheckBox State Save", Toast.LENGTH_LONG).show()
            saveCheckbox(checkBox.isChecked, checkBox.text.toString())
        }
    }

    fun saveCheckbox(isChecked: Boolean, key: String){
        val sharedpreferences = getPreferences(Context.MODE_PRIVATE)
        val editor = sharedpreferences.edit()
        editor.putBoolean(key, isChecked)
        editor.apply()
    }

    fun loadCheckBox(key: String):Boolean{
        val sharedpreferences = getPreferences(Context.MODE_PRIVATE)
        return sharedpreferences.getBoolean(key, false)
    }
}
