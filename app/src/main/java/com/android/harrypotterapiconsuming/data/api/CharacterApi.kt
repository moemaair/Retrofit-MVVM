package com.android.harrypotterapiconsuming.data.api

import com.android.harrypotterapiconsuming.data.api.model.ApiConstants
import retrofit2.http.GET

interface CharacterApi {

    @GET(ApiConstants.END_POINT)
    suspend fun getCharacter():List<Character>
}