package com.imeepwni.android.draganddraw.ui

import android.support.v4.app.*
import com.imeepwni.android.draganddraw.app.*

class DragAndDrawActivity : SingleFragmentActivity() {
    override fun getFragment(): Fragment {
        return DragAndDrawFragment.newInstance()
    }
}
