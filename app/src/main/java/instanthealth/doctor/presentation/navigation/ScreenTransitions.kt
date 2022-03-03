package instanthealth.doctor.presentation.navigation

import androidx.compose.animation.*
import androidx.compose.animation.core.AnimationConstants
import androidx.compose.animation.core.tween
import androidx.navigation.NavBackStackEntry
import instanthealth.doctor.presentation.screens.SplashScreenRoute

@OptIn(ExperimentalAnimationApi::class)
fun AnimatedContentScope<NavBackStackEntry>.enterTransition(): EnterTransition {
    return when(initialState.destination.route) {
        SplashScreenRoute.route -> {
            slideInHorizontally(
                initialOffsetX = { 300 },
                animationSpec = tween(300)
            ) + fadeIn(animationSpec = tween(300))
        }
        else -> {
            EnterTransition.None
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
fun AnimatedContentScope<NavBackStackEntry>.exitTransition(): ExitTransition {
    return when(initialState.destination.route) {
        SplashScreenRoute.route -> {
            slideOutHorizontally(
                targetOffsetX = { -300 },
                animationSpec = tween(300)
            ) + fadeOut(animationSpec = tween(300))
        }
        else -> ExitTransition.None
    }
}

@OptIn(ExperimentalAnimationApi::class)
fun AnimatedContentScope<NavBackStackEntry>.popEnterTransition(): EnterTransition {
    return when(initialState.destination.route) {
        SplashScreenRoute.route -> {
            slideInHorizontally(
                initialOffsetX = { 300 },
                animationSpec = tween(300)
            ) + fadeIn(animationSpec = tween(300))
        }
        else -> EnterTransition.None
    }
}


@OptIn(ExperimentalAnimationApi::class)
fun AnimatedContentScope<NavBackStackEntry>.popExitTransition(): ExitTransition {
    return when(initialState.destination.route) {
        SplashScreenRoute.route -> {
            slideOutHorizontally(
                targetOffsetX = { -300 },
                animationSpec = tween(300)
            ) + fadeOut(animationSpec = tween(300))
        }
        else -> ExitTransition.None
    }
}