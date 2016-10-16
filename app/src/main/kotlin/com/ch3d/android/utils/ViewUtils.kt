package com.ch3d.android.utils

import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE

class ViewUtils {
    fun View.hide(gone: Boolean = true) {
        visibility = if (gone) INVISIBLE else INVISIBLE
    }

    fun View.show() {
        visibility = VISIBLE
    }
}