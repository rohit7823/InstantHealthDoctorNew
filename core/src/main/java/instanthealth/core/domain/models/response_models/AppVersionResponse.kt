package instanthealth.core.domain.models.response_models

import instanthealth.core.domain.models.AppVersion
import kotlinx.serialization.Serializable

@Serializable
data class AppVersionResponse(
    val status: Boolean,
    val message: String,
    val appVersion: AppVersion
)
