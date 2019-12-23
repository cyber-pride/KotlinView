package com.bluapp.kotlinview.Tab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.bluapp.kotlinview.R
import com.google.android.material.tabs.TabLayout

class TabActivity18 : AppCompatActivity(), SendFragment.OnFragmentInteractionListener {
    private var tabLayout: TabLayout? = null
    private var viewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab18)
        tabLayout = findViewById(R.id.tabs) as TabLayout
        viewPager = findViewById(R.id.viewpager) as ViewPager
        viewPager!!.setAdapter(MyAdapter(supportFragmentManager))
        tabLayout!!.post(Runnable { tabLayout!!.setupWithViewPager(viewPager) })

    }

    override public fun onButtonClick(data: String){
        val tag = "android:switcher:" + R.id.viewpager + ":" + 1;
        val receiveFragment = supportFragmentManager.findFragmentByTag(tag) as ReceiveFragment
        receiveFragment.onButtonClick(data)
    }

    private inner class MyAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        private val int_items = 2;

        override fun getItem(position: Int): Fragment {
            var fragment: Fragment? = null
            when (position) {
                0 -> fragment = SendFragment.newInstance()
                1 -> fragment = ReceiveFragment.newInstance()
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
            }
            return null
        }
    }
}
