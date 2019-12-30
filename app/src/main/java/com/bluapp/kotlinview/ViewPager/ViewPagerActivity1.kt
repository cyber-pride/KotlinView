package com.bluapp.kotlinview.ViewPager

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bluapp.kotlinview.R

class ViewPagerActivity1 : AppCompatActivity() {
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager1)
        viewPager = findViewById(R.id.viewpager) as ViewPager
        viewPager!!.adapter = MyAdapter(supportFragmentManager)
    }

    private inner class MyAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        private val int_items = 5

        override fun getItem(position: Int): Fragment {
            var fragment: Fragment? = null
            when (position) {
                0 -> fragment = ViewPagerFragment()
                1 -> fragment = ViewPagerFragment()
                2 -> fragment = ViewPagerFragment()
                3 -> fragment = ViewPagerFragment()
                4 -> fragment = ViewPagerFragment()
            }
            return fragment!!
        }

        override fun getCount(): Int {
            return int_items
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.viewpager_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.getItemId()) {
            R.id.action_activityviewpager2 -> {
                startActivity(Intent(this@ViewPagerActivity1, ViewPagerActivity2::class.java))
                return true
            }
            R.id.action_activityviewpager3 -> {
                startActivity(Intent(this@ViewPagerActivity1, ViewPagerActivity3::class.java))
                return true
            }
            R.id.action_activityviewpager4 -> {
                startActivity(Intent(this@ViewPagerActivity1, ViewPagerActivity4::class.java))
                return true
            }
            R.id.action_activityviewpager5 -> {
                startActivity(Intent(this@ViewPagerActivity1, ViewPagerActivity5::class.java))
                return true
            }
            R.id.action_activityviewpager6 -> {
                startActivity(Intent(this@ViewPagerActivity1, ViewPagerActivity6::class.java))
                return true
            }
            R.id.action_activityviewpager7 -> {
                startActivity(Intent(this@ViewPagerActivity1, ViewPagerActivity7::class.java))
                return true
            }
            R.id.action_activityviewpager8 -> {
                startActivity(Intent(this@ViewPagerActivity1, ViewPagerActivity8::class.java))
                return true
            }
            R.id.action_activityviewpager9 -> {
                startActivity(Intent(this@ViewPagerActivity1, ViewPagerActivity9::class.java))
                return true
            }
            R.id.action_activityviewpager10 -> {
                startActivity(Intent(this@ViewPagerActivity1, ViewPagerActivity10::class.java))
                return true
            }
            R.id.action_activityviewpager11 -> {
                startActivity(Intent(this@ViewPagerActivity1, ViewPagerActivity11::class.java))
                return true
            }
            R.id.action_activityviewpager12 -> {
                startActivity(Intent(this@ViewPagerActivity1, ViewPagerActivity12::class.java))
                return true
            }
            R.id.action_activityviewpager13 -> {
                startActivity(Intent(this@ViewPagerActivity1, ViewPagerActivity13::class.java))
                return true
            }
            R.id.action_activityviewpager14 -> {
                startActivity(Intent(this@ViewPagerActivity1, ViewPagerActivity14::class.java))
                return true
            }
        }

        return true
    }

}
