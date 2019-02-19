package com.example.kphisics.ui.tools

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.TextView
import com.example.kphisics.R
import com.example.kphisics.model.SensorNames
import com.example.kphisics.utils.inflate
import java.util.*

class ExpandableListAdapter (private val context: Context, private val deptList: ArrayList<Int>) : BaseExpandableListAdapter() {

    override fun getChildrenCount(groupPosition: Int): Int {
        return 0
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {

        return getGroup(groupPosition)
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return childPosition.toLong()
    }

    override fun getChildView(groupPosition: Int, childPosition: Int, isLastChild: Boolean,
                              view: View?, parent: ViewGroup): View {
        val view = view

        val sensorDetail = getChild(groupPosition, childPosition)



        val resultView = view ?: parent.inflate(resource = R.layout.expandable_list_item)

        return resultView
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
        heading.text = context.resources.getString(SensorNames.titleForFype(headerInfo))

        return returnView
    }

    override fun hasStableIds(): Boolean {
        return true
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }
}
