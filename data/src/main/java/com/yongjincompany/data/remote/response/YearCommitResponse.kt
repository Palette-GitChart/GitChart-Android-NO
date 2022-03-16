package com.yongjincompany.data.remote.response

import com.google.gson.annotations.SerializedName
import com.yongjincompany.domain.entity.home.YearCommitEntity

data class YearCommitResponse(
    @SerializedName("year_commit") val yearCommit: Int
)

fun YearCommitResponse.toEntity() =
    YearCommitEntity(
        yearCommit = yearCommit
    )