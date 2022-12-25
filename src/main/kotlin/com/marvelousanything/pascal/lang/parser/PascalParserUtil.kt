package com.marvelousanything.pascal.lang.parser

import com.intellij.lang.PsiBuilder
import com.intellij.lang.parser.GeneratedParserUtilBase
import com.intellij.openapi.diagnostic.Logger
import com.intellij.psi.PsiElement
import com.intellij.psi.impl.source.resolve.FileContextUtil

object PascalParserUtil : GeneratedParserUtilBase() {
    private val LOG = Logger.getInstance(PascalParserUtil::class.java)
    private const val UNIT_NAME_SYSTEM = "system"
    val EXPLICIT_UNITS = listOf(UNIT_NAME_SYSTEM, )
    const val MAX_STRUCT_TYPE_RESOLVE_RECURSION = 1000

    fun parsePascal(builder: PsiBuilder, level: Int, parser: Parser): Boolean {
        val file = builder.getUserData(FileContextUtil.CONTAINING_FILE_KEY)
        val state = ErrorState.get(builder)
        return parseAsTree(state, builder, level, DUMMY_BLOCK, true, parser, TRUE_CONDITION)
    }

}