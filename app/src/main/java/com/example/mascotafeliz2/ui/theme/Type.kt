package com.example.mascotafeliz2.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mascotafeliz2.R

// Set of Material typography styles to start with

private val kanit = FontFamily(
Font(R.font.young, FontWeight.Normal)
)

val Typography = Typography(

    bodyLarge = TextStyle(
        fontFamily = kanit,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        lineHeight = 34.sp,
        letterSpacing = 0.5.sp
    )

)