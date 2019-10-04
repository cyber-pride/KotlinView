package com.bluapp.kotlinview.imageView

import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bluapp.kotlinview.R
import android.graphics.drawable.BitmapDrawable



class ImageViewActivity15 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view15)
        val imageView = findViewById<ImageView>(R.id.imageView) as ImageView
        val bitmap = (resources.getDrawable(R.drawable.profilepic) as BitmapDrawable).bitmap
        val bitmapRounded = Bitmap.createBitmap(bitmap.width, bitmap.height, bitmap.config)
        val canvas = Canvas(bitmapRounded)
        val paint = Paint()
        paint.setAntiAlias(true)
        paint.setShader(BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP))
        canvas.drawRoundRect(RectF(0.0f, 0.0f, bitmap.width.toFloat(), bitmap.height.toFloat()), 30.0f, 30.0f, paint)
        imageView.setImageBitmap(bitmapRounded)
    }
}
