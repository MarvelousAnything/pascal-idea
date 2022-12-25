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

public class PasIfStatementImpl extends PasStatementImpl implements PasIfStatement {

  public PasIfStatementImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PasVisitor visitor) {
    visitor.visitIfStatement(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PasVisitor) accept((PasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PasExpression getExpression() {
    return PsiTreeUtil.getChildOfType(this, PasExpression.class);
  }

  @Override
  @Nullable
  public PasIfElseStatement getIfElseStatement() {
    return PsiTreeUtil.getChildOfType(this, PasIfElseStatement.class);
  }

  @Override
  @Nullable
  public PasIfThenStatement getIfThenStatement() {
    return PsiTreeUtil.getChildOfType(this, PasIfThenStatement.class);
  }

}
