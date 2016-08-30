package com.ch3d.android.utils

import android.content.ContentValues

fun ContentValues.addAll(values: ContentValues): ContentValues {
    putAll(values)
    return this
}

fun ContentValues.add(key: String, value: String): ContentValues {
    put(key, value)
    return this
}

fun ContentValues.add(key: String, value: Long): ContentValues {
    put(key, value)
    return this
}

fun ContentValues.add(key: String, value: Int): ContentValues {
    put(key, value)
    return this
}