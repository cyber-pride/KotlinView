package com.bluapp.kotlinview.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.bluapp.kotlinview.R

class EditTextActivity13 : AppCompatActivity() {
    var edtField: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text13)
        edtField = findViewById<EditText>(R.id.edtField) as EditText
    }

    fun clearEdtInput(view: View){
        edtField?.text?.clear();
    }
}
