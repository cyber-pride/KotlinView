package com.bluapp.kotlinview.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.bluapp.kotlinview.R

class SpinnerActivity7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner7)
        val spinner = findViewById(R.id.spinner) as Spinner
        spinner.background=resources.getDrawable(R.drawable.spinner_background)
        val userNames = arrayOf("Henry", "Mark", "Jack", "Smith", "Clark", "Kelvin", "Denzel")
        val arrayadapter = ArrayAdapter(this@SpinnerActivity7, android.R.layout.simple_spinner_item, userNames)
        spinner.adapter = arrayadapter
    }
}
