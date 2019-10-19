package com.bluapp.kotlinview.TextViewAndRadioButton

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.Gravity
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.bluapp.kotlinview.R

class TextViewAndRadioButtonActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view_and_radio_button5)
        val constraintLayout = findViewById(R.id.constraintLayout) as ConstraintLayout
        val conParam = ConstraintLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        conParam.topToTop = ConstraintSet.PARENT_ID
        conParam.bottomToBottom = ConstraintSet.PARENT_ID
        conParam.startToStart = ConstraintSet.PARENT_ID
        conParam.endToEnd = ConstraintSet.PARENT_ID
        val textview = TextView(this)
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.N){
            textview.text = Html.fromHtml("<h2>Hello</h2><br><p>Hello World</p>", Html.FROM_HTML_MODE_COMPACT)
        }else{
            textview.text = Html.fromHtml("<h2>Hello</h2><br><p>Hello World</p>")
        }
        textview.gravity = Gravity.CENTER
        constraintLayout.addView(textview, conParam)
    }
}
