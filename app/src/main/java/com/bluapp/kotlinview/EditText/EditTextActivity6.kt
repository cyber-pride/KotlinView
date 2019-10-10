package com.bluapp.kotlinview.EditText

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.bluapp.kotlinview.R
import android.content.Context.INPUT_METHOD_SERVICE
import android.util.Log
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService



class EditTextActivity6 : AppCompatActivity() {
    private var edtField : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text6)
        edtField = findViewById<EditText>(R.id.edtField) as EditText
    }

    fun edtSoftKeyboard(view: View){
        try {
            val editTextInput = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            editTextInput.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception) {
            Log.e("KotlinView", "closeKeyboard: $e")
        }
        Toast.makeText(this@EditTextActivity6, "Result: "+edtField?.text.toString(), Toast.LENGTH_LONG).show()
    }
}
