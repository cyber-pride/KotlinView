package com.bluapp.kotlinview.Navigation

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.appcompat.widget.Toolbar
import androidx.core.view.MenuItemCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.bluapp.kotlinview.R
import com.google.android.material.navigation.NavigationView


class NavigationActivity11 : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private var blogTv: AppCompatTextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation11)
        val toolbar: Toolbar = findViewById(R.id.toolbar)

        setSupportActionBar(toolbar)
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val navController = findNavController(R.id.nav_host_fragment)
        appBarConfiguration = AppBarConfiguration(
            setOf(R.id.nav_item_home, R.id.nav_item_blog, R.id.nav_item_app), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        blogTv = MenuItemCompat.getActionView(navView.menu.findItem(R.id.nav_item_blog)) as AppCompatTextView
        initCountOnDrawer()
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    fun initCountOnDrawer(){
        blogTv!!.gravity = Gravity.CENTER_VERTICAL
        blogTv!!.setTypeface(null, Typeface.BOLD)
        blogTv!!.setTextColor(Color.RED)
        blogTv!!.text = "60"
    }
}
