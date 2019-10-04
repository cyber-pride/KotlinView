package com.bluapp.kotlinview.imageView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import com.bluapp.kotlinview.R

class ImageViewActivity20 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view20)
        val relativeLayout = findViewById(R.id.relativeLayout) as RelativeLayout
        val relParam = RelativeLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        relParam.addRule(RelativeLayout.CENTER_IN_PARENT)
        relParam.setMargins(10, 10, 10, 10)
        val imageView = ImageView(this)
        imageView.setImageResource(R.drawable.profilepic)
        relativeLayout.addView(imageView, relParam)
    }
}
