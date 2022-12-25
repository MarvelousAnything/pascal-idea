// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PasInlineVarDeclaration extends PascalVariableDeclaration, PascalInlineDeclaration {

  @NotNull
  List<PasCustomAttributeDecl> getCustomAttributeDeclList();

  @NotNull
  List<PasNamedIdent> getNamedIdentList();

  @Nullable
  PasTypeDecl getTypeDecl();

  //WARNING: getNamedIdentDeclList(...) is skipped
  //matching getNamedIdentDeclList(PasInlineVarDeclaration, ...)
  //methods are not found in PascalPsiImplUtil

}
