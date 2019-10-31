package com.bluapp.kotlinview.spinner

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.bluapp.kotlinview.R

class SpinnerActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner4)
        val spinner = findViewById(R.id.spinner) as Spinner
        val userNames = arrayOf("Select Name..","Henry", "Mark", "Jack", "Smith", "Clark", "Kelvin", "Denzel")
        val customArrayAdapter = CustomArrayAdapter<String>(this@SpinnerActivity4, userNames)
        spinner.adapter = customArrayAdapter
    }

    internal class CustomArrayAdapter<T>(ctx: Context, objects: Array<T>) :
        ArrayAdapter<T>(ctx, android.R.layout.simple_spinner_item, objects) {
        override
        fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
            val view = super.getView(position, convertView, parent)
            val text = view.findViewById(android.R.id.text1) as TextView
            if(position==0){
                text.setTextColor(Color.GRAY)
            }else{
                text.setTextColor(Color.BLACK)
            }
            return view
        }
    }
}
