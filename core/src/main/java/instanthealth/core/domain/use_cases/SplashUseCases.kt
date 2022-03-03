package instanthealth.core.domain.use_cases

import instanthealth.core.domain.repository.SplashRepository
import javax.inject.Inject

class SplashUseCases @Inject constructor(
    private val splashRepository: SplashRepository
) {
}