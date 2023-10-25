package com.az.rickandmortyapp.data.network

import com.az.rickandmortyapp.data.model.Character
import com.az.rickandmortyapp.data.model.CharacterList
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET("character")
    suspend fun getCharacters(): CharacterList

    @GET("character/{id}")
    suspend fun getCharacterDetails(
        @Path("id") id: Int
    ): Character


}