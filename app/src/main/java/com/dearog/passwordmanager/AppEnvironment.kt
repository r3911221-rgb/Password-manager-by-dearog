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
 * Represents the current application environment.
 */
enum class AppEnvironment {

    /** Development build. */
    DEBUG,

    /** Production build. */
    RELEASE,

    /** Benchmark build. */
    BENCHMARK
}

/**
 * Resolves the current application environment.
 */
class AppEnvironmentProvider(
    private val buildConfigProvider: BuildConfigProvider
) {

    /**
     * Returns the current environment.
     */
    fun current(): AppEnvironment {
        return when (buildConfigProvider.buildType.lowercase()) {
            "debug" -> AppEnvironment.DEBUG
            "benchmark" -> AppEnvironment.BENCHMARK
            else -> AppEnvironment.RELEASE
        }
    }

    /**
     * Returns true when running a debug build.
     */
    fun isDebug(): Boolean =
        current() == AppEnvironment.DEBUG

    /**
     * Returns true when running a release build.
     */
    fun isRelease(): Boolean =
        current() == AppEnvironment.RELEASE

    /**
     * Returns true when running a benchmark build.
     */
    fun isBenchmark(): Boolean =
        current() == AppEnvironment.BENCHMARK
}