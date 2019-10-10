package com.bluapp.kotlinview.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.bluapp.kotlinview.R

class EditTextActivity5 : AppCompatActivity() {
    private var edtField : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text5)
        edtField = findViewById<EditText>(R.id.edtField) as EditText
    }

    fun edtFun(view: View){
        if(view.id == R.id.enableEdt){
            edtField?.isEnabled = true
        }else{
            edtField?.isEnabled = false
        }
    }
}
