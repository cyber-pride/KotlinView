package com.bluapp.kotlinview.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import com.bluapp.kotlinview.R
import java.util.ArrayList

class SpinnerActivity18 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner18)
        val spinner = findViewById(R.id.spinner) as Spinner
        val newuserNamesBtn = findViewById(R.id.newuserNamesBtn) as Button
        val userNames = ArrayList<String>()
        userNames.add("Henry")
        userNames.add("Mark")
        userNames.add("Jack")
        userNames.add("Smith")
        userNames.add("Clark")
        val arrayadapter = ArrayAdapter(this@SpinnerActivity18, android.R.layout.simple_spinner_item, userNames)
        spinner.adapter = arrayadapter
        newuserNamesBtn.setOnClickListener {
            userNames.add("Kelvin")
            userNames.add("Denzel")
            arrayadapter.notifyDataSetChanged()
        }
    }
}
