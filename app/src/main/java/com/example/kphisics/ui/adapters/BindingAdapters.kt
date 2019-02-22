package com.example.kphisics.ui.adapters

import android.widget.ExpandableListView
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.BindingAdapter
import com.example.kphisics.ui.tools.SensorExpandableListAdapter

@BindingAdapter("expandableAdapterList")
fun <T> updateExpandableListAdapter(view: ExpandableListView, list: List<T>) {
    val adapter = view.expandableListAdapter as? SensorExpandableListAdapter

    if (adapter == null)
        view.setAdapter(SensorExpandableListAdapter(view.context, list as List<Int>))
    else
        adapter.updateList(list  as List<Int>)
}

@BindingAdapter("onGroupClicked")
fun onGroupClicked(view: ExpandableListView, list: List<Int>) {
    view.setOnGroupClickListener { parent, view, groupPosition, id ->  //get the group header
        val headerInfo = list[groupPosition]
        //display it or do something with it
        Toast.makeText(view.context, "Child on Header $headerInfo",
                Toast.LENGTH_LONG).show()

        false
    }
}

@BindingAdapter("queHostiasPasa")
fun queHostiasPasaClicked(view: TextView, s : String){

}