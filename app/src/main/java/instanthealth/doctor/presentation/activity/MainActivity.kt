package instanthealth.doctor.presentation.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.Modifier
import instanthealth.doctor.presentation.ui.theme.InstantHealthDoctorTheme
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.ui.unit.dp
import androidx.navigation.NavBackStackEntry
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

import dagger.hilt.android.AndroidEntryPoint
import instanthealth.doctor.presentation.navigation.NavigationComponent
import instanthealth.doctor.presentation.screens.Screen2

@AndroidEntryPoint
class MainActivity : ComponentActivity() {


    @OptIn(ExperimentalAnimationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val animatedNavController = rememberAnimatedNavController()
            InstantHealthDoctorTheme {
                Scaffold {
                    NavigationComponent(animatedNavController, it)
                }
            }
        }


    }
}