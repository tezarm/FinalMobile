package com.d121211099.SeafoodApp.Data.Source.remote

import com.d121211099.SeafoodApp.Data.Response.GetSeafoodResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    // https://www.themealdb.com/api/json/v1/1/filter.php?c=Seafood

    @GET("v2/everything")
    suspend fun getSeafoodApp(
        @Query("c") c: String
    ): GetSeafoodResponse
}