package com.yongjincompany.domain.repository

import com.yongjincompany.domain.entity.home.MyProfileEntity

interface HomeRepository {
    suspend fun fetchMyProfile (id: String) : Flow<MyProfileEntity>
}