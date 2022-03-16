package com.yongjincompany.data.local.entity

import androidx.room.Entity
import com.yongjincompany.domain.entity.home.WeeklyCommitEntity

@Entity(tableName = "weekCommit")
data class WeeklyCommitRoomEntity(
    val weekCommit: Int
)

fun WeeklyCommitRoomEntity.toEntity() =
    WeeklyCommitEntity(
        weekCommit = weekCommit
    )

fun WeeklyCommitEntity.toDbEntity() =
    WeeklyCommitRoomEntity(
        weekCommit = weekCommit
    )