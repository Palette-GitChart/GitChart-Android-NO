package com.yongjincompany.data.remote.datasource

import com.yongjincompany.data.remote.response.home.MyProfileResponse

interface RemoteHomeDataSource {
    suspend fun fetchMyProfile(id: String): MyProfileResponse
}