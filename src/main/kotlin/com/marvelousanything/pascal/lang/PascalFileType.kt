package com.marvelousanything.pascal.lang

import com.intellij.openapi.fileTypes.LanguageFileType

object PascalFileType : LanguageFileType(PascalLanguage) {
    override fun getName() = "Pascal file"

    override fun getDescription() = "Pascal language file"

    override fun getDefaultExtension() = "pas"

    override fun getIcon() = PascalIcons.UNIT
}