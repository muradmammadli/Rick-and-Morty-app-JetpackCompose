package com.az.rickandmortyapp.domain.repository

import com.az.rickandmortyapp.data.model.Character
import com.az.rickandmortyapp.data.model.CharacterList

interface CharacterRepository {

    suspend fun getCharacters():CharacterList

    suspend fun getCharacterDetails(id:Int):Character

}