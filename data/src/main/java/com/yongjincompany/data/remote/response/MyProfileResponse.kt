package com.yongjincompany.data.remote.response

import com.google.gson.annotations.SerializedName
import com.yongjincompany.domain.entity.home.MyProfileEntity

data class MyProfileResponse(
    @SerializedName("avatar_url") val avatarUrl: String,
    @SerializedName("followers") val followers: Int,
    @SerializedName("following") val following: Int,
    @SerializedName("login") val id: String
)

fun MyProfileResponse.toEntity() =
    MyProfileEntity(
        avatarUrl = avatarUrl,
        followers = followers,
        following = following,
        id = id
    )