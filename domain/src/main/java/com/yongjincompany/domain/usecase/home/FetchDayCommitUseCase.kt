package com.yongjincompany.domain.usecase.home

import com.yongjincompany.domain.entity.home.TodayCommitEntity
import com.yongjincompany.domain.repository.HomeRepository
import com.yongjincompany.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchDayCommitUseCase @Inject constructor(
    private val homeRepository: HomeRepository
) : UseCase<String, Flow<TodayCommitEntity>>() {
    override suspend fun execute(data: String): Flow<TodayCommitEntity> =
        homeRepository.fetchDayCommit(data)

}