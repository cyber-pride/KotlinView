package com.bluapp.kotlinview.Tab

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView

import com.bluapp.kotlinview.R


class ReceiveFragment : Fragment() {
    private var dataRec: AppCompatTextView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_receive, container, false)
        dataRec = view.findViewById(R.id.dataRec) as AppCompatTextView

        return view;
    }

    public fun onButtonClick(data: String){
        dataRec!!.setText(data)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ReceiveFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() = SendFragment().apply {}
    }
}

