package com.bluapp.kotlinview.imageView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import com.bluapp.kotlinview.R

class ImageViewActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view2)
        val imageView = findViewById<ImageView>(R.id.imageView) as ImageView
        imageView.setImageResource(R.drawable.profilepic)
        imageView.scaleType = ImageView.ScaleType.FIT_XY
        imageView.adjustViewBounds = false
        imageView.layoutParams.height = ViewGroup.LayoutParams.MATCH_PARENT
        imageView.layoutParams.width = ViewGroup.LayoutParams.MATCH_PARENT
    }
}
