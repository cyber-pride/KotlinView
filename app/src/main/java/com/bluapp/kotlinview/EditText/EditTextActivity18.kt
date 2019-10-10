package com.bluapp.kotlinview.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.bluapp.kotlinview.R
import android.widget.EditText
import androidx.appcompat.app.AlertDialog


class EditTextActivity18 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text18)
    }

    fun showDialogEdt(view: View){
        val taskEditText = EditText(this)
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Your Title")
        alertDialogBuilder.setMessage("What do you want?")
        alertDialogBuilder.setView(taskEditText)
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }
}
