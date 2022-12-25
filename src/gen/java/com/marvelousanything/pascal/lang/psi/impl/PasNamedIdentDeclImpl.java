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
import com.marvelousanything.pascal.lang.stub.PasIdentStub;

public class PasNamedIdentDeclImpl extends PascalIdentDeclImpl implements PasNamedIdentDecl {

  public PasNamedIdentDeclImpl(ASTNode node) {
    super(node);
  }

  public PasNamedIdentDeclImpl(PasIdentStub stub, IStubElementType stubType) {
    super(stub, stubType);
  }

  public void accept(@NotNull PasVisitor visitor) {
    visitor.visitNamedIdentDecl(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PasVisitor) accept((PasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public PasEscapedIdent getEscapedIdent() {
    return PsiTreeUtil.getChildOfType(this, PasEscapedIdent.class);
  }

  @Override
  @Nullable
  public PasKeywordIdent getKeywordIdent() {
    return PsiTreeUtil.getChildOfType(this, PasKeywordIdent.class);
  }

}
