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
import com.intellij.psi.stubs.IStubElementType;
import com.marvelousanything.pascal.lang.stub.struct.PasObjectDeclStub;

public class PasObjectDeclImpl extends PascalObjectDeclImpl implements PasObjectDecl {

  public PasObjectDeclImpl(ASTNode node) {
    super(node);
  }

  public PasObjectDeclImpl(PasObjectDeclStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull PasVisitor visitor) {
    visitor.visitObjectDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PasVisitor) accept((PasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PasClassField> getClassFieldList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasClassField.class);
  }

  @Override
  @NotNull
  public List<PasClassMethodResolution> getClassMethodResolutionList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasClassMethodResolution.class);
  }

  @Override
  @Nullable
  public PasClassParent getClassParent() {
    return PsiTreeUtil.getChildOfType(this, PasClassParent.class);
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
  public List<PasExportedRoutine> getExportedRoutineList() {
    return PsiTreeUtil.getStubChildrenOfTypeAsList(this, PasExportedRoutine.class);
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

  @Override
  @NotNull
  public List<PasVisibility> getVisibilityList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasVisibility.class);
  }

}
