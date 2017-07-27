package com.imeepwni.android.draganddraw.viewmodel

import com.imeepwni.android.draganddraw.model.data.*
import com.imeepwni.android.draganddraw.model.repository.*

/**
 * Create by guofeng on 2017/7/27.
 */
class BoxViewModel {
    fun add(box: Box): Unit {
        BoxRepository.boxList.add(box)
    }

    fun getBoxList(): MutableList<Box> {
        return BoxRepository.boxList
    }
}