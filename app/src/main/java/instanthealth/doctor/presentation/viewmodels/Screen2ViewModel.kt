package instanthealth.doctor.presentation.viewmodels

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import instanthealth.doctor.presentation.navigation.RouteNavigator
import javax.inject.Inject

@HiltViewModel
class Screen2ViewModel @Inject constructor(
    private val routeNavigator: RouteNavigator
):ViewModel(), RouteNavigator by routeNavigator {





}