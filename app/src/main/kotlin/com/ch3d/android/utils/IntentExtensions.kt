package com.ch3d.ifttt.batterywatchdog.utils

import android.content.Intent
import android.os.Parcelable

fun Intent.putExtra(name: String, value: Long): Intent {
    this.putExtra(name, value)
    return this
}

fun Intent.putExtra(name: String, value: Int): Intent {
    this.putExtra(name, value)
    return this
}

fun Intent.putExtra(name: String, value: String): Intent {
    this.putExtra(name, value)
    return this
}

fun Intent.putExtra(name: String, value: Float): Intent {
    this.putExtra(name, value)
    return this
}

fun Intent.putExtra(name: String, value: Parcelable): Intent {
    this.putExtra(name, value)
    return this
}
