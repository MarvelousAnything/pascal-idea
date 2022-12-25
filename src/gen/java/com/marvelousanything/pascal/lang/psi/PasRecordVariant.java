// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PasRecordVariant extends PascalPsiElement {

  @NotNull
  List<PasClassField> getClassFieldList();

  @NotNull
  List<PasConstExpressionOrd> getConstExpressionOrdList();

  @Nullable
  PasNamedIdentDecl getNamedIdentDecl();

  @NotNull
  List<PasRecordVariant> getRecordVariantList();

  @Nullable
  PasTypeDecl getTypeDecl();

}
