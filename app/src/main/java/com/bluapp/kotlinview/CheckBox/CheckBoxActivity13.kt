package com.bluapp.kotlinview.CheckBox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.bluapp.kotlinview.R

class CheckBoxActivity13 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box13)
        val checkBox = findViewById(R.id.checkbox) as CheckBox
        val resetBtn = findViewById(R.id.resetBtn) as Button
        resetBtn.setOnClickListener {
            checkBox.isChecked=false
            Toast.makeText(this@CheckBoxActivity13, "CheckBox Reset", Toast.LENGTH_LONG).show()
        }
    }
}
