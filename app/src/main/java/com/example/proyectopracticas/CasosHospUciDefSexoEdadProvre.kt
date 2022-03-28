package com.example.proyectopracticas

import kotlinx.serialization.*
import kotlinx.serialization.json.*
import kotlinx.serialization.descriptors.*
import kotlinx.serialization.encoding.*



@Serializable
data class CasosHospUciDefSexoEdadProvre (
    @SerialName("provincia_iso")
    val provinciaISO: String,

    val sexo: String,

    @SerialName("grupo_edad")
    val grupoEdad: String,

    val fecha: String,

    @SerialName("num_casos")
    val numCasos: String,

    @SerialName("num_hosp")
    val numHosp: String,

    @SerialName("num_uci")
    val numUci: String,

    @SerialName("num_def")
    val numDef: String
)
