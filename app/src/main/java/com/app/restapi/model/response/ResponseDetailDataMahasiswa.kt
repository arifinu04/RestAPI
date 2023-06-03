package com.app.restapi.model.response


import com.app.restapi.model.request.DataDetailMahasiswa
import com.google.gson.annotations.SerializedName

data class ResponseDetailDataMahasiswa(
    @SerializedName("data")
    val data: DataDetailMahasiswa,
    @SerializedName("status")
    val status: String
)