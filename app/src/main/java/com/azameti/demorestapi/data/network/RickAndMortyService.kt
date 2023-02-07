package com.azameti.demorestapi.data.network

import retrofit2.Call
import retrofit2.http.GET

interface RickAndMortyService {

    @GET("character/3")
    fun getCharacter(): Call<Any>

}
