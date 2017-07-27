package com.imeepwni.android.draganddraw.ui.view

import android.content.*
import android.graphics.*
import android.util.*
import android.view.*
import com.imeepwni.android.draganddraw.model.data.*
import com.imeepwni.android.draganddraw.model.repository.*
import com.orhanobut.logger.*
import kotlin.properties.*

/**
 * Create by guofeng on 2017/7/27.
 */
class BoxDrawingView(ctx: Context, attrs: AttributeSet? = null) : View(ctx, attrs) {
    private val logger = Logger.t(javaClass.simpleName)!!
    private var box by Delegates.notNull<Box>()

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val current = PointF(event.x, event.y)
        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                box = Box(current)
                BoxRepository.boxList.add(box)
            }
            MotionEvent.ACTION_MOVE -> {
                box.current = current
                invalidate()
            }
        }
        logger.i("Action: ${event.action}, x = ${event.x}, y = ${event.y}")
        return true
    }

    private val boxPaint: Paint = Paint().apply { color = 0x22ff0000 }
    private val backgroundPaint: Paint = Paint().apply { color = 0xfff8efe0.toInt() }

    override fun onDraw(canvas: Canvas) {
        canvas.drawPaint(backgroundPaint)

        BoxRepository.boxList.forEach {
            val left = Math.min(it.origin.x, it.current.x)
            val right = Math.max(it.origin.x, it.current.x)
            val top = Math.min(it.origin.y, it.current.y)
            val bottom = Math.max(it.origin.y, it.current.y)
            canvas.drawRect(left, top, right, bottom, boxPaint)
        }
    }
}