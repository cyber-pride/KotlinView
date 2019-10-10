package com.bluapp.kotlinview.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputFilter
import android.widget.EditText
import com.bluapp.kotlinview.R

class EditTextActivity9 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text9)
        val edtField = findViewById<EditText>(R.id.edtField) as EditText
        edtField.filters = arrayOf(InputFilter.LengthFilter(10))
    }
}
