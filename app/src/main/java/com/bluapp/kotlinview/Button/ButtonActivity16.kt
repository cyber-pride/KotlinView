package com.bluapp.kotlinview.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.bluapp.kotlinview.R



class ButtonActivity16 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button16)
        val disableDoubleClickBtn = findViewById<AppCompatButton>(R.id.disableDoubleClickBtn)
        disableDoubleClickBtn.setOnClickListener {
                Toast.makeText(this@ButtonActivity16,"Button Click", Toast.LENGTH_SHORT).show();
                disableDoubleClickBtn.setEnabled(false);
        }
    }
}
