package com.namnp.weatherappcomposemvi.domain.util

sealed class Resource<T>(val data: T? = null, val message: String? = null) {
    class Loading<T>(data: T?): Resource<T>()
    class Success<T>(data: T?): Resource<T>(data = data)
    class Error<T>(message: String?, data: T? = null): Resource<T>(data, message)
}
