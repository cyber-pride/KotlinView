package com.bluapp.kotlinview.CheckBox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.appcompat.app.AlertDialog
import com.bluapp.kotlinview.R

class CheckBoxActivity8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box8)
    }

    fun showDialogCheckBox(view: View){
        val checkbox = CheckBox(this)
        checkbox.text = "CheckBox"
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Your Title")
        alertDialogBuilder.setMessage("What do you want?")
        alertDialogBuilder.setView(checkbox)
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}
