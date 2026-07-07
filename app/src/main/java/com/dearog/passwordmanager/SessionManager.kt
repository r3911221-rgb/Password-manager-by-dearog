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

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

/**
 * Manages the current vault session.
 *
 * Responsible for:
 * - Vault lock/unlock state
 * - Authentication state
 * - Session timeout
 * - Last user activity
 */
class SessionManager {

    private val _isVaultUnlocked = MutableStateFlow(false)
    val isVaultUnlocked: StateFlow<Boolean> = _isVaultUnlocked.asStateFlow()

    private val _isAuthenticated = MutableStateFlow(false)
    val isAuthenticated: StateFlow<Boolean> = _isAuthenticated.asStateFlow()

    private val _lastActivityTime = MutableStateFlow(0L)
    val lastActivityTime: StateFlow<Long> = _lastActivityTime.asStateFlow()

    /**
     * Unlocks the vault.
     */
    fun unlockVault() {
        _isVaultUnlocked.value = true
        _isAuthenticated.value = true
        updateActivity()
    }

    /**
     * Locks the vault.
     */
    fun lockVault() {
        _isVaultUnlocked.value = false
        _isAuthenticated.value = false
    }

    /**
     * Updates the last user interaction time.
     */
    fun updateActivity() {
        _lastActivityTime.value = System.currentTimeMillis()
    }

    /**
     * Returns true if the vault is currently unlocked.
     */
    fun isUnlocked(): Boolean = _isVaultUnlocked.value

    /**
     * Returns true if the user is authenticated.
     */
    fun isUserAuthenticated(): Boolean = _isAuthenticated.value

    /**
     * Clears the current session.
     */
    fun clearSession() {
        _isVaultUnlocked.value = false
        _isAuthenticated.value = false
        _lastActivityTime.value = 0L
    }
}