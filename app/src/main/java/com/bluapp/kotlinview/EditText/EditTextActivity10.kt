package com.bluapp.kotlinview.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.bluapp.kotlinview.R

class EditTextActivity10 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text10)
        val edtField = findViewById<EditText>(R.id.edtField) as EditText
        edtField.background = getDrawable(R.drawable.edittext_background)
    }
}
