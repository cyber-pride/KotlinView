package com.bluapp.kotlinview.recyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.bluapp.kotlinview.R
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.TextView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import android.content.Context
import android.view.View


class RecyclerViewActivity11 : AppCompatActivity() {
    private var list: RecyclerView? = null
    private var recyclerAdapter: adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view11)
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
        list!!.setLayoutManager(layoutManager)
        recyclerAdapter = adapter(this@RecyclerViewActivity11, country)
        list!!.addItemDecoration(DividerItemDecoration(list!!.getContext(), layoutManager.orientation))
        list!!.setAdapter(recyclerAdapter)
        val itemTouchHelper = ItemTouchHelper(simpleCallback)
        itemTouchHelper.attachToRecyclerView(list)
    }

    var simpleCallback: ItemTouchHelper.SimpleCallback = object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT or ItemTouchHelper.DOWN or ItemTouchHelper.UP) {
        override fun onMove(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder, viewHolder1: RecyclerView.ViewHolder): Boolean {
            Toast.makeText(this@RecyclerViewActivity11, "Move", Toast.LENGTH_SHORT).show()
            return false
        }

        override fun onSwiped(viewHolder: RecyclerView.ViewHolder, i: Int) {
            Toast.makeText(this@RecyclerViewActivity11, "Swipe To Delete", Toast.LENGTH_SHORT).show()
            val position = viewHolder.adapterPosition
            recyclerAdapter!!.deleteItem(position)
        }
    }


    private inner class adapter(internal var context: Context, internal var mData: MutableList<String>) : RecyclerView.Adapter<adapter.myViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapter.myViewHolder {
            val view = LayoutInflater.from(context).inflate(com.bluapp.kotlinview.R.layout.recyclerview_adapter1, parent, false)
            return myViewHolder(view)
        }
        fun deleteItem(position: Int) {
            mData.removeAt(position)
            notifyItemRemoved(position)
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

}
