package com.az.rickandmortyapp.domain.repository

import com.az.rickandmortyapp.data.model.CharacterList

interface CharacterRepository {

    suspend fun getCharacters():CharacterList

}