package instanthealth.doctor.presentation.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.google.accompanist.navigation.animation.AnimatedNavHost
import instanthealth.doctor.presentation.screens.Screen2Route
import instanthealth.doctor.presentation.screens.SplashScreenRoute


@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NavigationComponent(navHostController: NavHostController, paddingValues: PaddingValues) {

    AnimatedNavHost(
        navController = navHostController,
        startDestination = SplashScreenRoute.route,
        modifier = Modifier.padding(paddingValues),
        enterTransition = {enterTransition()},
        exitTransition = {exitTransition()},
        popEnterTransition = {popEnterTransition()},
        popExitTransition = {popExitTransition()}
    ) {
        SplashScreenRoute.composable(this, navHostController)
        Screen2Route.composable(this, navHostController)
    }
}