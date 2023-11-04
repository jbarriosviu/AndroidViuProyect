package es.repositoriocompartido.psicologiaapp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiService {
    @GET
    suspend fun getCitasApi(@Url url:String): Response<CitaResponse>
}