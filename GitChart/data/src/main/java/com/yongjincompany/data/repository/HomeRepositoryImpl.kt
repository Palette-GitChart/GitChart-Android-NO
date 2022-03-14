package com.yongjincompany.data.repository

import com.yongjincompany.data.remote.datasource.RemoteHomeDataSource
import com.yongjincompany.data.utill.OfflineCacheUtil
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(
    private val remoteHomeDataSource: RemoteHomeDataSource,
    private val localGithubDataSource: LocalHomeDataSource
) : HomeRepository {

    override suspend fun fetchGithubProfile(id: String): Flow<GithubProfileEntity> =
        OfflineCacheUtil<MyProfileEntity>()
            .remoteData { remoteHomeDataSource.fetchGithubProfile(id).toEntity() }
            .localData { localHomeDataSource.fetchGithubProfile(id).toEntity() }
            .doOnNeedRefresh { localHomeDataSource.refreshGithubProfile(it.toRoomEntity()) }
            .createFlow()
}