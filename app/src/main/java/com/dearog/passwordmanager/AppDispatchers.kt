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

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

/**
 * Provides coroutine dispatchers used throughout the application.
 *
 * Keeping dispatchers behind an interface makes them easy to replace
 * during unit testing.
 */
interface AppDispatchers {

    /** Main thread dispatcher. */
    val main: CoroutineDispatcher

    /** IO dispatcher for disk, database and network operations. */
    val io: CoroutineDispatcher

    /** CPU-intensive work dispatcher. */
    val default: CoroutineDispatcher

    /** Low-priority background work dispatcher. */
    val unconfined: CoroutineDispatcher
}

/**
 * Default implementation backed by kotlinx.coroutines.Dispatchers.
 */
class DefaultAppDispatchers : AppDispatchers {

    override val main: CoroutineDispatcher = Dispatchers.Main

    override val io: CoroutineDispatcher = Dispatchers.IO

    override val default: CoroutineDispatcher = Dispatchers.Default

    override val unconfined: CoroutineDispatcher = Dispatchers.Unconfined
}