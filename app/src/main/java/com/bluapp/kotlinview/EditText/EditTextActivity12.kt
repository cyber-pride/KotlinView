package com.bluapp.kotlinview.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.bluapp.kotlinview.R

class EditTextActivity12 : AppCompatActivity() {
    var edtField: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text12)
        edtField = findViewById<EditText>(R.id.edtField) as EditText
    }

    fun edtResult(view: View){
      Toast.makeText(this@EditTextActivity12, "Result: "+edtField?.text.toString(), Toast.LENGTH_LONG).show()
    }

}
