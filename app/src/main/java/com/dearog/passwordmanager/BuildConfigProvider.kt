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
 * Provides access to BuildConfig values.
 *
 * Keeping BuildConfig access in one place makes it easier to test
 * and avoids spreading BuildConfig references across the app.
 */
interface BuildConfigProvider {

    val applicationId: String

    val versionName: String

    val versionCode: Int

    val isDebug: Boolean

    val buildType: String
}

/**
 * Default implementation backed by BuildConfig.
 */
class DefaultBuildConfigProvider : BuildConfigProvider {

    override val applicationId: String
        get() = BuildConfig.APPLICATION_ID

    override val versionName: String
        get() = BuildConfig.VERSION_NAME

    override val versionCode: Int
        get() = BuildConfig.VERSION_CODE

    override val isDebug: Boolean
        get() = BuildConfig.DEBUG

    override val buildType: String
        get() = BuildConfig.BUILD_TYPE
}