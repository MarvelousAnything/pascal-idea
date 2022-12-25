// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PasTypeDeclaration extends PascalPsiElement {

  @Nullable
  PasConstExpression getConstExpression();

  @NotNull
  List<PasCustomAttributeDecl> getCustomAttributeDeclList();

  @NotNull
  PasGenericTypeIdent getGenericTypeIdent();

  @NotNull
  List<PasStringFactor> getStringFactorList();

  @Nullable
  PasTypeDecl getTypeDecl();

}
