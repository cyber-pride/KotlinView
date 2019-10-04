package com.bluapp.kotlinview.imageView

import android.graphics.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bluapp.kotlinview.R
import android.widget.ImageView


class ImageViewActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view3)
        val imageView = findViewById<ImageView>(R.id.imageView) as ImageView
        imageView.setImageBitmap(getCircleBitmap(BitmapFactory.decodeResource(resources, R.drawable.profilepic)))
    }

    fun getCircleBitmap(bitmap: Bitmap): Bitmap {
        val output = Bitmap.createBitmap(bitmap.width, bitmap.height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(output)
        val paint = Paint()
        val rect = Rect(0, 0, bitmap.width, bitmap.height)
        val rectF = RectF(rect)
        paint.setAntiAlias(true)
        canvas.drawARGB(0, 0, 0, 0)
        canvas.drawOval(rectF, paint)
        paint.setXfermode(PorterDuffXfermode(PorterDuff.Mode.SRC_IN))
        canvas.drawBitmap(bitmap, rect, rect, paint)
        bitmap.recycle()
        return output
    }


}
