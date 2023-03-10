// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PasVarDeclaration extends PascalVariableDeclaration {

  @NotNull
  List<PasCustomAttributeDecl> getCustomAttributeDeclList();

  @NotNull
  List<PasNamedIdentDecl> getNamedIdentDeclList();

  @NotNull
  List<PasStringFactor> getStringFactorList();

  @Nullable
  PasTypeDecl getTypeDecl();

  @Nullable
  PasVarValueSpec getVarValueSpec();

}
