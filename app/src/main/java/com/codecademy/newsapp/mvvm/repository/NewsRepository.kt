package com.codecademy.newsapp.mvvm.repository

import com.codecademy.newsapp.mvvm.api.RetrofitInstance
import com.codecademy.newsapp.mvvm.db.ArticleDatabase
import retrofit2.Retrofit

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery : String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)
}