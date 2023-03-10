// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PasBlockLocalWONested extends PascalPsiElement {

  @Nullable
  PasBlockBody getBlockBody();

  @NotNull
  List<PasClassProperty> getClassPropertyList();

  @NotNull
  List<PasConstSection> getConstSectionList();

  @NotNull
  List<PasLabelDeclSection> getLabelDeclSectionList();

  @NotNull
  List<PasTypeSection> getTypeSectionList();

  @NotNull
  List<PasVarSection> getVarSectionList();

}
