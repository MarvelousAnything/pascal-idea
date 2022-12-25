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

public class PasExportsSectionImpl extends PascalPsiElementImpl implements PasExportsSection {

  public PasExportsSectionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PasVisitor visitor) {
    visitor.visitExportsSection(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PasVisitor) accept((PasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PasExpression> getExpressionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasExpression.class);
  }

  @Override
  @NotNull
  public List<PasFormalParameterSection> getFormalParameterSectionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasFormalParameterSection.class);
  }

  @Override
  @NotNull
  public List<PasRefNamedIdent> getRefNamedIdentList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasRefNamedIdent.class);
  }

}
