package com.bluapp.kotlinview.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.bluapp.kotlinview.R

class EditTextActivity11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text11)
        val edtField = findViewById<EditText>(R.id.edtField) as EditText
        edtField.setTextColor(resources.getColor(R.color.colorPrimaryDark))
    }
}
