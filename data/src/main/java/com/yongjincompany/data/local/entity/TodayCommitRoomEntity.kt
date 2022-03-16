package com.yongjincompany.data.local.entity

import androidx.room.Entity
import com.yongjincompany.domain.entity.home.TodayCommitEntity

@Entity(tableName = "todayCommit")
data class TodayCommitRoomEntity(
    val dayCommit: Int
)

fun TodayCommitRoomEntity.toEntity() =
    TodayCommitEntity(
        dayCommit = dayCommit
    )

fun TodayCommitEntity.toDbEntity() =
    TodayCommitRoomEntity(
        dayCommit = dayCommit
    )