package com.bluapp.kotlinview.TextViewAndRadioButton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.bluapp.kotlinview.R

class TextViewAndRadioButtonActivity7 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view_and_radio_button7)
        val textView = findViewById(R.id.textView) as TextView
        val textBtn = findViewById(R.id.textBtn) as Button
        textBtn.setOnClickListener {
            Toast.makeText(this@TextViewAndRadioButtonActivity7, "TextView Value: "+textView.text.toString(), Toast.LENGTH_LONG).show()
        }
    }
}
