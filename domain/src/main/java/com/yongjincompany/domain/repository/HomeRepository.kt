package com.yongjincompany.domain.repository

import com.yongjincompany.domain.entity.home.MyProfileEntity
import com.yongjincompany.domain.entity.home.TodayCommitEntity
import com.yongjincompany.domain.entity.home.WeeklyCommitEntity
import com.yongjincompany.domain.entity.home.YearCommitEntity
import kotlinx.coroutines.flow.Flow


interface HomeRepository {
    suspend fun fetchMyProfile(userId: String): Flow<MyProfileEntity>

    suspend fun fetchDayCommit(userName: String): Flow<TodayCommitEntity>

    suspend fun fetchWeekCommit(userName: String): Flow<WeeklyCommitEntity>

    suspend fun fetchYearCommit(userName: String): Flow<YearCommitEntity>
}