package com.yongjincompany.gogit.di

import com.yongjincompany.data.remote.datasource.RemoteHomeDataSource
import com.yongjincompany.data.remote.datasource.RemoteHomeDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataSourceModule {

    @Binds
    abstract fun bindHomeDataSource(
        remoteHomeDataSourceImpl: RemoteHomeDataSourceImpl
    ): RemoteHomeDataSource
}