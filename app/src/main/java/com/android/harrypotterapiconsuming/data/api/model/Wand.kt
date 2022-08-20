package com.android.harrypotterapiconsuming.data.api.model


import com.google.gson.annotations.SerializedName

data class Wand(
    @SerializedName("core")
    val core: String,
    @SerializedName("length")
    val length: Int,
    @SerializedName("wood")
    val wood: String
)