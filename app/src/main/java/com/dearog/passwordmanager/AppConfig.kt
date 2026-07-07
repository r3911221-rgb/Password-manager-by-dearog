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
 * Global application configuration.
 *
 * All application-wide configuration values should be defined here.
 */
object AppConfig {

    /** Application information */
    const val APP_NAME = "Dearog Password Manager"

    /** Session */
    const val DEFAULT_AUTO_LOCK_MINUTES = 5
    const val MAX_FAILED_ATTEMPTS = 10

    /** Security */
    const val MASTER_PASSWORD_MIN_LENGTH = 12
    const val GENERATED_PASSWORD_DEFAULT_LENGTH = 20

    /** Backup */
    const val MAX_BACKUP_HISTORY = 10

    /** Search */
    const val SEARCH_DEBOUNCE_MS = 300L

    /** Database */
    const val DATABASE_NAME = "dearog_password_manager.db"

    /** Logging */
    const val LOG_TAG = "Dearog"

    /** Notifications */
    const val NOTIFICATION_CHANNEL_SECURITY = "security"
    const val NOTIFICATION_CHANNEL_BACKUP = "backup"

    /** Worker */
    const val AUTO_BACKUP_WORK = "auto_backup"
    const val VAULT_LOCK_WORK = "vault_lock"

    /** Preferences */
    const val PREFS_NAME = "dearog_preferences"

    /** Biometrics */
    const val BIOMETRIC_PROMPT_TITLE = "Unlock Vault"

    /** Timeouts */
    const val BIOMETRIC_TIMEOUT_SECONDS = 30

    private AppConfig()
}