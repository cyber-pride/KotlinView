package com.bluapp.kotlinview.EditText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.RelativeLayout
import com.bluapp.kotlinview.R

class EditTextActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text4)
        val relativeLayout = findViewById(R.id.relativeLayout) as RelativeLayout
        val relParam = RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        relParam.addRule(RelativeLayout.CENTER_IN_PARENT)
        relParam.setMargins(10, 10, 10, 10)
        val editText = EditText(this)
        editText.id = View.generateViewId()
        editText.hint = "Fullname"
        relativeLayout.addView(editText, relParam)

    }
}
