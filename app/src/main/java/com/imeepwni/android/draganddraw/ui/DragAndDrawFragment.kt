package com.imeepwni.android.draganddraw.ui


import android.databinding.*
import android.os.*
import android.support.v4.app.*
import android.view.*
import com.imeepwni.android.draganddraw.*
import com.imeepwni.android.draganddraw.databinding.*

class DragAndDrawFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentDragAndDrawBinding>(inflater, R.layout.fragment_drag_and_draw, container, false)
        return binding.root
    }

    companion object {
        fun newInstance(): DragAndDrawFragment {
            val dragAndDrawFragment = DragAndDrawFragment()
            return dragAndDrawFragment
        }
    }
}
