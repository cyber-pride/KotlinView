package com.bluapp.kotlinview.imageView

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bluapp.kotlinview.R
import android.widget.Toast
import android.content.Intent
import android.widget.Button
import android.widget.ImageView
import com.theartofdev.edmodo.cropper.CropImage


class ImageViewActivity7 : AppCompatActivity() {
    val PIC_CROP_REQUEST = 1
    val PICK_IMAGE_REQUEST = 2
    var imagePreview: ImageView?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view7)
        imagePreview = findViewById<ImageView>(R.id.imagePreview) as ImageView
        val chooseImageBtn = findViewById<Button>(R.id.choose_image) as Button
        chooseImageBtn.setOnClickListener { ImagePicker() }
    }

    private fun ImagePicker() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        intent.putExtra("crop", "true")
        startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE_REQUEST)
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK) {
            if(data == null || data.data == null){
                return
            }
            CropImage.activity(data.data!!).start(this);
        }else if (requestCode == CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE) {
            val result = CropImage.getActivityResult(data)
            if (resultCode == RESULT_OK) {
                imagePreview?.setImageURI(result.getUri())
            } else if (resultCode == CropImage.CROP_IMAGE_ACTIVITY_RESULT_ERROR_CODE) {
                val error = result.getError()
                Toast.makeText(this@ImageViewActivity7, error.message, Toast.LENGTH_SHORT).show()
            }
        }

    }
}
