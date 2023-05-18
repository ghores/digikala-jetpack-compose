package com.ghores.digikalacompose.di

import android.content.Context
import com.ghores.digikalacompose.data.datastore.DataStoreRepository
import com.ghores.digikalacompose.data.datastore.DataStoreRepositoryImpl
import com.ghores.digikalacompose.data.remote.HomeApiInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HomeApiInterfaceModule {

    @Singleton
    @Provides
    fun provideHomeApiService(retrofit: Retrofit): HomeApiInterface =
        retrofit.create(HomeApiInterface::class.java)
}