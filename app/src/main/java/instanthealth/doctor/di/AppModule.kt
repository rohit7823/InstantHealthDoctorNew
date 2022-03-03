package instanthealth.doctor.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import instanthealth.core.domain.repository.SplashRepository
import instanthealth.doctor.data.repo.SplashRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideSplashRepositoryImpl(): SplashRepository {
        return SplashRepositoryImpl()
    }

}