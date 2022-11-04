package com.example.test.model

import com.google.gson.Gson
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class NganHangObj(
    @SerializedName("ID"                )    @Expose var ID                 : Int = 0,
    @SerializedName("CODE"                )    @Expose var CODE                 : Int = 0,
    @SerializedName("NAME_VI"                )    @Expose var NAME_VI                 : String = "",
    @SerializedName("NAME_EN"                )    @Expose var NAME_EN                 : String = "",
    @SerializedName("SMS"                )    @Expose var SMS                 : String = "",
    @SerializedName("ORDER"                )    @Expose var ORDER                 : Int = 0,
) {
    override fun toString(): String {
        return Gson().toJson(this)
    }
}
