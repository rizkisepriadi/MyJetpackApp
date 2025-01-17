package com.app.myjetpackapp.data

import DragonBallData
import com.app.myjetpackapp.model.DragonBall
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class DragonBallRepository {
    private val dragonBall = mutableListOf<DragonBall>()

    init {
        if (dragonBall.isEmpty()) {
            DragonBallData.listData.forEach {
                dragonBall.add(DragonBall(it, 0))
            }
        }
    }

    fun getAllChar(): Flow<List<DragonBall>> {
        return flowOf(dragonBall)
    }

    fun getCharById(id: Int): DragonBall {
        val character = dragonBall.firstOrNull { it.fighterZ.id == id }
        if (character == null) {
            throw NoSuchElementException("Character with id $id not found.")
        }
        return character
    }


    companion object {
        @Volatile
        private var instance: DragonBallRepository? = null

        fun getInstance(): DragonBallRepository =
            instance ?: synchronized(this) {
                DragonBallRepository().apply {
                    instance = this
                }
            }
    }
}