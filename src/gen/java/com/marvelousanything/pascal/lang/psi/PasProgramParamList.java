// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PasProgramParamList extends PascalPsiElement {

  @NotNull
  List<PasEscapedIdent> getEscapedIdentList();

  @NotNull
  List<PasKeywordIdent> getKeywordIdentList();

}
