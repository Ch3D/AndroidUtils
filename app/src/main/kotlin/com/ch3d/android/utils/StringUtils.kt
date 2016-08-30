package com.ch3d.android.utils

import android.content.Context
import android.util.TypedValue

class StringUtils {

    companion object {
        fun dpToPx(context: Context, i: Float): Float {
            val displayMetrics = context.resources.displayMetrics
            return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, i, displayMetrics)
        }

        val EMPTY_STRING = ""
        val DASH = "-"
        val SPACE = " "
        val UNDERSCORE = "_"
        val NEXT_STRING = "\n"

        /**
         * Safely checks whether two strings are equal or not

         * @return true - if strings are equal, false - otherwise
         */
        fun hasChanges(newValue: String, oldValue: String): Boolean {
            if (StringUtils.isEmpty(newValue) && StringUtils.isEmpty(oldValue)) {
                return false
            } else if (StringUtils.isEmpty(newValue) && !StringUtils.isEmpty(oldValue)) {
                return true
            } else
                return !StringUtils.isEmpty(newValue) && StringUtils.isEmpty(
                        oldValue) || newValue.trim { it <= ' ' } != oldValue.trim { it <= ' ' }
        }

        /**
         * Returns true if the string is null or 0-length.

         * @param str the string to be examined
         * *
         * @return true if str is null or zero length
         */
        fun hasNoEmptyValue(vararg str: CharSequence): Boolean {
            for (sequence in str) {
                if (isEmpty(sequence)) {
                    return false
                }
            }
            return true
        }

        fun isEmpty(str: CharSequence?): Boolean {
            return str == null || str.length == 0
        }
    }
}
