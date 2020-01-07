package com.bluapp.kotlinview.Navigation

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import com.bluapp.kotlinview.R


class NavigationActivity9 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation9)
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
            Toast.makeText(this@NavigationActivity9, "Visible Fragment Label Name: " + destination.label, Toast.LENGTH_LONG).show()
        }

    }
}
