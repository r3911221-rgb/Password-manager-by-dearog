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

package com.dearog.passwordmanager.common.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Clear
import androidx.compose.material.icons.outlined.Search
import androidx.compose.runtime.Composable

/**
 * Standard search bar used throughout the application.
 */
@Composable
fun SearchBar(
    query: String,
    onQueryChange: (String) -> Unit,
    placeholder: String = "Search...",
    enabled: Boolean = true,
    onClearClick: () -> Unit = {
        onQueryChange("")
    }
) {
    AppTextField(
        value = query,
        onValueChange = onQueryChange,
        placeholder = placeholder,
        enabled = enabled,
        singleLine = true,
        leadingIcon = {
            AppIconButton(
                icon = Icons.Outlined.Search,
                contentDescription = "Search",
                onClick = {}
            )
        },
        trailingIcon = {
            if (query.isNotEmpty()) {
                AppIconButton(
                    icon = Icons.Outlined.Clear,
                    contentDescription = "Clear search",
                    onClick = onClearClick
                )
            }
        }
    )
}