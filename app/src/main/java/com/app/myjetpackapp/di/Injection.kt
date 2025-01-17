package com.app.myjetpackapp.di

import com.app.myjetpackapp.data.DragonBallRepository

object Injection {
    fun provideRepository(): DragonBallRepository {
        return DragonBallRepository.getInstance()
    }
}