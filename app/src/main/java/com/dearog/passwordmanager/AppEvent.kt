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
 * Global application events.
 *
 * These events can be emitted from anywhere in the app and observed
 * by the UI or other components.
 */
sealed interface AppEvent {

    /* Application */

    data object AppStarted : AppEvent

    data object AppStopped : AppEvent

    data object AppUpdated : AppEvent

    /* Authentication */

    data object LoginRequested : AppEvent

    data object AuthenticationSucceeded : AppEvent

    data object AuthenticationFailed : AppEvent

    data object VaultUnlocked : AppEvent

    data object VaultLocked : AppEvent

    data object LogoutRequested : AppEvent

    data object SessionExpired : AppEvent

    /* Backup */

    data object BackupStarted : AppEvent

    data object BackupCompleted : AppEvent

    data object RestoreStarted : AppEvent

    data object RestoreCompleted : AppEvent

    /* Settings */

    data object ThemeChanged : AppEvent

    data object LanguageChanged : AppEvent

    /* Security */

    data object SecurityWarning : AppEvent

    data object SecurityViolation : AppEvent

    /* Database */

    data object DatabaseOpened : AppEvent

    data object DatabaseClosed : AppEvent

    /* Sync */

    data object SyncStarted : AppEvent

    data object SyncCompleted : AppEvent

    /* Error */

    data class Error(
        val message: String,
        val throwable: Throwable? = null
    ) : AppEvent
}