package com.az.rickandmortyapp.domain.usecase

import com.az.rickandmortyapp.data.model.Character
import com.az.rickandmortyapp.domain.repository.CharacterRepository
import javax.inject.Inject

class GetCharacterDetailsUseCase @Inject constructor(
    private val characterRepository: CharacterRepository
) {
    suspend operator fun invoke(id:Int): Character {
        return characterRepository.getCharacterDetails(id)
    }
}