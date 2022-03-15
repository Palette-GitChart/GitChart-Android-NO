package com.yongjincompany.data.remote.api

import com.yongjincompany.data.remote.response.MyProfileResponse
import com.yongjincompany.data.remote.response.TodayCommitResponse
import com.yongjincompany.data.remote.response.WeeklyCommitResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HomeApi {
    @GET("users/{userId}")
    suspend fun fetchGithubProfile(
        @Path("userId") userId: String
    ): MyProfileResponse

    @GET("{userName}/daycount")
    suspend fun fetchDayCommit(
        @Path("userName") userName: String
    ) : TodayCommitResponse

    @GET("{userName}/weekcount")
    suspend fun fetchWeekCommit(
        @Path("userName") userName: String
    ) : WeeklyCommitResponse
}