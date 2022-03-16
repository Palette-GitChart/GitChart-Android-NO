package com.yongjincompany.domain.usecase.home

import com.yongjincompany.domain.entity.home.WeeklyCommitEntity
import com.yongjincompany.domain.repository.HomeRepository
import com.yongjincompany.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchWeekCommitUseCase @Inject constructor(
    private val homeRepository: HomeRepository
) : UseCase<String, Flow<WeeklyCommitEntity>>() {
    override suspend fun execute(data: String): Flow<WeeklyCommitEntity> =
        homeRepository.fetchWeekCommit(data)

}