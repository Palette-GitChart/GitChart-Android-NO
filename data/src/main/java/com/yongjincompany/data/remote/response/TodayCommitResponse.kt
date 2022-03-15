package com.yongjincompany.data.remote.response

import com.google.gson.annotations.SerializedName

data class TodayCommitResponse(
    @SerializedName("day_commit") val dayCommit: Int
)
