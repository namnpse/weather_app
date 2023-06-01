package com.namnp.weatherappcomposemvi.domain

import com.namnp.weatherappcomposemvi.domain.util.Resource
import com.namnp.weatherappcomposemvi.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}