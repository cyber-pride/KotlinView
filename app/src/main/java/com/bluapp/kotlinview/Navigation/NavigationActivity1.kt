package com.bluapp.kotlinview.Navigation

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import com.bluapp.kotlinview.R
import com.google.android.material.navigation.NavigationView


class NavigationActivity1 : AppCompatActivity() {
    private var mDrawerLayout: DrawerLayout? = null
    private var mNavigationView: NavigationView? = null
    private var toolbar: Toolbar? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation1)
        toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        mDrawerLayout = findViewById(R.id.drawerLayout) as DrawerLayout
        mNavigationView = findViewById(R.id.navigationView) as NavigationView

        val mDrawerToggle = ActionBarDrawerToggle(this, mDrawerLayout, toolbar, R.string.app_name, R.string.app_name)
        mDrawerLayout!!.addDrawerListener(mDrawerToggle)
        mDrawerToggle.syncState()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.navigation_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.getItemId()) {
            R.id.action_activitynavigation2 -> {
                startActivity(Intent(this@NavigationActivity1, NavigationActivity2::class.java))
                return true
            }
            R.id.action_activitynavigation3 -> {
                startActivity(Intent(this@NavigationActivity1, NavigationActivity3::class.java))
                return true
            }
            R.id.action_activitynavigation4 -> {
                startActivity(Intent(this@NavigationActivity1, NavigationActivity4::class.java))
                return true
            }
            R.id.action_activitynavigation5 -> {
                startActivity(Intent(this@NavigationActivity1, NavigationActivity5::class.java))
                return true
            }
            R.id.action_activitynavigation6 -> {
                startActivity(Intent(this@NavigationActivity1, NavigationActivity6::class.java))
                return true
            }
            R.id.action_activitynavigation7 -> {
                startActivity(Intent(this@NavigationActivity1, NavigationActivity7::class.java))
                return true
            }
            R.id.action_activitynavigation8 -> {
                startActivity(Intent(this@NavigationActivity1, NavigationActivity8::class.java))
                return true
            }
            R.id.action_activitynavigation9 -> {
                startActivity(Intent(this@NavigationActivity1, NavigationActivity9::class.java))
                return true
            }
            R.id.action_activitynavigation10 -> {
                startActivity(Intent(this@NavigationActivity1, NavigationActivity10::class.java))
                return true
            }
        }

        return true
    }
}
