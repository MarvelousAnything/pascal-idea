// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PasClassQualifiedIdent extends PascalQualifiedIdent, PascalNamedElement {

  @NotNull
  List<PasGenericPostfix> getGenericPostfixList();

  @NotNull
  List<PasSubIdent> getSubIdentList();

}
