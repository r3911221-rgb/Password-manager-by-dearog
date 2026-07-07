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

import androidx.compose.runtime.Composable

/**
 * Root navigation graph.
 *
 * This will later be migrated to Jetpack Navigation Compose
 * as features are implemented.
 */
@Composable
fun NavGraph() {
    AppStartupScreen()
}

@Composable
private fun AppStartupScreen() {
    SplashRoute()
}

@Composable
private fun SplashRoute() {
    // Temporary placeholder.
    // Later this will determine whether to navigate to:
    // - Onboarding
    // - Unlock Vault
    // - Home
}