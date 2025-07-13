package io.github.ivblinov.popkorn.data.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.github.ivblinov.popkorn.data.repository.MovieFeedRepositoryImpl
import io.github.ivblinov.popkorn.domain.repository.MovieFeedRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun bindMovieFeedRepository(
        impl: MovieFeedRepositoryImpl
    ): MovieFeedRepository
}