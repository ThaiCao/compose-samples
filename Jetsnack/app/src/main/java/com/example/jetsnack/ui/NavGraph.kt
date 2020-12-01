/*
 * Copyright 2020 The Android Open Source Project
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

package com.example.jetsnack.ui

import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate

object Destinations {
    const val Home = "home"
    const val SnackDetail = "snackDetail"

    object SnackDetailArgs {
        const val SnackId = "snackId"
    }
}

class Actions(navController: NavHostController) {
    val selectSnack: (Long) -> Unit = { snackId: Long ->
        navController.navigate(Destinations.SnackDetail + "/$snackId")
    }
    val upPress: () -> Unit = {
        navController.popBackStack()
    }
}