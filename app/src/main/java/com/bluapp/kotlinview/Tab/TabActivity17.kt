package com.bluapp.kotlinview.Tab

import android.app.TabActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TabHost
import com.bluapp.kotlinview.R


@Suppress("DEPRECATION")
class TabActivity17 : TabActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab17)
        val tabHost = findViewById(android.R.id.tabhost) as TabHost

        val TabMenu1: TabHost.TabSpec = tabHost.newTabSpec("First Tab")
        val TabMenu2: TabHost.TabSpec = tabHost.newTabSpec("Second Tab")
        val TabMenu3: TabHost.TabSpec = tabHost.newTabSpec("Third Tab")

        TabMenu1.setIndicator("Tab1")
        TabMenu1.setContent(Intent(this@TabActivity17, TabHostActivity::class.java))

        TabMenu2.setIndicator("Tab2")
        TabMenu2.setContent(Intent(this@TabActivity17, TabHostActivity::class.java))

        TabMenu3.setIndicator("Tab3")
        TabMenu3.setContent(Intent(this@TabActivity17, TabHostActivity::class.java))

        tabHost.addTab(TabMenu1)
        tabHost.addTab(TabMenu2)
        tabHost.addTab(TabMenu3)

    }
}
