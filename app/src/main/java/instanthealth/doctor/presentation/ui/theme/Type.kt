package `in`.instanthealth.doctor.presentation.ui.theme

import `in`.instanthealth.doctor.R
import androidx.compose.material.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.poppins_bold)
        ),
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp,
        color = Color(0xFF414141)
    ),
    h2 = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.poppins_regular)
        ),
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp,
        color = Color(0xFFBBBBBB)
    ),
    caption = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.poppins_light)
        ),
        fontSize = 15.sp,
        color = Color(0xFFCFCFCF)
    ),
    button = TextStyle(
        fontFamily = FontFamily(
            Font(R.font.poppins_bold)
        ),
        fontSize = 15.sp,
        color = Color(0xFfFFFFFF)
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)