package com.bluapp.kotlinview.recyclerView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import android.widget.EditText
import com.bluapp.kotlinview.R
import android.widget.TextView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.content.Context;
import android.view.View;
import android.widget.Filter;
import android.widget.Filterable;
import android.text.Editable
import android.text.TextWatcher
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager


class RecyclerViewActivity15 : AppCompatActivity() {
    private var list: RecyclerView? = null
    private var search: EditText? = null
    private var recyclerAdapter: adapter? = null
    var country: ArrayList<String>? = null
    var listcountry: ArrayList<String>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view15)
        list = findViewById(R.id.list) as RecyclerView
        search = findViewById(R.id.search) as EditText
        listcountry = getListCountry()
        country = ArrayList()
        country!!.addAll(listcountry!!)
        val layoutManager = LinearLayoutManager(this)
        list!!.setLayoutManager(layoutManager)
        recyclerAdapter = adapter(this@RecyclerViewActivity15, country!!)
        list!!.addItemDecoration(DividerItemDecoration(list!!.getContext(), layoutManager.orientation))
        list!!.setAdapter(recyclerAdapter)


        search!!.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {}
            override fun onTextChanged(charSequence: CharSequence, i: Int, i1: Int, i2: Int) {
                recyclerAdapter!!.getFilter().filter(charSequence.toString())
            }

            override fun afterTextChanged(editable: Editable) {}
        })
    }

    private inner class adapter(internal var context: Context, internal var mData: List<String>) : RecyclerView.Adapter<adapter.myViewHolder>(), Filterable {
        internal var mfilter: NewFilter

        override fun getFilter(): Filter {
            return mfilter
        }

        init {
            mfilter = NewFilter(this@adapter)
        }

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

        inner class NewFilter(var mAdapter: adapter) : Filter() {
            override fun performFiltering(charSequence: CharSequence): FilterResults {
                country!!.clear()
                val results = FilterResults()
                if (charSequence.length == 0) {
                    country!!.addAll(listcountry!!)
                } else {
                    val filterPattern = charSequence.toString().toLowerCase().trim { it <= ' ' }
                    for (listcountry in listcountry!!) {
                        if (listcountry.toLowerCase().startsWith(filterPattern)) {
                            country!!.add(listcountry)
                        }
                    }
                }
                results.values = country
                results.count = country!!.size
                return results
            }

            override fun publishResults(charSequence: CharSequence, filterResults: FilterResults) {
                this.mAdapter.notifyDataSetChanged()
            }

        }
    }

    fun getListCountry(): ArrayList<String> {
        val listcountry = arrayListOf<String>()
        listcountry.add("Nigeria")
        listcountry.add("China")
        listcountry.add("USA")
        listcountry.add("Ghana")
        listcountry.add("Canada")
        listcountry.add("Finland")
        listcountry.add("Denmark")
        listcountry.add("Argentina")
        listcountry.add("Andorra")
        listcountry.add("Togo")
        return listcountry
    }

}
