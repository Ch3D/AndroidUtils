package com.ch3d.android.utils

import android.content.IntentFilter

fun IntentFilter.add(action: String): IntentFilter {
    this.add(action)
    return this
}