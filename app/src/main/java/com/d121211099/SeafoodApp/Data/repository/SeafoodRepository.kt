package com.d121211099.SeafoodApp.Data.repository

import com.d121211099.SeafoodApp.Data.Response.GetSeafoodResponse
import com.d121211099.SeafoodApp.Data.Source.remote.ApiService

class SeafoodAppRepository(private val apiService: ApiService) {

    suspend fun getSeafood(c: String): GetSeafoodResponse{
        return apiService.getSeafoodApp(c)
    }
}