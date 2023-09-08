package com.az.rickandmortyapp.domain.usecase

import com.az.rickandmortyapp.data.model.CharacterList
import com.az.rickandmortyapp.domain.repository.CharacterRepository
import javax.inject.Inject

class GetCharacterUseCase @Inject constructor(
    private val characterRepository: CharacterRepository
) {
    suspend operator fun invoke():CharacterList{
        return characterRepository.getCharacters()
    }
}