package com.bluapp.kotlinview.imageView

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bluapp.kotlinview.R

class ImageViewActivity17 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view17)
        val imageView = findViewById<ImageView>(R.id.imageView) as ImageView
        imageView.setBackgroundColor(Color.RED)
    }
}
