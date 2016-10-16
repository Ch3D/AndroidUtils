package com.ch3d.ifttt.batterywatchdog.utils

import android.app.Activity
import android.content.Context
import android.util.TypedValue
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

fun EditText.text() = text.toString()

fun Activity.hideKeyboard() {
    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(findViewById(android.R.id.content).windowToken, 0)
}

fun dpToPx(context: Context, i: Float): Float {
    val displayMetrics = context.resources.displayMetrics
    return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, i, displayMetrics)
}