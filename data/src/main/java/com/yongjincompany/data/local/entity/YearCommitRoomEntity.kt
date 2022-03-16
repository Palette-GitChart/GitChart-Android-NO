package com.yongjincompany.data.local.entity

import androidx.room.Entity
import com.yongjincompany.domain.entity.home.YearCommitEntity

@Entity(tableName = "yearCommit")
data class YearCommitRoomEntity(
    val yearCommit: Int
)

fun YearCommitRoomEntity.toEntity() =
    YearCommitEntity(
        yearCommit = yearCommit
    )

fun YearCommitEntity.toDbEntity() =
    YearCommitRoomEntity(
        yearCommit = yearCommit
    )


