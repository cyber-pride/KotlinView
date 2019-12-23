package com.bluapp.kotlinview.Tab

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bluapp.kotlinview.R
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener


class TabActivity7 : AppCompatActivity() {
    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null
    private var actionbar: ActionBar? = null
    val mFragmentTitleList = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab7)
        tabLayout = findViewById<View>(R.id.tabs) as TabLayout
        viewPager = findViewById(R.id.viewpager) as ViewPager
        actionbar = supportActionBar
        mFragmentTitleList.add("TabLayout1")
        mFragmentTitleList.add("TabLayout2")
        mFragmentTitleList.add("TabLayout3")
        mFragmentTitleList.add("TabLayout4")
        mFragmentTitleList.add("TabLayout5")
        viewPager!!.setAdapter(MyAdapter(supportFragmentManager))
        tabLayout!!.post(Runnable { tabLayout!!.setupWithViewPager(viewPager) })
        setActionBarTitle()
    }

    private fun setActionBarTitle() {
        tabLayout!!.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                val position = tab.position
                actionbar!!.title =  mFragmentTitleList.get(position)
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
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
            return mFragmentTitleList.get(position)
        }
    }
}
