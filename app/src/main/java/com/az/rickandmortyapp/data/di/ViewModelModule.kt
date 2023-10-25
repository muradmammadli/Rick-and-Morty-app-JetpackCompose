package com.az.rickandmortyapp.data.di

import com.az.rickandmortyapp.domain.usecase.GetCharacterDetailsUseCase
import com.az.rickandmortyapp.domain.usecase.GetCharacterUseCase
import com.az.rickandmortyapp.presentation.viewmodel.CharacterViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object ViewModelModule {

    @Provides
    @Singleton
    fun provideCharacterViewModel(
        characterUseCase: GetCharacterUseCase,
        characterDetailsUseCase: GetCharacterDetailsUseCase
    ): CharacterViewModel {
        return CharacterViewModel(characterUseCase, characterDetailsUseCase)
    }

}