package com.bluapp.kotlinview.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.bluapp.kotlinview.R
import androidx.databinding.adapters.TextViewBindingAdapter.setText
import android.text.Editable
import android.text.TextWatcher



class EditTextActivity17 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text17)
        val textWatcher = findViewById<TextView>(R.id.textWatcher) as TextView
        val edtField = findViewById<EditText>(R.id.edtField) as EditText
        edtField.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
            }
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
            }
            override fun afterTextChanged(editable: Editable) {
                textWatcher.text = edtField.text.toString()
            }
        })
    }
}
