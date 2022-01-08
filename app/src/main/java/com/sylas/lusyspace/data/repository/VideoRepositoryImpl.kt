package com.sylas.lusyspace.data.repository

import com.sylas.lusyspace.data.local.VideoLocalDataSource
import com.sylas.lusyspace.data.local.VideoLocalDataSourceImpl
import com.sylas.lusyspace.data.model.SpaceVideo

class VideoRepositoryImpl(
    private val videoLocalDataSource: VideoLocalDataSource = VideoLocalDataSourceImpl()
) : VideoRepository {
    override fun saveVideo(spaceVideo: SpaceVideo): Boolean {
        return videoLocalDataSource.saveVideo(spaceVideo)
    }

    override fun incrementSavedVideos(): Boolean {
        return videoLocalDataSource.incrementSavedVideos()
    }

    override fun getVideosQuantity(): Int {
        return videoLocalDataSource.getVideosQuantity()
    }
}