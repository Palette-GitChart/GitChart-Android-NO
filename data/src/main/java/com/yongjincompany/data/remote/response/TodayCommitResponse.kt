package com.yongjincompany.data.remote.response

import com.google.gson.annotations.SerializedName
import com.yongjincompany.domain.entity.home.TodayCommitEntity

data class TodayCommitResponse(
    @SerializedName("day_commit") val dayCommit: Int
)

fun TodayCommitResponse.toEntity() =
    TodayCommitEntity(
        dayCommit = dayCommit
    )
