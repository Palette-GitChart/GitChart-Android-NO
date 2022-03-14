package com.yongjincompany.data.remote.datasource

import com.yongjincompany.data.remote.api.HomeApi
import com.yongjincompany.data.remote.response.home.MyProfileResponse
import com.yongjincompany.domain.exception.NoInternetException
import java.net.UnknownHostException
import javax.inject.Inject

class RemoteHomeDataSourceImpl @Inject constructor(
    private val homeApi: HomeApi
) : RemoteHomeDataSource {

    override suspend fun fetchGithubProfile(id: String): MyProfileResponse =
        try {
            homeApi.fetchGithubProfile(id)
        } catch (e: UnknownHostException) {
            throw NoInternetException()
        }
}