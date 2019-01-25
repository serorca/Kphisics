package com.example.kphisics.model

import android.hardware.Sensor

class SensorNames {

    companion object {

        const val LIGHT = Sensor.TYPE_LIGHT

        const val ACOUSTIC_INTENSITY = Sensor.TYPE_PRESSURE

        const val SOUND_TONE = Sensor.TYPE_AMBIENT_TEMPERATURE

        const val ACCELEROMETER = Sensor.TYPE_ACCELEROMETER

        const val ACCELEROMETER_X = Sensor.TYPE_LINEAR_ACCELERATION

        const val ACCELEROMETER_Y = Sensor.TYPE_LINEAR_ACCELERATION

        const val ACCELEROMETER_Z = Sensor.TYPE_LINEAR_ACCELERATION

        const val MAGNETIC_FIELD = Sensor.TYPE_MAGNETIC_FIELD
    }

    private val names = arrayOf("LIGHT", "ACOUSTIC_INTENSITY", "SOUND_TONE", "ACCELEROMETER",
            "ACCELEROMETER_X", "ACCELEROMETER_Y", "ACCELEROMETER_Z", "MAGNETIC_FIELD")

    fun SensorName(){}

    fun name(e: Int): String { return names[e]}

}