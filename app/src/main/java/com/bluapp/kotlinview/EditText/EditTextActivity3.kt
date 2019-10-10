package com.bluapp.kotlinview.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.view.View
import android.widget.EditText
import com.bluapp.kotlinview.R

class EditTextActivity3 : AppCompatActivity() {
    private var edtField : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text3)
        edtField = findViewById<EditText>(R.id.edtField) as EditText
    }

    fun edtPass(view: View){
        if(view.id == R.id.showpass){
            edtField?.transformationMethod = HideReturnsTransformationMethod.getInstance()
        }else{
            edtField?.transformationMethod = PasswordTransformationMethod.getInstance()
        }
    }
}
