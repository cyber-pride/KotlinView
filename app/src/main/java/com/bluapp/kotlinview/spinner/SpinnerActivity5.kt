package com.bluapp.kotlinview.spinner

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat
import com.bluapp.kotlinview.R

class SpinnerActivity5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner5)
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
        spinner.background= ContextCompat.getDrawable(this@SpinnerActivity5, R.drawable.rounded_spinner)
        val userNames = arrayOf("Henry", "Mark", "Jack", "Smith", "Clark", "Kelvin", "Denzel")
        val customArrayAdapter = CustomArrayAdapter<String>(this@SpinnerActivity5, userNames)
        spinner.adapter = customArrayAdapter
        constraintLayout.addView(spinner, conParam)
    }

    internal class CustomArrayAdapter<T>(internal val ctx: Context, objects: Array<T>) : ArrayAdapter<T>(ctx, android.R.layout.simple_spinner_item, objects) {
        override
        fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
            val view = super.getView(position, convertView, parent)
            val text = view.findViewById(android.R.id.text1) as TextView
            return view
        }
    }
}
