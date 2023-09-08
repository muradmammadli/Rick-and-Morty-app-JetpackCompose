package com.az.rickandmortyapp.data.di

import com.az.rickandmortyapp.data.network.ApiService
import com.az.rickandmortyapp.data.repository.CharacterRepositoryImpl
import com.az.rickandmortyapp.domain.repository.CharacterRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@InstallIn(SingletonComponent::class)
@Module
object RepositoryModule {

    @Provides
    @Singleton
    fun provideCharacterRepository(service: ApiService):CharacterRepository{
        return CharacterRepositoryImpl(service)
    }

}