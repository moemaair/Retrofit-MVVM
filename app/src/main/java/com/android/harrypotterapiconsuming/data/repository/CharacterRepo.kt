package com.android.harrypotterapiconsuming.data.repository

import com.android.harrypotterapiconsuming.data.api.CharacterApi
import javax.inject.Inject

class CharacterRepo @Inject constructor(
    private val characterApi: CharacterApi
) {
    suspend fun getCharacters():List<Character>{
        return characterApi.getCharacter()
    }
}