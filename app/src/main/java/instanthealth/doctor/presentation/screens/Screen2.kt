package instanthealth.doctor.presentation.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import instanthealth.doctor.presentation.navigation.NavRoute
import instanthealth.doctor.presentation.viewmodels.Screen2ViewModel
import instanthealth.doctor.presentation.viewmodels.SplashScreenViewModel


object Screen2Route : NavRoute<Screen2ViewModel> {

    override val route = "screen2/"

    @Composable
    override fun viewModel(): Screen2ViewModel = hiltViewModel()

    @Composable
    override fun Content(viewModel: Screen2ViewModel) = Screen2(viewModel)
}


@Composable
fun Screen2(
    viewModel: Screen2ViewModel
) {
    Column(
        modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Screen 2",
            fontFamily = MaterialTheme.typography.h1.fontFamily,
            fontSize = MaterialTheme.typography.h1.fontSize)
    }
}