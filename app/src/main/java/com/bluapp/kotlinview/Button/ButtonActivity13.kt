package com.bluapp.kotlinview.Button

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.bluapp.kotlinview.R

class ButtonActivity13 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button13)
        val marginBtn = findViewById<AppCompatButton>(R.id.marginBtn)
        setMarginsInDp(marginBtn, 25, 0, 25, 0)
    }

    fun setMarginsInDp(view: View, left: Int, top: Int, right: Int, bottom: Int){
        if(view.layoutParams is ViewGroup.MarginLayoutParams){
            val screenDesity: Float = view.context.resources.displayMetrics.density
            val params: ViewGroup.MarginLayoutParams = view.layoutParams as ViewGroup.MarginLayoutParams
            params.setMargins(left*screenDesity.toInt(), top*screenDesity.toInt(), right*screenDesity.toInt(), bottom*screenDesity.toInt())
            view.requestLayout()
        }
    }
}
