package com.android.harrypotterapiconsuming.di

import com.android.harrypotterapiconsuming.data.api.CharacterApi
import com.android.harrypotterapiconsuming.data.api.model.ApiConstants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CharacterApiModlue {
    @Provides
    @Singleton
    fun provideApi(builder:Retrofit.Builder) :CharacterApi{
        return builder
            .build()
            .create(CharacterApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRetrofit() :Retrofit.Builder{
        return Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())

    }
}