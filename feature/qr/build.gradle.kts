/*
 * Copyright 2024 Mifos Initiative
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 *
 * See https://github.com/openMF/mobile-wallet/blob/master/LICENSE.md
 */
plugins {
    alias(libs.plugins.mifospay.android.feature)
    alias(libs.plugins.mifospay.android.library.compose)
}

android {
    namespace = "org.mifospay.feature.qr"
}

dependencies {
    implementation(libs.zxing)
    implementation(libs.androidx.camera.view)
    implementation(libs.androidx.camera.lifecycle)
    // TODO:: this should be removed
    implementation("com.google.guava:guava:27.0.1-android")
}