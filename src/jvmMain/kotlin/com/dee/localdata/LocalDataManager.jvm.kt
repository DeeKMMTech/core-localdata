package com.dee.localdata

/**
 * Created by Hein Htet
 */
actual class LocalDataManager {
    actual fun getInt(key: String): Int {
       return 1
    }

    actual fun putInt(key: String, value: Int) {
    }

    actual fun getString(key: String): String? {
        return ""
    }

    actual fun putString(key: String, value: String) {
    }

    actual fun getBoolean(key: String): Boolean {
        return false
    }

    actual fun putBoolean(key: String, value: Boolean) {
    }

    actual fun getLong(key: String): Long {
        return 1L
    }

    actual fun putLong(key: String, value: Long) {
    }
}