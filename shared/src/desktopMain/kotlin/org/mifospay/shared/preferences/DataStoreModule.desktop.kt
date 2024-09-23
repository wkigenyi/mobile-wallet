/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-wallet/blob/master/LICENSE.md
 */
package org.mifospay.shared.preferences

import androidx.datastore.core.DataStore
import okio.FileSystem
import okio.Path.Companion.toPath
import org.mifospay.shared.commonMain.proto.UserPreferences
import java.io.File

actual fun getDataStore(): DataStore<UserPreferences> {
    val dbFile = File(System.getProperty("java.io.tmpdir"), DATA_STORE_FILE_NAME)

    return createDataStore(
        fileSystem = FileSystem.SYSTEM,
        producePath = { dbFile.absolutePath.toPath() },
    )
}