package com.example.simplegrid.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.simplegrid.model.ImageData
import com.example.simplegrid.network.ApiClient
import kotlinx.coroutines.launch

class ImageViewModel : ViewModel() {

    private val _images = MutableLiveData<List<ImageData>>()
    val images: LiveData<List<ImageData>> get() = _images

    fun fetchImages() {
        viewModelScope.launch {
            try {
                val response = ApiClient.apiService.getImages()
                _images.value = response
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
