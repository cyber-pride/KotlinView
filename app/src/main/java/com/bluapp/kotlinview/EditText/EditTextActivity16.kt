package com.bluapp.kotlinview.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.bluapp.kotlinview.R

class EditTextActivity16 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text16)
        val edtField = findViewById<EditText>(R.id.edtField) as EditText
        edtField.setOnClickListener {
            Toast.makeText(this@EditTextActivity16, "EditText Click", Toast.LENGTH_LONG).show()
        }
    }
}
