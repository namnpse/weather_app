package com.namnp.weatherappcomposemvi.data.repository

import com.namnp.weatherappcomposemvi.data.mappers.toWeatherInfo
import com.namnp.weatherappcomposemvi.data.remote.WeatherApi
import com.namnp.weatherappcomposemvi.domain.WeatherRepository
import com.namnp.weatherappcomposemvi.domain.util.Resource
import com.namnp.weatherappcomposemvi.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(lat, long).toWeatherInfo()
            )
        }catch (e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "Unknown error occurced")
        }
    }
}