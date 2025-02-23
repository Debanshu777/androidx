/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package androidx.room.vo

import androidx.room.compiler.processing.XMethodElement

/**
 * Represents a DAO method that delegates to a concrete implementation, specifically to override a
 * Kotlin interface whose implementation is in the DefaultImpl generated class.
 */
data class KotlinDefaultMethodDelegate(
    // the original element, not the stub that is generated for DefaultImpls
    val element: XMethodElement
)
