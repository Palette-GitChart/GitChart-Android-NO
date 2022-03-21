package com.yongjincompany.gogit.di

import com.yongjincompany.data.local.datasource.LocalHomeDataSource
import com.yongjincompany.data.local.datasource.LocalHomeDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class LocalDataSourceModule {

    @Binds
    abstract fun bindHomeDataSource(
        localHomeDataSourceImpl: LocalHomeDataSourceImpl
    ): LocalHomeDataSource
}