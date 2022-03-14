package com.yongjincompany.domain.entity.home

import com.google.gson.annotations.SerializedName

data class MyProfileEntity (
    val avatarUrl: String,
    val followers: Int,
    val following: Int,
    val id: String,
    val name: String
)