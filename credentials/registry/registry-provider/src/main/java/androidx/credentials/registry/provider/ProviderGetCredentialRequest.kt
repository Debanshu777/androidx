/*
 * Copyright 2024 The Android Open Source Project
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

package androidx.credentials.registry.provider

import androidx.annotation.RestrictTo
import androidx.credentials.provider.ProviderGetCredentialRequest
import androidx.credentials.registry.provider.digitalcredentials.DigitalCredentialEntry

internal const val EXTRA_CREDENTIAL_ID =
    "androidx.credentials.registry.provider.extra.CREDENTIAL_ID"

/**
 * Returns the selected entry id, if present.
 *
 * For example, for a digital credential entry, this maps to the corresponding entry's
 * [DigitalCredentialEntry.id].
 */
@get:RestrictTo(RestrictTo.Scope.LIBRARY)
public val ProviderGetCredentialRequest.selectedEntryId: String?
    get() = this.sourceBundle?.getString(EXTRA_CREDENTIAL_ID)
