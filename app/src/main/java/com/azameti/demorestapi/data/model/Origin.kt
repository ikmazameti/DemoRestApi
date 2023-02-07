package com.azameti.demorestapi.data.model


import com.google.gson.annotations.SerializedName


data class Origin(
    @SerializedName("name")
    val name: String,
    @SerializedName("url")
    val url: String
)