package com.example.kphisics.ui.tools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListAdapter
import android.widget.ExpandableListView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.kphisics.R
import com.example.kphisics.databinding.FragmentToolsBinding
import com.example.kphisics.model.SensorNames
import com.example.kphisics.model.SensorUIModel
import kotlinx.android.synthetic.main.fragment_tools.*
import java.util.*
import kotlin.collections.ArrayList

class ToolsFragment : Fragment() {

    private lateinit var viewModel: ToolsViewModel
    private lateinit var adapter: ExpandableListAdapter

    private val mySection = LinkedHashMap<String, Int>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tools, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = checkNotNull(DataBindingUtil.bind<FragmentToolsBinding>(view))

        val viewModel = generateViewModel()


    }
    private fun initExpandableList(){

    }

    private fun generateViewModel() = ViewModelProviders.of(this)[ToolsViewModel::class.java]
}