package com.bluapp.kotlinview.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.RelativeLayout
import com.bluapp.kotlinview.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ButtonActivity9 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button9)

        val relativeLayout = findViewById(R.id.relativeLayout) as RelativeLayout

        val fab = FloatingActionButton(this)
        val rel = RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        rel.setMargins(15, 15, 15, 15)
        rel.addRule(RelativeLayout.ALIGN_PARENT_RIGHT);
        rel.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM);
        fab.layoutParams = rel
        fab.setImageResource(android.R.drawable.ic_dialog_email)
        fab.size = FloatingActionButton.SIZE_NORMAL
        relativeLayout.addView(fab)

    }


}
