package com.bluapp.kotlinview.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.bluapp.kotlinview.R

class SpinnerActivity11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner11)
        val spinner = findViewById(R.id.spinner) as Spinner
        val userNames = arrayOf("Henry", "Mark", "Jack", "Smith", "Clark", "Kelvin", "Denzel")
        val arrayadapter = ArrayAdapter(this@SpinnerActivity11, android.R.layout.simple_spinner_item, userNames)
        spinner.adapter = arrayadapter
        val enableSpinnerBtn = findViewById(R.id.enableSpinnerBtn) as Button
        val disableSpinnerBtn = findViewById(R.id.disableSpinnerBtn) as Button
        enableSpinnerBtn.setOnClickListener {
            spinner.isEnabled = true
        }
        disableSpinnerBtn.setOnClickListener {
                spinner.isEnabled = false
        }
    }
}
