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

public class PasProcedureTypeImpl extends PascalProcedureTypeImpl implements PasProcedureType {

  public PasProcedureTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PasVisitor visitor) {
    visitor.visitProcedureType(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PasVisitor) accept((PasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PasCustomAttributeDecl> getCustomAttributeDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasCustomAttributeDecl.class);
  }

  @Override
  @Nullable
  public PasFormalParameterSection getFormalParameterSection() {
    return PsiTreeUtil.getChildOfType(this, PasFormalParameterSection.class);
  }

  @Override
  @Nullable
  public PasTypeDecl getTypeDecl() {
    return PsiTreeUtil.getChildOfType(this, PasTypeDecl.class);
  }

}
