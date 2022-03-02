package `in`.instanthealth.doctor.presentation.components

import `in`.instanthealth.doctor.presentation.ScreenTransitions
import `in`.instanthealth.doctor.presentation.ui.theme.InstantHealthDoctorTheme
import instanthealth.doctor.presentation.viewmodels.SplashScreenViewModel
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination(
    start = true,
    style = ScreenTransitions::class
)
@Composable
fun SplashScreen(
    navController: DestinationsNavigator? = null,
    viewModel: SplashScreenViewModel = hiltViewModel(),
) {




}

@Preview(showBackground = true)
@Composable
fun SplashPreview() {
    InstantHealthDoctorTheme {
        Surface(modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)) {
            SplashScreen()
        }
    }
}