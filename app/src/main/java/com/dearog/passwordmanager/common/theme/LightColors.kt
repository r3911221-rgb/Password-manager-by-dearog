/*
 * Copyright 2026 Dearog Team
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.dearog.passwordmanager.common.theme

import androidx.compose.material3.lightColorScheme

/**
 * Material 3 Light Color Scheme.
 */
val LightColorScheme = lightColorScheme(

    primary = AppColors.BrandPrimary,
    onPrimary = AppColors.White,
    primaryContainer = AppColors.BrandPrimaryContainer,
    onPrimaryContainer = AppColors.Black,

    secondary = AppColors.BrandSecondary,
    onSecondary = AppColors.White,
    secondaryContainer = AppColors.BrandSecondaryContainer,
    onSecondaryContainer = AppColors.Black,

    tertiary = AppColors.BrandTertiary,
    onTertiary = AppColors.White,
    tertiaryContainer = AppColors.BrandTertiaryContainer,
    onTertiaryContainer = AppColors.Black,

    background = AppColors.White,
    onBackground = AppColors.Gray900,

    surface = AppColors.Gray50,
    onSurface = AppColors.Gray900,

    surfaceVariant = AppColors.Gray100,
    onSurfaceVariant = AppColors.Gray700,

    outline = AppColors.Gray400,
    outlineVariant = AppColors.Gray200,

    error = AppColors.Error,
    onError = AppColors.White,

    inverseSurface = AppColors.Gray900,
    inverseOnSurface = AppColors.White,

    inversePrimary = AppColors.BrandPrimaryContainer,

    scrim = AppColors.Black
)