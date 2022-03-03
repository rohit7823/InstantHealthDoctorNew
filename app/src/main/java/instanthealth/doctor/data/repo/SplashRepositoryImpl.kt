package instanthealth.doctor.data.repo

import instanthealth.core.common.Resource
import instanthealth.core.domain.models.AppVersion
import instanthealth.core.domain.models.response_models.AppVersionResponse
import instanthealth.core.domain.repository.SplashRepository
import kotlinx.coroutines.delay
import javax.inject.Inject

class SplashRepositoryImpl @Inject constructor(

) : SplashRepository {
    override suspend fun getAppVersion(): Resource<AppVersionResponse> {
        delay(1000L)
        return Resource.Success(
            AppVersionResponse(
                status = true,
                message = "Successful",
                appVersion = AppVersion(
                    version = "1.0",
                    date = "3/3/2022"
                )
            )
        )
    }
}