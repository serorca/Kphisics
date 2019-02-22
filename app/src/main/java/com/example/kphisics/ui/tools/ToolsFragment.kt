package com.example.kphisics.ui.tools

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ExpandableListView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.kphisics.R
import com.example.kphisics.databinding.FragmentToolsBinding
import java.util.*

class ToolsFragment : Fragment() {

    private val mySection = LinkedHashMap<String, Int>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_tools, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val binding = checkNotNull(DataBindingUtil.bind<FragmentToolsBinding>(view))


    }

    private fun generateViewModel() = ViewModelProviders.of(this)[ToolsViewModel::class.java]
}