package com.ch3d.android.utils

import android.content.Context
import android.util.TypedValue

/**
 * TODO add javadocs
 */
class ViewUtils {
    companion object {
        fun dpToPx(context: Context, i: Float): Float {
            val displayMetrics = context.resources.displayMetrics
            return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, i, displayMetrics)
        }
    }
}