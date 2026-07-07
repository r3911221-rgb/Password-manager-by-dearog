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

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

/**
 * Material 3 shape definitions.
 *
 * These shapes are shared across the entire application.
 */
val AppShapes = Shapes(

    extraSmall = RoundedCornerShape(4.dp),

    small = RoundedCornerShape(8.dp),

    medium = RoundedCornerShape(12.dp),

    large = RoundedCornerShape(16.dp),

    extraLarge = RoundedCornerShape(28.dp)
)

/**
 * Common reusable corner radii.
 */
object CornerRadius {

    val None = 0.dp

    val ExtraSmall = 4.dp

    val Small = 8.dp

    val Medium = 12.dp

    val Large = 16.dp

    val ExtraLarge = 20.dp

    val ExtraExtraLarge = 28.dp

    val Full = 999.dp
}