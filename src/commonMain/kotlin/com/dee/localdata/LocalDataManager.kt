package com.dee.localdata

/**
 * Created by Hein Htet
 */
expect class LocalDataManager {
    fun getInt(key: String): Int
    fun putInt(key: String, value: Int)
    fun getString(key: String): String?
    fun putString(key: String, value: String)
    fun getBoolean(key: String): Boolean
    fun putBoolean(key: String, value: Boolean)
    fun getLong(key: String): Long
    fun putLong(key: String, value: Long)
}

