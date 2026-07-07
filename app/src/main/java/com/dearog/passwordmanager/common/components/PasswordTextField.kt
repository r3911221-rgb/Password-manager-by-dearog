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
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material.icons.outlined.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.KeyboardOptions
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

/**
 * Reusable password text field with show/hide support.
 */
@Composable
fun PasswordTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String = "Password",
    placeholder: String = "",
    enabled: Boolean = true,
    readOnly: Boolean = false,
    isError: Boolean = false,
    supportingText: String? = null
) {
    var passwordVisible by remember {
        mutableStateOf(false)
    }

    AppTextField(
        value = value,
        onValueChange = onValueChange,
        label = label,
        placeholder = placeholder,
        enabled = enabled,
        readOnly = readOnly,
        isError = isError,
        supportingText = supportingText,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password
        ),
        visualTransformation = if (passwordVisible) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        },
        trailingIcon = {
            AppIconButton(
                icon = if (passwordVisible) {
                    Icons.Outlined.VisibilityOff
                } else {
                    Icons.Outlined.Visibility
                },
                contentDescription = if (passwordVisible) {
                    "Hide password"
                } else {
                    "Show password"
                },
                onClick = {
                    passwordVisible = !passwordVisible
                }
            )
        }
    )
}