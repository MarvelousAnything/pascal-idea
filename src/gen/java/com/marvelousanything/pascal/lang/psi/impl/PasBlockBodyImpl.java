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

public class PasBlockBodyImpl extends PascalPsiElementImpl implements PasBlockBody {

  public PasBlockBodyImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PasVisitor visitor) {
    visitor.visitBlockBody(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PasVisitor) accept((PasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PasAssemblerStatement getAssemblerStatement() {
    return PsiTreeUtil.getChildOfType(this, PasAssemblerStatement.class);
  }

  @Override
  @Nullable
  public PasCompoundStatement getCompoundStatement() {
    return PsiTreeUtil.getChildOfType(this, PasCompoundStatement.class);
  }

}
