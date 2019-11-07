package com.bluapp.kotlinview.recyclerView

import android.content.Context
import android.content.Intent
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.bluapp.kotlinview.R
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

class RecyclerViewActivity1 : AppCompatActivity() {
    private var list: RecyclerView? = null
    private var recyclerAdapter: adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view1)
        list = findViewById(R.id.list) as RecyclerView
        val country = arrayListOf<String>()
        country.add("Nigeria")
        country.add("China")
        country.add("USA")
        country.add("Ghana")
        country.add("Canada")
        country.add("Finland")
        country.add("Denmark")
        country.add("Argentina")
        country.add("Andorra")
        country.add("Togo")

        val layoutManager = LinearLayoutManager(this)
        list!!.layoutManager = layoutManager
        recyclerAdapter = adapter(this@RecyclerViewActivity1, country)
        list!!.addItemDecoration(CustomDividerItemDecoration(this@RecyclerViewActivity1))
        list!!.adapter = recyclerAdapter

    }

    private inner class CustomDividerItemDecoration(context: Context) : RecyclerView.ItemDecoration() {
        private val drawableline: Drawable?
        init {
            drawableline = ContextCompat.getDrawable(context, R.drawable.recyclerline)
        }
        override fun onDrawOver(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
            val left = parent.paddingLeft
            val right = parent.width - parent.paddingRight
            val childCount = parent.childCount
            for (i in 0 until childCount) {
                val child = parent.getChildAt(i)
                val params = child.layoutParams as RecyclerView.LayoutParams
                val top = child.bottom + params.bottomMargin
                val bottom = top + drawableline!!.intrinsicHeight
                drawableline.setBounds(left, top, right, bottom)
                drawableline.draw(c)
            }
        }
    }

    private inner class adapter(internal var context: Context, internal var mData: List<String>) : RecyclerView.Adapter<adapter.myViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter.myViewHolder {
            val view =
                LayoutInflater.from(context).inflate(R.layout.recyclerview_adapter1, parent, false)
            return myViewHolder(view)
        }
        override fun onBindViewHolder(holder: adapter.myViewHolder, position: Int) {
            holder.country.text = mData[position]
        }
        override fun getItemCount(): Int {
            return mData.size
        }
        inner class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            internal var country: TextView
            init {
                country = itemView.findViewById(R.id.country)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.recyclerview_option, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when (item.getItemId()) {
            R.id.action_activityrecyclerview2 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity2::class.java))
                return true
            }
            R.id.action_activityrecyclerview3 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity3::class.java))
                return true
            }
            R.id.action_activityrecyclerview4 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity4::class.java))
                return true
            }
            R.id.action_activityrecyclerview5 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity5::class.java))
                return true
            }
            R.id.action_activityrecyclerview6 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity6::class.java))
                return true
            }
            R.id.action_activityrecyclerview7 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity7::class.java))
                return true
            }
            R.id.action_activityrecyclerview8 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity8::class.java))
                return true
            }
            R.id.action_activityrecyclerview9 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity9::class.java))
                return true
            }
            R.id.action_activityrecyclerview10 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity10::class.java))
                return true
            }
            R.id.action_activityrecyclerview11 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity11::class.java))
                return true
            }
            R.id.action_activityrecyclerview12 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity12::class.java))
                return true
            }
            R.id.action_activityrecyclerview13 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity13::class.java))
                return true
            }
            R.id.action_activityrecyclerview14 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity14::class.java))
                return true
            }
            R.id.action_activityrecyclerview15 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity15::class.java))
                return true
            }
            R.id.action_activityrecyclerview16 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity16::class.java))
                return true
            }
            R.id.action_activityrecyclerview17 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity17::class.java))
                return true
            }
            R.id.action_activityrecyclerview18 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity18::class.java))
                return true
            }
            R.id.action_activityrecyclerview19 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity19::class.java))
                return true
            }
            R.id.action_activityrecyclerview20 -> {
                startActivity(Intent(this@RecyclerViewActivity1, RecyclerViewActivity20::class.java))
                return true
            }
        }

        return true
    }
}
