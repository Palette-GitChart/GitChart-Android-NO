package com.yongjincompany.data.remote.response

import com.google.gson.annotations.SerializedName

data class MyProfileResponse(
    @SerializedName("avatar_url") val avatarUrl: String,
    @SerializedName("followers") val followers: Int,
    @SerializedName("following") val following: Int,
    @SerializedName("login") val id: String
)