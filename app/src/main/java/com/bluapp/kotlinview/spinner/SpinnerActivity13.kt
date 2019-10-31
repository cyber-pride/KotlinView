package com.bluapp.kotlinview.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.bluapp.kotlinview.R
import java.util.ArrayList

class SpinnerActivity13 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner13)
        val spinner = findViewById(R.id.spinner) as Spinner
        val arrayadapter = ArrayAdapter(this@SpinnerActivity13, android.R.layout.simple_spinner_item, getUserNames())
        spinner.adapter = arrayadapter
    }

    fun getUserNames(): List<String> {
        val userNames = ArrayList<String>()
        userNames.add("Henry")
        userNames.add("Mark")
        userNames.add("Jack")
        userNames.add("Smith")
        userNames.add("Clark")
        userNames.add("Kelvin")
        userNames.add("Denzel")
        return userNames
    }
}
