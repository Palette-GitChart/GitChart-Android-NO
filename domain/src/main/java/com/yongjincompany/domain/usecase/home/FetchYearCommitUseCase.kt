package com.yongjincompany.domain.usecase.home

import com.yongjincompany.domain.entity.home.YearCommitEntity
import com.yongjincompany.domain.repository.HomeRepository
import com.yongjincompany.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchYearCommitUseCase @Inject constructor(
    private val homeRepository: HomeRepository
) : UseCase<String, Flow<YearCommitEntity>>() {
    override suspend fun execute(data: String): Flow<YearCommitEntity> =
        homeRepository.fetchYearCommit(data)
}