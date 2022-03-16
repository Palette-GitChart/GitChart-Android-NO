package com.yongjincompany.data.local.entity

import androidx.room.Entity

@Entity(tableName = "yearCommit")
data class YearCommitRoomEntity(
    val yearCommit: Int
)
