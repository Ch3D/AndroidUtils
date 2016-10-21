package com.ch3d.android.utils

import android.database.Cursor
import com.ch3d.android.utils.functions.Func1
import java.util.*

fun <T> Cursor.mapList(mapper: Func1<Cursor, T>): List<T> {
    val list = ArrayList<T>(count)
    while (moveToNext()) {
        list.add(mapper.call(this))
    }
    return list
}