package com.bluapp.kotlinview.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bluapp.kotlinview.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import android.widget.RelativeLayout
import android.view.ViewGroup



class ButtonActivity8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button8)
        val relativeLayout = findViewById(R.id.relativeLayout) as RelativeLayout

        val fab = FloatingActionButton(this)
        val rel = RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        rel.setMargins(15, 15, 15, 15)
        rel.addRule(RelativeLayout.CENTER_IN_PARENT)
        fab.layoutParams = rel
        fab.setImageResource(android.R.drawable.ic_dialog_email)
        fab.size = FloatingActionButton.SIZE_NORMAL
        relativeLayout.addView(fab)

    }
}
