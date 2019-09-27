package com.bluapp.kotlinview.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.bluapp.kotlinview.R
import androidx.appcompat.app.AlertDialog


class ButtonActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button5)
        val alertDialogBtn = findViewById<AppCompatButton>(R.id.alertDialogBtn) as AppCompatButton
        alertDialogBtn.setOnClickListener {
            showAlertDialog()
        }
    }

    fun showAlertDialog(){
        val alertDialogBuilder = AlertDialog.Builder(this)
        alertDialogBuilder.setTitle("Your Title")
        alertDialogBuilder.setMessage("Show message over here")
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()

    }
}
