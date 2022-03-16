package com.yongjincompany.data.repository

import com.yongjincompany.data.local.datasource.LocalHomeDataSource
import com.yongjincompany.data.remote.datasource.RemoteHomeDataSource
import com.yongjincompany.data.remote.response.toEntity
import com.yongjincompany.data.util.OfflineCacheUtil
import com.yongjincompany.domain.entity.home.MyProfileEntity
import com.yongjincompany.domain.entity.home.TodayCommitEntity
import com.yongjincompany.domain.entity.home.WeeklyCommitEntity
import com.yongjincompany.domain.entity.home.YearCommitEntity
import com.yongjincompany.domain.repository.HomeRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class HomeRepositoryImpl @Inject constructor(
    private val localHomeDataSource: LocalHomeDataSource,
    private val remoteHomeDataSource: RemoteHomeDataSource
) : HomeRepository {
    override suspend fun fetchMyProfile(id: String): Flow<MyProfileEntity> =
        OfflineCacheUtil<MyProfileEntity>()
            .remoteData { remoteHomeDataSource.fetchMyProfile(id).toEntity() }
            .localData { localHomeDataSource.fetchMyProfile(id) }
            .doOnNeedRefresh { localHomeDataSource.insertMyProfile(it) }
            .createFlow()

    override suspend fun fetchDayCommit(userName: String): Flow<TodayCommitEntity> =
        OfflineCacheUtil<TodayCommitEntity>()
            .remoteData { remoteHomeDataSource.fetchDayCommit(userName).toEntity() }
            .localData { localHomeDataSource.fetchDayCommit(userName) }
            .doOnNeedRefresh { localHomeDataSource.insertDayCommit(it) }
            .createFlow()

    override suspend fun fetchWeekCommit(userName: String): Flow<WeeklyCommitEntity> =
        OfflineCacheUtil<WeeklyCommitEntity>()
            .remoteData { remoteHomeDataSource.fetchWeekCommit(userName).toEntity() }
            .localData { localHomeDataSource.fetchWeekCommit(userName) }
            .doOnNeedRefresh { localHomeDataSource.insertWeekCommit(it) }
            .createFlow()

    override suspend fun fetchYearCommit(userName: String): Flow<YearCommitEntity> =
        OfflineCacheUtil<YearCommitEntity>()
            .remoteData { remoteHomeDataSource.fetchYearCommit(userName).toEntity() }
            .localData { localHomeDataSource.fetchYearCommit(userName) }
            .doOnNeedRefresh { localHomeDataSource.insertYearCommit(it) }
            .createFlow()
}