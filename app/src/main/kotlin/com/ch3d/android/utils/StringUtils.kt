package com.ch3d.android.utils

class StringUtils {
    companion object {
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
            if (newValue.isEmpty() && oldValue.isEmpty()) {
                return false
            } else if (newValue.isEmpty() && !oldValue.isEmpty()) {
                return true
            } else {
                val trimPredicate: (Char) -> Boolean = { it <= ' ' }
                return !newValue.isEmpty() && oldValue.isEmpty()
                        || newValue.trim(trimPredicate) != oldValue.trim(trimPredicate)
            }
        }

        /**
         * Returns true if the string is null or 0-length.

         * @param str the string to be examined
         * *
         * @return true if str is null or zero length
         */
        fun hasNoEmptyValue(vararg str: CharSequence) = str.all { seq -> !seq.isEmpty() }
    }

    fun CharSequence?.isEmpty() = this == null || length == 0
}
