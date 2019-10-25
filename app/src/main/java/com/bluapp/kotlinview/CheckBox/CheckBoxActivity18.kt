package com.bluapp.kotlinview.CheckBox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import com.bluapp.kotlinview.R

class CheckBoxActivity18 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box18)
        val male = findViewById(R.id.male) as CheckBox
        val female = findViewById(R.id.female) as CheckBox
        male.setOnCheckedChangeListener { compoundButton, b ->
                if(female.isChecked){
                    female.isChecked=false
                    male.isChecked=b
                }else{
                    male.isChecked=b
                }
        }
        female.setOnCheckedChangeListener { compoundButton, b ->
            if(male.isChecked){
                male.isChecked=false
                female.isChecked=b
            }else{
                female.isChecked=b
            }

        }
    }
}
