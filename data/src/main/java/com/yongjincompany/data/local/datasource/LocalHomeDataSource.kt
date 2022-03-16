package com.yongjincompany.data.local.datasource

import com.yongjincompany.domain.entity.home.MyProfileEntity
import com.yongjincompany.domain.entity.home.TodayCommitEntity
import com.yongjincompany.domain.entity.home.WeeklyCommitEntity
import com.yongjincompany.domain.entity.home.YearCommitEntity

interface LocalHomeDataSource {
    suspend fun fetchMyProfile(userId: String): MyProfileEntity

    suspend fun insertMyProfile(myProfileEntity: MyProfileEntity)

    suspend fun fetchDayCommit(userName: String): TodayCommitEntity

    suspend fun insertDayCommit(todayCommitEntity: TodayCommitEntity)

    suspend fun fetchWeekCommit(userName: String): WeeklyCommitEntity

    suspend fun insertWeekCommit(weeklyCommitEntity: WeeklyCommitEntity)

    suspend fun fetchYearCommit(userName: String): YearCommitEntity

    suspend fun insertYearCommit(yearCommitEntity: YearCommitEntity)
}