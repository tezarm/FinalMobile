package com.d121211099.SeafoodApp.Data

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.d121211099.SeafoodApp.Data.repository.SeafoodAppRepository
import com.d121211099.SeafoodApp.Data.Source.remote.ApiService
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer {
    val SeafoodAppRepository: SeafoodAppRepository
}

class DefaultAppContainer: AppContainer {

    private val BASE_URL = "https://www.themealdb.com/api/json/v1/1/filter.php?c=Chicken"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService : ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }

    override val SeafoodAppRepository: SeafoodAppRepository
        get() = SeafoodAppRepository(retrofitService)

}