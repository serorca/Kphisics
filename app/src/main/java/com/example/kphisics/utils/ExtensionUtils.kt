package com.example.kphisics.utils

import android.view.LayoutInflater
import android.view.ViewGroup


fun ViewGroup.inflate(inflater: LayoutInflater = LayoutInflater.from(context), resource: Int) =
        inflater.inflate(resource, null, false)
