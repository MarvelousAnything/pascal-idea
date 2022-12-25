package com.marvelousanything.pascal.lang.psi.impl

import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.PsiReference
import com.intellij.psi.util.PsiTreeUtil
import com.marvelousanything.pascal.lang.psi.PascalFile
import com.marvelousanything.pascal.lang.psi.PasModule

object PascalPsiImplUtil {
    private val LOG = Logger.getInstance(PascalPsiImplUtil::class.java)
    fun getReferences(o: PasModule): Array<PsiReference> {
        val file = PsiTreeUtil.getParentOfType(o, PascalFile::class.java) ?: return PsiReference.EMPTY_ARRAY
        return arrayOf()
    }
}