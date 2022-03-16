package com.yongjincompany.data.local.entity

import androidx.room.Entity

@Entity(tableName = "weekCommit")
data class WeeklyCommitRoomEntity(
    val weekCommit: Int
)