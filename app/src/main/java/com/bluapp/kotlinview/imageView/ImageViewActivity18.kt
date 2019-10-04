package com.bluapp.kotlinview.imageView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bluapp.kotlinview.R

class ImageViewActivity18 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view18)
        val imageView = findViewById<ImageView>(R.id.imageView) as ImageView
        imageView.setBackgroundResource(R.drawable.image_border)
    }
}
