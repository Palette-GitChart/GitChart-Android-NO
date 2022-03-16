package com.yongjincompany.data.remote.response

import com.google.gson.annotations.SerializedName
import com.yongjincompany.domain.entity.home.WeeklyCommitEntity

data class WeeklyCommitResponse(
    @SerializedName("week_commit") val weekCommit: Int
)

fun WeeklyCommitResponse.toEntity() =
    WeeklyCommitEntity(
        weekCommit = weekCommit
    )
