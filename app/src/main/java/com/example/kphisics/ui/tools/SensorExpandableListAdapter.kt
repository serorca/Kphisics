package com.example.kphisics.ui.tools

import android.content.Context
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.ListAdapter
import android.widget.TextView
import com.example.kphisics.R
import com.example.kphisics.model.SensorNames
import com.example.kphisics.utils.inflate
import com.github.mikephil.charting.charts.Chart
import com.github.mikephil.charting.charts.LineChart
import java.util.*

class SensorExpandableListAdapter(private val context: Context,
                                   private var deptList: List<Int>) : BaseExpandableListAdapter(){

    override fun getChildrenCount(groupPosition: Int): Int {
        return 0
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
//        val productList = deptList[groupPosition].getProductList()
        return 0
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean,
                              view: View?, parent: ViewGroup): View {
        var view = view

        val detailInfo = getChild(groupPosition, childPosition) as DetailInfo

        if (view == null) {
            val infalInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = infalInflater.inflate(R.layout.expandable_list_item, null)
        }

        val returnView = view ?: parent.inflate(resource = R.layout.expandable_list_item)

        val chart = view?.findViewById(R.id.chart) as LineChart


        return returnView
    }

    override fun getGroup(groupPosition: Int): Int {
        return deptList[groupPosition]
    }

    override fun getGroupCount(): Int {
        return deptList.size
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getGroupView(groupPosition: Int, isLastChild: Boolean, view: View?,
                              parent: ViewGroup): View {

        val headerInfo = getGroup(groupPosition)

        val returnView = view ?: parent.inflate(resource = R.layout.expandable_list_group)

        val heading = returnView.findViewById<TextView>(R.id.heading)
        heading.text = context.resources.getString(SensorNames.titleForType(headerInfo))

        return returnView
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }

    fun updateList(list : List<Int>) {
        deptList = list
        notifyDataSetChanged()
    }


}
