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

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Standard elevations used throughout the application.
 *
 * Use these values instead of hardcoding elevations.
 */
object AppElevation {

    /** No elevation. */
    val None: Dp = 0.dp

    /** Small elements. */
    val ExtraSmall: Dp = 1.dp

    /** Buttons, chips. */
    val Small: Dp = 2.dp

    /** Cards. */
    val Medium: Dp = 4.dp

    /** Navigation bar, app bar. */
    val Large: Dp = 6.dp

    /** Dialogs. */
    val ExtraLarge: Dp = 8.dp

    /** Floating Action Button. */
    val Fab: Dp = 6.dp

    /** Modal Bottom Sheet. */
    val BottomSheet: Dp = 8.dp

    /** Navigation Drawer. */
    val NavigationDrawer: Dp = 16.dp

    /** Popup/Menu. */
    val Menu: Dp = 4.dp

    /** Tooltip. */
    val Tooltip: Dp = 4.dp
}