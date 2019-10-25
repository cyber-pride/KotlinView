package com.bluapp.kotlinview.CheckBox

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import android.widget.LinearLayout
import androidx.core.view.marginBottom
import com.bluapp.kotlinview.R

class CheckBoxActivity6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box6)
        val linearLayout = findViewById(R.id.linearLayout) as LinearLayout

        val llParam = LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )

        val addButton = Button(this)
        addButton.text= "Add CheckBox"
        addButton.setTextColor(Color.WHITE)
        addButton.setBackgroundColor(resources.getColor(R.color.colorAccent))
        llParam.setMargins(0,0,0,10)
        linearLayout.addView(addButton, llParam)

        val removeButton = Button(this)
        removeButton.text= "Remove CheckBox"
        removeButton.setTextColor(Color.WHITE)
        removeButton.setBackgroundColor(resources.getColor(R.color.colorAccent))
        llParam.setMargins(0,0,0,10)
        linearLayout.addView(removeButton, llParam)

        addButton.setOnClickListener {
            val checkbox = CheckBox(this)
            checkbox.tag="CheckBoxTag"
            checkbox.text="CheckBox"
            linearLayout.addView(checkbox)
        }

        removeButton.setOnClickListener {
            val getcheckbox = linearLayout.findViewWithTag<CheckBox>("CheckBoxTag")
            linearLayout.removeView(getcheckbox)
        }
    }
}
