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
 * Represents every navigation destination in the application.
 *
 * Each destination maps to a route defined in [AppRoutes].
 */
sealed class AppDestination(
    val route: String
) {

    /* Startup */

    data object Splash : AppDestination(AppRoutes.SPLASH)

    data object Onboarding : AppDestination(AppRoutes.ONBOARDING)

    data object CreateVault : AppDestination(AppRoutes.CREATE_VAULT)

    data object ImportVault : AppDestination(AppRoutes.IMPORT_VAULT)

    data object Unlock : AppDestination(AppRoutes.UNLOCK)

    /* Home */

    data object Home : AppDestination(AppRoutes.HOME)

    data object Search : AppDestination(AppRoutes.SEARCH)

    /* Passwords */

    data object Passwords : AppDestination(AppRoutes.PASSWORDS)

    data object PasswordDetails : AppDestination(AppRoutes.PASSWORD_DETAILS)

    data object AddPassword : AppDestination(AppRoutes.ADD_PASSWORD)

    data object EditPassword : AppDestination(AppRoutes.EDIT_PASSWORD)

    /* Vault */

    data object SecureNotes : AppDestination(AppRoutes.SECURE_NOTES)

    data object PaymentCards : AppDestination(AppRoutes.PAYMENT_CARDS)

    data object Identities : AppDestination(AppRoutes.IDENTITIES)

    data object Documents : AppDestination(AppRoutes.DOCUMENTS)

    data object Licenses : AppDestination(AppRoutes.LICENSES)

    data object ApiKeys : AppDestination(AppRoutes.API_KEYS)

    data object SshKeys : AppDestination(AppRoutes.SSH_KEYS)

    data object WifiPasswords : AppDestination(AppRoutes.WIFI_PASSWORDS)

    /* Security */

    data object PasswordGenerator : AppDestination(AppRoutes.PASSWORD_GENERATOR)

    data object PasswordHealth : AppDestination(AppRoutes.PASSWORD_HEALTH)

    data object Passkeys : AppDestination(AppRoutes.PASSKEYS)

    data object Totp : AppDestination(AppRoutes.TOTP)

    /* Backup */

    data object Backup : AppDestination(AppRoutes.BACKUP)

    data object Restore : AppDestination(AppRoutes.RESTORE)

    data object Import : AppDestination(AppRoutes.IMPORT)

    data object Export : AppDestination(AppRoutes.EXPORT)

    /* Settings */

    data object Settings : AppDestination(AppRoutes.SETTINGS)

    data object About : AppDestination(AppRoutes.ABOUT)

    data object License : AppDestination(AppRoutes.LICENSE)

    data object Privacy : AppDestination(AppRoutes.PRIVACY)

    /* Developer */

    data object DeveloperOptions : AppDestination(AppRoutes.DEVELOPER_OPTIONS)
}