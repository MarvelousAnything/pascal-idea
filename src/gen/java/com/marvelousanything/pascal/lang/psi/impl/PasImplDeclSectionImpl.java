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

public class PasImplDeclSectionImpl extends PascalPsiElementImpl implements PasImplDeclSection {

  public PasImplDeclSectionImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PasVisitor visitor) {
    visitor.visitImplDeclSection(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PasVisitor) accept((PasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PasClassProperty> getClassPropertyList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasClassProperty.class);
  }

  @Override
  @NotNull
  public List<PasConstSection> getConstSectionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasConstSection.class);
  }

  @Override
  @NotNull
  public List<PasCustomAttributeDecl> getCustomAttributeDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasCustomAttributeDecl.class);
  }

  @Override
  @NotNull
  public List<PasExportsSection> getExportsSectionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasExportsSection.class);
  }

  @Override
  @NotNull
  public List<PasLabelDeclSection> getLabelDeclSectionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasLabelDeclSection.class);
  }

  @Override
  @NotNull
  public List<PasRoutineImplDecl> getRoutineImplDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasRoutineImplDecl.class);
  }

  @Override
  @NotNull
  public List<PasTypeSection> getTypeSectionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasTypeSection.class);
  }

  @Override
  @NotNull
  public List<PasVarSection> getVarSectionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasVarSection.class);
  }

}
