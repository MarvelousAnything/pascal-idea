// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PasInlineConstDeclaration extends PascalInlineDeclaration {

  @Nullable
  PasConstExpression getConstExpression();

  @NotNull
  List<PasCustomAttributeDecl> getCustomAttributeDeclList();

  @Nullable
  PasNamedIdent getNamedIdent();

  @Nullable
  PasTypeDecl getTypeDecl();

}
