package com.example.simplegrid.network

import com.example.simplegrid.model.ImageData
import retrofit2.http.GET

interface ApiService {
    @GET("photos") // APIのエンドポイントを指定
    suspend fun getImages(): List<ImageData> // レスポンスのデータ型
}