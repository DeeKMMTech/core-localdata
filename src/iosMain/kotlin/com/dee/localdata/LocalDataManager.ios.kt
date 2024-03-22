package com.dee.localdata

import platform.Foundation.NSUserDefaults

/**
 * Created by Hein Htet
 */
actual class LocalDataManager {
    actual fun getInt(key: String): Int {
        return NSUserDefaults.standardUserDefaults.integerForKey(key).toInt()
    }

    actual fun putInt(key: String, value: Int) {
        NSUserDefaults.standardUserDefaults.setInteger(value.toLong(), key)
    }

    actual fun putString(key: String, value: String) {
        NSUserDefaults.standardUserDefaults.setObject(key, value)
    }

    actual fun getString(key: String): String? {
        return NSUserDefaults.standardUserDefaults.stringForKey(key)
    }


    actual fun putBoolean(key: String, value: Boolean) {
        NSUserDefaults.standardUserDefaults.setBool(value, key)
    }

    actual fun getBoolean(key: String): Boolean {
        return NSUserDefaults.standardUserDefaults.boolForKey(key)
    }

    actual fun putLong(key: String, value: Long) {
        NSUserDefaults.standardUserDefaults.setObject(value,key)
    }

    actual fun getLong(key: String): Long {
        return NSUserDefaults.standardUserDefaults.objectForKey(key).toString().toLongOrNull() ?: 0L
    }

}
