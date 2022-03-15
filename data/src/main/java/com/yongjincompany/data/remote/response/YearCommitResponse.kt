package com.yongjincompany.data.remote.response

import com.google.gson.annotations.SerializedName

data class YearCommitResponse(
    @SerializedName("year_commit") val yearCommit: Int
)
