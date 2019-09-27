package com.bluapp.kotlinview.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import com.bluapp.kotlinview.R

class ButtonActivity14 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button14)
        val getTextBtn = findViewById<AppCompatButton>(R.id.getTextBtn)
        getTextBtn.setOnClickListener {
            Toast.makeText(this@ButtonActivity14, "Result: "+getTextBtn.text, Toast.LENGTH_SHORT).show()
        }
    }
}
