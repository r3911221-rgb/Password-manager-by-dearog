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

package com.dearog.passwordmanager

/**
 * Global application state.
 *
 * This state is shared across the application and represents
 * the current lifecycle and security status.
 */
data class AppState(

    /** True while the application is initializing. */
    val isInitializing: Boolean = true,

    /** True if onboarding has been completed. */
    val isOnboardingCompleted: Boolean = false,

    /** True if a vault already exists. */
    val hasVault: Boolean = false,

    /** True if the vault is currently unlocked. */
    val isVaultUnlocked: Boolean = false,

    /** True if biometric authentication is available. */
    val isBiometricAvailable: Boolean = false,

    /** True if biometric authentication is enabled. */
    val isBiometricEnabled: Boolean = false,

    /** True if the user is authenticated. */
    val isAuthenticated: Boolean = false,

    /** True while a background task is running. */
    val isLoading: Boolean = false,

    /** Current application theme. */
    val theme: AppTheme = AppTheme.SYSTEM,

    /** Current language code. */
    val language: String = "en",

    /** Current application version. */
    val appVersion: String = "",

    /** Last synchronization time. */
    val lastSyncTime: Long? = null
)

/**
 * Available application themes.
 */
enum class AppTheme {
    LIGHT,
    DARK,
    SYSTEM
}