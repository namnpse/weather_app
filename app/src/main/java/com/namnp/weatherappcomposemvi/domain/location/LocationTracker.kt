package com.namnp.weatherappcomposemvi.domain.location

import com.namnp.weatherappcomposemvi.domain.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}