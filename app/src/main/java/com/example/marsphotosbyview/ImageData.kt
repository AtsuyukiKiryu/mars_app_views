package com.example.simplegrid.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ImageData(
    val id: String,  // ID（APIレスポンスに応じて変更）
    @SerialName(value = "img_src")
    val url: String  // 画像のURL
)