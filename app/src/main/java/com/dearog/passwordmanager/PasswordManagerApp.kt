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

import android.app.Application
import android.util.Log

/**
 * Application entry point for Dearog Password Manager.
 *
 * Responsible for initializing global components that should live for the
 * entire lifetime of the application.
 */
class PasswordManagerApp : Application() {

    override fun onCreate() {
        super.onCreate()

        initializeApplication()
    }

    /**
     * Initializes application level components.
     */
    private fun initializeApplication() {
        initializeLogging()
        initializeSecurity()
        initializeDatabase()
        initializeBackgroundWork()
        initializeServices()
    }

    private fun initializeLogging() {
        Log.i(TAG, "Logging initialized")
    }

    private fun initializeSecurity() {
        Log.i(TAG, "Security initialized")
    }

    private fun initializeDatabase() {
        Log.i(TAG, "Database initialized")
    }

    private fun initializeBackgroundWork() {
        Log.i(TAG, "Background workers initialized")
    }

    private fun initializeServices() {
        Log.i(TAG, "Application services initialized")
    }

    companion object {
        private const val TAG = "PasswordManagerApp"
    }
}