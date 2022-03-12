package com.yongjincompany.data.remote.response.home

data class MyProfileResponse(
    val avatar_url: String,
    val followers: Int,
    val following: Int,
    val id: Int,
    val login: String,
    val name: String,
    val node_id: String
)