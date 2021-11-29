package com.myproject.mynewsapp.repository

import com.myproject.mynewsapp.api.RetrofitInstance
import com.myproject.mynewsapp.db.ArticleDatabase
import com.myproject.mynewsapp.models.Article
import retrofit2.Retrofit

class NewsRepository(
    val db: ArticleDatabase
){
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode,pageNumber)

    suspend fun searchNews(searchQuery: String,pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery,pageNumber )

    suspend fun upsert(article: Article) = db.getArticleDao().insertArticle(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}
