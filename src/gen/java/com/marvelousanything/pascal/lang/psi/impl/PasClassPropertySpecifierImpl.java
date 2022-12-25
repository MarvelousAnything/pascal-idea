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

public class PasClassPropertySpecifierImpl extends PascalPsiElementImpl implements PasClassPropertySpecifier {

  public PasClassPropertySpecifierImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PasVisitor visitor) {
    visitor.visitClassPropertySpecifier(this);
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
  public PasRefNamedIdent getRefNamedIdent() {
    return PsiTreeUtil.getChildOfType(this, PasRefNamedIdent.class);
  }

  @Override
  @Nullable
  public PasTypeID getTypeID() {
    return PsiTreeUtil.getChildOfType(this, PasTypeID.class);
  }

}
