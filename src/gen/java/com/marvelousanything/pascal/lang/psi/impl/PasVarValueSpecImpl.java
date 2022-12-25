// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.marvelousanything.pascal.lang.psi.PasTypes.*;
import com.marvelousanything.pascal.lang.psi.*;

public class PasVarValueSpecImpl extends PascalPsiElementImpl implements PasVarValueSpec {

  public PasVarValueSpecImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PasVisitor visitor) {
    visitor.visitVarValueSpec(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PasVisitor) accept((PasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PasConstExpression getConstExpression() {
    return PsiTreeUtil.getChildOfType(this, PasConstExpression.class);
  }

  @Override
  @Nullable
  public PasFullyQualifiedIdent getFullyQualifiedIdent() {
    return PsiTreeUtil.getChildOfType(this, PasFullyQualifiedIdent.class);
  }

}
