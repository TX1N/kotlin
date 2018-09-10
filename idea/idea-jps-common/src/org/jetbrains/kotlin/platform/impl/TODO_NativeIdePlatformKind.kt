/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.platform.impl

import org.jetbrains.kotlin.cli.common.arguments.CommonCompilerArguments
import org.jetbrains.kotlin.config.TargetPlatformVersion
import org.jetbrains.kotlin.js.resolve.JsPlatform
import org.jetbrains.kotlin.platform.IdePlatform
import org.jetbrains.kotlin.platform.IdePlatformKind

// TODO: NativeIdePlatformKind
object TODO_NativeIdePlatformKind : IdePlatformKind<TODO_NativeIdePlatformKind>() {
    override fun platformByCompilerArguments(arguments: CommonCompilerArguments): IdePlatform<TODO_NativeIdePlatformKind, TODO_NativeCompilerArguments>? {
        return if (arguments is TODO_NativeCompilerArguments) Platform
        else null
    }

    override val compilerPlatform get() = JsPlatform

    override val platforms get() = listOf(Platform)
    override val defaultPlatform get() = Platform

    override val argumentsClass get() = TODO_NativeCompilerArguments::class.java

    override val name get() = "Native"

    object Platform : IdePlatform<TODO_NativeIdePlatformKind, TODO_NativeCompilerArguments>() {
        override val kind get() = TODO_NativeIdePlatformKind
        override val version get() = TargetPlatformVersion.NoVersion
        override fun createArguments(init: TODO_NativeCompilerArguments.() -> Unit) = TODO_NativeCompilerArguments()
    }
}

// TODO: NativeIdePlatformKind
class TODO_NativeCompilerArguments : CommonCompilerArguments()