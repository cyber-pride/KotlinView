package com.bluapp.kotlinview.imageView

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bluapp.kotlinview.R
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.widget.ImageView
import java.io.ByteArrayOutputStream


class ImageViewActivity14 : AppCompatActivity() {

    @SuppressLint("WrongThread")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view14)
        val imageView = findViewById<ImageView>(R.id.imageView) as ImageView
        val drawable = imageView.getDrawable()
        val bitmap = (drawable as BitmapDrawable).bitmap
        val stream = ByteArrayOutputStream()
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream)
        val bitmapdata = stream.toByteArray()
    }
}
