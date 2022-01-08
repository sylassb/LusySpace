package com.sylas.lusyspace.data.local

import com.sylas.lusyspace.data.model.SpaceVideo

class VideoLocalDataSourceImpl(
    private val roomDatabase: RoomDatabase = RoomDatabase()
) : VideoLocalDataSource {

    override fun saveVideo(spaceVideo: SpaceVideo): Boolean {
        return roomDatabase.saveVideo(spaceVideo)
    }

    override fun incrementSavedVideos(): Boolean {
        return roomDatabase.incrementSavedVideos()
    }

    override fun getVideosQuantity(): Int {
        return roomDatabase.getVideosQuantity()
    }
}