package com.myproject.mynewsapp


import com.google.gson.annotations.SerializedName
import com.myproject.mynewsapp.models.Article

data class NewsResponse(
    @SerializedName("articles")
    val articles: List<Article>,
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int
)