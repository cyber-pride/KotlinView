package com.bluapp.kotlinview.imageView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import com.bluapp.kotlinview.R

class ImageViewActivity19 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view19)
        val imageView = findViewById<ImageView>(R.id.imageView) as ImageView
        val anim = AnimationUtils.loadAnimation(this@ImageViewActivity19, R.anim.blink)
        imageView.startAnimation(anim)
    }
}
