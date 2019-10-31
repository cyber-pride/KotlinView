package com.bluapp.kotlinview.spinner

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.bluapp.kotlinview.R

class SpinnerActivity10 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner10)
        val constraintLayout = findViewById(R.id.constraintLayout) as ConstraintLayout
        val conParam = ConstraintLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        conParam.topToTop = ConstraintSet.PARENT_ID
        conParam.bottomToBottom = ConstraintSet.PARENT_ID
        conParam.startToStart = ConstraintSet.PARENT_ID
        conParam.endToEnd = ConstraintSet.PARENT_ID
        val spinner = Spinner(this)
        val userNames = arrayOf("Henry", "Mark", "Jack", "Smith", "Clark", "Kelvin", "Denzel")
        val customArrayAdapter = CustomArrayAdapter<String>(this@SpinnerActivity10, userNames)
        spinner.adapter = customArrayAdapter
        spinner.onItemSelectedListener = object  : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val textview = parent?.getChildAt(0) as TextView
                textview.setTextColor(resources.getColor(R.color.colorPrimaryDark))
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
        constraintLayout.addView(spinner, conParam)
    }

    internal class CustomArrayAdapter<T>(var ctx: Context, objects: Array<T>) :
        ArrayAdapter<T>(ctx, android.R.layout.simple_spinner_item, objects) {
        override
        fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
            val view = super.getView(position, convertView, parent)
            val text = view.findViewById(android.R.id.text1) as TextView
            text.setTextColor(R.drawable.state_selector_drawable)
            return view
        }
    }
}
