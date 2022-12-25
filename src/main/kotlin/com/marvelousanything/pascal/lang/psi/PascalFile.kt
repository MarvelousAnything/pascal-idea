package com.marvelousanything.pascal.lang.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.marvelousanything.pascal.lang.PascalLanguage

class PascalFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, PascalLanguage) {
    override fun getFileType(): FileType {
        TODO("Not yet implemented")
    }
}