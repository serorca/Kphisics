package com.example.kphisics.ui.tools

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.kphisics.R
import com.example.kphisics.model.SensorNames
import java.util.*

class ExpandableListAdapter (private val context: Context, private val deptList: ArrayList<Int>) : BaseExpandableListAdapter() {

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
            view = infalInflater.inflate(R.layout.child_row, null)
        }

        val sequence = view?.findViewById(R.id.sequence) as TextView
        sequence.text = detailInfo.getSequence().trim() + ") "
        val childItem = view.findViewById(R.id.childItem) as TextView
        childItem.text = detailInfo.getName().trim()

        return view
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
        var view = view

        val headerInfo = getGroup(groupPosition)
        if (view == null) {
            val inf = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            view = inf.inflate(R.layout.expandable_list_group, null)
        }

        val heading = view!!.findViewById(R.id.heading) as TextView
        heading.text = context.resources.getString(SensorNames.titleForFype(headerInfo))

        return view
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }
}
