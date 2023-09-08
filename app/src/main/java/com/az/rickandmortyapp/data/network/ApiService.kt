package com.az.rickandmortyapp.data.network

import com.az.rickandmortyapp.data.model.CharacterList
import retrofit2.http.GET

interface ApiService {

    @GET("character")
    suspend fun getCharacters():CharacterList

}