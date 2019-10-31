package com.bluapp.kotlinview.spinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AlertDialog
import com.bluapp.kotlinview.R

class SpinnerActivity17 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner17)
    }

    fun showDialogSpinner(view: View){
        val spinner = Spinner(this)
        val userNames = arrayOf("Henry", "Mark", "Jack", "Smith", "Clark", "Kelvin", "Denzel")
        val arrayadapter = ArrayAdapter(this@SpinnerActivity17, android.R.layout.simple_spinner_item, userNames)
        spinner.adapter = arrayadapter
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Your Title")
        alertDialogBuilder.setMessage("What do you want?")
        alertDialogBuilder.setView(spinner)
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}
