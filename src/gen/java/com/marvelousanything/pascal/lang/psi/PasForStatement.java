// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface PasForStatement extends PasStatement {

  @Nullable
  PasExpression getExpression();

  @Nullable
  PasForInlineDeclaration getForInlineDeclaration();

  @Nullable
  PasFromExpression getFromExpression();

  @Nullable
  PasFullyQualifiedIdent getFullyQualifiedIdent();

  @Nullable
  PasStatement getStatement();

}
