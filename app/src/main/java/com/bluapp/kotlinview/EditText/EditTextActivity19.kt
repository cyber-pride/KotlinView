package com.bluapp.kotlinview.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.bluapp.kotlinview.R



class EditTextActivity19 : AppCompatActivity() {
    var edtField: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text19)
        edtField = findViewById<EditText>(R.id.edtField) as EditText
    }

    fun getNumericValue(view: View){
        val value = Integer.parseInt(edtField?.getText().toString())
        Toast.makeText(this@EditTextActivity19, "Value $value", Toast.LENGTH_SHORT).show()

    }
}
