// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.marvelousanything.pascal.lang.stub.struct.PasRecordDeclStub;

public interface PasRecordDecl extends PascalRecordDecl, StubBasedPsiElement<PasRecordDeclStub> {

  @NotNull
  List<PasClassField> getClassFieldList();

  @NotNull
  List<PasClassMethodResolution> getClassMethodResolutionList();

  @Nullable
  PasClassParent getClassParent();

  @NotNull
  List<PasClassProperty> getClassPropertyList();

  @NotNull
  List<PasConstSection> getConstSectionList();

  @NotNull
  List<PasExportedRoutine> getExportedRoutineList();

  @Nullable
  PasNamedIdentDecl getNamedIdentDecl();

  @NotNull
  List<PasRecordVariant> getRecordVariantList();

  @Nullable
  PasTypeDecl getTypeDecl();

  @NotNull
  List<PasTypeSection> getTypeSectionList();

  @NotNull
  List<PasVarSection> getVarSectionList();

  @NotNull
  List<PasVisibility> getVisibilityList();

}
