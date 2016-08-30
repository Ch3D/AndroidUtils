package com.ch3d.android.utils

import android.database.Cursor

fun Cursor.getLong(colName: String): Long = getLong(getColumnIndex(colName))

fun Cursor.getInt(colName: String): Int = getInt(getColumnIndex(colName))

fun Cursor.getString(colName: String): String = getString(getColumnIndex(colName))