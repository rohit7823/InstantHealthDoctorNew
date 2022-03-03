package instanthealth.core.domain.repository

import instanthealth.core.common.Resource
import instanthealth.core.domain.models.response_models.AppVersionResponse

interface SplashRepository {
    suspend fun getAppVersion(): Resource<AppVersionResponse>
}