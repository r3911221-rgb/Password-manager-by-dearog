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
 * Coordinates the application startup sequence.
 *
 * Responsibilities:
 * - Initialize application components
 * - Determine current environment
 * - Load application version
 * - Restore session state
 * - Decide the initial navigation destination
 */
class AppStartup(
    private val appInitializer: AppInitializer,
    private val sessionManager: SessionManager,
    private val environmentProvider: AppEnvironmentProvider,
    private val versionProvider: AppVersionProvider
) {

    /**
     * Starts the application initialization.
     */
    fun start(): StartupResult {

        appInitializer.initialize()

        val environment = environmentProvider.current()

        val version = versionProvider.get()

        val destination = determineStartDestination()

        return StartupResult(
            environment = environment,
            version = version,
            startDestination = destination
        )
    }

    /**
     * Determines the first screen that should be shown.
     *
     * Later this method will check:
     * - Onboarding
     * - Existing vault
     * - Auto-lock
     * - Biometric authentication
     * - Master password state
     */
    private fun determineStartDestination(): AppDestination {

        return if (sessionManager.isUnlocked()) {
            AppDestination.Home
        } else {
            AppDestination.Unlock
        }
    }
}

/**
 * Result returned after startup completes.
 */
data class StartupResult(
    val environment: AppEnvironment,
    val version: AppVersion,
    val startDestination: AppDestination
)