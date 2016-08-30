package com.ch3d.android.utils

import android.content.Context
import android.os.IBinder
import android.view.View
import android.view.inputmethod.InputMethodManager

class KeyboardUtils {
    companion object {
        fun hideKeyboard(context: Context, windowToken: IBinder) {
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(windowToken, 0)
        }

        fun showKeyboard(context: Context?, view: View?) {
            if (context == null || view == null) {
                // skip
                return
            }
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
        }

        fun hideKeyboard(context: Context, view: View?) {
            if (view != null) {
                hideKeyboard(context, view.windowToken)
            }
        }
    }
}
