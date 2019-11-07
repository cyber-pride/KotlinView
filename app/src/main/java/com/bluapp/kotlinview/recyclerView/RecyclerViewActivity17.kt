package com.bluapp.kotlinview.recyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import com.bluapp.kotlinview.R
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.ViewGroup
import android.content.Context


class RecyclerViewActivity17 : AppCompatActivity() {
    private var list: RecyclerView? = null
    private var emptyData: TextView? = null
    private var recyclerAdapter: adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view17)
        list = findViewById(R.id.list) as RecyclerView
        emptyData = findViewById(R.id.empty) as TextView
        val country = arrayListOf<String>()

        if (country.isEmpty()) {
            list!!.setVisibility(View.GONE)
            emptyData!!.setVisibility(View.VISIBLE)
        } else {
            emptyData!!.setVisibility(View.GONE)
            list!!.setVisibility(View.VISIBLE)
        }
        val layoutManager = LinearLayoutManager(this)
        list!!.setLayoutManager(layoutManager)
        recyclerAdapter = adapter(this@RecyclerViewActivity17, country)
        list!!.addItemDecoration(DividerItemDecoration(list!!.getContext(), layoutManager.orientation))
        list!!.setAdapter(recyclerAdapter)
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
                country = itemView.findViewById(R.id.country) as TextView
            }
        }
    }

}
