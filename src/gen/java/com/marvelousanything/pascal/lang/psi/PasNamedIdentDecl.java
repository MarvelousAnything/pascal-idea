// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;
import com.intellij.psi.StubBasedPsiElement;
import com.marvelousanything.pascal.lang.stub.PasIdentStub;

public interface PasNamedIdentDecl extends PascalIdentDecl, StubBasedPsiElement<PasIdentStub> {

  @Nullable
  PasEscapedIdent getEscapedIdent();

  @Nullable
  PasKeywordIdent getKeywordIdent();

}
