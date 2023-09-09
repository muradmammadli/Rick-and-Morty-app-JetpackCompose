package com.az.rickandmortyapp.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.az.rickandmortyapp.data.model.Character
import com.az.rickandmortyapp.data.model.CharacterList
import com.az.rickandmortyapp.domain.usecase.GetCharacterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val getCharacterUseCase: GetCharacterUseCase
):ViewModel() {

    fun getCharacters():Flow<List<Character>> = flow {
        emit(getCharacterUseCase().results)
    }

}