package com.yongjincompany.data.local.datasource

import com.yongjincompany.data.local.dao.HomeDao
import com.yongjincompany.data.local.entity.toDbEntity
import com.yongjincompany.data.local.entity.toEntity
import com.yongjincompany.domain.entity.home.MyProfileEntity
import com.yongjincompany.domain.entity.home.TodayCommitEntity
import com.yongjincompany.domain.entity.home.WeeklyCommitEntity
import com.yongjincompany.domain.entity.home.YearCommitEntity
import javax.inject.Inject

class LocalHomeDataSourceImpl @Inject constructor(
    private val homeDao: HomeDao
) : LocalHomeDataSource {
    override suspend fun fetchMyProfile(userId: String): MyProfileEntity =
        homeDao.fetchMyProfile(userId).toEntity()

    override suspend fun insertMyProfile(myProfileEntity: MyProfileEntity) {
        homeDao.insertMyProfile(myProfileEntity.toDbEntity())
    }

    override suspend fun fetchDayCommit(userName: String): TodayCommitEntity =
        homeDao.fetchDayCommit(userName).toEntity()

    override suspend fun insertDayCommit(todayCommitEntity: TodayCommitEntity) {
        homeDao.insertDayCommit(todayCommitEntity.toDbEntity())
    }

    override suspend fun fetchWeekCommit(userName: String): WeeklyCommitEntity =
        homeDao.fetchWeekCommit(userName).toEntity()

    override suspend fun insertWeekCommit(weeklyCommitEntity: WeeklyCommitEntity) {
        homeDao.insertWeekCommit(weeklyCommitEntity.toDbEntity())
    }

    override suspend fun fetchYearCommit(userName: String): YearCommitEntity =
        homeDao.fetchYearCommit(userName).toEntity()

    override suspend fun insertYearCommit(yearCommitEntity: YearCommitEntity) {
        homeDao.insertYearCommit(yearCommitEntity.toDbEntity())
    }
}