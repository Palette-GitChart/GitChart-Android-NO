package com.yongjincompany.domain.usecase.home

import com.yongjincompany.domain.entity.home.MyProfileEntity
import com.yongjincompany.domain.repository.HomeRepository
import com.yongjincompany.domain.usecase.UseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FetchMyProfileUseCase @Inject constructor(
    private val homeRepository: HomeRepository
) : UseCase<String, Flow<MyProfileEntity>>() {

    override suspend fun execute(data: String): Flow<MyProfileEntity> =
        homeRepository.fetchMyProfile(data)
}