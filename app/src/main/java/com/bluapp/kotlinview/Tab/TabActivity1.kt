package com.bluapp.kotlinview.Tab

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bluapp.kotlinview.R
import com.google.android.material.tabs.TabLayout


class TabActivity1 : AppCompatActivity() {
    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab1)
        tabLayout = findViewById(R.id.tabs) as TabLayout
        viewPager = findViewById(R.id.viewpager) as ViewPager
        viewPager!!.setAdapter(MyAdapter(supportFragmentManager))
        tabLayout!!.post(Runnable { tabLayout!!.setupWithViewPager(viewPager) })

    }

    private inner class MyAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        private val int_items = 5;

        override fun getItem(position: Int): Fragment {
            var fragment: Fragment? = null
            when (position) {
                0 -> fragment = TabFragment()
                1 -> fragment = TabFragment()
                2 -> fragment = TabFragment()
                3 -> fragment = TabFragment()
                4 -> fragment = TabFragment()
            }
            return fragment!!
        }

        override fun getCount(): Int {
            return int_items
        }

        override fun getPageTitle(position: Int): CharSequence? {
            when (position) {
                0 -> return "TabLayout1"
                1 -> return "TabLayout2"
                2 -> return "TabLayout3"
                3 -> return "TabLayout4"
                4 -> return "TabLayout5"
            }
            return null
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.tab_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.getItemId()) {
            R.id.action_activitytab2 -> {
                startActivity(Intent(this@TabActivity1, TabActivity2::class.java))
                return true
            }
            R.id.action_activitytab3 -> {
                startActivity(Intent(this@TabActivity1, TabActivity3::class.java))
                return true
            }
            R.id.action_activitytab4 -> {
                startActivity(Intent(this@TabActivity1, TabActivity4::class.java))
                return true
            }
            R.id.action_activitytab5 -> {
                startActivity(Intent(this@TabActivity1, TabActivity5::class.java))
                return true
            }
            R.id.action_activitytab6 -> {
                startActivity(Intent(this@TabActivity1, TabActivity6::class.java))
                return true
            }
            R.id.action_activitytab7 -> {
                startActivity(Intent(this@TabActivity1, TabActivity7::class.java))
                return true
            }
            R.id.action_activitytab8 -> {
                startActivity(Intent(this@TabActivity1, TabActivity8::class.java))
                return true
            }
            R.id.action_activitytab9 -> {
                startActivity(Intent(this@TabActivity1, TabActivity9::class.java))
                return true
            }
            R.id.action_activitytab10 -> {
                startActivity(Intent(this@TabActivity1, TabActivity10::class.java))
                return true
            }
            R.id.action_activitytab11 -> {
                startActivity(Intent(this@TabActivity1, TabActivity11::class.java))
                return true
            }
            R.id.action_activitytab12 -> {
                startActivity(Intent(this@TabActivity1, TabActivity12::class.java))
                return true
            }
        }

        return true
    }

}
