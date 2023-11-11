package com.saydullin.pexelsapp.di

import com.saydullin.pexelsapp.domain.repository.CuratedImagesRepository
import com.saydullin.pexelsapp.domain.repository.FeaturedCollectionsRepository
import com.saydullin.pexelsapp.domain.usecase.GetCuratedImagesAPIUseCase
import com.saydullin.pexelsapp.domain.usecase.GetFeaturedCollectionsAPIUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun providesGetFeaturedCollectionsAPIUseCase(
        featuredCollectionsRepository: FeaturedCollectionsRepository,
    ): GetFeaturedCollectionsAPIUseCase {
        return GetFeaturedCollectionsAPIUseCase(featuredCollectionsRepository)
    }

    @Provides
    fun providesGetCuratedImagesAPIUseCase(
        curatedImagesRepository: CuratedImagesRepository,
    ): GetCuratedImagesAPIUseCase {
        return GetCuratedImagesAPIUseCase(curatedImagesRepository)
    }

}


