// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.marvelousanything.pascal.lang.stub.PasExportedRoutineStub;

public interface PasExportedRoutine extends PascalExportedRoutine, PasDeclSection, PascalRoutine, StubBasedPsiElement<PasExportedRoutineStub> {

  @Nullable
  PasClassQualifiedIdent getClassQualifiedIdent();

  @NotNull
  List<PasConstrainedTypeParam> getConstrainedTypeParamList();

  @NotNull
  List<PasCustomAttributeDecl> getCustomAttributeDeclList();

  @Nullable
  PasExternalDirective getExternalDirective();

  @Nullable
  PasFormalParameterSection getFormalParameterSection();

  @NotNull
  List<PasFunctionDirective> getFunctionDirectiveList();

  @Nullable
  PasNamedIdent getNamedIdent();

  @Nullable
  PasTypeDecl getTypeDecl();

}
