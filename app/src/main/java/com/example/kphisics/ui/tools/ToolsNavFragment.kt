package com.example.kphisics.ui.tools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.kphisics.R
import com.example.kphisics.model.SensorNames
import java.util.*

class ToolsNavFragment : Fragment() {

    private val mySection = LinkedHashMap<String, Int>()
    private val sensorList = ArrayList<Int>()

    private var listAdapter: ExpandableListAdapter? = null
    private var expandableListView: ExpandableListView? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tools, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sensorList.add(SensorNames.LIGHT)
        sensorList.add(SensorNames.ACOUSTIC_INTENSITY)
        sensorList.add(SensorNames.SOUND_TONE)
        sensorList.add(SensorNames.ACCELEROMETER)
        sensorList.add(SensorNames.ACCELEROMETER_X)
        sensorList.add(SensorNames.ACCELEROMETER_Y)
        sensorList.add(SensorNames.ACCELEROMETER_Z)
        sensorList.add(SensorNames.MAGNETIC_FIELD)

        //get reference to the ExpandableListView
        expandableListView = activity!!.findViewById(R.id.lvExp) as ExpandableListView
        //create the adapter by passing your ArrayList data
        listAdapter = ExpandableListAdapter(this.context!!, sensorList)
        //attach the adapter to the list
        expandableListView!!.setAdapter(listAdapter)

        expandableListView!!.setOnGroupClickListener(listGroupClicked)

    }

    private val listGroupClicked = ExpandableListView.OnGroupClickListener { _, _, groupPosition, _ ->
        //get the group header
        val headerInfo = sensorList[groupPosition]
        //display it or do something with it
        Toast.makeText(context, "Child on Header $headerInfo",
                Toast.LENGTH_LONG).show()

        false
    }

    //method to expand all groups
    private fun expandAll() {
        val count = listAdapter!!.groupCount
        for (i in 0 until count) {
            expandableListView!!.expandGroup(i)
        }
    }

    //method to collapse all groups
    private fun collapseAll() {
        val count = listAdapter!!.groupCount
        for (i in 0 until count) {
            expandableListView!!.collapseGroup(i)
        }
    }

}