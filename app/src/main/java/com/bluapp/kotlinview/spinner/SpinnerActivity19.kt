package com.bluapp.kotlinview.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.databinding.DataBindingUtil
import com.bluapp.kotlinview.R
import com.bluapp.kotlinview.databinding.ActivitySpinner19Binding

class SpinnerActivity19 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivitySpinner19Binding = DataBindingUtil.setContentView(this, R.layout.activity_spinner19)
        val userNames = arrayOf("Henry", "Mark", "Jack", "Smith", "Clark", "Kelvin", "Denzel")
        val arrayadapter = ArrayAdapter(this@SpinnerActivity19, android.R.layout.simple_spinner_item, userNames)
        binding.spinnerAdapter = arrayadapter
    }


}
