package com.sylas.lusyspace.presentation

import androidx.lifecycle.ViewModel
import com.sylas.lusyspace.data.repository.VideoRepository
import com.sylas.lusyspace.data.repository.VideoRepositoryImpl

class VisorViewModel(
    private val videoRepository: VideoRepository = VideoRepositoryImpl()
) : ViewModel() {

    fun getVideosQuantity(): String {
        val quantity = videoRepository.getVideosQuantity()
        return quantity.toString()
    }
}