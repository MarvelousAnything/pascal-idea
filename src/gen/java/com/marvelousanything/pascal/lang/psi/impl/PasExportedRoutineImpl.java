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
import com.marvelousanything.pascal.lang.stub.PasExportedRoutineStub;

public class PasExportedRoutineImpl extends PascalExportedRoutineImpl implements PasExportedRoutine {

  public PasExportedRoutineImpl(ASTNode node) {
    super(node);
  }

  public PasExportedRoutineImpl(PasExportedRoutineStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull PasVisitor visitor) {
    visitor.visitExportedRoutine(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PasVisitor) accept((PasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PasClassQualifiedIdent getClassQualifiedIdent() {
    return PsiTreeUtil.getChildOfType(this, PasClassQualifiedIdent.class);
  }

  @Override
  @NotNull
  public List<PasConstrainedTypeParam> getConstrainedTypeParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasConstrainedTypeParam.class);
  }

  @Override
  @NotNull
  public List<PasCustomAttributeDecl> getCustomAttributeDeclList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasCustomAttributeDecl.class);
  }

  @Override
  @Nullable
  public PasExternalDirective getExternalDirective() {
    return PsiTreeUtil.getChildOfType(this, PasExternalDirective.class);
  }

  @Override
  @Nullable
  public PasFormalParameterSection getFormalParameterSection() {
    return PsiTreeUtil.getChildOfType(this, PasFormalParameterSection.class);
  }

  @Override
  @NotNull
  public List<PasFunctionDirective> getFunctionDirectiveList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasFunctionDirective.class);
  }

  @Override
  @Nullable
  public PasNamedIdent getNamedIdent() {
    return PsiTreeUtil.getChildOfType(this, PasNamedIdent.class);
  }

  @Override
  @Nullable
  public PasTypeDecl getTypeDecl() {
    return PsiTreeUtil.getChildOfType(this, PasTypeDecl.class);
  }

}
