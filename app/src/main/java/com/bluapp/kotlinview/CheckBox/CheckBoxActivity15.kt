package com.bluapp.kotlinview.CheckBox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast
import com.bluapp.kotlinview.R

class CheckBoxActivity15 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box15)
        val checkBox = findViewById(R.id.checkBox) as CheckBox
        checkBox.setOnCheckedChangeListener { compoundButton, b ->
            if(b){
                Toast.makeText(this@CheckBoxActivity15, "Checked", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this@CheckBoxActivity15, "UnChecked", Toast.LENGTH_LONG).show()
            }
        }
    }
}
