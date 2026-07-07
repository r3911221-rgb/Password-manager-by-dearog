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
 * Navigation route names.
 *
 * Every screen in the application should have a unique route.
 */
object AppRoutes {

    /** Startup */
    const val SPLASH = "splash"
    const val ONBOARDING = "onboarding"
    const val CREATE_VAULT = "create_vault"
    const val IMPORT_VAULT = "import_vault"
    const val UNLOCK = "unlock"

    /** Home */
    const val HOME = "home"
    const val SEARCH = "search"

    /** Passwords */
    const val PASSWORDS = "passwords"
    const val PASSWORD_DETAILS = "password_details"
    const val ADD_PASSWORD = "add_password"
    const val EDIT_PASSWORD = "edit_password"

    /** Vault Items */
    const val SECURE_NOTES = "secure_notes"
    const val PAYMENT_CARDS = "payment_cards"
    const val IDENTITIES = "identities"
    const val DOCUMENTS = "documents"
    const val LICENSES = "licenses"
    const val API_KEYS = "api_keys"
    const val SSH_KEYS = "ssh_keys"
    const val WIFI_PASSWORDS = "wifi_passwords"

    /** Security */
    const val PASSWORD_GENERATOR = "password_generator"
    const val PASSWORD_HEALTH = "password_health"
    const val PASSKEYS = "passkeys"
    const val TOTP = "totp"

    /** Data */
    const val BACKUP = "backup"
    const val RESTORE = "restore"
    const val IMPORT = "import"
    const val EXPORT = "export"

    /** Settings */
    const val SETTINGS = "settings"
    const val ABOUT = "about"
    const val LICENSE = "license"
    const val PRIVACY = "privacy"

    /** Developer */
    const val DEVELOPER_OPTIONS = "developer_options"

    private AppRoutes()
}