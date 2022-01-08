package com.sylas.lusyspace.data.repository

import com.sylas.lusyspace.data.model.SpaceVideo

interface VideoRepository {
    fun saveVideo(spaceVideo: SpaceVideo): Boolean
    fun incrementSavedVideos(): Boolean
    fun getVideosQuantity(): Int
}