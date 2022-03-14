package com.yongjincompany.data.remote.api

import com.yongjincompany.data.remote.response.home.MyProfileResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HomeApi {
    @GET("users/{userId}")
    suspend fun fetchMyProfile(
        @Path("userId") userId: String
    ): MyProfileResponse
}