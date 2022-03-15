package com.yongjincompany.data.remote.response

import com.google.gson.annotations.SerializedName

data class WeeklyCommitResponse(
    @SerializedName("week_commit") val weekCommit: Int
)
