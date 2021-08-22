package com.tedm.gnewsappcompose.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = OrangeAccent,
    background = MediumGrey,
    onBackground = TextBlack,
    onPrimary = White,
    surface = LightGrey,
    onSurface = MediumGrey
)

@Composable
fun GNewsAppComposeTheme(
    content: @Composable() () -> Unit
) {
    MaterialTheme(
        colors = DarkColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}