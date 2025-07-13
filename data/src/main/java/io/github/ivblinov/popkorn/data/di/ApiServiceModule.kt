package io.github.ivblinov.popkorn.data.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.ivblinov.popkorn.data.network.KinopoiskApiService
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiServiceModule {

    @Provides
    @Singleton
    fun provideKinopoiskApiService(retrofit: Retrofit): KinopoiskApiService =
        retrofit.create(KinopoiskApiService::class.java)
}