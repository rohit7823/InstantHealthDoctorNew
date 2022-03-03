package instanthealth.doctor.presentation.screens

import androidx.compose.foundation.Image
import instanthealth.doctor.presentation.viewmodels.SplashScreenViewModel
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import instanthealth.doctor.R
import instanthealth.doctor.presentation.ui.theme.InstantHealthDoctorTheme
import instanthealth.doctor.presentation.navigation.NavRoute


object SplashScreenRoute : NavRoute<SplashScreenViewModel> {

    override val route = "splash/"

    @Composable
    override fun viewModel(): SplashScreenViewModel = hiltViewModel()

    @Composable
    override fun Content(viewModel: SplashScreenViewModel) = SplashScreen(viewModel::onStartClicked)
}


@Composable
private fun SplashScreen(
    onStartClicked: () -> Unit
) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colors.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.instahealthlogo),
            contentDescription = "Logo",
            modifier = Modifier.clickable {
                onStartClicked()
            }
        )
        Text(text = "InstantHealth",
            fontSize = MaterialTheme.typography.h1.fontSize,
            fontFamily = MaterialTheme.typography.h1.fontFamily)
    }

}

@Preview(showBackground = true)
@Composable
fun SplashPreview() {
    InstantHealthDoctorTheme {
        Surface(modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)) {

        }
    }
}