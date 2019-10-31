package com.bluapp.kotlinview.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.bluapp.kotlinview.R
import java.util.ArrayList

class SpinnerActivity20 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner20)
        val spinner = findViewById(R.id.spinner) as Spinner
        val userNames = ArrayList<String>()
        userNames.add("Henry")
        userNames.add("Mark")
        userNames.add("Jack")
        userNames.add("Smith")
        userNames.add("Clark")
        userNames.add("Kelvin")
        userNames.add("Denzel")
        val arrayadapter = ArrayAdapter(this@SpinnerActivity20, android.R.layout.simple_spinner_item, userNames)
        spinner.adapter = arrayadapter
        spinner.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                userNames.remove(parent?.getItemAtPosition(p2).toString())
                arrayadapter.notifyDataSetChanged();
                Toast.makeText(this@SpinnerActivity20, "Item remove from spinner", Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }
}
