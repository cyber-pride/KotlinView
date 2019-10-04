package com.bluapp.kotlinview.imageView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bluapp.kotlinview.R
import android.graphics.drawable.BitmapDrawable
import android.graphics.Paint.Align
import android.graphics.*
import android.widget.ImageView


class ImageViewActivity9 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view9)
        val imageView = findViewById<ImageView>(R.id.imageView) as ImageView
        imageView.setImageDrawable(textOnImage(R.drawable.profilepic, "Hello World"))
    }

    private fun textOnImage(drawableId: Int, text: String): BitmapDrawable {
        val bm = BitmapFactory.decodeResource(resources, drawableId).copy(Bitmap.Config.ARGB_8888, true)
        val tf = Typeface.create("Helvetica", Typeface.BOLD)
        val paint = Paint()
        paint.setStyle(Paint.Style.FILL)
        paint.setColor(Color.WHITE)
        paint.setTypeface(tf)
        paint.setTextAlign(Align.CENTER)
        paint.setTextSize(30.0f)
        val textRect = Rect()
        paint.getTextBounds(text, 0, text.length, textRect)
        val canvas = Canvas(bm)
        if (textRect.width() >= canvas.getWidth() - 4)
            paint.setTextSize(20.0f)
        val xPos = canvas.getWidth() / 2 - 2
        val yPos = (canvas.getHeight() / 2 - (paint.descent() + paint.ascent()) / 2)
        canvas.drawText(text, xPos.toFloat(), yPos, paint)
        return BitmapDrawable(resources, bm)
    }
}
