package com.bluapp.kotlinview.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.bluapp.kotlinview.R



class EditTextActivity2 : AppCompatActivity() {
    private var edtField: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text2)
        edtField = findViewById<EditText>(R.id.edtField) as EditText

    }

    fun isEmptyEdt(view: View){
        val edtFieldstr = edtField?.getText().toString()
        if(edtFieldstr.equals("")){
            edtField?.error = "Field is empty"
        }
    }
}
