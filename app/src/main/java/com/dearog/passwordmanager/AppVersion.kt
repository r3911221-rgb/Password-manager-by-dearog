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
 * Represents application version information.
 */
data class AppVersion(
    val applicationId: String,
    val versionName: String,
    val versionCode: Int,
    val buildType: String,
    val isDebug: Boolean
) {

    /**
     * Returns a readable version string.
     */
    fun displayName(): String {
        return "$versionName ($versionCode)"
    }

    /**
     * Returns a detailed version string.
     */
    fun fullDescription(): String {
        return buildString {
            append("Application ID: ")
            append(applicationId)
            append('\n')

            append("Version Name: ")
            append(versionName)
            append('\n')

            append("Version Code: ")
            append(versionCode)
            append('\n')

            append("Build Type: ")
            append(buildType)
            append('\n')

            append("Debug Build: ")
            append(isDebug)
        }
    }
}

/**
 * Creates an AppVersion instance from BuildConfigProvider.
 */
class AppVersionProvider(
    private val buildConfigProvider: BuildConfigProvider
) {

    fun get(): AppVersion {
        return AppVersion(
            applicationId = buildConfigProvider.applicationId,
            versionName = buildConfigProvider.versionName,
            versionCode = buildConfigProvider.versionCode,
            buildType = buildConfigProvider.buildType,
            isDebug = buildConfigProvider.isDebug
        )
    }
}