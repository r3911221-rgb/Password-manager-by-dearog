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

import android.util.Log

/**
 * Centralized application logger.
 *
 * All logging in the application should go through this object.
 * This makes it easy to replace Android Log with Timber,
 * Crashlytics, or another logging solution in the future.
 */
object AppLogger {

    private const val DEFAULT_TAG = "Dearog"

    fun verbose(
        message: String,
        tag: String = DEFAULT_TAG
    ) {
        Log.v(tag, message)
    }

    fun debug(
        message: String,
        tag: String = DEFAULT_TAG
    ) {
        Log.d(tag, message)
    }

    fun info(
        message: String,
        tag: String = DEFAULT_TAG
    ) {
        Log.i(tag, message)
    }

    fun warning(
        message: String,
        tag: String = DEFAULT_TAG
    ) {
        Log.w(tag, message)
    }

    fun error(
        message: String,
        throwable: Throwable? = null,
        tag: String = DEFAULT_TAG
    ) {
        Log.e(tag, message, throwable)
    }

    fun wtf(
        message: String,
        throwable: Throwable? = null,
        tag: String = DEFAULT_TAG
    ) {
        Log.wtf(tag, message, throwable)
    }
}