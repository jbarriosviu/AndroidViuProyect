package es.repositoriocompartido.psicologiaapp

import com.google.gson.annotations.SerializedName

data class CitaResponse (
    @SerializedName("version") var version:String,
    @SerializedName("citas") var citas:List<Cita>

)