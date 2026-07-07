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

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationDrawerItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import com.dearog.passwordmanager.common.theme.AppSpacing

/**
 * Model representing a navigation drawer item.
 */
data class NavigationDrawerItemData(
    val label: String,
    val icon: ImageVector,
    val selected: Boolean
)

/**
 * Standard navigation drawer content.
 */
@Composable
fun AppNavigationDrawer(
    items: List<NavigationDrawerItemData>,
    onItemSelected: (Int) -> Unit,
    modifier: Modifier = Modifier,
    header: (@Composable () -> Unit)? = null
) {
    ModalDrawerSheet(
        modifier = modifier.fillMaxHeight()
    ) {

        if (header != null) {
            Column(
                modifier = Modifier.padding(AppSpacing.Medium)
            ) {
                header()
            }
        }

        items.forEachIndexed { index, item ->

            NavigationDrawerItem(
                label = {
                    Text(item.label)
                },
                selected = item.selected,
                onClick = {
                    onItemSelected(index)
                },
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.label
                    )
                },
                modifier = Modifier.padding(
                    horizontal = AppSpacing.Small,
                    vertical = AppSpacing.ExtraSmall
                ),
                colors = NavigationDrawerItemDefaults.colors()
            )
        }
    }
}