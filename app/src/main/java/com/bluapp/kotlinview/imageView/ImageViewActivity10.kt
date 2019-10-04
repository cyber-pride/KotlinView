package com.bluapp.kotlinview.imageView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bluapp.kotlinview.R
import android.view.ScaleGestureDetector
import android.view.MotionEvent


class ImageViewActivity10 : AppCompatActivity() {
    private var mScaleGestureDetector: ScaleGestureDetector? = null
    private var mScaleFactor = 1.0f
    private var imageView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view10)
        imageView = findViewById<ImageView>(R.id.imageView)
        mScaleGestureDetector = ScaleGestureDetector(this, ScaleListener())
    }

    override fun onTouchEvent(motionEvent: MotionEvent): Boolean {
        mScaleGestureDetector?.onTouchEvent(motionEvent)
        return true
    }

    private inner class ScaleListener : ScaleGestureDetector.SimpleOnScaleGestureListener() {
        override fun onScale(scaleGestureDetector: ScaleGestureDetector): Boolean {
            mScaleFactor *= scaleGestureDetector.scaleFactor
            mScaleFactor = Math.max(0.1f, Math.min(mScaleFactor, 10.0f))
            imageView?.setScaleX(mScaleFactor)
            imageView?.setScaleY(mScaleFactor)
            return true
        }
    }
}
