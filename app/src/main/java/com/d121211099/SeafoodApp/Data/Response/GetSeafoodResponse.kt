package com.d121211099.SeafoodApp.Data.Response

import com.d121211099.SeafoodApp.Data.models.Article
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetSeafoodResponse(
    @SerialName("meals")
    val meals: Article?
)