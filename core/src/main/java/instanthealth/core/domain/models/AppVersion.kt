package instanthealth.core.domain.models

import kotlinx.serialization.Serializable

@Serializable
data class AppVersion(
    val version: String,
    val date: String
)
