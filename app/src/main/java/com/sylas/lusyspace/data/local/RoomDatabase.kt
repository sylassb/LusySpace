package com.sylas.lusyspace.data.local

import com.sylas.lusyspace.data.model.SpaceVideo
import java.util.*

class RoomDatabase {
    fun saveVideo(spaceVideo: SpaceVideo): Boolean {
        print("Video saved")
        return true
    }

    fun incrementSavedVideos(): Boolean {
        print("Number incremented")
        return true
    }

    fun getVideosQuantity(): Int {
        print("Quantity returned")
        return Random().nextInt()
    }
}