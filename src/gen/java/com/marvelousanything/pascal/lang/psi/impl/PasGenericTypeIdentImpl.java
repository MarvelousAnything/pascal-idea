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

public class PasGenericTypeIdentImpl extends PascalNamedElementImpl implements PasGenericTypeIdent {

  public PasGenericTypeIdentImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PasVisitor visitor) {
    visitor.visitGenericTypeIdent(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof PasVisitor) accept((PasVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<PasConstrainedTypeParam> getConstrainedTypeParamList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, PasConstrainedTypeParam.class);
  }

  @Override
  @NotNull
  public PasNamedIdentDecl getNamedIdentDecl() {
    return notNullChild(PsiTreeUtil.getChildOfType(this, PasNamedIdentDecl.class));
  }

}
