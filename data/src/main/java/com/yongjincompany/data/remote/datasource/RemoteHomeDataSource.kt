package com.yongjincompany.data.remote.datasource

import com.yongjincompany.data.remote.response.MyProfileResponse
import com.yongjincompany.data.remote.response.TodayCommitResponse
import com.yongjincompany.data.remote.response.WeeklyCommitResponse

interface RemoteHomeDataSource {
    suspend fun fetchGithubProfile(userId: String): MyProfileResponse

    suspend fun fetchDayCommit(userName: String): TodayCommitResponse

    suspend fun fetchWeekCommit(userName: String): WeeklyCommitResponse
}