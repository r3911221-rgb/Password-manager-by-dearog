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

/**
 * Represents the application's theme preference.
 */
enum class ThemeMode {

    /**
     * Always use the light theme.
     */
    LIGHT,

    /**
     * Always use the dark theme.
     */
    DARK,

    /**
     * Follow the system theme.
     */
    SYSTEM
}

/**
 * Utility functions for working with ThemeMode.
 */
object ThemeModeDefaults {

    /**
     * Default theme mode for new installations.
     */
    const val DEFAULT = ThemeMode.SYSTEM

    /**
     * Preference key used to persist the theme mode.
     */
    const val PREFERENCE_KEY = "theme_mode"
}