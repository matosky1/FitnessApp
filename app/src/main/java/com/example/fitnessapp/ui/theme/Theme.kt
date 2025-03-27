package com.example.fitnessapp.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import com.example.fitnessapp.ui.theme.Shapes
import com.example.fitnessapp.ui.theme.Typography
import com.example.fitnessapp.ui.theme.backgroundDark
import com.example.fitnessapp.ui.theme.backgroundLight
import com.example.fitnessapp.ui.theme.errorContainerDark
import com.example.fitnessapp.ui.theme.errorContainerLight
import com.example.fitnessapp.ui.theme.errorDark
import com.example.fitnessapp.ui.theme.errorLight
import com.example.fitnessapp.ui.theme.onBackgroundDark
import com.example.fitnessapp.ui.theme.onBackgroundLight
import com.example.fitnessapp.ui.theme.onErrorContainerDark
import com.example.fitnessapp.ui.theme.onErrorContainerLight
import com.example.fitnessapp.ui.theme.onErrorDark
import com.example.fitnessapp.ui.theme.onErrorLight
import com.example.fitnessapp.ui.theme.onPrimaryContainerDark
import com.example.fitnessapp.ui.theme.onPrimaryContainerLight
import com.example.fitnessapp.ui.theme.onPrimaryDark
import com.example.fitnessapp.ui.theme.onPrimaryLight
import com.example.fitnessapp.ui.theme.onSecondaryContainerDark
import com.example.fitnessapp.ui.theme.onSecondaryContainerLight
import com.example.fitnessapp.ui.theme.onSecondaryDark
import com.example.fitnessapp.ui.theme.onSecondaryLight
import com.example.fitnessapp.ui.theme.onSurfaceDark
import com.example.fitnessapp.ui.theme.onSurfaceLight
import com.example.fitnessapp.ui.theme.onTertiaryContainerDark
import com.example.fitnessapp.ui.theme.onTertiaryContainerLight
import com.example.fitnessapp.ui.theme.onTertiaryDark
import com.example.fitnessapp.ui.theme.onTertiaryLight
import com.example.fitnessapp.ui.theme.primaryContainerDark
import com.example.fitnessapp.ui.theme.primaryContainerLight
import com.example.fitnessapp.ui.theme.primaryDark
import com.example.fitnessapp.ui.theme.primaryLight
import com.example.fitnessapp.ui.theme.secondaryContainerDark
import com.example.fitnessapp.ui.theme.secondaryContainerLight
import com.example.fitnessapp.ui.theme.secondaryDark
import com.example.fitnessapp.ui.theme.secondaryLight
import com.example.fitnessapp.ui.theme.surfaceDark
import com.example.fitnessapp.ui.theme.surfaceLight
import com.example.fitnessapp.ui.theme.tertiaryContainerDark
import com.example.fitnessapp.ui.theme.tertiaryContainerLight
import com.example.fitnessapp.ui.theme.tertiaryDark
import com.example.fitnessapp.ui.theme.tertiaryLight

private val LightColors = lightColorScheme(
    primary = primaryLight,
    onPrimary = onPrimaryLight,
    primaryContainer = primaryContainerLight,
    onPrimaryContainer = onPrimaryContainerLight,
    secondary = secondaryLight,
    onSecondary = onSecondaryLight,
    secondaryContainer = secondaryContainerLight,
    onSecondaryContainer = onSecondaryContainerLight,
    tertiary = tertiaryLight,
    onTertiary = onTertiaryLight,
    tertiaryContainer = tertiaryContainerLight,
    onTertiaryContainer = onTertiaryContainerLight,
    error = errorLight,
    onError = onErrorLight,
    errorContainer = errorContainerLight,
    onErrorContainer = onErrorContainerLight,
    background = backgroundLight,
    onBackground = onBackgroundLight,
    surface = surfaceLight,
    onSurface = onSurfaceLight
)

private val DarkColors = darkColorScheme(
    primary = primaryDark,
    onPrimary = onPrimaryDark,
    primaryContainer = primaryContainerDark,
    onPrimaryContainer = onPrimaryContainerDark,
    secondary = secondaryDark,
    onSecondary = onSecondaryDark,
    secondaryContainer = secondaryContainerDark,
    onSecondaryContainer = onSecondaryContainerDark,
    tertiary = tertiaryDark,
    onTertiary = onTertiaryDark,
    tertiaryContainer = tertiaryContainerDark,
    onTertiaryContainer = onTertiaryContainerDark,
    error = errorDark,
    onError = onErrorDark,
    errorContainer = errorContainerDark,
    onErrorContainer = onErrorContainerDark,
    background = backgroundDark,
    onBackground = onBackgroundDark,
    surface = surfaceDark,
    onSurface = onSurfaceDark
)

@Composable
fun FitnessAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColors else LightColors

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
