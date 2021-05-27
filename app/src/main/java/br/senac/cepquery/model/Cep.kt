package br.senac.cepquery.model

data class Cep(
    var id: Int,
    var cep: String,
    var logradouro: String,
    var complemento: String? = null,
    var bairro: String,
    var localidade: String,
    var uf: String,
    var ibge: String,
    var gia: String,
    var ddd: String,
    var siafi: String
)
