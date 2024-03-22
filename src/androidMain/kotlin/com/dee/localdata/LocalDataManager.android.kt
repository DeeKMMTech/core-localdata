package com.dee.localdata

import android.content.SharedPreferences

/**
 * Created by Hein Htet
 */

actual class LocalDataManager(private val encryptedSharePreference: SharedPreferences) {

    actual fun getInt(key: String): Int {
        return encryptedSharePreference.getInt(key, 0)
    }

    actual fun putInt(key: String, value: Int) {
        encryptedSharePreference.edit().putInt(key, value).apply()
    }

    actual fun putString(key: String, value: String) {
        encryptedSharePreference.edit().putString(key, value).apply()
    }

    actual fun getString(key: String): String? {
        return encryptedSharePreference.getString(key, null)
    }


    actual fun putBoolean(key: String, value: Boolean) {
        encryptedSharePreference.edit().putBoolean(key, value).apply()
    }

    actual fun getBoolean(key: String): Boolean {
        return encryptedSharePreference.getBoolean(key, false)
    }

    actual fun putLong(key: String, value: Long) {
        encryptedSharePreference.edit().putLong(key, value).apply()
    }

    actual fun getLong(key: String): Long {
        return encryptedSharePreference.getLong(key, 0L)
    }

}