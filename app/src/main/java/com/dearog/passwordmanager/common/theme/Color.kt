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

import androidx.compose.ui.graphics.Color

/**
 * Application color definitions.
 *
 * These are the base colors used to build the Light and Dark
 * Material 3 color schemes.
 */
object AppColors {

    /* Brand */

    val BrandPrimary = Color(0xFF2563EB)
    val BrandPrimaryContainer = Color(0xFFDCEBFF)

    val BrandSecondary = Color(0xFF7C3AED)
    val BrandSecondaryContainer = Color(0xFFEADDFF)

    val BrandTertiary = Color(0xFF0F766E)
    val BrandTertiaryContainer = Color(0xFFCFFAF3)

    /* Status */

    val Success = Color(0xFF16A34A)
    val Warning = Color(0xFFF59E0B)
    val Error = Color(0xFFDC2626)
    val Info = Color(0xFF0284C7)

    /* Neutral */

    val White = Color(0xFFFFFFFF)
    val Black = Color(0xFF000000)

    val Gray50 = Color(0xFFF9FAFB)
    val Gray100 = Color(0xFFF3F4F6)
    val Gray200 = Color(0xFFE5E7EB)
    val Gray300 = Color(0xFFD1D5DB)
    val Gray400 = Color(0xFF9CA3AF)
    val Gray500 = Color(0xFF6B7280)
    val Gray600 = Color(0xFF4B5563)
    val Gray700 = Color(0xFF374151)
    val Gray800 = Color(0xFF1F2937)
    val Gray900 = Color(0xFF111827)

    /* Security */

    val SecureGreen = Color(0xFF15803D)
    val SecureYellow = Color(0xFFEAB308)
    val SecureRed = Color(0xFFB91C1C)

    /* Vault */

    val VaultLocked = Color(0xFFB91C1C)
    val VaultUnlocked = Color(0xFF15803D)

    /* Transparent */

    val Transparent = Color.Transparent
}