package com.imeepwni.android.draganddraw.model.data

import android.graphics.*

/**
 * Create by guofeng on 2017/7/27.
 */
data class Box(
        var origin: PointF = PointF(0.0f, 0.0f),
        var current: PointF = origin
)