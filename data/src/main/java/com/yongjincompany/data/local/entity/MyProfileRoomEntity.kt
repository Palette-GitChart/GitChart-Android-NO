package com.yongjincompany.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.yongjincompany.domain.entity.home.MyProfileEntity

@Entity(tableName = "myProfile")
data class MyProfileRoomEntity (
    @PrimaryKey val id: String,
    val avatarUrl: String,
    val followers: Int,
    val following: Int
    )

fun MyProfileRoomEntity.toEntity() =
    MyProfileEntity(
        avatarUrl = avatarUrl,
        followers = followers,
        following = following,
        id = id
    )

fun MyProfileEntity.toDbEntity() =
    MyProfileRoomEntity(
        id = id,
        avatarUrl = avatarUrl,
        followers = followers,
        following = following
    )


