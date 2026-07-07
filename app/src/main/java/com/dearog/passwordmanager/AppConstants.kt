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
 * Shared constants used across the application.
 *
 * This object contains keys, identifiers, filenames,
 * request codes and other immutable values.
 */
object AppConstants {

    /** Database */
    const val DATABASE_NAME = "password_manager.db"
    const val DATABASE_VERSION = 1

    /** Preferences */
    const val PREFS_NAME = "dearog_preferences"

    /** Vault */
    const val VAULT_FILE_NAME = "vault.dat"
    const val BACKUP_FILE_EXTENSION = ".dpm"

    /** Encryption */
    const val KEYSTORE_ALIAS = "dearog_master_key"

    /** Intent Extras */
    const val EXTRA_PASSWORD_ID = "extra_password_id"
    const val EXTRA_NOTE_ID = "extra_note_id"
    const val EXTRA_CARD_ID = "extra_card_id"
    const val EXTRA_DOCUMENT_ID = "extra_document_id"

    /** Navigation */
    const val ARG_ITEM_ID = "itemId"
    const val ARG_CATEGORY_ID = "categoryId"

    /** Notifications */
    const val CHANNEL_SECURITY = "security"
    const val CHANNEL_BACKUP = "backup"

    const val NOTIFICATION_SECURITY = 1001
    const val NOTIFICATION_BACKUP = 1002

    /** Workers */
    const val WORK_AUTO_BACKUP = "auto_backup"
    const val WORK_AUTO_LOCK = "auto_lock"

    /** Backup */
    const val BACKUP_FOLDER = "DearogBackup"

    /** File Names */
    const val EXPORT_FILE_PREFIX = "Dearog_Export"
    const val LOG_FILE_NAME = "dearog.log"

    private AppConstants()
}