package instanthealth.doctor.presentation.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import instanthealth.core.domain.use_cases.SplashUseCases
import instanthealth.doctor.presentation.navigation.RouteNavigator
import instanthealth.doctor.presentation.screens.Screen2Route
import javax.inject.Inject


@HiltViewModel
class SplashScreenViewModel @Inject constructor(
    private val routeNavigator: RouteNavigator
): ViewModel(), RouteNavigator by routeNavigator {


    fun onStartClicked(){
        navigateToRoute(Screen2Route.route)
    }



}