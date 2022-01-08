package com.sylas.lusyspace.data.local

import com.sylas.lusyspace.data.model.SpaceVideo

interface VideoLocalDataSource {
    fun saveVideo(spaceVideo: SpaceVideo): Boolean
    fun incrementSavedVideos(): Boolean
    fun getVideosQuantity(): Int
}