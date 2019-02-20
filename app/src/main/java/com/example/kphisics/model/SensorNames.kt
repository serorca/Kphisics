package com.example.kphisics.model

import android.hardware.Sensor
import com.example.kphisics.R

class SensorNames {

    companion object {

        const val LIGHT = Sensor.TYPE_LIGHT

        const val ACOUSTIC_INTENSITY = Sensor.TYPE_PRESSURE

        const val SOUND_TONE = Sensor.TYPE_AMBIENT_TEMPERATURE

        const val ACCELEROMETER = Sensor.TYPE_ACCELEROMETER

        const val ACCELEROMETER_X = Sensor.TYPE_LINEAR_ACCELERATION

        const val ACCELEROMETER_Y = Sensor.TYPE_LINEAR_ACCELERATION + 1

        const val ACCELEROMETER_Z = Sensor.TYPE_LINEAR_ACCELERATION + 2

        const val MAGNETIC_FIELD = Sensor.TYPE_MAGNETIC_FIELD

        fun titleForType(type: Int): Int {

            return when (type) {

                LIGHT -> R.string.title_light
                ACOUSTIC_INTENSITY -> R.string.title_acoustic_intensity
                SOUND_TONE -> R.string.title_sound_tone
                ACCELEROMETER -> R.string.title_accelerometer
                ACCELEROMETER_X -> R.string.title_accelerometer_x
                ACCELEROMETER_Y -> R.string.title_accelerometer_y
                ACCELEROMETER_Z -> R.string.title_accelerometer_z
                MAGNETIC_FIELD -> R.string.title_magnetic_field
                else -> R.string.title_unknown
            }
        }
    }

    private val names = arrayOf("LIGHT", "ACOUSTIC_INTENSITY", "SOUND_TONE", "ACCELEROMETER",
            "ACCELEROMETER_X", "ACCELEROMETER_Y", "ACCELEROMETER_Z", "MAGNETIC_FIELD")


    fun SensorName() {}

    fun name(e: Int): String {
        return names[e]
    }


}