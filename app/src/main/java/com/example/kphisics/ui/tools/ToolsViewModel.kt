package com.example.kphisics.ui.tools

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.example.kphisics.model.*
import java.util.*

class ToolsViewModel : ViewModel() {

     val sensorList = ObservableField<List<Int>>(listOf(
            LIGHT,
            ACOUSTIC_INTENSITY,
            SOUND_TONE,
            ACCELEROMETER,
            ACCELEROMETER_X,
            ACCELEROMETER_Y,
            ACCELEROMETER_Z,
            MAGNETIC_FIELD
    ))


}