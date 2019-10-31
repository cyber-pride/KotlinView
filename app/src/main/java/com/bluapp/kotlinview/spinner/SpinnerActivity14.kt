package com.bluapp.kotlinview.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.bluapp.kotlinview.R

class SpinnerActivity14 : AppCompatActivity() {
    private var spinnerDatabase: SpinnerDatabase? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner14)
        val spinner = findViewById(R.id.spinner) as Spinner
        spinnerDatabase = SpinnerDatabase.getInstance(this)
        val usernameSpinner = Spinner14(id = null, username = "Clark")
        spinnerDatabase!!.spinnerDAO().insert(usernameSpinner)
        val username = spinnerDatabase!!.spinnerDAO().allSpinner()
        val item = arrayOfNulls<String>(username.size)
        for(i in 0 until username.size){
            item[i] = username.get(i).username
        }
        val arrayadapter = ArrayAdapter(this@SpinnerActivity14, android.R.layout.simple_spinner_item, item)
        spinner.adapter = arrayadapter
    }
}
