package com.yongjincompany.data.remote.datasource

import com.yongjincompany.data.remote.response.MyProfileResponse
import com.yongjincompany.data.remote.response.TodayCommitResponse
import com.yongjincompany.data.remote.response.WeeklyCommitResponse
import com.yongjincompany.data.remote.response.YearCommitResponse

interface RemoteHomeDataSource {
    suspend fun fetchMyProfile(id: String): MyProfileResponse

    suspend fun fetchDayCommit(userName: String): TodayCommitResponse

    suspend fun fetchWeekCommit(userName: String): WeeklyCommitResponse

    suspend fun fetchYearCommit(userName: String): YearCommitResponse
}