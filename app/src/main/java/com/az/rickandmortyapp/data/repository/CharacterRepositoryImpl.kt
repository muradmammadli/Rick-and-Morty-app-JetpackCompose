package com.az.rickandmortyapp.data.repository

import com.az.rickandmortyapp.data.model.Character
import com.az.rickandmortyapp.data.model.CharacterList
import com.az.rickandmortyapp.data.network.ApiService
import com.az.rickandmortyapp.domain.repository.CharacterRepository
import javax.inject.Inject

class CharacterRepositoryImpl @Inject constructor(
    private val service: ApiService
) : CharacterRepository {
    override suspend fun getCharacters(): CharacterList {
        return service.getCharacters()
    }

    override suspend fun getCharacterDetails(id:Int): Character {
        return service.getCharacterDetails(id)
    }
}