package com.bluapp.kotlinview.recyclerView

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.bluapp.kotlinview.databinding.ActivityRecyclerView13Binding
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.bluapp.kotlinview.BR
import com.bluapp.kotlinview.R
import com.bluapp.kotlinview.databinding.ItemDatabind13RowBinding


class RecyclerViewActivity13 : AppCompatActivity() {
    private var binding: ActivityRecyclerView13Binding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view13)
        populateData()
    }

    private fun populateData() {
        val countryModelList = arrayListOf<CountryModel>()
        countryModelList.add(CountryModel("Nigeria"))
        countryModelList.add(CountryModel("India"))
        countryModelList.add(CountryModel("Sweden"))
        countryModelList.add(CountryModel("Usa"))
        countryModelList.add(CountryModel("Ghana"))
        countryModelList.add(CountryModel("South Africa"))

        val countryAdapter = CountryAdapter(countryModelList, this)
        binding!!.setCountryAdapter(countryAdapter)
    }

    inner class CountryModel(val countryName: String)

    interface CustomClickListner {
        fun cardClicked(countryModel: CountryModel)
    }

    inner class CountryAdapter(private val countryModelList: List<CountryModel>, private val context: Context) : RecyclerView.Adapter<CountryAdapter.ViewHolder>(), CustomClickListner {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val binding = DataBindingUtil.inflate<ItemDatabind13RowBinding>(LayoutInflater.from(parent.context), R.layout.item_databind13_row, parent, false)
            return ViewHolder(binding)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val countryModel = countryModelList[position]
            holder.bind(countryModel)
            holder.itemDatabind16RowBinding.setItemClickListner(this)
        }

        override fun getItemCount(): Int {
            return countryModelList.size
        }


        inner class ViewHolder(var itemDatabind16RowBinding: ItemDatabind13RowBinding) :
            RecyclerView.ViewHolder(itemDatabind16RowBinding.getRoot()) {

            fun bind(`object`: Any) {
                itemDatabind16RowBinding.setVariable(BR.model, `object`)
                itemDatabind16RowBinding.executePendingBindings()
            }
        }

        override fun cardClicked(countryModel: CountryModel) {
            Toast.makeText(context, "Item Click " + countryModel.countryName, Toast.LENGTH_LONG).show()
        }
    }


}
