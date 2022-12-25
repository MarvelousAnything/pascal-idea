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

public class PasUnaryExprImpl extends PasExprImpl implements PasUnaryExpr {

  public PasUnaryExprImpl(ASTNode node) {
    super(node);
  }

  @Override
  public void accept(@NotNull PasVisitor visitor) {
    visitor.visitUnaryExpr(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PasVisitor) accept((PasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PasExpr getExpr() {
    return PsiTreeUtil.getChildOfType(this, PasExpr.class);
  }

  @Override
  @NotNull
  public PasUnaryOp getUnaryOp() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, PasUnaryOp.class));
  }

}
