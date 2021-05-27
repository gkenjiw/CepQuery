package br.senac.cepquery.services

import br.senac.cepquery.model.Cep
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CepService {
    @GET("viacep.com.br/ws/{cep}")
    fun getCep(@Path("cep") cep: String): Call<Cep>
}