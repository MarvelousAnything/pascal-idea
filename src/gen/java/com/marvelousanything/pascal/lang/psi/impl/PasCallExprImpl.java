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

public class PasCallExprImpl extends PasExprImpl implements PasCallExpr {

  public PasCallExprImpl(ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull PasVisitor visitor) {
    visitor.visitCallExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PasVisitor) accept((PasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public PasArgumentList getArgumentList() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, PasArgumentList.class));
  }

  @Override
  @NotNull
  public PasExpr getExpr() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, PasExpr.class));
  }

}
