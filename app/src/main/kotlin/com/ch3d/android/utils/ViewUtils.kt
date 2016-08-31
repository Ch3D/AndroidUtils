package com.ch3d.android.utils

import android.content.Context
import android.util.TypedValue
import android.view.View

class ViewUtils {
    companion object {
        fun dpToPx(context: Context, i: Float): Float {
            val displayMetrics = context.resources.displayMetrics
            return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, i, displayMetrics)
        }

        fun setViewVisibility(view: View?, visibility: Int) {
            if (view?.visibility != visibility) {
                view?.visibility = visibility
            }
        }

        fun setViewGone(view: View?, gone: Boolean) =
                setViewVisibility(view, if (gone) View.GONE else View.VISIBLE)

        fun setViewInvisible(view: View?, gone: Boolean) =
                setViewVisibility(view, if (gone) View.INVISIBLE else View.VISIBLE)
    }
}