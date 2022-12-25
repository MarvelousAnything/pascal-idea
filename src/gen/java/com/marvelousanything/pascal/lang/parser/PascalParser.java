// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.marvelousanything.pascal.lang.psi.PasTypes.*;
import static com.marvelousanything.pascal.lang.parser.PascalParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PascalParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    parseLight(root_, builder_);
    return builder_.getTreeBuilt();
  }

  public void parseLight(IElementType root_, PsiBuilder builder_) {
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this, EXTENDS_SETS_);
    Marker marker_ = enter_section_(builder_, 0, _COLLAPSE_, null);
    result_ = parse_root_(root_, builder_);
    exit_section_(builder_, 0, marker_, root_, result_, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType root_, PsiBuilder builder_) {
    return parse_root_(root_, builder_, 0);
  }

  static boolean parse_root_(IElementType root_, PsiBuilder builder_, int level_) {
    return parsePascal(builder_, level_ + 1, PascalParser::Module);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(CLASS_QUALIFIED_IDENT, IN_OPERATOR_QUALIFIED_IDENT),
    create_token_set_(OPERATOR_SUB_IDENT, SUB_IDENT),
    create_token_set_(CONST_EXPRESSION, CONST_EXPRESSION_ORD),
    create_token_set_(ROUTINE_IMPL_DECL, ROUTINE_IMPL_DECL_NESTED_1, ROUTINE_IMPL_DECL_WO_NESTED),
    create_token_set_(ARRAY_CONST_EXPR, CALL_EXPR, CLOSURE_EXPR, DEREFERENCE_EXPR,
      EXPR, INDEX_EXPR, LITERAL_EXPR, PAREN_EXPR,
      PRODUCT_EXPR, RECORD_CONST_EXPR, REFERENCE_EXPR, RELATIONAL_EXPR,
      SET_EXPR, SUM_EXPR, UNARY_EXPR),
  };

  /* ********************************************************** */
  // '(' [ !')' Expr [ColonConstruct]  (',' Expr [ColonConstruct]) * ] ')'
  public static boolean ArgumentList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgumentList")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARGUMENT_LIST, null);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ArgumentList_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ !')' Expr [ColonConstruct]  (',' Expr [ColonConstruct]) * ]
  private static boolean ArgumentList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgumentList_1")) return false;
    ArgumentList_1_0(builder_, level_ + 1);
    return true;
  }

  // !')' Expr [ColonConstruct]  (',' Expr [ColonConstruct]) *
  private static boolean ArgumentList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgumentList_1_0")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = ArgumentList_1_0_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, Expr(builder_, level_ + 1, -1));
    result_ = pinned_ && report_error_(builder_, ArgumentList_1_0_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && ArgumentList_1_0_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // !')'
  private static boolean ArgumentList_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgumentList_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ColonConstruct]
  private static boolean ArgumentList_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgumentList_1_0_2")) return false;
    ColonConstruct(builder_, level_ + 1);
    return true;
  }

  // (',' Expr [ColonConstruct]) *
  private static boolean ArgumentList_1_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgumentList_1_0_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ArgumentList_1_0_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ArgumentList_1_0_3", pos_)) break;
    }
    return true;
  }

  // ',' Expr [ColonConstruct]
  private static boolean ArgumentList_1_0_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgumentList_1_0_3_0")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, Expr(builder_, level_ + 1, -1));
    result_ = pinned_ && ArgumentList_1_0_3_0_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ColonConstruct]
  private static boolean ArgumentList_1_0_3_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArgumentList_1_0_3_0_2")) return false;
    ColonConstruct(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // "(" constExpr ("," constExpr)+ ")"
  public static boolean ArrayConstExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayConstExpr")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && constExpr(builder_, level_ + 1);
    result_ = result_ && ArrayConstExpr_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, ARRAY_CONST_EXPR, result_);
    return result_;
  }

  // ("," constExpr)+
  private static boolean ArrayConstExpr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayConstExpr_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ArrayConstExpr_2_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!ArrayConstExpr_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ArrayConstExpr_2", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // "," constExpr
  private static boolean ArrayConstExpr_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayConstExpr_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && constExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // SubRangeType | TypeID
  public static boolean ArrayIndex(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayIndex")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARRAY_INDEX, "<array index>");
    result_ = SubRangeType(builder_, level_ + 1);
    if (!result_) result_ = TypeID(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [PACKED | "bitpacked"] ARRAY [arrayIndexes] OF arraySubType
  public static boolean ArrayType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayType")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ARRAY_TYPE, "<array type>");
    result_ = ArrayType_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, ARRAY);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, ArrayType_2(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, OF)) && result_;
    result_ = pinned_ && arraySubType(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [PACKED | "bitpacked"]
  private static boolean ArrayType_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayType_0")) return false;
    ArrayType_0_0(builder_, level_ + 1);
    return true;
  }

  // PACKED | "bitpacked"
  private static boolean ArrayType_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayType_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PACKED);
    if (!result_) result_ = consumeToken(builder_, "bitpacked");
    return result_;
  }

  // [arrayIndexes]
  private static boolean ArrayType_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ArrayType_2")) return false;
    arrayIndexes(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ASM asmBlock END
  public static boolean AssemblerStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssemblerStatement")) return false;
    if (!nextTokenIs(builder_, ASM)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASSEMBLER_STATEMENT, null);
    result_ = consumeToken(builder_, ASM);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, asmBlock(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, END) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // ":=" | PLUS_ASSIGN | MINUS_ASSIGN | MULT_ASSIGN | DIV_ASSIGN
  public static boolean AssignOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssignOp")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASSIGN_OP, "<assign op>");
    result_ = consumeToken(builder_, ASSIGN);
    if (!result_) result_ = consumeToken(builder_, PLUS_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, MINUS_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, MULT_ASSIGN);
    if (!result_) result_ = consumeToken(builder_, DIV_ASSIGN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // AssignOp (NewStatement | Expression)
  public static boolean AssignPart(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssignPart")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ASSIGN_PART, "<assign part>");
    result_ = AssignOp(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && AssignPart_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_statement);
    return result_ || pinned_;
  }

  // NewStatement | Expression
  private static boolean AssignPart_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AssignPart_1")) return false;
    boolean result_;
    result_ = NewStatement(builder_, level_ + 1);
    if (!result_) result_ = Expression(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // Expression (COMMA Expression)*
  public static boolean AttributeParamList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AttributeParamList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ATTRIBUTE_PARAM_LIST, "<attribute param list>");
    result_ = Expression(builder_, level_ + 1);
    result_ = result_ && AttributeParamList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (COMMA Expression)*
  private static boolean AttributeParamList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AttributeParamList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!AttributeParamList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "AttributeParamList_1", pos_)) break;
    }
    return true;
  }

  // COMMA Expression
  private static boolean AttributeParamList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "AttributeParamList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CompoundStatement |	AssemblerStatement
  public static boolean BlockBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockBody")) return false;
    if (!nextTokenIs(builder_, "<block body>", ASM, BEGIN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BLOCK_BODY, "<block body>");
    result_ = CompoundStatement(builder_, level_ + 1);
    if (!result_) result_ = AssemblerStatement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // declSection* BlockBody
  public static boolean BlockGlobal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockGlobal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BLOCK_GLOBAL, "<block global>");
    result_ = BlockGlobal_0(builder_, level_ + 1);
    result_ = result_ && BlockBody(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_block_global_end);
    return result_;
  }

  // declSection*
  private static boolean BlockGlobal_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockGlobal_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!declSection(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "BlockGlobal_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [';'] declSectionNested* BlockBody
  public static boolean BlockLocal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockLocal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BLOCK_LOCAL, "<block local>");
    result_ = BlockLocal_0(builder_, level_ + 1);
    result_ = result_ && BlockLocal_1(builder_, level_ + 1);
    result_ = result_ && BlockBody(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [';']
  private static boolean BlockLocal_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockLocal_0")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  // declSectionNested*
  private static boolean BlockLocal_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockLocal_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!declSectionNested(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "BlockLocal_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [';'] declSectionNested1* BlockBody
  public static boolean BlockLocalNested1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockLocalNested1")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BLOCK_LOCAL_NESTED_1, "<block local nested 1>");
    result_ = BlockLocalNested1_0(builder_, level_ + 1);
    result_ = result_ && BlockLocalNested1_1(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && BlockBody(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [';']
  private static boolean BlockLocalNested1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockLocalNested1_0")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  // declSectionNested1*
  private static boolean BlockLocalNested1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockLocalNested1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!declSectionNested1(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "BlockLocalNested1_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [';'] declSectionWONested* BlockBody
  public static boolean BlockLocalWONested(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockLocalWONested")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, BLOCK_LOCAL_WO_NESTED, "<block local wo nested>");
    result_ = BlockLocalWONested_0(builder_, level_ + 1);
    result_ = result_ && BlockLocalWONested_1(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && BlockBody(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [';']
  private static boolean BlockLocalWONested_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockLocalWONested_0")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  // declSectionWONested*
  private static boolean BlockLocalWONested_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BlockLocalWONested_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!declSectionWONested(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "BlockLocalWONested_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // BREAK
  public static boolean BreakStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "BreakStatement")) return false;
    if (!nextTokenIs(builder_, BREAK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, BREAK);
    exit_section_(builder_, marker_, BREAK_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // ELSE statementList
  public static boolean CaseElse(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseElse")) return false;
    if (!nextTokenIs(builder_, ELSE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CASE_ELSE, null);
    result_ = consumeToken(builder_, ELSE);
    pinned_ = result_; // pin = 1
    result_ = result_ && statementList(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // caseLabel Statement [";"]
  public static boolean CaseItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseItem")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CASE_ITEM, "<case item>");
    result_ = caseLabel(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, Statement(builder_, level_ + 1));
    result_ = pinned_ && CaseItem_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_caseItem);
    return result_ || pinned_;
  }

  // [";"]
  private static boolean CaseItem_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseItem_2")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  /* ********************************************************** */
  // caseBody [CaseElse] END
  public static boolean CaseStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseStatement")) return false;
    if (!nextTokenIs(builder_, CASE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = caseBody(builder_, level_ + 1);
    result_ = result_ && CaseStatement_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, CASE_STATEMENT, result_);
    return result_;
  }

  // [CaseElse]
  private static boolean CaseStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CaseStatement_1")) return false;
    CaseElse(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // field
  public static boolean ClassField(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassField")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_FIELD, "<class field>");
    result_ = field(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // CLASS HELPER classHelperBody END
  public static boolean ClassHelperDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassHelperDecl")) return false;
    if (!nextTokenIs(builder_, "<class helper declaration>", CLASS)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_HELPER_DECL, "<class helper declaration>");
    result_ = consumeTokens(builder_, 2, CLASS, HELPER);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, classHelperBody(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, END) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // [CLASS] procKey GenericTypeIdent "." identifier "=" RefNamedIdent ";"
  public static boolean ClassMethodResolution(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassMethodResolution")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_METHOD_RESOLUTION, "<class method resolution>");
    result_ = ClassMethodResolution_0(builder_, level_ + 1);
    result_ = result_ && procKey(builder_, level_ + 1);
    result_ = result_ && GenericTypeIdent(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    result_ = result_ && identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, EQ);
    result_ = result_ && RefNamedIdent(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [CLASS]
  private static boolean ClassMethodResolution_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassMethodResolution_0")) return false;
    consumeToken(builder_, CLASS);
    return true;
  }

  /* ********************************************************** */
  // "(" TypeID? classParentRest ")"
  public static boolean ClassParent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassParent")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_PARENT, null);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ClassParent_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, classParentRest(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // TypeID?
  private static boolean ClassParent_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassParent_1")) return false;
    TypeID(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // customAttributes* [CLASS] PROPERTY NamedIdentDecl [ClassPropertyArray] [":" TypeID] [ClassPropertyIndex] ClassPropertySpecifier* ";" [DEFAULT] hintingDirective* [";"]
  public static boolean ClassProperty(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassProperty")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_PROPERTY, "<class property>");
    result_ = ClassProperty_0(builder_, level_ + 1);
    result_ = result_ && ClassProperty_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PROPERTY);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, NamedIdentDecl(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, ClassProperty_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, ClassProperty_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, ClassProperty_6(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, ClassProperty_7(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, SEMI)) && result_;
    result_ = pinned_ && report_error_(builder_, ClassProperty_9(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, ClassProperty_10(builder_, level_ + 1)) && result_;
    result_ = pinned_ && ClassProperty_11(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_routine_decl);
    return result_ || pinned_;
  }

  // customAttributes*
  private static boolean ClassProperty_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassProperty_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!customAttributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ClassProperty_0", pos_)) break;
    }
    return true;
  }

  // [CLASS]
  private static boolean ClassProperty_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassProperty_1")) return false;
    consumeToken(builder_, CLASS);
    return true;
  }

  // [ClassPropertyArray]
  private static boolean ClassProperty_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassProperty_4")) return false;
    ClassPropertyArray(builder_, level_ + 1);
    return true;
  }

  // [":" TypeID]
  private static boolean ClassProperty_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassProperty_5")) return false;
    ClassProperty_5_0(builder_, level_ + 1);
    return true;
  }

  // ":" TypeID
  private static boolean ClassProperty_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassProperty_5_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && TypeID(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ClassPropertyIndex]
  private static boolean ClassProperty_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassProperty_6")) return false;
    ClassPropertyIndex(builder_, level_ + 1);
    return true;
  }

  // ClassPropertySpecifier*
  private static boolean ClassProperty_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassProperty_7")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ClassPropertySpecifier(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ClassProperty_7", pos_)) break;
    }
    return true;
  }

  // [DEFAULT]
  private static boolean ClassProperty_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassProperty_9")) return false;
    consumeToken(builder_, DEFAULT);
    return true;
  }

  // hintingDirective*
  private static boolean ClassProperty_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassProperty_10")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!hintingDirective(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ClassProperty_10", pos_)) break;
    }
    return true;
  }

  // [";"]
  private static boolean ClassProperty_11(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassProperty_11")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  /* ********************************************************** */
  // "[" formalParameterList "]"
  public static boolean ClassPropertyArray(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassPropertyArray")) return false;
    if (!nextTokenIs(builder_, LBRACK)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_PROPERTY_ARRAY, null);
    result_ = consumeToken(builder_, LBRACK);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, formalParameterList(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RBRACK) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // INDEX ConstExpressionOrd
  public static boolean ClassPropertyIndex(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassPropertyIndex")) return false;
    if (!nextTokenIs(builder_, INDEX)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_PROPERTY_INDEX, null);
    result_ = consumeToken(builder_, INDEX);
    pinned_ = result_; // pin = 1
    result_ = result_ && ConstExpressionOrd(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // classPropertyReadWrite | classPropertyDispInterface | "stored" Expression
  //                          | DEFAULT Expression | "nodefault" | IMPLEMENTS TypeID
  public static boolean ClassPropertySpecifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassPropertySpecifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_PROPERTY_SPECIFIER, "<class property specifier>");
    result_ = classPropertyReadWrite(builder_, level_ + 1);
    if (!result_) result_ = classPropertyDispInterface(builder_, level_ + 1);
    if (!result_) result_ = ClassPropertySpecifier_2(builder_, level_ + 1);
    if (!result_) result_ = ClassPropertySpecifier_3(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, "nodefault");
    if (!result_) result_ = ClassPropertySpecifier_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_propspec);
    return result_;
  }

  // "stored" Expression
  private static boolean ClassPropertySpecifier_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassPropertySpecifier_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "stored");
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DEFAULT Expression
  private static boolean ClassPropertySpecifier_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassPropertySpecifier_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DEFAULT);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // IMPLEMENTS TypeID
  private static boolean ClassPropertySpecifier_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassPropertySpecifier_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IMPLEMENTS);
    result_ = result_ && TypeID(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (SubIdent [GenericPostfix] ".")+ SubIdent
  public static boolean ClassQualifiedIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassQualifiedIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_QUALIFIED_IDENT, "<Identifier>");
    result_ = ClassQualifiedIdent_0(builder_, level_ + 1);
    result_ = result_ && SubIdent(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (SubIdent [GenericPostfix] ".")+
  private static boolean ClassQualifiedIdent_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassQualifiedIdent_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ClassQualifiedIdent_0_0(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!ClassQualifiedIdent_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ClassQualifiedIdent_0", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // SubIdent [GenericPostfix] "."
  private static boolean ClassQualifiedIdent_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassQualifiedIdent_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = SubIdent(builder_, level_ + 1);
    result_ = result_ && ClassQualifiedIdent_0_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [GenericPostfix]
  private static boolean ClassQualifiedIdent_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassQualifiedIdent_0_0_1")) return false;
    GenericPostfix(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // SEALED | ABSTRACT
  public static boolean ClassState(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassState")) return false;
    if (!nextTokenIs(builder_, "<class state>", ABSTRACT, SEALED)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_STATE, "<class state>");
    result_ = consumeToken(builder_, SEALED);
    if (!result_) result_ = consumeToken(builder_, ABSTRACT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [PACKED] classDecl
  public static boolean ClassTypeDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassTypeDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_TYPE_DECL, "<class declaration>");
    result_ = ClassTypeDecl_0(builder_, level_ + 1);
    result_ = result_ && classDecl(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [PACKED]
  private static boolean ClassTypeDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassTypeDecl_0")) return false;
    consumeToken(builder_, PACKED);
    return true;
  }

  /* ********************************************************** */
  // CLASS OF TypeID
  public static boolean ClassTypeTypeDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClassTypeTypeDecl")) return false;
    if (!nextTokenIs(builder_, "<metaclass declaration>", CLASS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLASS_TYPE_TYPE_DECL, "<metaclass declaration>");
    result_ = consumeTokens(builder_, 0, CLASS, OF);
    result_ = result_ && TypeID(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // (funcHeading | procHeading) BlockLocal
  public static boolean ClosureRoutine(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClosureRoutine")) return false;
    if (!nextTokenIs(builder_, "<closure routine>", FUNCTION, PROCEDURE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLOSURE_ROUTINE, "<closure routine>");
    result_ = ClosureRoutine_0(builder_, level_ + 1);
    result_ = result_ && BlockLocal(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // funcHeading | procHeading
  private static boolean ClosureRoutine_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClosureRoutine_0")) return false;
    boolean result_;
    result_ = funcHeading(builder_, level_ + 1);
    if (!result_) result_ = procHeading(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // ':' Expr [':' Expr]
  public static boolean ColonConstruct(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ColonConstruct")) return false;
    if (!nextTokenIs(builder_, COLON)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && Expr(builder_, level_ + 1, -1);
    result_ = result_ && ColonConstruct_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, COLON_CONSTRUCT, result_);
    return result_;
  }

  // [':' Expr]
  private static boolean ColonConstruct_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ColonConstruct_2")) return false;
    ColonConstruct_2_0(builder_, level_ + 1);
    return true;
  }

  // ':' Expr
  private static boolean ColonConstruct_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ColonConstruct_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && Expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // BEGIN statementBlock END
  public static boolean CompoundStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CompoundStatement")) return false;
    if (!nextTokenIs(builder_, BEGIN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, COMPOUND_STATEMENT, null);
    result_ = consumeToken(builder_, BEGIN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, statementBlock(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, END) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // customAttributes* NamedIdentDecl [":" TypeDecl] "=" ConstExpression hintingDirective* ";"
  public static boolean ConstDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstDeclaration")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONST_DECLARATION, "<const declaration>");
    result_ = ConstDeclaration_0(builder_, level_ + 1);
    result_ = result_ && NamedIdentDecl(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, ConstDeclaration_2(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, EQ)) && result_;
    result_ = pinned_ && report_error_(builder_, ConstExpression(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, ConstDeclaration_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_name);
    return result_ || pinned_;
  }

  // customAttributes*
  private static boolean ConstDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstDeclaration_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!customAttributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ConstDeclaration_0", pos_)) break;
    }
    return true;
  }

  // [":" TypeDecl]
  private static boolean ConstDeclaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstDeclaration_2")) return false;
    ConstDeclaration_2_0(builder_, level_ + 1);
    return true;
  }

  // ":" TypeDecl
  private static boolean ConstDeclaration_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstDeclaration_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && TypeDecl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // hintingDirective*
  private static boolean ConstDeclaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstDeclaration_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!hintingDirective(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ConstDeclaration_5", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // constExpr
  public static boolean ConstExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONST_EXPRESSION, "<constant expression>");
    result_ = constExpr(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_expr_colon);
    return result_;
  }

  /* ********************************************************** */
  // expressionOrd
  public static boolean ConstExpressionOrd(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstExpressionOrd")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONST_EXPRESSION_ORD, "<integer constant expression>");
    result_ = expressionOrd(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // constKey constDeclarations [";"]
  public static boolean ConstSection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstSection")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONST_SECTION, "<const section>");
    result_ = constKey(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, constDeclarations(builder_, level_ + 1));
    result_ = pinned_ && ConstSection_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_decl_section);
    return result_ || pinned_;
  }

  // [";"]
  private static boolean ConstSection_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstSection_2")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  /* ********************************************************** */
  // typeParamIdentList [ ":" genericConstraintList]
  public static boolean ConstrainedTypeParam(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstrainedTypeParam")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONSTRAINED_TYPE_PARAM, "<constrained type param>");
    result_ = typeParamIdentList(builder_, level_ + 1);
    result_ = result_ && ConstrainedTypeParam_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ ":" genericConstraintList]
  private static boolean ConstrainedTypeParam_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstrainedTypeParam_1")) return false;
    ConstrainedTypeParam_1_0(builder_, level_ + 1);
    return true;
  }

  // ":" genericConstraintList
  private static boolean ConstrainedTypeParam_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ConstrainedTypeParam_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && genericConstraintList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONTAINS namespaceNameList ";"
  public static boolean ContainsClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContainsClause")) return false;
    if (!nextTokenIs(builder_, CONTAINS)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CONTAINS_CLAUSE, null);
    result_ = consumeToken(builder_, CONTAINS);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, namespaceNameList(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // CONTINUE
  public static boolean ContinueStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ContinueStatement")) return false;
    if (!nextTokenIs(builder_, CONTINUE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, CONTINUE);
    exit_section_(builder_, marker_, CONTINUE_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // FullyQualifiedIdent [LPAREN AttributeParamList RPAREN]
  public static boolean CustomAttributeDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CustomAttributeDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CUSTOM_ATTRIBUTE_DECL, "<custom attribute decl>");
    result_ = FullyQualifiedIdent(builder_, level_ + 1);
    result_ = result_ && CustomAttributeDecl_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_attr);
    return result_;
  }

  // [LPAREN AttributeParamList RPAREN]
  private static boolean CustomAttributeDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CustomAttributeDecl_1")) return false;
    CustomAttributeDecl_1_0(builder_, level_ + 1);
    return true;
  }

  // LPAREN AttributeParamList RPAREN
  private static boolean CustomAttributeDecl_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CustomAttributeDecl_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && AttributeParamList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CustomAttributeDecl (COMMA CustomAttributeDecl)*
  static boolean CustomAttributeList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CustomAttributeList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = CustomAttributeDecl(builder_, level_ + 1);
    result_ = result_ && CustomAttributeList_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_attr2);
    return result_;
  }

  // (COMMA CustomAttributeDecl)*
  private static boolean CustomAttributeList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CustomAttributeList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!CustomAttributeList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "CustomAttributeList_1", pos_)) break;
    }
    return true;
  }

  // COMMA CustomAttributeDecl
  private static boolean CustomAttributeList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "CustomAttributeList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && CustomAttributeDecl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // "(" enumEl enumRest* ")"
  public static boolean EnumType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumType")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ENUM_TYPE, null);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, enumEl(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, EnumType_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // enumRest*
  private static boolean EnumType_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EnumType_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!enumRest(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "EnumType_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PROGRAM_ | UNIT_ | LIBRARY_ | INTERFACE_ | IMPLEMENTATION_ | INITIALIZATION_ | FINALIZATION_
  //                               | EXPORTS_ | USES_ | VAR_ | CONST_ | TYPE_ | THREADVAR_ | RESOURCESTRING_ | CONSTREF_ | ABSOLUTE_
  //                               | PROCEDURE_ | FUNCTION_ | OPERATOR_ | CONSTRUCTOR_ | DESTRUCTOR_ | STRICT_ | PRIVATE_ | PROTECTED_ | PUBLIC_ | PUBLISHED_
  //                               | ARRAY_ | RECORD_ | SET_ | FILE_ | OBJECT_ | CLASS_ | OF_ | PROPERTY_ | LABEL_
  //                               | TRY_ | RAISE_ | EXCEPT_ | FINALLY_ | ON_ | GOTO_
  //                               | FOR_ | TO_ | DOWNTO_ | REPEAT_ | UNTIL_ | WHILE_ | DO_ | WITH_ | BEGIN_ | END_ | IF_ | THEN_ | ELSE_ | CASE_
  //                               | NIL_ | FALSE_ | TRUE_ | ASM_ | INHERITED_
  //                               | AND_ | OR_ | XOR_ | NOT_ | SHL_ | SHR_ | DIV_ | MOD_ | IN_ | AS_ | IS_
  //                               | INLINE_
  // 
  //                               | OUT_ | SELF_ | NEW_
  //                               | EXIT_ | BREAK_ | CONTINUE_
  //                               | VIRTUAL_ | DYNAMIC_ | ABSTRACT_ | OVERLOAD_ | OVERRIDE_ | REINTRODUCE_ | MESSAGE_ | STATIC_ | SEALED_ | FINAL_ | ASSEMBLER_
  //                               | CDECL_ | PASCAL_ | REGISTER_ | SAFECALL_ | STDCALL_ | EXPORT_
  //                               | AUTOMATED_ | DISPID_ | EXTERNAL_ | FORWARD_ | HELPER_ | IMPLEMENTS_
  //                               | DEFAULT_ | INDEX_ | READ_ | WRITE_ | DEPRECATED_ | EXPERIMENTAL_ | PLATFORM_ | REFERENCE_
  //                               | PACKAGE_ | CONTAINS_ | REQUIRES_
  // 
  //                               | NAME_
  public static boolean EscapedIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "EscapedIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ESCAPED_IDENT, "<Identifier>");
    result_ = consumeToken(builder_, PROGRAM_);
    if (!result_) result_ = consumeToken(builder_, UNIT_);
    if (!result_) result_ = consumeToken(builder_, LIBRARY_);
    if (!result_) result_ = consumeToken(builder_, INTERFACE_);
    if (!result_) result_ = consumeToken(builder_, IMPLEMENTATION_);
    if (!result_) result_ = consumeToken(builder_, INITIALIZATION_);
    if (!result_) result_ = consumeToken(builder_, FINALIZATION_);
    if (!result_) result_ = consumeToken(builder_, EXPORTS_);
    if (!result_) result_ = consumeToken(builder_, USES_);
    if (!result_) result_ = consumeToken(builder_, VAR_);
    if (!result_) result_ = consumeToken(builder_, CONST_);
    if (!result_) result_ = consumeToken(builder_, TYPE_);
    if (!result_) result_ = consumeToken(builder_, THREADVAR_);
    if (!result_) result_ = consumeToken(builder_, RESOURCESTRING_);
    if (!result_) result_ = consumeToken(builder_, CONSTREF_);
    if (!result_) result_ = consumeToken(builder_, ABSOLUTE_);
    if (!result_) result_ = consumeToken(builder_, PROCEDURE_);
    if (!result_) result_ = consumeToken(builder_, FUNCTION_);
    if (!result_) result_ = consumeToken(builder_, OPERATOR_);
    if (!result_) result_ = consumeToken(builder_, CONSTRUCTOR_);
    if (!result_) result_ = consumeToken(builder_, DESTRUCTOR_);
    if (!result_) result_ = consumeToken(builder_, STRICT_);
    if (!result_) result_ = consumeToken(builder_, PRIVATE_);
    if (!result_) result_ = consumeToken(builder_, PROTECTED_);
    if (!result_) result_ = consumeToken(builder_, PUBLIC_);
    if (!result_) result_ = consumeToken(builder_, PUBLISHED_);
    if (!result_) result_ = consumeToken(builder_, ARRAY_);
    if (!result_) result_ = consumeToken(builder_, RECORD_);
    if (!result_) result_ = consumeToken(builder_, SET_);
    if (!result_) result_ = consumeToken(builder_, FILE_);
    if (!result_) result_ = consumeToken(builder_, OBJECT_);
    if (!result_) result_ = consumeToken(builder_, CLASS_);
    if (!result_) result_ = consumeToken(builder_, OF_);
    if (!result_) result_ = consumeToken(builder_, PROPERTY_);
    if (!result_) result_ = consumeToken(builder_, LABEL_);
    if (!result_) result_ = consumeToken(builder_, TRY_);
    if (!result_) result_ = consumeToken(builder_, RAISE_);
    if (!result_) result_ = consumeToken(builder_, EXCEPT_);
    if (!result_) result_ = consumeToken(builder_, FINALLY_);
    if (!result_) result_ = consumeToken(builder_, ON_);
    if (!result_) result_ = consumeToken(builder_, GOTO_);
    if (!result_) result_ = consumeToken(builder_, FOR_);
    if (!result_) result_ = consumeToken(builder_, TO_);
    if (!result_) result_ = consumeToken(builder_, DOWNTO_);
    if (!result_) result_ = consumeToken(builder_, REPEAT_);
    if (!result_) result_ = consumeToken(builder_, UNTIL_);
    if (!result_) result_ = consumeToken(builder_, WHILE_);
    if (!result_) result_ = consumeToken(builder_, DO_);
    if (!result_) result_ = consumeToken(builder_, WITH_);
    if (!result_) result_ = consumeToken(builder_, BEGIN_);
    if (!result_) result_ = consumeToken(builder_, END_);
    if (!result_) result_ = consumeToken(builder_, IF_);
    if (!result_) result_ = consumeToken(builder_, THEN_);
    if (!result_) result_ = consumeToken(builder_, ELSE_);
    if (!result_) result_ = consumeToken(builder_, CASE_);
    if (!result_) result_ = consumeToken(builder_, NIL_);
    if (!result_) result_ = consumeToken(builder_, FALSE_);
    if (!result_) result_ = consumeToken(builder_, TRUE_);
    if (!result_) result_ = consumeToken(builder_, ASM_);
    if (!result_) result_ = consumeToken(builder_, INHERITED_);
    if (!result_) result_ = consumeToken(builder_, AND_);
    if (!result_) result_ = consumeToken(builder_, OR_);
    if (!result_) result_ = consumeToken(builder_, XOR_);
    if (!result_) result_ = consumeToken(builder_, NOT_);
    if (!result_) result_ = consumeToken(builder_, SHL_);
    if (!result_) result_ = consumeToken(builder_, SHR_);
    if (!result_) result_ = consumeToken(builder_, DIV_);
    if (!result_) result_ = consumeToken(builder_, MOD_);
    if (!result_) result_ = consumeToken(builder_, IN_);
    if (!result_) result_ = consumeToken(builder_, AS_);
    if (!result_) result_ = consumeToken(builder_, IS_);
    if (!result_) result_ = consumeToken(builder_, INLINE_);
    if (!result_) result_ = consumeToken(builder_, OUT_);
    if (!result_) result_ = consumeToken(builder_, SELF_);
    if (!result_) result_ = consumeToken(builder_, NEW_);
    if (!result_) result_ = consumeToken(builder_, EXIT_);
    if (!result_) result_ = consumeToken(builder_, BREAK_);
    if (!result_) result_ = consumeToken(builder_, CONTINUE_);
    if (!result_) result_ = consumeToken(builder_, VIRTUAL_);
    if (!result_) result_ = consumeToken(builder_, DYNAMIC_);
    if (!result_) result_ = consumeToken(builder_, ABSTRACT_);
    if (!result_) result_ = consumeToken(builder_, OVERLOAD_);
    if (!result_) result_ = consumeToken(builder_, OVERRIDE_);
    if (!result_) result_ = consumeToken(builder_, REINTRODUCE_);
    if (!result_) result_ = consumeToken(builder_, MESSAGE_);
    if (!result_) result_ = consumeToken(builder_, STATIC_);
    if (!result_) result_ = consumeToken(builder_, SEALED_);
    if (!result_) result_ = consumeToken(builder_, FINAL_);
    if (!result_) result_ = consumeToken(builder_, ASSEMBLER_);
    if (!result_) result_ = consumeToken(builder_, CDECL_);
    if (!result_) result_ = consumeToken(builder_, PASCAL_);
    if (!result_) result_ = consumeToken(builder_, REGISTER_);
    if (!result_) result_ = consumeToken(builder_, SAFECALL_);
    if (!result_) result_ = consumeToken(builder_, STDCALL_);
    if (!result_) result_ = consumeToken(builder_, EXPORT_);
    if (!result_) result_ = consumeToken(builder_, AUTOMATED_);
    if (!result_) result_ = consumeToken(builder_, DISPID_);
    if (!result_) result_ = consumeToken(builder_, EXTERNAL_);
    if (!result_) result_ = consumeToken(builder_, FORWARD_);
    if (!result_) result_ = consumeToken(builder_, HELPER_);
    if (!result_) result_ = consumeToken(builder_, IMPLEMENTS_);
    if (!result_) result_ = consumeToken(builder_, DEFAULT_);
    if (!result_) result_ = consumeToken(builder_, INDEX_);
    if (!result_) result_ = consumeToken(builder_, READ_);
    if (!result_) result_ = consumeToken(builder_, WRITE_);
    if (!result_) result_ = consumeToken(builder_, DEPRECATED_);
    if (!result_) result_ = consumeToken(builder_, EXPERIMENTAL_);
    if (!result_) result_ = consumeToken(builder_, PLATFORM_);
    if (!result_) result_ = consumeToken(builder_, REFERENCE_);
    if (!result_) result_ = consumeToken(builder_, PACKAGE_);
    if (!result_) result_ = consumeToken(builder_, CONTAINS_);
    if (!result_) result_ = consumeToken(builder_, REQUIRES_);
    if (!result_) result_ = consumeToken(builder_, NAME_);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // EXIT [ "(" [Expression] ")" ]
  public static boolean ExitStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExitStatement")) return false;
    if (!nextTokenIs(builder_, EXIT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXIT);
    result_ = result_ && ExitStatement_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXIT_STATEMENT, result_);
    return result_;
  }

  // [ "(" [Expression] ")" ]
  private static boolean ExitStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExitStatement_1")) return false;
    ExitStatement_1_0(builder_, level_ + 1);
    return true;
  }

  // "(" [Expression] ")"
  private static boolean ExitStatement_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExitStatement_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && ExitStatement_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [Expression]
  private static boolean ExitStatement_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExitStatement_1_0_1")) return false;
    Expression(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // routineDeclaration [ExternalDirective]
  public static boolean ExportedRoutine(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExportedRoutine")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPORTED_ROUTINE, "<exported routine>");
    result_ = routineDeclaration(builder_, level_ + 1);
    result_ = result_ && ExportedRoutine_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [ExternalDirective]
  private static boolean ExportedRoutine_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExportedRoutine_1")) return false;
    ExternalDirective(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // EXPORTS RefNamedIdent exportItem ("," RefNamedIdent exportItem)* ";"
  public static boolean ExportsSection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExportsSection")) return false;
    if (!nextTokenIs(builder_, EXPORTS)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPORTS_SECTION, null);
    result_ = consumeToken(builder_, EXPORTS);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, RefNamedIdent(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, exportItem(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, ExportsSection_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ("," RefNamedIdent exportItem)*
  private static boolean ExportsSection_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExportsSection_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!ExportsSection_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ExportsSection_3", pos_)) break;
    }
    return true;
  }

  // "," RefNamedIdent exportItem
  private static boolean ExportsSection_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExportsSection_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && RefNamedIdent(builder_, level_ + 1);
    result_ = result_ && exportItem(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Expr
  public static boolean Expression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Expression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, EXPRESSION, "<expression>");
    result_ = Expr(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // EXTERNAL ";" | EXTERNAL externalSpecifier [libLoadSpec] ";" | EXTERNAL ConstExpression [externalSpecifier] [libLoadSpec] ";"
  public static boolean ExternalDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExternalDirective")) return false;
    if (!nextTokenIs(builder_, EXTERNAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parseTokens(builder_, 0, EXTERNAL, SEMI);
    if (!result_) result_ = ExternalDirective_1(builder_, level_ + 1);
    if (!result_) result_ = ExternalDirective_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, EXTERNAL_DIRECTIVE, result_);
    return result_;
  }

  // EXTERNAL externalSpecifier [libLoadSpec] ";"
  private static boolean ExternalDirective_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExternalDirective_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXTERNAL);
    result_ = result_ && externalSpecifier(builder_, level_ + 1);
    result_ = result_ && ExternalDirective_1_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [libLoadSpec]
  private static boolean ExternalDirective_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExternalDirective_1_2")) return false;
    libLoadSpec(builder_, level_ + 1);
    return true;
  }

  // EXTERNAL ConstExpression [externalSpecifier] [libLoadSpec] ";"
  private static boolean ExternalDirective_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExternalDirective_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXTERNAL);
    result_ = result_ && ConstExpression(builder_, level_ + 1);
    result_ = result_ && ExternalDirective_2_2(builder_, level_ + 1);
    result_ = result_ && ExternalDirective_2_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [externalSpecifier]
  private static boolean ExternalDirective_2_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExternalDirective_2_2")) return false;
    externalSpecifier(builder_, level_ + 1);
    return true;
  }

  // [libLoadSpec]
  private static boolean ExternalDirective_2_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ExternalDirective_2_3")) return false;
    libLoadSpec(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // FILE [OF TypeDecl]
  public static boolean FileType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FileType")) return false;
    if (!nextTokenIs(builder_, FILE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FILE_TYPE, null);
    result_ = consumeToken(builder_, FILE);
    pinned_ = result_; // pin = 1
    result_ = result_ && FileType_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [OF TypeDecl]
  private static boolean FileType_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FileType_1")) return false;
    FileType_1_0(builder_, level_ + 1);
    return true;
  }

  // OF TypeDecl
  private static boolean FileType_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FileType_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OF);
    result_ = result_ && TypeDecl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // VAR NamedIdent [":" TypeDecl]
  public static boolean ForInlineDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInlineDeclaration")) return false;
    if (!nextTokenIs(builder_, VAR)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FOR_INLINE_DECLARATION, null);
    result_ = consumeToken(builder_, VAR);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, NamedIdent(builder_, level_ + 1));
    result_ = pinned_ && ForInlineDeclaration_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [":" TypeDecl]
  private static boolean ForInlineDeclaration_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInlineDeclaration_2")) return false;
    ForInlineDeclaration_2_0(builder_, level_ + 1);
    return true;
  }

  // ":" TypeDecl
  private static boolean ForInlineDeclaration_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForInlineDeclaration_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && TypeDecl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // FOR forCycleIdent forCycleCondition doStatement
  public static boolean ForStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ForStatement")) return false;
    if (!nextTokenIs(builder_, FOR)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FOR_STATEMENT, null);
    result_ = consumeToken(builder_, FOR);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, forCycleIdent(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, forCycleCondition(builder_, level_ + 1)) && result_;
    result_ = pinned_ && doStatement(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // customAttributes* [ ParamType ] identList [ ":" TypeDecl ] [ "=" ConstExpression ]
  public static boolean FormalParameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameter")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FORMAL_PARAMETER, "<formal parameter>");
    result_ = FormalParameter_0(builder_, level_ + 1);
    result_ = result_ && FormalParameter_1(builder_, level_ + 1);
    result_ = result_ && identList(builder_, level_ + 1);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, FormalParameter_3(builder_, level_ + 1));
    result_ = pinned_ && FormalParameter_4(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_formal_param);
    return result_ || pinned_;
  }

  // customAttributes*
  private static boolean FormalParameter_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameter_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!customAttributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "FormalParameter_0", pos_)) break;
    }
    return true;
  }

  // [ ParamType ]
  private static boolean FormalParameter_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameter_1")) return false;
    ParamType(builder_, level_ + 1);
    return true;
  }

  // [ ":" TypeDecl ]
  private static boolean FormalParameter_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameter_3")) return false;
    FormalParameter_3_0(builder_, level_ + 1);
    return true;
  }

  // ":" TypeDecl
  private static boolean FormalParameter_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameter_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && TypeDecl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ "=" ConstExpression ]
  private static boolean FormalParameter_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameter_4")) return false;
    FormalParameter_4_0(builder_, level_ + 1);
    return true;
  }

  // "=" ConstExpression
  private static boolean FormalParameter_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameter_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQ);
    result_ = result_ && ConstExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // formalParameterSect
  public static boolean FormalParameterSection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FormalParameterSection")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = formalParameterSect(builder_, level_ + 1);
    exit_section_(builder_, marker_, FORMAL_PARAMETER_SECTION, result_);
    return result_;
  }

  /* ********************************************************** */
  // Expression
  public static boolean FromExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FromExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FROM_EXPRESSION, "<from expression>");
    result_ = Expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_statement_mid);
    return result_;
  }

  /* ********************************************************** */
  // namespacePart? SubIdent
  public static boolean FullyQualifiedIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FullyQualifiedIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FULLY_QUALIFIED_IDENT, "<Identifier>");
    result_ = FullyQualifiedIdent_0(builder_, level_ + 1);
    result_ = result_ && SubIdent(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // namespacePart?
  private static boolean FullyQualifiedIdent_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FullyQualifiedIdent_0")) return false;
    namespacePart(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // functionDirective | dispIDDirective
  public static boolean FunctionDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "FunctionDirective")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, FUNCTION_DIRECTIVE, "<routine directive>");
    result_ = functionDirective(builder_, level_ + 1);
    if (!result_) result_ = dispIDDirective(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TypeID | RECORD | CLASS | CONSTRUCTOR | INTERFACE | OBJECT
  public static boolean GenericConstraint(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "GenericConstraint")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GENERIC_CONSTRAINT, "<generic constraint>");
    result_ = TypeID(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, RECORD);
    if (!result_) result_ = consumeToken(builder_, CLASS);
    if (!result_) result_ = consumeToken(builder_, CONSTRUCTOR);
    if (!result_) result_ = consumeToken(builder_, INTERFACE);
    if (!result_) result_ = consumeToken(builder_, OBJECT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // "<" TypeDecl typeDeclsRest* ">"
  public static boolean GenericPostfix(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "GenericPostfix")) return false;
    if (!nextTokenIs(builder_, LT)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LT);
    result_ = result_ && TypeDecl(builder_, level_ + 1);
    result_ = result_ && GenericPostfix_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, GT);
    exit_section_(builder_, marker_, GENERIC_POSTFIX, result_);
    return result_;
  }

  // typeDeclsRest*
  private static boolean GenericPostfix_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "GenericPostfix_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!typeDeclsRest(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "GenericPostfix_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [GENERIC] NamedIdentDecl [genericDefinition]
  public static boolean GenericTypeIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "GenericTypeIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, GENERIC_TYPE_IDENT, "<Identifier>");
    result_ = GenericTypeIdent_0(builder_, level_ + 1);
    result_ = result_ && NamedIdentDecl(builder_, level_ + 1);
    result_ = result_ && GenericTypeIdent_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_typeId);
    return result_;
  }

  // [GENERIC]
  private static boolean GenericTypeIdent_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "GenericTypeIdent_0")) return false;
    consumeToken(builder_, GENERIC);
    return true;
  }

  // [genericDefinition]
  private static boolean GenericTypeIdent_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "GenericTypeIdent_2")) return false;
    genericDefinition(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // GOTO LabelId
  public static boolean GotoStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "GotoStatement")) return false;
    if (!nextTokenIs(builder_, GOTO)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, GOTO);
    result_ = result_ && LabelId(builder_, level_ + 1);
    exit_section_(builder_, marker_, GOTO_STATEMENT, result_);
    return result_;
  }

  /* ********************************************************** */
  // handlerStart doStatement ";"
  public static boolean Handler(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Handler")) return false;
    if (!nextTokenIs(builder_, ON)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, HANDLER, null);
    result_ = handlerStart(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, doStatement(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // Statement
  public static boolean IfElseStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfElseStatement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IF_ELSE_STATEMENT, "<if else statement>");
    result_ = Statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // IF ctrlStmtExpression ifThenStatement [ELSE IfElseStatement]
  public static boolean IfStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement")) return false;
    if (!nextTokenIs(builder_, IF)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IF_STATEMENT, null);
    result_ = consumeToken(builder_, IF);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ctrlStmtExpression(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, ifThenStatement(builder_, level_ + 1)) && result_;
    result_ = pinned_ && IfStatement_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ELSE IfElseStatement]
  private static boolean IfStatement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement_3")) return false;
    IfStatement_3_0(builder_, level_ + 1);
    return true;
  }

  // ELSE IfElseStatement
  private static boolean IfStatement_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfStatement_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && IfElseStatement(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Statement
  public static boolean IfThenStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IfThenStatement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IF_THEN_STATEMENT, "<if then statement>");
    result_ = Statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // declSection* {}
  public static boolean ImplDeclSection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImplDeclSection")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IMPL_DECL_SECTION, "<impl decl section>");
    result_ = ImplDeclSection_0(builder_, level_ + 1);
    result_ = result_ && ImplDeclSection_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // declSection*
  private static boolean ImplDeclSection_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ImplDeclSection_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!declSection(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ImplDeclSection_0", pos_)) break;
    }
    return true;
  }

  // {}
  private static boolean ImplDeclSection_1(PsiBuilder builder_, int level_) {
    return true;
  }

  /* ********************************************************** */
  // (SubIdent [GenericPostfix] ".")* OperatorSubIdent
  public static boolean InOperatorQualifiedIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InOperatorQualifiedIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, IN_OPERATOR_QUALIFIED_IDENT, "<Identifier>");
    result_ = InOperatorQualifiedIdent_0(builder_, level_ + 1);
    result_ = result_ && OperatorSubIdent(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (SubIdent [GenericPostfix] ".")*
  private static boolean InOperatorQualifiedIdent_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InOperatorQualifiedIdent_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!InOperatorQualifiedIdent_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "InOperatorQualifiedIdent_0", pos_)) break;
    }
    return true;
  }

  // SubIdent [GenericPostfix] "."
  private static boolean InOperatorQualifiedIdent_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InOperatorQualifiedIdent_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = SubIdent(builder_, level_ + 1);
    result_ = result_ && InOperatorQualifiedIdent_0_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [GenericPostfix]
  private static boolean InOperatorQualifiedIdent_0_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InOperatorQualifiedIdent_0_0_1")) return false;
    GenericPostfix(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // INHERITED
  public static boolean InheritedCall(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InheritedCall")) return false;
    if (!nextTokenIs(builder_, INHERITED)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INHERITED);
    exit_section_(builder_, marker_, INHERITED_CALL, result_);
    return result_;
  }

  /* ********************************************************** */
  // CONST customAttributes* NamedIdent [":" TypeDecl] "=" ConstExpression
  public static boolean InlineConstDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InlineConstDeclaration")) return false;
    if (!nextTokenIs(builder_, CONST)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INLINE_CONST_DECLARATION, null);
    result_ = consumeToken(builder_, CONST);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, InlineConstDeclaration_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, NamedIdent(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, InlineConstDeclaration_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, EQ)) && result_;
    result_ = pinned_ && ConstExpression(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // customAttributes*
  private static boolean InlineConstDeclaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InlineConstDeclaration_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!customAttributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "InlineConstDeclaration_1", pos_)) break;
    }
    return true;
  }

  // [":" TypeDecl]
  private static boolean InlineConstDeclaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InlineConstDeclaration_3")) return false;
    InlineConstDeclaration_3_0(builder_, level_ + 1);
    return true;
  }

  // ":" TypeDecl
  private static boolean InlineConstDeclaration_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InlineConstDeclaration_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && TypeDecl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // VAR customAttributes* identList [":" TypeDecl]
  public static boolean InlineVarDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InlineVarDeclaration")) return false;
    if (!nextTokenIs(builder_, VAR)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INLINE_VAR_DECLARATION, null);
    result_ = consumeToken(builder_, VAR);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, InlineVarDeclaration_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, identList(builder_, level_ + 1)) && result_;
    result_ = pinned_ && InlineVarDeclaration_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // customAttributes*
  private static boolean InlineVarDeclaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InlineVarDeclaration_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!customAttributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "InlineVarDeclaration_1", pos_)) break;
    }
    return true;
  }

  // [":" TypeDecl]
  private static boolean InlineVarDeclaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InlineVarDeclaration_3")) return false;
    InlineVarDeclaration_3_0(builder_, level_ + 1);
    return true;
  }

  // ":" TypeDecl
  private static boolean InlineVarDeclaration_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InlineVarDeclaration_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && TypeDecl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // interfaceKey interfaceBody END
  //                               | interfaceKey [classParentWithRecovery]
  public static boolean InterfaceTypeDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InterfaceTypeDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INTERFACE_TYPE_DECL, "<interface declaration>");
    result_ = InterfaceTypeDecl_0(builder_, level_ + 1);
    if (!result_) result_ = InterfaceTypeDecl_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // interfaceKey interfaceBody END
  private static boolean InterfaceTypeDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InterfaceTypeDecl_0")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = interfaceKey(builder_, level_ + 1);
    pinned_ = result_; // pin = interfaceKey
    result_ = result_ && report_error_(builder_, interfaceBody(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, END) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // interfaceKey [classParentWithRecovery]
  private static boolean InterfaceTypeDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InterfaceTypeDecl_1")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = interfaceKey(builder_, level_ + 1);
    pinned_ = result_; // pin = interfaceKey
    result_ = result_ && InterfaceTypeDecl_1_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [classParentWithRecovery]
  private static boolean InterfaceTypeDecl_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "InterfaceTypeDecl_1_1")) return false;
    classParentWithRecovery(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // OUT | SELF | NEW
  //                               | EXIT | BREAK | CONTINUE
  //                               | VIRTUAL | DYNAMIC | ABSTRACT | OVERLOAD | OVERRIDE | REINTRODUCE | MESSAGE | STATIC | SEALED | FINAL | ASSEMBLER
  //                               | CDECL | PASCAL | REGISTER | SAFECALL | STDCALL | EXPORT | OPERATOR
  //                               | AUTOMATED | DISPID | EXTERNAL | FORWARD | HELPER | IMPLEMENTS
  //                               | DEFAULT | INDEX | READ | WRITE | DEPRECATED | EXPERIMENTAL | PLATFORM | REFERENCE
  //                               | PACKAGE | CONTAINS | REQUIRES
  public static boolean KeywordIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "KeywordIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, KEYWORD_IDENT, "<Identifier>");
    result_ = consumeToken(builder_, OUT);
    if (!result_) result_ = consumeToken(builder_, SELF);
    if (!result_) result_ = consumeToken(builder_, NEW);
    if (!result_) result_ = consumeToken(builder_, EXIT);
    if (!result_) result_ = consumeToken(builder_, BREAK);
    if (!result_) result_ = consumeToken(builder_, CONTINUE);
    if (!result_) result_ = consumeToken(builder_, VIRTUAL);
    if (!result_) result_ = consumeToken(builder_, DYNAMIC);
    if (!result_) result_ = consumeToken(builder_, ABSTRACT);
    if (!result_) result_ = consumeToken(builder_, OVERLOAD);
    if (!result_) result_ = consumeToken(builder_, OVERRIDE);
    if (!result_) result_ = consumeToken(builder_, REINTRODUCE);
    if (!result_) result_ = consumeToken(builder_, MESSAGE);
    if (!result_) result_ = consumeToken(builder_, STATIC);
    if (!result_) result_ = consumeToken(builder_, SEALED);
    if (!result_) result_ = consumeToken(builder_, FINAL);
    if (!result_) result_ = consumeToken(builder_, ASSEMBLER);
    if (!result_) result_ = consumeToken(builder_, CDECL);
    if (!result_) result_ = consumeToken(builder_, PASCAL);
    if (!result_) result_ = consumeToken(builder_, REGISTER);
    if (!result_) result_ = consumeToken(builder_, SAFECALL);
    if (!result_) result_ = consumeToken(builder_, STDCALL);
    if (!result_) result_ = consumeToken(builder_, EXPORT);
    if (!result_) result_ = consumeToken(builder_, OPERATOR);
    if (!result_) result_ = consumeToken(builder_, AUTOMATED);
    if (!result_) result_ = consumeToken(builder_, DISPID);
    if (!result_) result_ = consumeToken(builder_, EXTERNAL);
    if (!result_) result_ = consumeToken(builder_, FORWARD);
    if (!result_) result_ = consumeToken(builder_, HELPER);
    if (!result_) result_ = consumeToken(builder_, IMPLEMENTS);
    if (!result_) result_ = consumeToken(builder_, DEFAULT);
    if (!result_) result_ = consumeToken(builder_, INDEX);
    if (!result_) result_ = consumeToken(builder_, READ);
    if (!result_) result_ = consumeToken(builder_, WRITE);
    if (!result_) result_ = consumeToken(builder_, DEPRECATED);
    if (!result_) result_ = consumeToken(builder_, EXPERIMENTAL);
    if (!result_) result_ = consumeToken(builder_, PLATFORM);
    if (!result_) result_ = consumeToken(builder_, REFERENCE);
    if (!result_) result_ = consumeToken(builder_, PACKAGE);
    if (!result_) result_ = consumeToken(builder_, CONTAINS);
    if (!result_) result_ = consumeToken(builder_, REQUIRES);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LABEL label labelsRest* ";"
  public static boolean LabelDeclSection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LabelDeclSection")) return false;
    if (!nextTokenIs(builder_, "<label declaration>", LABEL)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LABEL_DECL_SECTION, "<label declaration>");
    result_ = consumeToken(builder_, LABEL);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, label(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, LabelDeclSection_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // labelsRest*
  private static boolean LabelDeclSection_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LabelDeclSection_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!labelsRest(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "LabelDeclSection_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // label
  public static boolean LabelId(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LabelId")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LABEL_ID, "<label id>");
    result_ = label(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // LIBRARY NamespaceIdent hintingDirective* ";"
  public static boolean LibraryModuleHead(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LibraryModuleHead")) return false;
    if (!nextTokenIs(builder_, LIBRARY)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LIBRARY_MODULE_HEAD, null);
    result_ = consumeToken(builder_, LIBRARY);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, NamespaceIdent(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, LibraryModuleHead_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // hintingDirective*
  private static boolean LibraryModuleHead_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "LibraryModuleHead_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!hintingDirective(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "LibraryModuleHead_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [prolog] (moduleUnit | moduleLibrary | modulePackage | moduleProgram | include_impl | include_intf)
  public static boolean Module(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Module")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MODULE, "<module>");
    result_ = Module_0(builder_, level_ + 1);
    result_ = result_ && Module_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [prolog]
  private static boolean Module_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Module_0")) return false;
    prolog(builder_, level_ + 1);
    return true;
  }

  // moduleUnit | moduleLibrary | modulePackage | moduleProgram | include_impl | include_intf
  private static boolean Module_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Module_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = moduleUnit(builder_, level_ + 1);
    if (!result_) result_ = moduleLibrary(builder_, level_ + 1);
    if (!result_) result_ = modulePackage(builder_, level_ + 1);
    if (!result_) result_ = moduleProgram(builder_, level_ + 1);
    if (!result_) result_ = include_impl(builder_, level_ + 1);
    if (!result_) result_ = include_intf(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier
  public static boolean NamedIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NamedIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NAMED_IDENT, "<Identifier>");
    result_ = identifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // identifier
  public static boolean NamedIdentDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NamedIdentDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NAMED_IDENT_DECL, "<named ident decl>");
    result_ = identifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // namespacePart? SubIdent
  public static boolean NamespaceIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NamespaceIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, NAMESPACE_IDENT, "<Identifier>");
    result_ = NamespaceIdent_0(builder_, level_ + 1);
    result_ = result_ && SubIdent(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // namespacePart?
  private static boolean NamespaceIdent_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NamespaceIdent_0")) return false;
    namespacePart(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // NEW "(" [ Expression ] ("," [ Expression ])* [ "," ConstExpression ] ")"
  public static boolean NewStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NewStatement")) return false;
    if (!nextTokenIs(builder_, NEW)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, NEW, LPAREN);
    result_ = result_ && NewStatement_2(builder_, level_ + 1);
    result_ = result_ && NewStatement_3(builder_, level_ + 1);
    result_ = result_ && NewStatement_4(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, NEW_STATEMENT, result_);
    return result_;
  }

  // [ Expression ]
  private static boolean NewStatement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NewStatement_2")) return false;
    Expression(builder_, level_ + 1);
    return true;
  }

  // ("," [ Expression ])*
  private static boolean NewStatement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NewStatement_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!NewStatement_3_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "NewStatement_3", pos_)) break;
    }
    return true;
  }

  // "," [ Expression ]
  private static boolean NewStatement_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NewStatement_3_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && NewStatement_3_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ Expression ]
  private static boolean NewStatement_3_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NewStatement_3_0_1")) return false;
    Expression(builder_, level_ + 1);
    return true;
  }

  // [ "," ConstExpression ]
  private static boolean NewStatement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NewStatement_4")) return false;
    NewStatement_4_0(builder_, level_ + 1);
    return true;
  }

  // "," ConstExpression
  private static boolean NewStatement_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "NewStatement_4_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && ConstExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [PACKED] objectTypeDecl
  public static boolean ObjectDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ObjectDecl")) return false;
    if (!nextTokenIs(builder_, "<object declaration>", OBJECT, PACKED)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OBJECT_DECL, "<object declaration>");
    result_ = ObjectDecl_0(builder_, level_ + 1);
    result_ = result_ && objectTypeDecl(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [PACKED]
  private static boolean ObjectDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ObjectDecl_0")) return false;
    consumeToken(builder_, PACKED);
    return true;
  }

  /* ********************************************************** */
  // IN | operatorRedef
  public static boolean OperatorSubIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "OperatorSubIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, OPERATOR_SUB_IDENT, "<Identifier>");
    result_ = consumeToken(builder_, IN);
    if (!result_) result_ = operatorRedef(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // PACKAGE NamespaceIdent ";"
  public static boolean PackageModuleHead(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PackageModuleHead")) return false;
    if (!nextTokenIs(builder_, PACKAGE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PACKAGE_MODULE_HEAD, null);
    result_ = consumeToken(builder_, PACKAGE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, NamespaceIdent(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // CONST | VAR | OUT | CONSTREF
  public static boolean ParamType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ParamType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PARAM_TYPE, "<param type>");
    result_ = consumeToken(builder_, CONST);
    if (!result_) result_ = consumeToken(builder_, VAR);
    if (!result_) result_ = consumeToken(builder_, OUT);
    if (!result_) result_ = consumeToken(builder_, CONSTREF);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // "^" TypeDecl
  public static boolean PointerType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "PointerType")) return false;
    if (!nextTokenIs(builder_, DEREF)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, POINTER_TYPE, null);
    result_ = consumeToken(builder_, DEREF);
    pinned_ = result_; // pin = 1
    result_ = result_ && TypeDecl(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // ProcForwardDecl | ExternalDirective | BlockLocal [";"]
  public static boolean ProcBodyBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcBodyBlock")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PROC_BODY_BLOCK, "<proc body block>");
    result_ = ProcForwardDecl(builder_, level_ + 1);
    if (!result_) result_ = ExternalDirective(builder_, level_ + 1);
    if (!result_) result_ = ProcBodyBlock_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // BlockLocal [";"]
  private static boolean ProcBodyBlock_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcBodyBlock_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = BlockLocal(builder_, level_ + 1);
    result_ = result_ && ProcBodyBlock_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [";"]
  private static boolean ProcBodyBlock_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcBodyBlock_2_1")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  /* ********************************************************** */
  // FORWARD ";" FunctionDirective*
  public static boolean ProcForwardDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcForwardDecl")) return false;
    if (!nextTokenIs(builder_, FORWARD)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, FORWARD, SEMI);
    result_ = result_ && ProcForwardDecl_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, PROC_FORWARD_DECL, result_);
    return result_;
  }

  // FunctionDirective*
  private static boolean ProcForwardDecl_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcForwardDecl_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!FunctionDirective(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ProcForwardDecl_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // procedureReference | simpleProcedureType
  public static boolean ProcedureType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProcedureType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PROCEDURE_TYPE, "<procedure type>");
    result_ = procedureReference(builder_, level_ + 1);
    if (!result_) result_ = simpleProcedureType(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // PROGRAM NamespaceIdent ProgramParamList? ";"
  public static boolean ProgramModuleHead(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProgramModuleHead")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PROGRAM_MODULE_HEAD, "<program module head>");
    result_ = consumeToken(builder_, PROGRAM);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, NamespaceIdent(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, ProgramModuleHead_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_programHead);
    return result_ || pinned_;
  }

  // ProgramParamList?
  private static boolean ProgramModuleHead_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProgramModuleHead_2")) return false;
    ProgramParamList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // LPAREN progParam? progParamsRest* RPAREN
  public static boolean ProgramParamList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProgramParamList")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, PROGRAM_PARAM_LIST, null);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ProgramParamList_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, ProgramParamList_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // progParam?
  private static boolean ProgramParamList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProgramParamList_1")) return false;
    progParam(builder_, level_ + 1);
    return true;
  }

  // progParamsRest*
  private static boolean ProgramParamList_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ProgramParamList_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!progParamsRest(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "ProgramParamList_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // RAISE [Expression] ["at" Expression]
  public static boolean RaiseStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RaiseStatement")) return false;
    if (!nextTokenIs(builder_, RAISE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RAISE_STATEMENT, null);
    result_ = consumeToken(builder_, RAISE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, RaiseStatement_1(builder_, level_ + 1));
    result_ = pinned_ && RaiseStatement_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [Expression]
  private static boolean RaiseStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RaiseStatement_1")) return false;
    Expression(builder_, level_ + 1);
    return true;
  }

  // ["at" Expression]
  private static boolean RaiseStatement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RaiseStatement_2")) return false;
    RaiseStatement_2_0(builder_, level_ + 1);
    return true;
  }

  // "at" Expression
  private static boolean RaiseStatement_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RaiseStatement_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "at");
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ConstExpressionOrd
  public static boolean RangeBound(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RangeBound")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RANGE_BOUND, "<range bound>");
    result_ = ConstExpressionOrd(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // "(" recordConstInner ")"
  public static boolean RecordConstExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecordConstExpr")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LPAREN);
    result_ = result_ && recordConstInner(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RPAREN);
    exit_section_(builder_, marker_, RECORD_CONST_EXPR, result_);
    return result_;
  }

  /* ********************************************************** */
  // [PACKED | "bitpacked"] RECORD varRecDecl END
  public static boolean RecordDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecordDecl")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RECORD_DECL, "<record declaration>");
    result_ = RecordDecl_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RECORD);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, varRecDecl(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, END) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [PACKED | "bitpacked"]
  private static boolean RecordDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecordDecl_0")) return false;
    RecordDecl_0_0(builder_, level_ + 1);
    return true;
  }

  // PACKED | "bitpacked"
  private static boolean RecordDecl_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecordDecl_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PACKED);
    if (!result_) result_ = consumeToken(builder_, "bitpacked");
    return result_;
  }

  /* ********************************************************** */
  // RECORD HELPER classHelperBody END
  public static boolean RecordHelperDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecordHelperDecl")) return false;
    if (!nextTokenIs(builder_, "<record helper declaration>", RECORD)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RECORD_HELPER_DECL, "<record helper declaration>");
    result_ = consumeTokens(builder_, 2, RECORD, HELPER);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, classHelperBody(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, END) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // ConstExpressionOrd ("," ConstExpressionOrd)* ":" "(" varRecDeclInner ")"
  public static boolean RecordVariant(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecordVariant")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, RECORD_VARIANT, "<record variant>");
    result_ = ConstExpressionOrd(builder_, level_ + 1);
    result_ = result_ && RecordVariant_1(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 2, COLON, LPAREN);
    pinned_ = result_; // pin = 4
    result_ = result_ && report_error_(builder_, varRecDeclInner(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ("," ConstExpressionOrd)*
  private static boolean RecordVariant_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecordVariant_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!RecordVariant_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "RecordVariant_1", pos_)) break;
    }
    return true;
  }

  // "," ConstExpressionOrd
  private static boolean RecordVariant_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RecordVariant_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && ConstExpressionOrd(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // identifier
  public static boolean RefNamedIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RefNamedIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, REF_NAMED_IDENT, "<Identifier>");
    result_ = identifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // REPEAT [statementList] UNTIL Expression
  public static boolean RepeatStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RepeatStatement")) return false;
    if (!nextTokenIs(builder_, REPEAT)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, REPEAT_STATEMENT, null);
    result_ = consumeToken(builder_, REPEAT);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, RepeatStatement_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, UNTIL)) && result_;
    result_ = pinned_ && Expression(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [statementList]
  private static boolean RepeatStatement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RepeatStatement_1")) return false;
    statementList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // REQUIRES namespaceNameList ";"
  public static boolean RequiresClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RequiresClause")) return false;
    if (!nextTokenIs(builder_, REQUIRES)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, REQUIRES_CLAUSE, null);
    result_ = consumeToken(builder_, REQUIRES);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, namespaceNameList(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // routineImpl ProcBodyBlock
  public static boolean RoutineImplDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RoutineImplDecl")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ROUTINE_IMPL_DECL, "<procedure or function declaration>");
    result_ = routineImpl(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && ProcBodyBlock(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // routineDeclaration (ProcForwardDecl | BlockLocalNested1) [";"]
  public static boolean RoutineImplDeclNested1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RoutineImplDeclNested1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ROUTINE_IMPL_DECL_NESTED_1, "<routine impl decl nested 1>");
    result_ = routineDeclaration(builder_, level_ + 1);
    result_ = result_ && RoutineImplDeclNested1_1(builder_, level_ + 1);
    result_ = result_ && RoutineImplDeclNested1_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ProcForwardDecl | BlockLocalNested1
  private static boolean RoutineImplDeclNested1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RoutineImplDeclNested1_1")) return false;
    boolean result_;
    result_ = ProcForwardDecl(builder_, level_ + 1);
    if (!result_) result_ = BlockLocalNested1(builder_, level_ + 1);
    return result_;
  }

  // [";"]
  private static boolean RoutineImplDeclNested1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RoutineImplDeclNested1_2")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  /* ********************************************************** */
  // routineDeclaration (ProcForwardDecl | BlockLocalWONested) [";"]
  public static boolean RoutineImplDeclWoNested(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RoutineImplDeclWoNested")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ROUTINE_IMPL_DECL_WO_NESTED, "<routine impl decl wo nested>");
    result_ = routineDeclaration(builder_, level_ + 1);
    result_ = result_ && RoutineImplDeclWoNested_1(builder_, level_ + 1);
    result_ = result_ && RoutineImplDeclWoNested_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ProcForwardDecl | BlockLocalWONested
  private static boolean RoutineImplDeclWoNested_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RoutineImplDeclWoNested_1")) return false;
    boolean result_;
    result_ = ProcForwardDecl(builder_, level_ + 1);
    if (!result_) result_ = BlockLocalWONested(builder_, level_ + 1);
    return result_;
  }

  // [";"]
  private static boolean RoutineImplDeclWoNested_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "RoutineImplDeclWoNested_2")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  /* ********************************************************** */
  // [PACKED] SET OF TypeDecl
  public static boolean SetType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SetType")) return false;
    if (!nextTokenIs(builder_, "<set type>", PACKED, SET)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SET_TYPE, "<set type>");
    result_ = SetType_0(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 1, SET, OF);
    pinned_ = result_; // pin = 2
    result_ = result_ && TypeDecl(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [PACKED]
  private static boolean SetType_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SetType_0")) return false;
    consumeToken(builder_, PACKED);
    return true;
  }

  /* ********************************************************** */
  // [LabelId ":" ] statementPart
  public static boolean Statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STATEMENT, "<statement>");
    result_ = Statement_0(builder_, level_ + 1);
    result_ = result_ && statementPart(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_statement);
    return result_;
  }

  // [LabelId ":" ]
  private static boolean Statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Statement_0")) return false;
    Statement_0_0(builder_, level_ + 1);
    return true;
  }

  // LabelId ":"
  private static boolean Statement_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Statement_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = LabelId(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // controlString (quotedString controlString)* [quotedString]
  //                               | quotedString (controlString quotedString)* [controlString]
  public static boolean StringFactor(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringFactor")) return false;
    if (!nextTokenIs(builder_, "<string factor>", CHARNUM, STRING_LITERAL)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRING_FACTOR, "<string factor>");
    result_ = StringFactor_0(builder_, level_ + 1);
    if (!result_) result_ = StringFactor_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // controlString (quotedString controlString)* [quotedString]
  private static boolean StringFactor_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringFactor_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = controlString(builder_, level_ + 1);
    result_ = result_ && StringFactor_0_1(builder_, level_ + 1);
    result_ = result_ && StringFactor_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (quotedString controlString)*
  private static boolean StringFactor_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringFactor_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!StringFactor_0_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "StringFactor_0_1", pos_)) break;
    }
    return true;
  }

  // quotedString controlString
  private static boolean StringFactor_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringFactor_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = quotedString(builder_, level_ + 1);
    result_ = result_ && controlString(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [quotedString]
  private static boolean StringFactor_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringFactor_0_2")) return false;
    quotedString(builder_, level_ + 1);
    return true;
  }

  // quotedString (controlString quotedString)* [controlString]
  private static boolean StringFactor_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringFactor_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = quotedString(builder_, level_ + 1);
    result_ = result_ && StringFactor_1_1(builder_, level_ + 1);
    result_ = result_ && StringFactor_1_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (controlString quotedString)*
  private static boolean StringFactor_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringFactor_1_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!StringFactor_1_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "StringFactor_1_1", pos_)) break;
    }
    return true;
  }

  // controlString quotedString
  private static boolean StringFactor_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringFactor_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = controlString(builder_, level_ + 1);
    result_ = result_ && quotedString(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [controlString]
  private static boolean StringFactor_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringFactor_1_2")) return false;
    controlString(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // "string" ["[" Expression "]"] | "AnsiString" [codePageNumber]
  public static boolean StringType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, STRING_TYPE, "<string type>");
    result_ = StringType_0(builder_, level_ + 1);
    if (!result_) result_ = StringType_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // "string" ["[" Expression "]"]
  private static boolean StringType_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringType_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "string");
    result_ = result_ && StringType_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ["[" Expression "]"]
  private static boolean StringType_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringType_0_1")) return false;
    StringType_0_1_0(builder_, level_ + 1);
    return true;
  }

  // "[" Expression "]"
  private static boolean StringType_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringType_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACK);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACK);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // "AnsiString" [codePageNumber]
  private static boolean StringType_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringType_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "AnsiString");
    result_ = result_ && StringType_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [codePageNumber]
  private static boolean StringType_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "StringType_1_1")) return false;
    codePageNumber(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // identifier
  public static boolean SubIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SubIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SUB_IDENT, "<Identifier>");
    result_ = identifier(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // RangeBound RANGE RangeBound
  public static boolean SubRangeType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "SubRangeType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SUB_RANGE_TYPE, "<sub range type>");
    result_ = RangeBound(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RANGE);
    result_ = result_ && RangeBound(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // TRY statementList (tryExcept | tryFinally) END
  public static boolean TryStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TryStatement")) return false;
    if (!nextTokenIs(builder_, TRY)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TRY_STATEMENT, null);
    result_ = consumeToken(builder_, TRY);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, statementList(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, TryStatement_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, END) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // tryExcept | tryFinally
  private static boolean TryStatement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TryStatement_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = tryExcept(builder_, level_ + 1);
    if (!result_) result_ = tryFinally(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // complexType | PointerType | ProcedureType | [TYPE] StringType | simpleType | [TYPE] TypeID
  public static boolean TypeDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_DECL, "<type decl>");
    result_ = complexType(builder_, level_ + 1);
    if (!result_) result_ = PointerType(builder_, level_ + 1);
    if (!result_) result_ = ProcedureType(builder_, level_ + 1);
    if (!result_) result_ = TypeDecl_3(builder_, level_ + 1);
    if (!result_) result_ = simpleType(builder_, level_ + 1);
    if (!result_) result_ = TypeDecl_5(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [TYPE] StringType
  private static boolean TypeDecl_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = TypeDecl_3_0(builder_, level_ + 1);
    result_ = result_ && StringType(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [TYPE]
  private static boolean TypeDecl_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_3_0")) return false;
    consumeToken(builder_, TYPE);
    return true;
  }

  // [TYPE] TypeID
  private static boolean TypeDecl_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_5")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = TypeDecl_5_0(builder_, level_ + 1);
    result_ = result_ && TypeID(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [TYPE]
  private static boolean TypeDecl_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDecl_5_0")) return false;
    consumeToken(builder_, TYPE);
    return true;
  }

  /* ********************************************************** */
  // customAttributes* GenericTypeIdent "=" type
  public static boolean TypeDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDeclaration")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_DECLARATION, "<type declaration>");
    result_ = TypeDeclaration_0(builder_, level_ + 1);
    result_ = result_ && GenericTypeIdent(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, consumeToken(builder_, EQ));
    result_ = pinned_ && type(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_name);
    return result_ || pinned_;
  }

  // customAttributes*
  private static boolean TypeDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeDeclaration_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!customAttributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "TypeDeclaration_0", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // SPECIALIZE? FullyQualifiedIdent [GenericPostfix]
  public static boolean TypeID(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeID")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_ID, "<type id>");
    result_ = TypeID_0(builder_, level_ + 1);
    result_ = result_ && FullyQualifiedIdent(builder_, level_ + 1);
    result_ = result_ && TypeID_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // SPECIALIZE?
  private static boolean TypeID_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeID_0")) return false;
    consumeToken(builder_, SPECIALIZE);
    return true;
  }

  // [GenericPostfix]
  private static boolean TypeID_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeID_2")) return false;
    GenericPostfix(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // TYPE typeDeclarations [";"]
  public static boolean TypeSection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSection")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, TYPE_SECTION, "<type section>");
    result_ = consumeToken(builder_, TYPE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, typeDeclarations(builder_, level_ + 1));
    result_ = pinned_ && TypeSection_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_decl_section);
    return result_ || pinned_;
  }

  // [";"]
  private static boolean TypeSection_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "TypeSection_2")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  /* ********************************************************** */
  // FINALIZATION statementList
  public static boolean UnitFinalization(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnitFinalization")) return false;
    if (!nextTokenIs(builder_, "<finalization section>", FINALIZATION)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, UNIT_FINALIZATION, "<finalization section>");
    result_ = consumeToken(builder_, FINALIZATION);
    pinned_ = result_; // pin = 1
    result_ = result_ && statementList(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // unitImplementationKey [intUsesClause] ImplDeclSection unitBlock
  public static boolean UnitImplementation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnitImplementation")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, UNIT_IMPLEMENTATION, "<implementation section>");
    result_ = unitImplementationKey(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, UnitImplementation_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, ImplDeclSection(builder_, level_ + 1)) && result_;
    result_ = pinned_ && unitBlock(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_implementation_dot);
    return result_ || pinned_;
  }

  // [intUsesClause]
  private static boolean UnitImplementation_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnitImplementation_1")) return false;
    intUsesClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // INITIALIZATION statementList
  public static boolean UnitInitialization(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnitInitialization")) return false;
    if (!nextTokenIs(builder_, "<initialization section>", INITIALIZATION)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, UNIT_INITIALIZATION, "<initialization section>");
    result_ = consumeToken(builder_, INITIALIZATION);
    pinned_ = result_; // pin = 1
    result_ = result_ && statementList(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // unitInterfaceKey [intUsesClause] interfaceDecl*
  public static boolean UnitInterface(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnitInterface")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, UNIT_INTERFACE, "<interface section>");
    result_ = unitInterfaceKey(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, UnitInterface_1(builder_, level_ + 1));
    result_ = pinned_ && UnitInterface_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_interface);
    return result_ || pinned_;
  }

  // [intUsesClause]
  private static boolean UnitInterface_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnitInterface_1")) return false;
    intUsesClause(builder_, level_ + 1);
    return true;
  }

  // interfaceDecl*
  private static boolean UnitInterface_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnitInterface_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!interfaceDecl(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "UnitInterface_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // UNIT NamespaceIdent hintingDirective* ";"
  public static boolean UnitModuleHead(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnitModuleHead")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, UNIT_MODULE_HEAD, "<unit module head>");
    result_ = consumeToken(builder_, UNIT);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, NamespaceIdent(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, UnitModuleHead_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_module);
    return result_ || pinned_;
  }

  // hintingDirective*
  private static boolean UnitModuleHead_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UnitModuleHead_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!hintingDirective(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "UnitModuleHead_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // USES namespaceNameList ";"
  public static boolean UsesClause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "UsesClause")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, USES_CLAUSE, "<uses clause>");
    result_ = consumeToken(builder_, USES);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, namespaceNameList(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_uses);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // customAttributes* identListDecl ":" TypeDecl [VarValueSpec] hintingDirective* ";"
  public static boolean VarDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDeclaration")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VAR_DECLARATION, "<var declaration>");
    result_ = VarDeclaration_0(builder_, level_ + 1);
    result_ = result_ && identListDecl(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, consumeToken(builder_, COLON));
    result_ = pinned_ && report_error_(builder_, TypeDecl(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, VarDeclaration_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, VarDeclaration_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_name);
    return result_ || pinned_;
  }

  // customAttributes*
  private static boolean VarDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDeclaration_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!customAttributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "VarDeclaration_0", pos_)) break;
    }
    return true;
  }

  // [VarValueSpec]
  private static boolean VarDeclaration_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDeclaration_4")) return false;
    VarValueSpec(builder_, level_ + 1);
    return true;
  }

  // hintingDirective*
  private static boolean VarDeclaration_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarDeclaration_5")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!hintingDirective(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "VarDeclaration_5", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // varKey varDeclarations [";"]
  public static boolean VarSection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarSection")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VAR_SECTION, "<var section>");
    result_ = varKey(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, varDeclarations(builder_, level_ + 1));
    result_ = pinned_ && VarSection_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_decl_section);
    return result_ || pinned_;
  }

  // [";"]
  private static boolean VarSection_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarSection_2")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  /* ********************************************************** */
  // ABSOLUTE FullyQualifiedIdent | ABSOLUTE ConstExpressionOrd | EQ ConstExpression
  public static boolean VarValueSpec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarValueSpec")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VAR_VALUE_SPEC, "<var value spec>");
    result_ = VarValueSpec_0(builder_, level_ + 1);
    if (!result_) result_ = VarValueSpec_1(builder_, level_ + 1);
    if (!result_) result_ = VarValueSpec_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_semi);
    return result_;
  }

  // ABSOLUTE FullyQualifiedIdent
  private static boolean VarValueSpec_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarValueSpec_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ABSOLUTE);
    result_ = result_ && FullyQualifiedIdent(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ABSOLUTE ConstExpressionOrd
  private static boolean VarValueSpec_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarValueSpec_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ABSOLUTE);
    result_ = result_ && ConstExpressionOrd(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // EQ ConstExpression
  private static boolean VarValueSpec_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "VarValueSpec_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EQ);
    result_ = result_ && ConstExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // [STRICT] PRIVATE | [STRICT] PROTECTED | PUBLIC | PUBLISHED | AUTOMATED
  public static boolean Visibility(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Visibility")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, VISIBILITY, "<visibility>");
    result_ = Visibility_0(builder_, level_ + 1);
    if (!result_) result_ = Visibility_1(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PUBLIC);
    if (!result_) result_ = consumeToken(builder_, PUBLISHED);
    if (!result_) result_ = consumeToken(builder_, AUTOMATED);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // [STRICT] PRIVATE
  private static boolean Visibility_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Visibility_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Visibility_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PRIVATE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [STRICT]
  private static boolean Visibility_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Visibility_0_0")) return false;
    consumeToken(builder_, STRICT);
    return true;
  }

  // [STRICT] PROTECTED
  private static boolean Visibility_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Visibility_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Visibility_1_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PROTECTED);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [STRICT]
  private static boolean Visibility_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "Visibility_1_0")) return false;
    consumeToken(builder_, STRICT);
    return true;
  }

  /* ********************************************************** */
  // WHILE whileExpression doStatement
  public static boolean WhileStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WhileStatement")) return false;
    if (!nextTokenIs(builder_, WHILE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, WHILE_STATEMENT, null);
    result_ = consumeToken(builder_, WHILE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, whileExpression(builder_, level_ + 1));
    result_ = pinned_ && doStatement(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // WITH withArgument doStatement
  public static boolean WithStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "WithStatement")) return false;
    if (!nextTokenIs(builder_, WITH)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, WITH_STATEMENT, null);
    result_ = consumeToken(builder_, WITH);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, withArgument(builder_, level_ + 1));
    result_ = pinned_ && doStatement(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // ABSTRACT | FINAL
  static boolean abstractDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "abstractDirective")) return false;
    if (!nextTokenIs(builder_, "", ABSTRACT, FINAL)) return false;
    boolean result_;
    result_ = consumeToken(builder_, ABSTRACT);
    if (!result_) result_ = consumeToken(builder_, FINAL);
    return result_;
  }

  /* ********************************************************** */
  // PLUS | MINUS | OR | XOR
  public static boolean addOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "addOp")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, ADD_OP, "<add op>");
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, OR);
    if (!result_) result_ = consumeToken(builder_, XOR);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // "," [ArrayIndex]
  static boolean arrayIndexRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayIndexRest")) return false;
    if (!nextTokenIs(builder_, COMMA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && arrayIndexRest_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ArrayIndex]
  private static boolean arrayIndexRest_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayIndexRest_1")) return false;
    ArrayIndex(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // "[" [ArrayIndex] arrayIndexRest* "]"
  static boolean arrayIndexes(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayIndexes")) return false;
    if (!nextTokenIs(builder_, LBRACK)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, LBRACK);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, arrayIndexes_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, arrayIndexes_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RBRACK) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ArrayIndex]
  private static boolean arrayIndexes_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayIndexes_1")) return false;
    ArrayIndex(builder_, level_ + 1);
    return true;
  }

  // arrayIndexRest*
  private static boolean arrayIndexes_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arrayIndexes_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!arrayIndexRest(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "arrayIndexes_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // CONST | TypeDecl
  static boolean arraySubType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arraySubType")) return false;
    boolean result_;
    result_ = consumeToken(builder_, CONST);
    if (!result_) result_ = TypeDecl(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // assemblerItem*
  static boolean asmBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "asmBlock")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    while (true) {
      int pos_ = current_position_(builder_);
      if (!assemblerItem(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "asmBlock", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, true, false, PascalParser::rec_struct_outer);
    return true;
  }

  /* ********************************************************** */
  // ',' | '[' | ']' | ':' | '+' | '-' | '*' | '/' | '@' | RefNamedIdent | NUMBER_INT | NUMBER_HEX | NUMBER_OCT | NUMBER_BIN | '.NOFRAME'
  static boolean assemblerItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assemblerItem")) return false;
    boolean result_;
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, LBRACK);
    if (!result_) result_ = consumeToken(builder_, RBRACK);
    if (!result_) result_ = consumeToken(builder_, COLON);
    if (!result_) result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, MULT);
    if (!result_) result_ = consumeToken(builder_, DIV);
    if (!result_) result_ = consumeToken(builder_, AT);
    if (!result_) result_ = RefNamedIdent(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, NUMBER_INT);
    if (!result_) result_ = consumeToken(builder_, NUMBER_HEX);
    if (!result_) result_ = consumeToken(builder_, NUMBER_OCT);
    if (!result_) result_ = consumeToken(builder_, NUMBER_BIN);
    if (!result_) result_ = consumeToken(builder_, ".NOFRAME");
    return result_;
  }

  /* ********************************************************** */
  // "[" "assembly" ":" CustomAttributeDecl "]"
  static boolean assemblyAttribute(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assemblyAttribute")) return false;
    if (!nextTokenIs(builder_, LBRACK)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, LBRACK);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, consumeToken(builder_, "assembly"));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, COLON)) && result_;
    result_ = pinned_ && report_error_(builder_, CustomAttributeDecl(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RBRACK) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // InlineVarDeclaration | Expression
  static boolean assignLeftPart(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "assignLeftPart")) return false;
    boolean result_;
    result_ = InlineVarDeclaration(builder_, level_ + 1);
    if (!result_) result_ = Expression(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // (MESSAGE Expression) | STATIC | DYNAMIC | OVERRIDE | VIRTUAL
  static boolean bindingDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bindingDirective")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = bindingDirective_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, STATIC);
    if (!result_) result_ = consumeToken(builder_, DYNAMIC);
    if (!result_) result_ = consumeToken(builder_, OVERRIDE);
    if (!result_) result_ = consumeToken(builder_, VIRTUAL);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // MESSAGE Expression
  private static boolean bindingDirective_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bindingDirective_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, MESSAGE);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CDECL | PASCAL | REGISTER | SAFECALL | STDCALL | EXPORT | varagrs
  static boolean callConvention(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "callConvention")) return false;
    boolean result_;
    result_ = consumeToken(builder_, CDECL);
    if (!result_) result_ = consumeToken(builder_, PASCAL);
    if (!result_) result_ = consumeToken(builder_, REGISTER);
    if (!result_) result_ = consumeToken(builder_, SAFECALL);
    if (!result_) result_ = consumeToken(builder_, STDCALL);
    if (!result_) result_ = consumeToken(builder_, EXPORT);
    if (!result_) result_ = varagrs(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // CASE ctrlStmtExpression OF CaseItem*
  static boolean caseBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseBody")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, CASE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ctrlStmtExpression(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, OF)) && result_;
    result_ = pinned_ && caseBody_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_case);
    return result_ || pinned_;
  }

  // CaseItem*
  private static boolean caseBody_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseBody_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!CaseItem(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "caseBody_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // caseLabelPart ("," caseLabelPart)* ":"
  static boolean caseLabel(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseLabel")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = caseLabelPart(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, caseLabel_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, COLON) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // ("," caseLabelPart)*
  private static boolean caseLabel_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseLabel_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!caseLabel_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "caseLabel_1", pos_)) break;
    }
    return true;
  }

  // "," caseLabelPart
  private static boolean caseLabel_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseLabel_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && caseLabelPart(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ConstExpressionOrd [RANGE ConstExpressionOrd]
  static boolean caseLabelPart(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseLabelPart")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ConstExpressionOrd(builder_, level_ + 1);
    result_ = result_ && caseLabelPart_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [RANGE ConstExpressionOrd]
  private static boolean caseLabelPart_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseLabelPart_1")) return false;
    caseLabelPart_1_0(builder_, level_ + 1);
    return true;
  }

  // RANGE ConstExpressionOrd
  private static boolean caseLabelPart_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "caseLabelPart_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, RANGE);
    result_ = result_ && ConstExpressionOrd(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // classHead (classFull | classShort)
  static boolean classDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classDecl")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = classHead(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && classDecl_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // classFull | classShort
  private static boolean classDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classDecl_1")) return false;
    boolean result_;
    result_ = classFull(builder_, level_ + 1);
    if (!result_) result_ = classShort(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // ClassField ";"
  static boolean classFieldSemi(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classFieldSemi")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = ClassField(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_struct_field);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // (CLASS | INTERFACE | OBJC_CLASS | OBJC_PROTOCOL) [EXTERNAL [externalSpecifier]]
  static boolean classForwardDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classForwardDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = classForwardDecl_0(builder_, level_ + 1);
    result_ = result_ && classForwardDecl_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // CLASS | INTERFACE | OBJC_CLASS | OBJC_PROTOCOL
  private static boolean classForwardDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classForwardDecl_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, CLASS);
    if (!result_) result_ = consumeToken(builder_, INTERFACE);
    if (!result_) result_ = consumeToken(builder_, OBJC_CLASS);
    if (!result_) result_ = consumeToken(builder_, OBJC_PROTOCOL);
    return result_;
  }

  // [EXTERNAL [externalSpecifier]]
  private static boolean classForwardDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classForwardDecl_1")) return false;
    classForwardDecl_1_0(builder_, level_ + 1);
    return true;
  }

  // EXTERNAL [externalSpecifier]
  private static boolean classForwardDecl_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classForwardDecl_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXTERNAL);
    result_ = result_ && classForwardDecl_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [externalSpecifier]
  private static boolean classForwardDecl_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classForwardDecl_1_0_1")) return false;
    externalSpecifier(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // [classParentWithRecovery] structItem* END
  static boolean classFull(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classFull")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = classFull_0(builder_, level_ + 1);
    result_ = result_ && classFull_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [classParentWithRecovery]
  private static boolean classFull_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classFull_0")) return false;
    classParentWithRecovery(builder_, level_ + 1);
    return true;
  }

  // structItem*
  private static boolean classFull_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classFull_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!structItem(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "classFull_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (CLASS | objc_decl) [ClassState]
  static boolean classHead(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classHead")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = classHead_0(builder_, level_ + 1);
    result_ = result_ && classHead_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // CLASS | objc_decl
  private static boolean classHead_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classHead_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, CLASS);
    if (!result_) result_ = objc_decl(builder_, level_ + 1);
    return result_;
  }

  // [ClassState]
  private static boolean classHead_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classHead_1")) return false;
    ClassState(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // [classParentWithRecovery] FOR TypeID structItem*
  static boolean classHelperBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classHelperBody")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = classHelperBody_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, FOR);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, TypeID(builder_, level_ + 1));
    result_ = pinned_ && classHelperBody_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_struct_outer);
    return result_ || pinned_;
  }

  // [classParentWithRecovery]
  private static boolean classHelperBody_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classHelperBody_0")) return false;
    classParentWithRecovery(builder_, level_ + 1);
    return true;
  }

  // structItem*
  private static boolean classHelperBody_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classHelperBody_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!structItem(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "classHelperBody_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [CLASS] OPERATOR operatorName FormalParameterSection ":" TypeDecl
  static boolean classOperatorDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classOperatorDecl")) return false;
    if (!nextTokenIs(builder_, "", CLASS, OPERATOR)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = classOperatorDecl_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, OPERATOR);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, operatorName(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, FormalParameterSection(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, COLON)) && result_;
    result_ = pinned_ && TypeDecl(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [CLASS]
  private static boolean classOperatorDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classOperatorDecl_0")) return false;
    consumeToken(builder_, CLASS);
    return true;
  }

  /* ********************************************************** */
  // ("," TypeID)*
  static boolean classParentRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classParentRest")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!classParentRest_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "classParentRest", pos_)) break;
    }
    return true;
  }

  // "," TypeID
  private static boolean classParentRest_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classParentRest_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && TypeID(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ClassParent
  static boolean classParentWORec(PsiBuilder builder_, int level_) {
    return ClassParent(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // ClassParent
  static boolean classParentWithRecovery(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classParentWithRecovery")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = ClassParent(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_classparent);
    return result_;
  }

  /* ********************************************************** */
  // "readonly" | "writeonly" | dispIDDirective
  static boolean classPropertyDispInterface(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classPropertyDispInterface")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "readonly");
    if (!result_) result_ = consumeToken(builder_, "writeonly");
    if (!result_) result_ = dispIDDirective(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // READ RefNamedIdent | WRITE RefNamedIdent | "add" RefNamedIdent | "remove" RefNamedIdent
  static boolean classPropertyReadWrite(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classPropertyReadWrite")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = classPropertyReadWrite_0(builder_, level_ + 1);
    if (!result_) result_ = classPropertyReadWrite_1(builder_, level_ + 1);
    if (!result_) result_ = classPropertyReadWrite_2(builder_, level_ + 1);
    if (!result_) result_ = classPropertyReadWrite_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // READ RefNamedIdent
  private static boolean classPropertyReadWrite_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classPropertyReadWrite_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, READ);
    result_ = result_ && RefNamedIdent(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // WRITE RefNamedIdent
  private static boolean classPropertyReadWrite_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classPropertyReadWrite_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, WRITE);
    result_ = result_ && RefNamedIdent(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // "add" RefNamedIdent
  private static boolean classPropertyReadWrite_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classPropertyReadWrite_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "add");
    result_ = result_ && RefNamedIdent(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // "remove" RefNamedIdent
  private static boolean classPropertyReadWrite_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "classPropertyReadWrite_3")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "remove");
    result_ = result_ && RefNamedIdent(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // classParentWithRecovery
  static boolean classShort(PsiBuilder builder_, int level_) {
    return classParentWithRecovery(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // "(" ConstExpressionOrd ")"
  static boolean codePageNumber(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "codePageNumber")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, ConstExpressionOrd(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // [CLASS] VarSection | ClassProperty | ConstSection | TypeSection
  static boolean commonDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "commonDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commonDecl_0(builder_, level_ + 1);
    if (!result_) result_ = ClassProperty(builder_, level_ + 1);
    if (!result_) result_ = ConstSection(builder_, level_ + 1);
    if (!result_) result_ = TypeSection(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [CLASS] VarSection
  private static boolean commonDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "commonDecl_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = commonDecl_0_0(builder_, level_ + 1);
    result_ = result_ && VarSection(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [CLASS]
  private static boolean commonDecl_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "commonDecl_0_0")) return false;
    consumeToken(builder_, CLASS);
    return true;
  }

  /* ********************************************************** */
  // ClassTypeTypeDecl | structTypeDecl | ArrayType | SetType | FileType
  static boolean complexType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "complexType")) return false;
    boolean result_;
    result_ = ClassTypeTypeDecl(builder_, level_ + 1);
    if (!result_) result_ = structTypeDecl(builder_, level_ + 1);
    if (!result_) result_ = ArrayType(builder_, level_ + 1);
    if (!result_) result_ = SetType(builder_, level_ + 1);
    if (!result_) result_ = FileType(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // ConstDeclaration+
  static boolean constDeclarations(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constDeclarations")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = ConstDeclaration(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!ConstDeclaration(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "constDeclarations", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_block_local_end);
    return result_;
  }

  /* ********************************************************** */
  // RecordConstExpr | ArrayConstExpr | Expression
  static boolean constExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constExpr")) return false;
    boolean result_;
    result_ = RecordConstExpr(builder_, level_ + 1);
    if (!result_) result_ = ArrayConstExpr(builder_, level_ + 1);
    if (!result_) result_ = Expression(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // CONST |	RESOURCESTRING
  static boolean constKey(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "constKey")) return false;
    if (!nextTokenIs(builder_, "", CONST, RESOURCESTRING)) return false;
    boolean result_;
    result_ = consumeToken(builder_, CONST);
    if (!result_) result_ = consumeToken(builder_, RESOURCESTRING);
    return result_;
  }

  /* ********************************************************** */
  // controlchar+
  static boolean controlString(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "controlString")) return false;
    if (!nextTokenIs(builder_, CHARNUM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = controlchar(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!controlchar(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "controlString", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CHARNUM NUMBER_INT | CHARNUM NUMBER_HEX
  static boolean controlchar(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "controlchar")) return false;
    if (!nextTokenIs(builder_, CHARNUM)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parseTokens(builder_, 0, CHARNUM, NUMBER_INT);
    if (!result_) result_ = parseTokens(builder_, 0, CHARNUM, NUMBER_HEX);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // Expression
  static boolean ctrlStmtExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ctrlStmtExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = Expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_statement_mid);
    return result_;
  }

  /* ********************************************************** */
  // LBRACK CustomAttributeList RBRACK | assemblyAttribute
  static boolean customAttributes(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "customAttributes")) return false;
    if (!nextTokenIs(builder_, LBRACK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = customAttributes_0(builder_, level_ + 1);
    if (!result_) result_ = assemblyAttribute(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // LBRACK CustomAttributeList RBRACK
  private static boolean customAttributes_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "customAttributes_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACK);
    result_ = result_ && CustomAttributeList(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACK);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // RoutineImplDecl | commonDecl | LabelDeclSection | ExportsSection | assemblyAttribute
  static boolean declSection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declSection")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = RoutineImplDecl(builder_, level_ + 1);
    if (!result_) result_ = commonDecl(builder_, level_ + 1);
    if (!result_) result_ = LabelDeclSection(builder_, level_ + 1);
    if (!result_) result_ = ExportsSection(builder_, level_ + 1);
    if (!result_) result_ = assemblyAttribute(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_decl_section);
    return result_;
  }

  /* ********************************************************** */
  // RoutineImplDeclNested1 | commonDecl | LabelDeclSection
  static boolean declSectionNested(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declSectionNested")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = RoutineImplDeclNested1(builder_, level_ + 1);
    if (!result_) result_ = commonDecl(builder_, level_ + 1);
    if (!result_) result_ = LabelDeclSection(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_decl_section);
    return result_;
  }

  /* ********************************************************** */
  // RoutineImplDeclWoNested | commonDecl | LabelDeclSection
  static boolean declSectionNested1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declSectionNested1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = RoutineImplDeclWoNested(builder_, level_ + 1);
    if (!result_) result_ = commonDecl(builder_, level_ + 1);
    if (!result_) result_ = LabelDeclSection(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_decl_section);
    return result_;
  }

  /* ********************************************************** */
  // commonDecl | LabelDeclSection
  static boolean declSectionWONested(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declSectionWONested")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = commonDecl(builder_, level_ + 1);
    if (!result_) result_ = LabelDeclSection(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_section_nested);
    return result_;
  }

  /* ********************************************************** */
  // "," Expression {}
  static boolean designatorsRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "designatorsRest")) return false;
    if (!nextTokenIs(builder_, COMMA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && Expression(builder_, level_ + 1);
    result_ = result_ && designatorsRest_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {}
  private static boolean designatorsRest_2(PsiBuilder builder_, int level_) {
    return true;
  }

  /* ********************************************************** */
  // DISPID Expression [";"]
  static boolean dispIDDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dispIDDirective")) return false;
    if (!nextTokenIs(builder_, DISPID)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, DISPID);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, Expression(builder_, level_ + 1));
    result_ = pinned_ && dispIDDirective_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [";"]
  private static boolean dispIDDirective_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "dispIDDirective_2")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  /* ********************************************************** */
  // DO
  static boolean doKey(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "doKey")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, DO);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_doKey);
    return result_;
  }

  /* ********************************************************** */
  // doKey Statement
  static boolean doStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "doStatement")) return false;
    if (!nextTokenIs(builder_, DO)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = doKey(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && Statement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // NamedIdentDecl [(EQ | ASSIGN) Expression] {}
  static boolean enumEl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumEl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = NamedIdentDecl(builder_, level_ + 1);
    result_ = result_ && enumEl_1(builder_, level_ + 1);
    result_ = result_ && enumEl_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [(EQ | ASSIGN) Expression]
  private static boolean enumEl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumEl_1")) return false;
    enumEl_1_0(builder_, level_ + 1);
    return true;
  }

  // (EQ | ASSIGN) Expression
  private static boolean enumEl_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumEl_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = enumEl_1_0_0(builder_, level_ + 1);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // EQ | ASSIGN
  private static boolean enumEl_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumEl_1_0_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, EQ);
    if (!result_) result_ = consumeToken(builder_, ASSIGN);
    return result_;
  }

  // {}
  private static boolean enumEl_2(PsiBuilder builder_, int level_) {
    return true;
  }

  /* ********************************************************** */
  // "," enumEl
  static boolean enumRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "enumRest")) return false;
    if (!nextTokenIs(builder_, COMMA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && enumEl(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // EXCEPT
  static boolean exceptKey(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exceptKey")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, EXCEPT);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_doKey);
    return result_;
  }

  /* ********************************************************** */
  // [FormalParameterSection] [INDEX Expression] ["name" Expression] ["resident"]
  static boolean exportItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportItem")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = exportItem_0(builder_, level_ + 1);
    result_ = result_ && exportItem_1(builder_, level_ + 1);
    result_ = result_ && exportItem_2(builder_, level_ + 1);
    result_ = result_ && exportItem_3(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [FormalParameterSection]
  private static boolean exportItem_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportItem_0")) return false;
    FormalParameterSection(builder_, level_ + 1);
    return true;
  }

  // [INDEX Expression]
  private static boolean exportItem_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportItem_1")) return false;
    exportItem_1_0(builder_, level_ + 1);
    return true;
  }

  // INDEX Expression
  private static boolean exportItem_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportItem_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INDEX);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ["name" Expression]
  private static boolean exportItem_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportItem_2")) return false;
    exportItem_2_0(builder_, level_ + 1);
    return true;
  }

  // "name" Expression
  private static boolean exportItem_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportItem_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "name");
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ["resident"]
  private static boolean exportItem_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportItem_3")) return false;
    consumeToken(builder_, "resident");
    return true;
  }

  /* ********************************************************** */
  // [GENERIC] [CLASS] FUNCTION procName [genericDefinition] [FormalParameterSection] ":" customAttributes* TypeDecl
  static boolean exportedFunc(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedFunc")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = exportedFunc_0(builder_, level_ + 1);
    result_ = result_ && exportedFunc_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, FUNCTION);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, procName(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, exportedFunc_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, exportedFunc_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, COLON)) && result_;
    result_ = pinned_ && report_error_(builder_, exportedFunc_7(builder_, level_ + 1)) && result_;
    result_ = pinned_ && TypeDecl(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [GENERIC]
  private static boolean exportedFunc_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedFunc_0")) return false;
    consumeToken(builder_, GENERIC);
    return true;
  }

  // [CLASS]
  private static boolean exportedFunc_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedFunc_1")) return false;
    consumeToken(builder_, CLASS);
    return true;
  }

  // [genericDefinition]
  private static boolean exportedFunc_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedFunc_4")) return false;
    genericDefinition(builder_, level_ + 1);
    return true;
  }

  // [FormalParameterSection]
  private static boolean exportedFunc_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedFunc_5")) return false;
    FormalParameterSection(builder_, level_ + 1);
    return true;
  }

  // customAttributes*
  private static boolean exportedFunc_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedFunc_7")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!customAttributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "exportedFunc_7", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [GENERIC] [CLASS] FUNCTION procName [genericDefinition] [FormalParameterSection] [":" customAttributes* TypeDecl]
  static boolean exportedFuncImpl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedFuncImpl")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = exportedFuncImpl_0(builder_, level_ + 1);
    result_ = result_ && exportedFuncImpl_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, FUNCTION);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, procName(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, exportedFuncImpl_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, exportedFuncImpl_5(builder_, level_ + 1)) && result_;
    result_ = pinned_ && exportedFuncImpl_6(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [GENERIC]
  private static boolean exportedFuncImpl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedFuncImpl_0")) return false;
    consumeToken(builder_, GENERIC);
    return true;
  }

  // [CLASS]
  private static boolean exportedFuncImpl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedFuncImpl_1")) return false;
    consumeToken(builder_, CLASS);
    return true;
  }

  // [genericDefinition]
  private static boolean exportedFuncImpl_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedFuncImpl_4")) return false;
    genericDefinition(builder_, level_ + 1);
    return true;
  }

  // [FormalParameterSection]
  private static boolean exportedFuncImpl_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedFuncImpl_5")) return false;
    FormalParameterSection(builder_, level_ + 1);
    return true;
  }

  // [":" customAttributes* TypeDecl]
  private static boolean exportedFuncImpl_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedFuncImpl_6")) return false;
    exportedFuncImpl_6_0(builder_, level_ + 1);
    return true;
  }

  // ":" customAttributes* TypeDecl
  private static boolean exportedFuncImpl_6_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedFuncImpl_6_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COLON);
    result_ = result_ && exportedFuncImpl_6_0_1(builder_, level_ + 1);
    result_ = result_ && TypeDecl(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // customAttributes*
  private static boolean exportedFuncImpl_6_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedFuncImpl_6_0_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!customAttributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "exportedFuncImpl_6_0_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // [GENERIC] [CLASS] methodKey procName [genericDefinition] [FormalParameterSection]
  static boolean exportedProc(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedProc")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = exportedProc_0(builder_, level_ + 1);
    result_ = result_ && exportedProc_1(builder_, level_ + 1);
    result_ = result_ && methodKey(builder_, level_ + 1);
    pinned_ = result_; // pin = 3
    result_ = result_ && report_error_(builder_, procName(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, exportedProc_4(builder_, level_ + 1)) && result_;
    result_ = pinned_ && exportedProc_5(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [GENERIC]
  private static boolean exportedProc_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedProc_0")) return false;
    consumeToken(builder_, GENERIC);
    return true;
  }

  // [CLASS]
  private static boolean exportedProc_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedProc_1")) return false;
    consumeToken(builder_, CLASS);
    return true;
  }

  // [genericDefinition]
  private static boolean exportedProc_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedProc_4")) return false;
    genericDefinition(builder_, level_ + 1);
    return true;
  }

  // [FormalParameterSection]
  private static boolean exportedProc_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "exportedProc_5")) return false;
    FormalParameterSection(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // Expression
  static boolean expressionOrd(PsiBuilder builder_, int level_) {
    return Expression(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // "name" ConstExpression | INDEX ConstExpressionOrd
  static boolean externalSpecifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "externalSpecifier")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = externalSpecifier_0(builder_, level_ + 1);
    if (!result_) result_ = externalSpecifier_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // "name" ConstExpression
  private static boolean externalSpecifier_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "externalSpecifier_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "name");
    result_ = result_ && ConstExpression(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // INDEX ConstExpressionOrd
  private static boolean externalSpecifier_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "externalSpecifier_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INDEX);
    result_ = result_ && ConstExpressionOrd(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // customAttributes* identListDecl ":" TypeDecl hintingDirective*
  static boolean field(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = field_0(builder_, level_ + 1);
    result_ = result_ && identListDecl(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, consumeToken(builder_, COLON));
    result_ = pinned_ && report_error_(builder_, TypeDecl(builder_, level_ + 1)) && result_;
    result_ = pinned_ && field_4(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_struct_field);
    return result_ || pinned_;
  }

  // customAttributes*
  private static boolean field_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!customAttributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "field_0", pos_)) break;
    }
    return true;
  }

  // hintingDirective*
  private static boolean field_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_4")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!hintingDirective(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "field_4", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ExitStatement | BreakStatement | ContinueStatement | GotoStatement
  static boolean flowStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "flowStatement")) return false;
    boolean result_;
    result_ = ExitStatement(builder_, level_ + 1);
    if (!result_) result_ = BreakStatement(builder_, level_ + 1);
    if (!result_) result_ = ContinueStatement(builder_, level_ + 1);
    if (!result_) result_ = GotoStatement(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // ":=" FromExpression (TO | DOWNTO)
  static boolean forCycle(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forCycle")) return false;
    if (!nextTokenIs(builder_, ASSIGN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, ASSIGN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, FromExpression(builder_, level_ + 1));
    result_ = pinned_ && forCycle_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // TO | DOWNTO
  private static boolean forCycle_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forCycle_2")) return false;
    boolean result_;
    result_ = consumeToken(builder_, TO);
    if (!result_) result_ = consumeToken(builder_, DOWNTO);
    return result_;
  }

  /* ********************************************************** */
  // (forCycle | IN) Expression
  static boolean forCycleCondition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forCycleCondition")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = forCycleCondition_0(builder_, level_ + 1);
    result_ = result_ && Expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_statement_mid);
    return result_;
  }

  // forCycle | IN
  private static boolean forCycleCondition_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forCycleCondition_0")) return false;
    boolean result_;
    result_ = forCycle(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, IN);
    return result_;
  }

  /* ********************************************************** */
  // ForInlineDeclaration | FullyQualifiedIdent
  static boolean forCycleIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "forCycleIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null, "<Identifier>");
    result_ = ForInlineDeclaration(builder_, level_ + 1);
    if (!result_) result_ = FullyQualifiedIdent(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // FormalParameter (";" FormalParameter)*
  static boolean formalParameterList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "formalParameterList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = FormalParameter(builder_, level_ + 1);
    result_ = result_ && formalParameterList_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (";" FormalParameter)*
  private static boolean formalParameterList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "formalParameterList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!formalParameterList_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "formalParameterList_1", pos_)) break;
    }
    return true;
  }

  // ";" FormalParameter
  private static boolean formalParameterList_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "formalParameterList_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMI);
    result_ = result_ && FormalParameter(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // "(" [ formalParameterList ] ")"
  static boolean formalParameterSect(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "formalParameterSect")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, formalParameterSect_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_formal_param_sec);
    return result_ || pinned_;
  }

  // [ formalParameterList ]
  private static boolean formalParameterSect_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "formalParameterSect_1")) return false;
    formalParameterList(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // FUNCTION [FormalParameterSection] ":" customAttributes* TypeDecl procTypeDirectives
  static boolean funcHeading(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "funcHeading")) return false;
    if (!nextTokenIs(builder_, FUNCTION)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, FUNCTION);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, funcHeading_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, COLON)) && result_;
    result_ = pinned_ && report_error_(builder_, funcHeading_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, TypeDecl(builder_, level_ + 1)) && result_;
    result_ = pinned_ && procTypeDirectives(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [FormalParameterSection]
  private static boolean funcHeading_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "funcHeading_1")) return false;
    FormalParameterSection(builder_, level_ + 1);
    return true;
  }

  // customAttributes*
  private static boolean funcHeading_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "funcHeading_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!customAttributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "funcHeading_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (OVERLOAD | oldCallConventionDirective | INLINE | ASSEMBLER | callConvention | hintingDirective | REINTRODUCE | bindingDirective | abstractDirective) ";"
  static boolean functionDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDirective")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = functionDirective_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // OVERLOAD | oldCallConventionDirective | INLINE | ASSEMBLER | callConvention | hintingDirective | REINTRODUCE | bindingDirective | abstractDirective
  private static boolean functionDirective_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "functionDirective_0")) return false;
    boolean result_;
    result_ = consumeToken(builder_, OVERLOAD);
    if (!result_) result_ = oldCallConventionDirective(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, INLINE);
    if (!result_) result_ = consumeToken(builder_, ASSEMBLER);
    if (!result_) result_ = callConvention(builder_, level_ + 1);
    if (!result_) result_ = hintingDirective(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, REINTRODUCE);
    if (!result_) result_ = bindingDirective(builder_, level_ + 1);
    if (!result_) result_ = abstractDirective(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // GenericConstraint genericConstraintsRest*
  static boolean genericConstraintList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "genericConstraintList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = GenericConstraint(builder_, level_ + 1);
    result_ = result_ && genericConstraintList_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // genericConstraintsRest*
  private static boolean genericConstraintList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "genericConstraintList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!genericConstraintsRest(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "genericConstraintList_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // "," GenericConstraint
  static boolean genericConstraintsRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "genericConstraintsRest")) return false;
    if (!nextTokenIs(builder_, COMMA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && GenericConstraint(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // "<" typeParamList ">"
  static boolean genericDefinition(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "genericDefinition")) return false;
    if (!nextTokenIs(builder_, LT)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, LT);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, typeParamList(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, GT) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // (Handler+ [ELSE statementList]) | statementList
  static boolean handlerList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "handlerList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = handlerList_0(builder_, level_ + 1);
    if (!result_) result_ = statementList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // Handler+ [ELSE statementList]
  private static boolean handlerList_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "handlerList_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = handlerList_0_0(builder_, level_ + 1);
    result_ = result_ && handlerList_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // Handler+
  private static boolean handlerList_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "handlerList_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = Handler(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!Handler(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "handlerList_0_0", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ELSE statementList]
  private static boolean handlerList_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "handlerList_0_1")) return false;
    handlerList_0_1_0(builder_, level_ + 1);
    return true;
  }

  // ELSE statementList
  private static boolean handlerList_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "handlerList_0_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, ELSE);
    result_ = result_ && statementList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ON [NamedIdent ":"] TypeID
  static boolean handlerStart(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "handlerStart")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, ON);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, handlerStart_1(builder_, level_ + 1));
    result_ = pinned_ && TypeID(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_statement_mid);
    return result_ || pinned_;
  }

  // [NamedIdent ":"]
  private static boolean handlerStart_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "handlerStart_1")) return false;
    handlerStart_1_0(builder_, level_ + 1);
    return true;
  }

  // NamedIdent ":"
  private static boolean handlerStart_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "handlerStart_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = NamedIdent(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (DEPRECATED [StringFactor]) | EXPERIMENTAL | PLATFORM | LIBRARY
  static boolean hintingDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hintingDirective")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = hintingDirective_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, EXPERIMENTAL);
    if (!result_) result_ = consumeToken(builder_, PLATFORM);
    if (!result_) result_ = consumeToken(builder_, LIBRARY);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // DEPRECATED [StringFactor]
  private static boolean hintingDirective_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hintingDirective_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DEPRECATED);
    result_ = result_ && hintingDirective_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [StringFactor]
  private static boolean hintingDirective_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "hintingDirective_0_1")) return false;
    StringFactor(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // identListItem identListRest*
  static boolean identList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identListItem(builder_, level_ + 1);
    result_ = result_ && identList_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identListRest*
  private static boolean identList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!identListRest(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "identList_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // identListDeclItem identListDeclRest*
  static boolean identListDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identListDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identListDeclItem(builder_, level_ + 1);
    result_ = result_ && identListDecl_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identListDeclRest*
  private static boolean identListDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identListDecl_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!identListDeclRest(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "identListDecl_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // NamedIdentDecl
  static boolean identListDeclItem(PsiBuilder builder_, int level_) {
    return NamedIdentDecl(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // "," identListDeclItem
  static boolean identListDeclRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identListDeclRest")) return false;
    if (!nextTokenIs(builder_, COMMA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && identListDeclItem(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // NamedIdent
  static boolean identListItem(PsiBuilder builder_, int level_) {
    return NamedIdent(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // "," identListItem
  static boolean identListRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identListRest")) return false;
    if (!nextTokenIs(builder_, COMMA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && identListItem(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // EscapedIdent | KeywordIdent | NAME
  static boolean identifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier")) return false;
    boolean result_;
    result_ = EscapedIdent(builder_, level_ + 1);
    if (!result_) result_ = KeywordIdent(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, NAME);
    return result_;
  }

  /* ********************************************************** */
  // "," NamedIdent
  static boolean identsRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identsRest")) return false;
    if (!nextTokenIs(builder_, COMMA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && NamedIdent(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // THEN IfThenStatement
  static boolean ifThenStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ifThenStatement")) return false;
    if (!nextTokenIs(builder_, THEN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, THEN);
    pinned_ = result_; // pin = 1
    result_ = result_ && IfThenStatement(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // [intUsesClause] declSection+ [unitBlock]
  static boolean include_impl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_impl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = include_impl_0(builder_, level_ + 1);
    result_ = result_ && include_impl_1(builder_, level_ + 1);
    result_ = result_ && include_impl_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_module_start);
    return result_;
  }

  // [intUsesClause]
  private static boolean include_impl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_impl_0")) return false;
    intUsesClause(builder_, level_ + 1);
    return true;
  }

  // declSection+
  private static boolean include_impl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_impl_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = declSection(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!declSection(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "include_impl_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [unitBlock]
  private static boolean include_impl_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_impl_2")) return false;
    unitBlock(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // [intUsesClause] interfaceDecl+
  static boolean include_intf(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_intf")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = include_intf_0(builder_, level_ + 1);
    result_ = result_ && include_intf_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_module_start);
    return result_;
  }

  // [intUsesClause]
  private static boolean include_intf_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_intf_0")) return false;
    intUsesClause(builder_, level_ + 1);
    return true;
  }

  // interfaceDecl+
  private static boolean include_intf_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "include_intf_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = interfaceDecl(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!interfaceDecl(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "include_intf_1", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // '[' Expr (',' Expr) * ']'
  public static boolean indexList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexList")) return false;
    if (!nextTokenIs(builder_, LBRACK)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, INDEX_LIST, null);
    result_ = consumeToken(builder_, LBRACK);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, Expr(builder_, level_ + 1, -1));
    result_ = pinned_ && report_error_(builder_, indexList_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, RBRACK) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // (',' Expr) *
  private static boolean indexList_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexList_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!indexList_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "indexList_2", pos_)) break;
    }
    return true;
  }

  // ',' Expr
  private static boolean indexList_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "indexList_2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && Expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // UsesClause
  static boolean intUsesClause(PsiBuilder builder_, int level_) {
    return UsesClause(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // [classParentWithRecovery] [interfaceGuid] structItem*
  static boolean interfaceBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceBody")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = interfaceBody_0(builder_, level_ + 1);
    result_ = result_ && interfaceBody_1(builder_, level_ + 1);
    result_ = result_ && interfaceBody_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_struct_outer);
    return result_;
  }

  // [classParentWithRecovery]
  private static boolean interfaceBody_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceBody_0")) return false;
    classParentWithRecovery(builder_, level_ + 1);
    return true;
  }

  // [interfaceGuid]
  private static boolean interfaceBody_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceBody_1")) return false;
    interfaceGuid(builder_, level_ + 1);
    return true;
  }

  // structItem*
  private static boolean interfaceBody_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceBody_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!structItem(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "interfaceBody_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // commonDecl | routineDecl | ExportsSection | assemblyAttribute
  static boolean interfaceDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = commonDecl(builder_, level_ + 1);
    if (!result_) result_ = routineDecl(builder_, level_ + 1);
    if (!result_) result_ = ExportsSection(builder_, level_ + 1);
    if (!result_) result_ = assemblyAttribute(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_block_local_end);
    return result_;
  }

  /* ********************************************************** */
  // "[" quotedString "]"
  static boolean interfaceGuid(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceGuid")) return false;
    if (!nextTokenIs(builder_, LBRACK)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, LBRACK);
    result_ = result_ && quotedString(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, RBRACK);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // INTERFACE | DISPINTERFACE | (OBJC_PROTOCOL [EXTERNAL [externalSpecifier]])
  static boolean interfaceKey(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceKey")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, INTERFACE);
    if (!result_) result_ = consumeToken(builder_, DISPINTERFACE);
    if (!result_) result_ = interfaceKey_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OBJC_PROTOCOL [EXTERNAL [externalSpecifier]]
  private static boolean interfaceKey_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceKey_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OBJC_PROTOCOL);
    result_ = result_ && interfaceKey_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [EXTERNAL [externalSpecifier]]
  private static boolean interfaceKey_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceKey_2_1")) return false;
    interfaceKey_2_1_0(builder_, level_ + 1);
    return true;
  }

  // EXTERNAL [externalSpecifier]
  private static boolean interfaceKey_2_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceKey_2_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXTERNAL);
    result_ = result_ && interfaceKey_2_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [externalSpecifier]
  private static boolean interfaceKey_2_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "interfaceKey_2_1_0_1")) return false;
    externalSpecifier(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // NamedIdent | NUMBER_INT | NUMBER_HEX
  static boolean label(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "label")) return false;
    boolean result_;
    result_ = NamedIdent(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, NUMBER_INT);
    if (!result_) result_ = consumeToken(builder_, NUMBER_HEX);
    return result_;
  }

  /* ********************************************************** */
  // "," label {}
  static boolean labelsRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "labelsRest")) return false;
    if (!nextTokenIs(builder_, COMMA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && label(builder_, level_ + 1);
    result_ = result_ && labelsRest_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {}
  private static boolean labelsRest_2(PsiBuilder builder_, int level_) {
    return true;
  }

  /* ********************************************************** */
  // ImplDeclSection END | BlockGlobal
  static boolean libBlockGlobal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "libBlockGlobal")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = libBlockGlobal_0(builder_, level_ + 1);
    if (!result_) result_ = BlockGlobal(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ImplDeclSection END
  private static boolean libBlockGlobal_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "libBlockGlobal_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ImplDeclSection(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // COMMA constExpr
  static boolean libListRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "libListRest")) return false;
    if (!nextTokenIs(builder_, COMMA)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    result_ = result_ && constExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // "delayed" | "dependency" constExpr libListRest*
  static boolean libLoadSpec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "libLoadSpec")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "delayed");
    if (!result_) result_ = libLoadSpec_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // "dependency" constExpr libListRest*
  private static boolean libLoadSpec_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "libLoadSpec_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, "dependency");
    result_ = result_ && constExpr(builder_, level_ + 1);
    result_ = result_ && libLoadSpec_1_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // libListRest*
  private static boolean libLoadSpec_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "libLoadSpec_1_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!libListRest(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "libLoadSpec_1_2", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // PROCEDURE | CONSTRUCTOR | DESTRUCTOR
  static boolean methodKey(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "methodKey")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PROCEDURE);
    if (!result_) result_ = consumeToken(builder_, CONSTRUCTOR);
    if (!result_) result_ = consumeToken(builder_, DESTRUCTOR);
    return result_;
  }

  /* ********************************************************** */
  // LibraryModuleHead [intUsesClause] libBlockGlobal "."
  static boolean moduleLibrary(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moduleLibrary")) return false;
    if (!nextTokenIs(builder_, LIBRARY)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = LibraryModuleHead(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, moduleLibrary_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, libBlockGlobal(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, DOT) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [intUsesClause]
  private static boolean moduleLibrary_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moduleLibrary_1")) return false;
    intUsesClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // PackageModuleHead RequiresClause [ContainsClause] END "."
  static boolean modulePackage(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "modulePackage")) return false;
    if (!nextTokenIs(builder_, PACKAGE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = PackageModuleHead(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, RequiresClause(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, modulePackage_2(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeTokens(builder_, -1, END, DOT)) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ContainsClause]
  private static boolean modulePackage_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "modulePackage_2")) return false;
    ContainsClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // progWithHead | progWoHead
  static boolean moduleProgram(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moduleProgram")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = progWithHead(builder_, level_ + 1);
    if (!result_) result_ = progWoHead(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // UnitModuleHead UnitInterface UnitImplementation "."
  static boolean moduleUnit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "moduleUnit")) return false;
    if (!nextTokenIs(builder_, UNIT)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = UnitModuleHead(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, UnitInterface(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, UnitImplementation(builder_, level_ + 1)) && result_;
    result_ = pinned_ && consumeToken(builder_, DOT) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // "*" | "/" | IDIV | MOD | AND | SHL | SHR | (">"">") | AS
  public static boolean mulOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mulOp")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, MUL_OP, "<mul op>");
    result_ = consumeToken(builder_, MULT);
    if (!result_) result_ = consumeToken(builder_, DIV);
    if (!result_) result_ = consumeToken(builder_, IDIV);
    if (!result_) result_ = consumeToken(builder_, MOD);
    if (!result_) result_ = consumeToken(builder_, AND);
    if (!result_) result_ = consumeToken(builder_, SHL);
    if (!result_) result_ = consumeToken(builder_, SHR);
    if (!result_) result_ = mulOp_7(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, AS);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ">"">"
  private static boolean mulOp_7(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mulOp_7")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, GT, GT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // NamespaceIdent [IN quotedString]
  static boolean namespaceFileName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceFileName")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = NamespaceIdent(builder_, level_ + 1);
    result_ = result_ && namespaceFileName_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_semi_section);
    return result_;
  }

  // [IN quotedString]
  private static boolean namespaceFileName_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceFileName_1")) return false;
    namespaceFileName_1_0(builder_, level_ + 1);
    return true;
  }

  // IN quotedString
  private static boolean namespaceFileName_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceFileName_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, IN);
    result_ = result_ && quotedString(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // SubIdent "."
  static boolean namespaceItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceItem")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = SubIdent(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // namespaceFileName namespaceNamesRest*
  static boolean namespaceNameList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceNameList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = namespaceFileName(builder_, level_ + 1);
    result_ = result_ && namespaceNameList_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // namespaceNamesRest*
  private static boolean namespaceNameList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceNameList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!namespaceNamesRest(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "namespaceNameList_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // COMMA namespaceFileName
  static boolean namespaceNamesRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespaceNamesRest")) return false;
    if (!nextTokenIs(builder_, COMMA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && namespaceFileName(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // namespaceItem+
  static boolean namespacePart(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "namespacePart")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = namespaceItem(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!namespaceItem(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "namespacePart", pos_)) break;
    }
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // OBJC_CLASS | OBJC_CATEGORY [EXTERNAL [externalSpecifier]]
  static boolean objc_decl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "objc_decl")) return false;
    if (!nextTokenIs(builder_, "", OBJC_CATEGORY, OBJC_CLASS)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OBJC_CLASS);
    if (!result_) result_ = objc_decl_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // OBJC_CATEGORY [EXTERNAL [externalSpecifier]]
  private static boolean objc_decl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "objc_decl_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, OBJC_CATEGORY);
    result_ = result_ && objc_decl_1_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [EXTERNAL [externalSpecifier]]
  private static boolean objc_decl_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "objc_decl_1_1")) return false;
    objc_decl_1_1_0(builder_, level_ + 1);
    return true;
  }

  // EXTERNAL [externalSpecifier]
  private static boolean objc_decl_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "objc_decl_1_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, EXTERNAL);
    result_ = result_ && objc_decl_1_1_0_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [externalSpecifier]
  private static boolean objc_decl_1_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "objc_decl_1_1_0_1")) return false;
    externalSpecifier(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // [classParentWithRecovery] structItem*
  static boolean objectBody(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "objectBody")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = objectBody_0(builder_, level_ + 1);
    result_ = result_ && objectBody_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_struct_outer);
    return result_;
  }

  // [classParentWithRecovery]
  private static boolean objectBody_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "objectBody_0")) return false;
    classParentWithRecovery(builder_, level_ + 1);
    return true;
  }

  // structItem*
  private static boolean objectBody_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "objectBody_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!structItem(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "objectBody_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OBJECT objectBody END
  static boolean objectTypeDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "objectTypeDecl")) return false;
    if (!nextTokenIs(builder_, OBJECT)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, OBJECT);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, objectBody(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, END) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // "far" | "local" | "near"
  static boolean oldCallConventionDirective(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "oldCallConventionDirective")) return false;
    boolean result_;
    result_ = consumeToken(builder_, "far");
    if (!result_) result_ = consumeToken(builder_, "local");
    if (!result_) result_ = consumeToken(builder_, "near");
    return result_;
  }

  /* ********************************************************** */
  // procName ["." operatorRedef]
  static boolean operName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operName")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = procName(builder_, level_ + 1);
    result_ = result_ && operName_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ["." operatorRedef]
  private static boolean operName_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operName_1")) return false;
    operName_1_0(builder_, level_ + 1);
    return true;
  }

  // "." operatorRedef
  private static boolean operName_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operName_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, DOT);
    result_ = result_ && operatorRedef(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // OPERATOR operatorRedef FormalParameterSection [NamedIdent] ":" TypeDecl
  static boolean operatorDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operatorDecl")) return false;
    if (!nextTokenIs(builder_, OPERATOR)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, OPERATOR);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, operatorRedef(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, FormalParameterSection(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, operatorDecl_3(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, COLON)) && result_;
    result_ = pinned_ && TypeDecl(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [NamedIdent]
  private static boolean operatorDecl_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operatorDecl_3")) return false;
    NamedIdent(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // InOperatorQualifiedIdent | operName
  static boolean operatorName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operatorName")) return false;
    boolean result_;
    result_ = InOperatorQualifiedIdent(builder_, level_ + 1);
    if (!result_) result_ = operName(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // ASSIGN | PLUS | MINUS | MULT | DIV | POWER | EQ | LTEQ | LT | GT | "<>" | IN | "explicit"
  static boolean operatorRedef(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "operatorRedef")) return false;
    boolean result_;
    result_ = consumeToken(builder_, ASSIGN);
    if (!result_) result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, MULT);
    if (!result_) result_ = consumeToken(builder_, DIV);
    if (!result_) result_ = consumeToken(builder_, POWER);
    if (!result_) result_ = consumeToken(builder_, EQ);
    if (!result_) result_ = consumeToken(builder_, LTEQ);
    if (!result_) result_ = consumeToken(builder_, LT);
    if (!result_) result_ = consumeToken(builder_, GT);
    if (!result_) result_ = consumeToken(builder_, NE);
    if (!result_) result_ = consumeToken(builder_, IN);
    if (!result_) result_ = consumeToken(builder_, "explicit");
    return result_;
  }

  /* ********************************************************** */
  // '(' [ !')' Expr (',' Expr) * ] ')'
  static boolean parenConstruct(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parenConstruct")) return false;
    if (!nextTokenIs(builder_, LPAREN)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, LPAREN);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, parenConstruct_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RPAREN) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ !')' Expr (',' Expr) * ]
  private static boolean parenConstruct_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parenConstruct_1")) return false;
    parenConstruct_1_0(builder_, level_ + 1);
    return true;
  }

  // !')' Expr (',' Expr) *
  private static boolean parenConstruct_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parenConstruct_1_0")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = parenConstruct_1_0_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, Expr(builder_, level_ + 1, -1));
    result_ = pinned_ && parenConstruct_1_0_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // !')'
  private static boolean parenConstruct_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parenConstruct_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeToken(builder_, RPAREN);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (',' Expr) *
  private static boolean parenConstruct_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parenConstruct_1_0_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!parenConstruct_1_0_2_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "parenConstruct_1_0_2", pos_)) break;
    }
    return true;
  }

  // ',' Expr
  private static boolean parenConstruct_1_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parenConstruct_1_0_2_0")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && Expr(builder_, level_ + 1, -1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // PROCEDURE [FormalParameterSection] procTypeDirectives
  static boolean procHeading(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procHeading")) return false;
    if (!nextTokenIs(builder_, PROCEDURE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, PROCEDURE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, procHeading_1(builder_, level_ + 1));
    result_ = pinned_ && procTypeDirectives(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [FormalParameterSection]
  private static boolean procHeading_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procHeading_1")) return false;
    FormalParameterSection(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // FUNCTION | PROCEDURE
  static boolean procKey(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procKey")) return false;
    if (!nextTokenIs(builder_, "", FUNCTION, PROCEDURE)) return false;
    boolean result_;
    result_ = consumeToken(builder_, FUNCTION);
    if (!result_) result_ = consumeToken(builder_, PROCEDURE);
    return result_;
  }

  /* ********************************************************** */
  // ClassQualifiedIdent | NamedIdent
  static boolean procName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procName")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = ClassQualifiedIdent(builder_, level_ + 1);
    if (!result_) result_ = NamedIdent(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_procName);
    return result_;
  }

  /* ********************************************************** */
  // (";" callConvention)* ([";"] callConvention)*
  static boolean procTypeDirectives(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procTypeDirectives")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = procTypeDirectives_0(builder_, level_ + 1);
    result_ = result_ && procTypeDirectives_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (";" callConvention)*
  private static boolean procTypeDirectives_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procTypeDirectives_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!procTypeDirectives_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "procTypeDirectives_0", pos_)) break;
    }
    return true;
  }

  // ";" callConvention
  private static boolean procTypeDirectives_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procTypeDirectives_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMI);
    result_ = result_ && callConvention(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ([";"] callConvention)*
  private static boolean procTypeDirectives_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procTypeDirectives_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!procTypeDirectives_1_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "procTypeDirectives_1", pos_)) break;
    }
    return true;
  }

  // [";"] callConvention
  private static boolean procTypeDirectives_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procTypeDirectives_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = procTypeDirectives_1_0_0(builder_, level_ + 1);
    result_ = result_ && callConvention(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [";"]
  private static boolean procTypeDirectives_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procTypeDirectives_1_0_0")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  /* ********************************************************** */
  // REFERENCE TO procedureTypeHeading
  static boolean procedureReference(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedureReference")) return false;
    if (!nextTokenIs(builder_, REFERENCE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, REFERENCE, TO);
    result_ = result_ && procedureTypeHeading(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (funcHeading | procHeading) [OF OBJECT]
  static boolean procedureTypeHeading(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedureTypeHeading")) return false;
    if (!nextTokenIs(builder_, "", FUNCTION, PROCEDURE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = procedureTypeHeading_0(builder_, level_ + 1);
    result_ = result_ && procedureTypeHeading_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // funcHeading | procHeading
  private static boolean procedureTypeHeading_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedureTypeHeading_0")) return false;
    boolean result_;
    result_ = funcHeading(builder_, level_ + 1);
    if (!result_) result_ = procHeading(builder_, level_ + 1);
    return result_;
  }

  // [OF OBJECT]
  private static boolean procedureTypeHeading_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "procedureTypeHeading_1")) return false;
    parseTokens(builder_, 0, OF, OBJECT);
    return true;
  }

  /* ********************************************************** */
  // identifier {}
  static boolean progParam(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "progParam")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && progParam_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {}
  private static boolean progParam_1(PsiBuilder builder_, int level_) {
    return true;
  }

  /* ********************************************************** */
  // "," progParam
  static boolean progParamsRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "progParamsRest")) return false;
    if (!nextTokenIs(builder_, COMMA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && progParam(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // ProgramModuleHead progWoHead
  static boolean progWithHead(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "progWithHead")) return false;
    if (!nextTokenIs(builder_, PROGRAM)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = ProgramModuleHead(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && progWoHead(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // [intUsesClause] BlockGlobal "."
  static boolean progWoHead(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "progWoHead")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = progWoHead_0(builder_, level_ + 1);
    result_ = result_ && BlockGlobal(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && consumeToken(builder_, DOT);
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_section_global);
    return result_ || pinned_;
  }

  // [intUsesClause]
  private static boolean progWoHead_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "progWoHead_0")) return false;
    intUsesClause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  static boolean prolog(PsiBuilder builder_, int level_) {
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    exit_section_(builder_, level_, marker_, true, false, PascalParser::rec_module_start);
    return true;
  }

  /* ********************************************************** */
  // STRING_LITERAL
  static boolean quotedString(PsiBuilder builder_, int level_) {
    return consumeToken(builder_, STRING_LITERAL);
  }

  /* ********************************************************** */
  // GENERIC PROCEDURE | GENERIC FUNCTION | PROCEDURE | FUNCTION | CONSTRUCTOR | DESTRUCTOR | OPERATOR
  static boolean rec__routine_key(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec__routine_key")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec__routine_key_0(builder_, level_ + 1);
    if (!result_) result_ = rec__routine_key_1(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, PROCEDURE);
    if (!result_) result_ = consumeTokenFast(builder_, FUNCTION);
    if (!result_) result_ = consumeTokenFast(builder_, CONSTRUCTOR);
    if (!result_) result_ = consumeTokenFast(builder_, DESTRUCTOR);
    if (!result_) result_ = consumeTokenFast(builder_, OPERATOR);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // GENERIC PROCEDURE
  private static boolean rec__routine_key_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec__routine_key_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, GENERIC, PROCEDURE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // GENERIC FUNCTION
  private static boolean rec__routine_key_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec__routine_key_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, GENERIC, FUNCTION);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // REPEAT | WHILE | FOR | CASE | WITH | RAISE | IF | TRY | BEGIN | BREAK | CONTINUE | EXIT | GOTO | INHERITED
  //                                   | NUMBER_INT | NUMBER_HEX | NUMBER_REAL | NUMBER_OCT | NUMBER_BIN | identifier | '^' | END "." | '[' | '('
  static boolean rec__stmt_start(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec__stmt_start")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, REPEAT);
    if (!result_) result_ = consumeTokenFast(builder_, WHILE);
    if (!result_) result_ = consumeTokenFast(builder_, FOR);
    if (!result_) result_ = consumeTokenFast(builder_, CASE);
    if (!result_) result_ = consumeTokenFast(builder_, WITH);
    if (!result_) result_ = consumeTokenFast(builder_, RAISE);
    if (!result_) result_ = consumeTokenFast(builder_, IF);
    if (!result_) result_ = consumeTokenFast(builder_, TRY);
    if (!result_) result_ = consumeTokenFast(builder_, BEGIN);
    if (!result_) result_ = consumeTokenFast(builder_, BREAK);
    if (!result_) result_ = consumeTokenFast(builder_, CONTINUE);
    if (!result_) result_ = consumeTokenFast(builder_, EXIT);
    if (!result_) result_ = consumeTokenFast(builder_, GOTO);
    if (!result_) result_ = consumeTokenFast(builder_, INHERITED);
    if (!result_) result_ = consumeTokenFast(builder_, NUMBER_INT);
    if (!result_) result_ = consumeTokenFast(builder_, NUMBER_HEX);
    if (!result_) result_ = consumeTokenFast(builder_, NUMBER_REAL);
    if (!result_) result_ = consumeTokenFast(builder_, NUMBER_OCT);
    if (!result_) result_ = consumeTokenFast(builder_, NUMBER_BIN);
    if (!result_) result_ = identifier(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, DEREF);
    if (!result_) result_ = rec__stmt_start_21(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, LBRACK);
    if (!result_) result_ = consumeTokenFast(builder_, LPAREN);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // END "."
  private static boolean rec__stmt_start_21(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec__stmt_start_21")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, END, DOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // !(COMMA | RBRACK | identifier)
  static boolean rec_attr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_attr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_attr_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // COMMA | RBRACK | identifier
  private static boolean rec_attr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_attr_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, COMMA);
    if (!result_) result_ = consumeTokenFast(builder_, RBRACK);
    if (!result_) result_ = identifier(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // !(RBRACK)
  static boolean rec_attr2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_attr2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_attr2_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (RBRACK)
  private static boolean rec_attr2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_attr2_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, RBRACK);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // !(".")
  static boolean rec_block_global_end(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_block_global_end")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_block_global_end_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (".")
  private static boolean rec_block_global_end_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_block_global_end_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, DOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // !(END | ";") & rec_section
  static boolean rec_block_local_end(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_block_local_end")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_block_local_end_0(builder_, level_ + 1);
    result_ = result_ && rec_block_local_end_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(END | ";")
  private static boolean rec_block_local_end_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_block_local_end_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_block_local_end_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // END | ";"
  private static boolean rec_block_local_end_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_block_local_end_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, END);
    if (!result_) result_ = consumeTokenFast(builder_, SEMI);
    return result_;
  }

  // & rec_section
  private static boolean rec_block_local_end_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_block_local_end_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(ELSE | END) & rec_section
  static boolean rec_case(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_case")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_case_0(builder_, level_ + 1);
    result_ = result_ && rec_case_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(ELSE | END)
  private static boolean rec_case_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_case_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_case_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ELSE | END
  private static boolean rec_case_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_case_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, ELSE);
    if (!result_) result_ = consumeTokenFast(builder_, END);
    return result_;
  }

  // & rec_section
  private static boolean rec_case_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_case_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(END | ELSE | caseLabel)
  static boolean rec_caseItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_caseItem")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_caseItem_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // END | ELSE | caseLabel
  private static boolean rec_caseItem_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_caseItem_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, END);
    if (!result_) result_ = consumeTokenFast(builder_, ELSE);
    if (!result_) result_ = caseLabel(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // !(CASE | FOR | ";") & rec_name
  static boolean rec_classparent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_classparent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_classparent_0(builder_, level_ + 1);
    result_ = result_ && rec_classparent_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(CASE | FOR | ";")
  private static boolean rec_classparent_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_classparent_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_classparent_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // CASE | FOR | ";"
  private static boolean rec_classparent_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_classparent_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, CASE);
    if (!result_) result_ = consumeTokenFast(builder_, FOR);
    if (!result_) result_ = consumeTokenFast(builder_, SEMI);
    return result_;
  }

  // & rec_name
  private static boolean rec_classparent_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_classparent_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_name(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(END) & rec_section
  static boolean rec_decl_section(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_decl_section")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_decl_section_0(builder_, level_ + 1);
    result_ = result_ && rec_decl_section_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(END)
  private static boolean rec_decl_section_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_decl_section_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_decl_section_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (END)
  private static boolean rec_decl_section_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_decl_section_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // & rec_section
  private static boolean rec_decl_section_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_decl_section_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(identifier) & rec_statement_mid
  static boolean rec_doKey(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_doKey")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_doKey_0(builder_, level_ + 1);
    result_ = result_ && rec_doKey_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(identifier)
  private static boolean rec_doKey_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_doKey_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_doKey_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (identifier)
  private static boolean rec_doKey_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_doKey_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // & rec_statement_mid
  private static boolean rec_doKey_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_doKey_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_statement_mid(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(")" | ";" | INDEX | "name" | "delayed" | "dependency" | "deprecated" | "platform") & rec_section
  static boolean rec_expr_colon(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_expr_colon")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_expr_colon_0(builder_, level_ + 1);
    result_ = result_ && rec_expr_colon_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(")" | ";" | INDEX | "name" | "delayed" | "dependency" | "deprecated" | "platform")
  private static boolean rec_expr_colon_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_expr_colon_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_expr_colon_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ")" | ";" | INDEX | "name" | "delayed" | "dependency" | "deprecated" | "platform"
  private static boolean rec_expr_colon_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_expr_colon_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, RPAREN);
    if (!result_) result_ = consumeTokenFast(builder_, SEMI);
    if (!result_) result_ = consumeTokenFast(builder_, INDEX);
    if (!result_) result_ = consumeTokenFast(builder_, "name");
    if (!result_) result_ = consumeTokenFast(builder_, "delayed");
    if (!result_) result_ = consumeTokenFast(builder_, "dependency");
    if (!result_) result_ = consumeTokenFast(builder_, DEPRECATED);
    if (!result_) result_ = consumeTokenFast(builder_, PLATFORM);
    return result_;
  }

  // & rec_section
  private static boolean rec_expr_colon_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_expr_colon_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(";" | ")" | "]") & rec_section
  static boolean rec_formal_param(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_formal_param")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_formal_param_0(builder_, level_ + 1);
    result_ = result_ && rec_formal_param_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(";" | ")" | "]")
  private static boolean rec_formal_param_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_formal_param_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_formal_param_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ";" | ")" | "]"
  private static boolean rec_formal_param_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_formal_param_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, SEMI);
    if (!result_) result_ = consumeTokenFast(builder_, RPAREN);
    if (!result_) result_ = consumeTokenFast(builder_, RBRACK);
    return result_;
  }

  // & rec_section
  private static boolean rec_formal_param_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_formal_param_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(";" | ":" | ">" | "]" | "," | OF | identifier) & rec_section
  static boolean rec_formal_param_sec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_formal_param_sec")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_formal_param_sec_0(builder_, level_ + 1);
    result_ = result_ && rec_formal_param_sec_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(";" | ":" | ">" | "]" | "," | OF | identifier)
  private static boolean rec_formal_param_sec_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_formal_param_sec_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_formal_param_sec_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ";" | ":" | ">" | "]" | "," | OF | identifier
  private static boolean rec_formal_param_sec_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_formal_param_sec_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, SEMI);
    if (!result_) result_ = consumeTokenFast(builder_, COLON);
    if (!result_) result_ = consumeTokenFast(builder_, GT);
    if (!result_) result_ = consumeTokenFast(builder_, RBRACK);
    if (!result_) result_ = consumeTokenFast(builder_, COMMA);
    if (!result_) result_ = consumeTokenFast(builder_, OF);
    if (!result_) result_ = identifier(builder_, level_ + 1);
    return result_;
  }

  // & rec_section
  private static boolean rec_formal_param_sec_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_formal_param_sec_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(">" | "," | ":" | ";" | ">""=") & rec_section
  static boolean rec_generic_def(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_generic_def")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_generic_def_0(builder_, level_ + 1);
    result_ = result_ && rec_generic_def_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(">" | "," | ":" | ";" | ">""=")
  private static boolean rec_generic_def_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_generic_def_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_generic_def_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ">" | "," | ":" | ";" | ">""="
  private static boolean rec_generic_def_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_generic_def_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, GT);
    if (!result_) result_ = consumeTokenFast(builder_, COMMA);
    if (!result_) result_ = consumeTokenFast(builder_, COLON);
    if (!result_) result_ = consumeTokenFast(builder_, SEMI);
    if (!result_) result_ = rec_generic_def_0_0_4(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // ">""="
  private static boolean rec_generic_def_0_0_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_generic_def_0_0_4")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, GT, EQ);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // & rec_section
  private static boolean rec_generic_def_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_generic_def_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(INITIALIZATION | FINALIZATION | BEGIN | ASM)
  static boolean rec_implementation(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_implementation")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_implementation_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // INITIALIZATION | FINALIZATION | BEGIN | ASM
  private static boolean rec_implementation_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_implementation_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, INITIALIZATION);
    if (!result_) result_ = consumeTokenFast(builder_, FINALIZATION);
    if (!result_) result_ = consumeTokenFast(builder_, BEGIN);
    if (!result_) result_ = consumeTokenFast(builder_, ASM);
    return result_;
  }

  /* ********************************************************** */
  // !(".") & rec_implementation
  static boolean rec_implementation_dot(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_implementation_dot")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_implementation_dot_0(builder_, level_ + 1);
    result_ = result_ && rec_implementation_dot_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(".")
  private static boolean rec_implementation_dot_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_implementation_dot_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_implementation_dot_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (".")
  private static boolean rec_implementation_dot_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_implementation_dot_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, DOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // & rec_implementation
  private static boolean rec_implementation_dot_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_implementation_dot_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_implementation(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(IMPLEMENTATION) & rec_implementation
  static boolean rec_interface(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_interface")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_interface_0(builder_, level_ + 1);
    result_ = result_ && rec_interface_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(IMPLEMENTATION)
  private static boolean rec_interface_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_interface_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_interface_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (IMPLEMENTATION)
  private static boolean rec_interface_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_interface_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, IMPLEMENTATION);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // & rec_implementation
  private static boolean rec_interface_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_interface_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_implementation(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(INTERFACE) & rec_interface
  static boolean rec_module(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_module")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_module_0(builder_, level_ + 1);
    result_ = result_ && rec_module_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(INTERFACE)
  private static boolean rec_module_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_module_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_module_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (INTERFACE)
  private static boolean rec_module_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_module_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, INTERFACE);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // & rec_interface
  private static boolean rec_module_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_module_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_interface(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(UNIT | LIBRARY | PROGRAM | PACKAGE | USES | END) & rec_section
  static boolean rec_module_start(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_module_start")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_module_start_0(builder_, level_ + 1);
    result_ = result_ && rec_module_start_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(UNIT | LIBRARY | PROGRAM | PACKAGE | USES | END)
  private static boolean rec_module_start_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_module_start_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_module_start_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // UNIT | LIBRARY | PROGRAM | PACKAGE | USES | END
  private static boolean rec_module_start_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_module_start_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, UNIT);
    if (!result_) result_ = consumeTokenFast(builder_, LIBRARY);
    if (!result_) result_ = consumeTokenFast(builder_, PROGRAM);
    if (!result_) result_ = consumeTokenFast(builder_, PACKAGE);
    if (!result_) result_ = consumeTokenFast(builder_, USES);
    if (!result_) result_ = consumeTokenFast(builder_, END);
    return result_;
  }

  // & rec_section
  private static boolean rec_module_start_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_module_start_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(GENERIC | identifier | END) & rec_section
  static boolean rec_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_name")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_name_0(builder_, level_ + 1);
    result_ = result_ && rec_name_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(GENERIC | identifier | END)
  private static boolean rec_name_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_name_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_name_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // GENERIC | identifier | END
  private static boolean rec_name_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_name_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, GENERIC);
    if (!result_) result_ = identifier(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, END);
    return result_;
  }

  // & rec_section
  private static boolean rec_name_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_name_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !("(" | "<" | ":" | ";" | ".") & rec_section
  static boolean rec_procName(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_procName")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_procName_0(builder_, level_ + 1);
    result_ = result_ && rec_procName_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !("(" | "<" | ":" | ";" | ".")
  private static boolean rec_procName_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_procName_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_procName_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // "(" | "<" | ":" | ";" | "."
  private static boolean rec_procName_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_procName_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, LPAREN);
    if (!result_) result_ = consumeTokenFast(builder_, LT);
    if (!result_) result_ = consumeTokenFast(builder_, COLON);
    if (!result_) result_ = consumeTokenFast(builder_, SEMI);
    if (!result_) result_ = consumeTokenFast(builder_, DOT);
    return result_;
  }

  // & rec_section
  private static boolean rec_procName_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_procName_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(USES) & rec_section
  static boolean rec_programHead(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_programHead")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_programHead_0(builder_, level_ + 1);
    result_ = result_ && rec_programHead_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(USES)
  private static boolean rec_programHead_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_programHead_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_programHead_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (USES)
  private static boolean rec_programHead_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_programHead_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, USES);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // & rec_section
  private static boolean rec_programHead_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_programHead_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(READ | WRITE | "add" | "remove" | classPropertyDispInterface | "stored" | SEMI | DEFAULT | IMPLEMENTS)
  static boolean rec_propspec(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_propspec")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_propspec_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // READ | WRITE | "add" | "remove" | classPropertyDispInterface | "stored" | SEMI | DEFAULT | IMPLEMENTS
  private static boolean rec_propspec_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_propspec_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, READ);
    if (!result_) result_ = consumeTokenFast(builder_, WRITE);
    if (!result_) result_ = consumeTokenFast(builder_, "add");
    if (!result_) result_ = consumeTokenFast(builder_, "remove");
    if (!result_) result_ = classPropertyDispInterface(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, "stored");
    if (!result_) result_ = consumeTokenFast(builder_, SEMI);
    if (!result_) result_ = consumeTokenFast(builder_, DEFAULT);
    if (!result_) result_ = consumeTokenFast(builder_, IMPLEMENTS);
    return result_;
  }

  /* ********************************************************** */
  // !(")" | END)
  static boolean rec_record_colon(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_record_colon")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_record_colon_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ")" | END
  private static boolean rec_record_colon_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_record_colon_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, RPAREN);
    if (!result_) result_ = consumeTokenFast(builder_, END);
    return result_;
  }

  /* ********************************************************** */
  // !(EXTERNAL | FORWARD) & rec_name & rec_interface
  static boolean rec_routine(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_routine")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_routine_0(builder_, level_ + 1);
    result_ = result_ && rec_routine_1(builder_, level_ + 1);
    result_ = result_ && rec_routine_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(EXTERNAL | FORWARD)
  private static boolean rec_routine_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_routine_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_routine_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // EXTERNAL | FORWARD
  private static boolean rec_routine_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_routine_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, EXTERNAL);
    if (!result_) result_ = consumeTokenFast(builder_, FORWARD);
    return result_;
  }

  // & rec_name
  private static boolean rec_routine_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_routine_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_name(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // & rec_interface
  private static boolean rec_routine_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_routine_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_interface(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(EXTERNAL | FORWARD | CASE | ";") & rec_name & rec_interface
  static boolean rec_routine_decl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_routine_decl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_routine_decl_0(builder_, level_ + 1);
    result_ = result_ && rec_routine_decl_1(builder_, level_ + 1);
    result_ = result_ && rec_routine_decl_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(EXTERNAL | FORWARD | CASE | ";")
  private static boolean rec_routine_decl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_routine_decl_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_routine_decl_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // EXTERNAL | FORWARD | CASE | ";"
  private static boolean rec_routine_decl_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_routine_decl_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, EXTERNAL);
    if (!result_) result_ = consumeTokenFast(builder_, FORWARD);
    if (!result_) result_ = consumeTokenFast(builder_, CASE);
    if (!result_) result_ = consumeTokenFast(builder_, SEMI);
    return result_;
  }

  // & rec_name
  private static boolean rec_routine_decl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_routine_decl_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_name(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // & rec_interface
  private static boolean rec_routine_decl_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_routine_decl_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_interface(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !rec__routine_key & rec_section_nested
  static boolean rec_section(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_section")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_section_0(builder_, level_ + 1);
    result_ = result_ && rec_section_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !rec__routine_key
  private static boolean rec_section_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_section_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec__routine_key(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // & rec_section_nested
  private static boolean rec_section_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_section_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section_nested(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(USES) & rec_section
  static boolean rec_sectionKey(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_sectionKey")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_sectionKey_0(builder_, level_ + 1);
    result_ = result_ && rec_sectionKey_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(USES)
  private static boolean rec_sectionKey_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_sectionKey_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_sectionKey_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (USES)
  private static boolean rec_sectionKey_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_sectionKey_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, USES);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // & rec_section
  private static boolean rec_sectionKey_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_sectionKey_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(".") & rec_section
  static boolean rec_section_global(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_section_global")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_section_global_0(builder_, level_ + 1);
    result_ = result_ && rec_section_global_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(".")
  private static boolean rec_section_global_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_section_global_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_section_global_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (".")
  private static boolean rec_section_global_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_section_global_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, DOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // & rec_section
  private static boolean rec_section_global_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_section_global_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(CLASS | TYPE | EXPORTS | varKey | constKey | PROPERTY | Visibility | LABEL | CASE |
  //                                  (identifier "<") | (END DOT) | "[") & rec_interface
  static boolean rec_section_nested(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_section_nested")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_section_nested_0(builder_, level_ + 1);
    result_ = result_ && rec_section_nested_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(CLASS | TYPE | EXPORTS | varKey | constKey | PROPERTY | Visibility | LABEL | CASE |
  //                                  (identifier "<") | (END DOT) | "[")
  private static boolean rec_section_nested_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_section_nested_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_section_nested_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // CLASS | TYPE | EXPORTS | varKey | constKey | PROPERTY | Visibility | LABEL | CASE |
  //                                  (identifier "<") | (END DOT) | "["
  private static boolean rec_section_nested_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_section_nested_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, CLASS);
    if (!result_) result_ = consumeTokenFast(builder_, TYPE);
    if (!result_) result_ = consumeTokenFast(builder_, EXPORTS);
    if (!result_) result_ = varKey(builder_, level_ + 1);
    if (!result_) result_ = constKey(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, PROPERTY);
    if (!result_) result_ = Visibility(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, LABEL);
    if (!result_) result_ = consumeTokenFast(builder_, CASE);
    if (!result_) result_ = rec_section_nested_0_0_9(builder_, level_ + 1);
    if (!result_) result_ = rec_section_nested_0_0_10(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenFast(builder_, LBRACK);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identifier "<"
  private static boolean rec_section_nested_0_0_9(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_section_nested_0_0_9")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, LT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // END DOT
  private static boolean rec_section_nested_0_0_10(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_section_nested_0_0_10")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, END, DOT);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // & rec_interface
  private static boolean rec_section_nested_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_section_nested_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_interface(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(";" | "deprecated" | "platform") & rec_section
  static boolean rec_semi(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_semi")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_semi_0(builder_, level_ + 1);
    result_ = result_ && rec_semi_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(";" | "deprecated" | "platform")
  private static boolean rec_semi_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_semi_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_semi_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ";" | "deprecated" | "platform"
  private static boolean rec_semi_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_semi_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, SEMI);
    if (!result_) result_ = consumeTokenFast(builder_, DEPRECATED);
    if (!result_) result_ = consumeTokenFast(builder_, PLATFORM);
    return result_;
  }

  // & rec_section
  private static boolean rec_semi_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_semi_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(";" | "=" | "," | ">") & rec_section
  static boolean rec_semi_section(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_semi_section")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_semi_section_0(builder_, level_ + 1);
    result_ = result_ && rec_semi_section_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(";" | "=" | "," | ">")
  private static boolean rec_semi_section_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_semi_section_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_semi_section_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ";" | "=" | "," | ">"
  private static boolean rec_semi_section_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_semi_section_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, SEMI);
    if (!result_) result_ = consumeTokenFast(builder_, EQ);
    if (!result_) result_ = consumeTokenFast(builder_, COMMA);
    if (!result_) result_ = consumeTokenFast(builder_, GT);
    return result_;
  }

  // & rec_section
  private static boolean rec_semi_section_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_semi_section_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(SEMI | ELSE | FINALLY | EXCEPT | UNTIL) & rec_statements
  static boolean rec_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_statement")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_statement_0(builder_, level_ + 1);
    result_ = result_ && rec_statement_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(SEMI | ELSE | FINALLY | EXCEPT | UNTIL)
  private static boolean rec_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_statement_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_statement_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // SEMI | ELSE | FINALLY | EXCEPT | UNTIL
  private static boolean rec_statement_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_statement_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, SEMI);
    if (!result_) result_ = consumeTokenFast(builder_, ELSE);
    if (!result_) result_ = consumeTokenFast(builder_, FINALLY);
    if (!result_) result_ = consumeTokenFast(builder_, EXCEPT);
    if (!result_) result_ = consumeTokenFast(builder_, UNTIL);
    return result_;
  }

  // & rec_statements
  private static boolean rec_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_statement_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_statements(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(DO | ELSE | THEN | TO | DOWNTO | OF | ON | SEMI | REPEAT | WHILE | FOR | CASE | WITH | RAISE | IF | TRY | FINALLY | EXCEPT | UNTIL | END) & rec_section
  static boolean rec_statement_mid(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_statement_mid")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_statement_mid_0(builder_, level_ + 1);
    result_ = result_ && rec_statement_mid_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(DO | ELSE | THEN | TO | DOWNTO | OF | ON | SEMI | REPEAT | WHILE | FOR | CASE | WITH | RAISE | IF | TRY | FINALLY | EXCEPT | UNTIL | END)
  private static boolean rec_statement_mid_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_statement_mid_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_statement_mid_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // DO | ELSE | THEN | TO | DOWNTO | OF | ON | SEMI | REPEAT | WHILE | FOR | CASE | WITH | RAISE | IF | TRY | FINALLY | EXCEPT | UNTIL | END
  private static boolean rec_statement_mid_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_statement_mid_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, DO);
    if (!result_) result_ = consumeTokenFast(builder_, ELSE);
    if (!result_) result_ = consumeTokenFast(builder_, THEN);
    if (!result_) result_ = consumeTokenFast(builder_, TO);
    if (!result_) result_ = consumeTokenFast(builder_, DOWNTO);
    if (!result_) result_ = consumeTokenFast(builder_, OF);
    if (!result_) result_ = consumeTokenFast(builder_, ON);
    if (!result_) result_ = consumeTokenFast(builder_, SEMI);
    if (!result_) result_ = consumeTokenFast(builder_, REPEAT);
    if (!result_) result_ = consumeTokenFast(builder_, WHILE);
    if (!result_) result_ = consumeTokenFast(builder_, FOR);
    if (!result_) result_ = consumeTokenFast(builder_, CASE);
    if (!result_) result_ = consumeTokenFast(builder_, WITH);
    if (!result_) result_ = consumeTokenFast(builder_, RAISE);
    if (!result_) result_ = consumeTokenFast(builder_, IF);
    if (!result_) result_ = consumeTokenFast(builder_, TRY);
    if (!result_) result_ = consumeTokenFast(builder_, FINALLY);
    if (!result_) result_ = consumeTokenFast(builder_, EXCEPT);
    if (!result_) result_ = consumeTokenFast(builder_, UNTIL);
    if (!result_) result_ = consumeTokenFast(builder_, END);
    return result_;
  }

  // & rec_section
  private static boolean rec_statement_mid_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_statement_mid_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(END | INITIALIZATION | FINALIZATION)
  static boolean rec_statements(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_statements")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_statements_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // END | INITIALIZATION | FINALIZATION
  private static boolean rec_statements_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_statements_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, END);
    if (!result_) result_ = consumeTokenFast(builder_, INITIALIZATION);
    if (!result_) result_ = consumeTokenFast(builder_, FINALIZATION);
    return result_;
  }

  /* ********************************************************** */
  // !(";" | ")" | END | CASE | identifier ) & rec_section
  static boolean rec_struct_field(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_struct_field")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_struct_field_0(builder_, level_ + 1);
    result_ = result_ && rec_struct_field_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(";" | ")" | END | CASE | identifier )
  private static boolean rec_struct_field_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_struct_field_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_struct_field_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ";" | ")" | END | CASE | identifier
  private static boolean rec_struct_field_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_struct_field_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, SEMI);
    if (!result_) result_ = consumeTokenFast(builder_, RPAREN);
    if (!result_) result_ = consumeTokenFast(builder_, END);
    if (!result_) result_ = consumeTokenFast(builder_, CASE);
    if (!result_) result_ = identifier(builder_, level_ + 1);
    return result_;
  }

  // & rec_section
  private static boolean rec_struct_field_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_struct_field_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !(END | ";" | "(")
  static boolean rec_struct_outer(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_struct_outer")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_struct_outer_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // END | ";" | "("
  private static boolean rec_struct_outer_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_struct_outer_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, END);
    if (!result_) result_ = consumeTokenFast(builder_, SEMI);
    if (!result_) result_ = consumeTokenFast(builder_, LPAREN);
    return result_;
  }

  /* ********************************************************** */
  // !(";" | "=" | ">" | ",") & rec_section
  static boolean rec_test(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_test")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_test_0(builder_, level_ + 1);
    result_ = result_ && rec_test_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(";" | "=" | ">" | ",")
  private static boolean rec_test_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_test_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_test_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // ";" | "=" | ">" | ","
  private static boolean rec_test_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_test_0_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, SEMI);
    if (!result_) result_ = consumeTokenFast(builder_, EQ);
    if (!result_) result_ = consumeTokenFast(builder_, GT);
    if (!result_) result_ = consumeTokenFast(builder_, COMMA);
    return result_;
  }

  // & rec_section
  private static boolean rec_test_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_test_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // !("=" | "." | ";" | DO)
  static boolean rec_typeId(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_typeId")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_typeId_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // "=" | "." | ";" | DO
  private static boolean rec_typeId_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_typeId_0")) return false;
    boolean result_;
    result_ = consumeTokenFast(builder_, EQ);
    if (!result_) result_ = consumeTokenFast(builder_, DOT);
    if (!result_) result_ = consumeTokenFast(builder_, SEMI);
    if (!result_) result_ = consumeTokenFast(builder_, DO);
    return result_;
  }

  /* ********************************************************** */
  // !(END) & rec_section
  static boolean rec_uses(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_uses")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = rec_uses_0(builder_, level_ + 1);
    result_ = result_ && rec_uses_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // !(END)
  private static boolean rec_uses_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_uses_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !rec_uses_0_0(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (END)
  private static boolean rec_uses_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_uses_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenFast(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // & rec_section
  private static boolean rec_uses_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rec_uses_1")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _AND_);
    result_ = rec_section(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // recordValue recordValueRest* [";"]
  static boolean recordConstInner(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recordConstInner")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = recordValue(builder_, level_ + 1);
    result_ = result_ && recordConstInner_1(builder_, level_ + 1);
    result_ = result_ && recordConstInner_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_record_colon);
    return result_;
  }

  // recordValueRest*
  private static boolean recordConstInner_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recordConstInner_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!recordValueRest(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "recordConstInner_1", pos_)) break;
    }
    return true;
  }

  // [";"]
  private static boolean recordConstInner_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recordConstInner_2")) return false;
    consumeToken(builder_, SEMI);
    return true;
  }

  /* ********************************************************** */
  // identifier ":" constExpr
  static boolean recordValue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recordValue")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = identifier(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    result_ = result_ && constExpr(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // ";" recordValue
  static boolean recordValueRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recordValueRest")) return false;
    if (!nextTokenIs(builder_, SEMI)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMI);
    result_ = result_ && recordValue(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // CASE [NamedIdentDecl ":"] TypeDecl OF recordVariants
  static boolean recordVariantSection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recordVariantSection")) return false;
    if (!nextTokenIs(builder_, CASE)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, CASE);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, recordVariantSection_1(builder_, level_ + 1));
    result_ = pinned_ && report_error_(builder_, TypeDecl(builder_, level_ + 1)) && result_;
    result_ = pinned_ && report_error_(builder_, consumeToken(builder_, OF)) && result_;
    result_ = pinned_ && recordVariants(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [NamedIdentDecl ":"]
  private static boolean recordVariantSection_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recordVariantSection_1")) return false;
    recordVariantSection_1_0(builder_, level_ + 1);
    return true;
  }

  // NamedIdentDecl ":"
  private static boolean recordVariantSection_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recordVariantSection_1_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = NamedIdentDecl(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, COLON);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // (RecordVariant ";")* [RecordVariant]
  static boolean recordVariants(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recordVariants")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = recordVariants_0(builder_, level_ + 1);
    result_ = result_ && recordVariants_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (RecordVariant ";")*
  private static boolean recordVariants_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recordVariants_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!recordVariants_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "recordVariants_0", pos_)) break;
    }
    return true;
  }

  // RecordVariant ";"
  private static boolean recordVariants_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recordVariants_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = RecordVariant(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [RecordVariant]
  private static boolean recordVariants_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "recordVariants_1")) return false;
    RecordVariant(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (GT EQ) | LTEQ | LT | GT | NE | EQ | IN | IS
  public static boolean relOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relOp")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, REL_OP, "<rel op>");
    result_ = relOp_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, LTEQ);
    if (!result_) result_ = consumeToken(builder_, LT);
    if (!result_) result_ = consumeToken(builder_, GT);
    if (!result_) result_ = consumeToken(builder_, NE);
    if (!result_) result_ = consumeToken(builder_, EQ);
    if (!result_) result_ = consumeToken(builder_, IN);
    if (!result_) result_ = consumeToken(builder_, IS);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // GT EQ
  private static boolean relOp_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "relOp_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokens(builder_, 0, GT, EQ);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // PROGRAM | UNIT | LIBRARY | INTERFACE | IMPLEMENTATION | INITIALIZATION | FINALIZATION
  //                               | EXPORTS | USES | VAR | CONST | TYPE | THREADVAR | RESOURCESTRING | CONSTREF | ABSOLUTE
  //                               | PROCEDURE | FUNCTION | OPERATOR | CONSTRUCTOR | DESTRUCTOR | STRICT | PRIVATE | PROTECTED | PUBLIC | PUBLISHED
  //                               | ARRAY | RECORD | SET | FILE | OBJECT | CLASS | OF | PROPERTY | LABEL
  //                               | TRY | RAISE | EXCEPT | FINALLY | ON | GOTO
  //                               | FOR | TO | DOWNTO | REPEAT | UNTIL | WHILE | DO | WITH | BEGIN | END | IF | THEN | ELSE | CASE
  //                               | NIL | FALSE | TRUE | ASM | INHERITED
  //                               | AND | OR | XOR | NOT | SHL | SHR | DIV | MOD | IN | AS | IS
  //                               | INLINE
  static boolean reservedWord(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "reservedWord")) return false;
    boolean result_;
    result_ = consumeToken(builder_, PROGRAM);
    if (!result_) result_ = consumeToken(builder_, UNIT);
    if (!result_) result_ = consumeToken(builder_, LIBRARY);
    if (!result_) result_ = consumeToken(builder_, INTERFACE);
    if (!result_) result_ = consumeToken(builder_, IMPLEMENTATION);
    if (!result_) result_ = consumeToken(builder_, INITIALIZATION);
    if (!result_) result_ = consumeToken(builder_, FINALIZATION);
    if (!result_) result_ = consumeToken(builder_, EXPORTS);
    if (!result_) result_ = consumeToken(builder_, USES);
    if (!result_) result_ = consumeToken(builder_, VAR);
    if (!result_) result_ = consumeToken(builder_, CONST);
    if (!result_) result_ = consumeToken(builder_, TYPE);
    if (!result_) result_ = consumeToken(builder_, THREADVAR);
    if (!result_) result_ = consumeToken(builder_, RESOURCESTRING);
    if (!result_) result_ = consumeToken(builder_, CONSTREF);
    if (!result_) result_ = consumeToken(builder_, ABSOLUTE);
    if (!result_) result_ = consumeToken(builder_, PROCEDURE);
    if (!result_) result_ = consumeToken(builder_, FUNCTION);
    if (!result_) result_ = consumeToken(builder_, OPERATOR);
    if (!result_) result_ = consumeToken(builder_, CONSTRUCTOR);
    if (!result_) result_ = consumeToken(builder_, DESTRUCTOR);
    if (!result_) result_ = consumeToken(builder_, STRICT);
    if (!result_) result_ = consumeToken(builder_, PRIVATE);
    if (!result_) result_ = consumeToken(builder_, PROTECTED);
    if (!result_) result_ = consumeToken(builder_, PUBLIC);
    if (!result_) result_ = consumeToken(builder_, PUBLISHED);
    if (!result_) result_ = consumeToken(builder_, ARRAY);
    if (!result_) result_ = consumeToken(builder_, RECORD);
    if (!result_) result_ = consumeToken(builder_, SET);
    if (!result_) result_ = consumeToken(builder_, FILE);
    if (!result_) result_ = consumeToken(builder_, OBJECT);
    if (!result_) result_ = consumeToken(builder_, CLASS);
    if (!result_) result_ = consumeToken(builder_, OF);
    if (!result_) result_ = consumeToken(builder_, PROPERTY);
    if (!result_) result_ = consumeToken(builder_, LABEL);
    if (!result_) result_ = consumeToken(builder_, TRY);
    if (!result_) result_ = consumeToken(builder_, RAISE);
    if (!result_) result_ = consumeToken(builder_, EXCEPT);
    if (!result_) result_ = consumeToken(builder_, FINALLY);
    if (!result_) result_ = consumeToken(builder_, ON);
    if (!result_) result_ = consumeToken(builder_, GOTO);
    if (!result_) result_ = consumeToken(builder_, FOR);
    if (!result_) result_ = consumeToken(builder_, TO);
    if (!result_) result_ = consumeToken(builder_, DOWNTO);
    if (!result_) result_ = consumeToken(builder_, REPEAT);
    if (!result_) result_ = consumeToken(builder_, UNTIL);
    if (!result_) result_ = consumeToken(builder_, WHILE);
    if (!result_) result_ = consumeToken(builder_, DO);
    if (!result_) result_ = consumeToken(builder_, WITH);
    if (!result_) result_ = consumeToken(builder_, BEGIN);
    if (!result_) result_ = consumeToken(builder_, END);
    if (!result_) result_ = consumeToken(builder_, IF);
    if (!result_) result_ = consumeToken(builder_, THEN);
    if (!result_) result_ = consumeToken(builder_, ELSE);
    if (!result_) result_ = consumeToken(builder_, CASE);
    if (!result_) result_ = consumeToken(builder_, NIL);
    if (!result_) result_ = consumeToken(builder_, FALSE);
    if (!result_) result_ = consumeToken(builder_, TRUE);
    if (!result_) result_ = consumeToken(builder_, ASM);
    if (!result_) result_ = consumeToken(builder_, INHERITED);
    if (!result_) result_ = consumeToken(builder_, AND);
    if (!result_) result_ = consumeToken(builder_, OR);
    if (!result_) result_ = consumeToken(builder_, XOR);
    if (!result_) result_ = consumeToken(builder_, NOT);
    if (!result_) result_ = consumeToken(builder_, SHL);
    if (!result_) result_ = consumeToken(builder_, SHR);
    if (!result_) result_ = consumeToken(builder_, DIV);
    if (!result_) result_ = consumeToken(builder_, MOD);
    if (!result_) result_ = consumeToken(builder_, IN);
    if (!result_) result_ = consumeToken(builder_, AS);
    if (!result_) result_ = consumeToken(builder_, IS);
    if (!result_) result_ = consumeToken(builder_, INLINE);
    return result_;
  }

  /* ********************************************************** */
  // ClassMethodResolution | ExportedRoutine
  static boolean routineDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "routineDecl")) return false;
    boolean result_;
    result_ = ClassMethodResolution(builder_, level_ + 1);
    if (!result_) result_ = ExportedRoutine(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // customAttributes* (exportedProc | exportedFunc | operatorDecl | classOperatorDecl) ";" FunctionDirective*
  static boolean routineDeclaration(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "routineDeclaration")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = routineDeclaration_0(builder_, level_ + 1);
    result_ = result_ && routineDeclaration_1(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, consumeToken(builder_, SEMI));
    result_ = pinned_ && routineDeclaration_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_routine_decl);
    return result_ || pinned_;
  }

  // customAttributes*
  private static boolean routineDeclaration_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "routineDeclaration_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!customAttributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "routineDeclaration_0", pos_)) break;
    }
    return true;
  }

  // exportedProc | exportedFunc | operatorDecl | classOperatorDecl
  private static boolean routineDeclaration_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "routineDeclaration_1")) return false;
    boolean result_;
    result_ = exportedProc(builder_, level_ + 1);
    if (!result_) result_ = exportedFunc(builder_, level_ + 1);
    if (!result_) result_ = operatorDecl(builder_, level_ + 1);
    if (!result_) result_ = classOperatorDecl(builder_, level_ + 1);
    return result_;
  }

  // FunctionDirective*
  private static boolean routineDeclaration_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "routineDeclaration_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!FunctionDirective(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "routineDeclaration_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // customAttributes* (exportedProc | exportedFuncImpl | operatorDecl | classOperatorDecl) ";" FunctionDirective*
  static boolean routineImpl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "routineImpl")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = routineImpl_0(builder_, level_ + 1);
    result_ = result_ && routineImpl_1(builder_, level_ + 1);
    pinned_ = result_; // pin = 2
    result_ = result_ && report_error_(builder_, consumeToken(builder_, SEMI));
    result_ = pinned_ && routineImpl_3(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_routine);
    return result_ || pinned_;
  }

  // customAttributes*
  private static boolean routineImpl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "routineImpl_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!customAttributes(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "routineImpl_0", pos_)) break;
    }
    return true;
  }

  // exportedProc | exportedFuncImpl | operatorDecl | classOperatorDecl
  private static boolean routineImpl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "routineImpl_1")) return false;
    boolean result_;
    result_ = exportedProc(builder_, level_ + 1);
    if (!result_) result_ = exportedFuncImpl(builder_, level_ + 1);
    if (!result_) result_ = operatorDecl(builder_, level_ + 1);
    if (!result_) result_ = classOperatorDecl(builder_, level_ + 1);
    return result_;
  }

  // FunctionDirective*
  private static boolean routineImpl_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "routineImpl_3")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!FunctionDirective(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "routineImpl_3", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ("," | ".." | ) Expr
  static boolean setTail(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "setTail")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = setTail_0(builder_, level_ + 1);
    result_ = result_ && Expr(builder_, level_ + 1, -1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // "," | ".." | 
  private static boolean setTail_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "setTail_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, COMMA);
    if (!result_) result_ = consumeToken(builder_, "..");
    if (!result_) result_ = consumeToken(builder_, SETTAIL_0_2_0);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // procedureTypeHeading
  static boolean simpleProcedureType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simpleProcedureType")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = procedureTypeHeading(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_semi_section);
    return result_;
  }

  /* ********************************************************** */
  // flowStatement | stmtSimpleOrAssign | Expression | InlineConstDeclaration
  static boolean simpleStatement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simpleStatement")) return false;
    boolean result_;
    result_ = flowStatement(builder_, level_ + 1);
    if (!result_) result_ = stmtSimpleOrAssign(builder_, level_ + 1);
    if (!result_) result_ = Expression(builder_, level_ + 1);
    if (!result_) result_ = InlineConstDeclaration(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // EnumType | SubRangeType
  static boolean simpleType(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simpleType")) return false;
    boolean result_;
    result_ = EnumType(builder_, level_ + 1);
    if (!result_) result_ = SubRangeType(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // [statementList]
  static boolean statementBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statementBlock")) return false;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    statementList(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, true, false, PascalParser::rec_block_local_end);
    return true;
  }

  /* ********************************************************** */
  // [Statement] statements*
  static boolean statementList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statementList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = statementList_0(builder_, level_ + 1);
    result_ = result_ && statementList_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [Statement]
  private static boolean statementList_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statementList_0")) return false;
    Statement(builder_, level_ + 1);
    return true;
  }

  // statements*
  private static boolean statementList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statementList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!statements(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "statementList_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // RepeatStatement | WhileStatement | ForStatement
  //                               | CaseStatement | WithStatement | RaiseStatement | AssemblerStatement
  //                               | IfStatement | TryStatement | simpleStatement | CompoundStatement | stmtEmpty
  static boolean statementPart(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statementPart")) return false;
    boolean result_;
    result_ = RepeatStatement(builder_, level_ + 1);
    if (!result_) result_ = WhileStatement(builder_, level_ + 1);
    if (!result_) result_ = ForStatement(builder_, level_ + 1);
    if (!result_) result_ = CaseStatement(builder_, level_ + 1);
    if (!result_) result_ = WithStatement(builder_, level_ + 1);
    if (!result_) result_ = RaiseStatement(builder_, level_ + 1);
    if (!result_) result_ = AssemblerStatement(builder_, level_ + 1);
    if (!result_) result_ = IfStatement(builder_, level_ + 1);
    if (!result_) result_ = TryStatement(builder_, level_ + 1);
    if (!result_) result_ = simpleStatement(builder_, level_ + 1);
    if (!result_) result_ = CompoundStatement(builder_, level_ + 1);
    if (!result_) result_ = stmtEmpty(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // ";" [Statement]
  static boolean statements(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements")) return false;
    if (!nextTokenIs(builder_, SEMI)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMI);
    result_ = result_ && statements_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [Statement]
  private static boolean statements_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statements_1")) return false;
    Statement(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  public static boolean stmtEmpty(PsiBuilder builder_, int level_) {
    Marker marker_ = enter_section_(builder_);
    exit_section_(builder_, marker_, STMT_EMPTY, true);
    return true;
  }

  /* ********************************************************** */
  // assignLeftPart [AssignPart]
  static boolean stmtSimpleOrAssign(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stmtSimpleOrAssign")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = assignLeftPart(builder_, level_ + 1);
    result_ = result_ && stmtSimpleOrAssign_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [AssignPart]
  private static boolean stmtSimpleOrAssign_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stmtSimpleOrAssign_1")) return false;
    AssignPart(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // commonDecl | routineDecl | classFieldSemi | Visibility
  static boolean structItem(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structItem")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = commonDecl(builder_, level_ + 1);
    if (!result_) result_ = routineDecl(builder_, level_ + 1);
    if (!result_) result_ = classFieldSemi(builder_, level_ + 1);
    if (!result_) result_ = Visibility(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_struct_field);
    return result_;
  }

  /* ********************************************************** */
  // ClassHelperDecl | ClassTypeDecl | InterfaceTypeDecl | ObjectDecl | RecordHelperDecl | RecordDecl
  static boolean structTypeDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "structTypeDecl")) return false;
    boolean result_;
    result_ = ClassHelperDecl(builder_, level_ + 1);
    if (!result_) result_ = ClassTypeDecl(builder_, level_ + 1);
    if (!result_) result_ = InterfaceTypeDecl(builder_, level_ + 1);
    if (!result_) result_ = ObjectDecl(builder_, level_ + 1);
    if (!result_) result_ = RecordHelperDecl(builder_, level_ + 1);
    if (!result_) result_ = RecordDecl(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // exceptKey handlerList
  static boolean tryExcept(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tryExcept")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = exceptKey(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && handlerList(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, PascalParser::rec_statement_mid);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // FINALLY statementList
  static boolean tryFinally(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tryFinally")) return false;
    if (!nextTokenIs(builder_, FINALLY)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, FINALLY);
    result_ = result_ && statementList(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // typeForwardDecl | typeDecl
  static boolean type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type")) return false;
    boolean result_;
    result_ = typeForwardDecl(builder_, level_ + 1);
    if (!result_) result_ = typeDecl(builder_, level_ + 1);
    return result_;
  }

  /* ********************************************************** */
  // TypeDecl hintingDirective* ";"
  static boolean typeDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeDecl")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = TypeDecl(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, typeDecl_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, SEMI) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // hintingDirective*
  private static boolean typeDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeDecl_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!hintingDirective(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "typeDecl_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // TypeDeclaration+
  static boolean typeDeclarations(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeDeclarations")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = TypeDeclaration(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!TypeDeclaration(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "typeDeclarations", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_block_local_end);
    return result_;
  }

  /* ********************************************************** */
  // "," TypeDecl
  static boolean typeDeclsRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeDeclsRest")) return false;
    if (!nextTokenIs(builder_, COMMA)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, COMMA);
    pinned_ = result_; // pin = 1
    result_ = result_ && TypeDecl(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // classForwardDecl ";"
  static boolean typeForwardDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeForwardDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = classForwardDecl(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // NamedIdent identsRest*
  static boolean typeParamIdentList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeParamIdentList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = NamedIdent(builder_, level_ + 1);
    result_ = result_ && typeParamIdentList_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // identsRest*
  private static boolean typeParamIdentList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeParamIdentList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!identsRest(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "typeParamIdentList_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ConstrainedTypeParam typeParamListRest*
  static boolean typeParamList(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeParamList")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ConstrainedTypeParam(builder_, level_ + 1);
    result_ = result_ && typeParamList_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // typeParamListRest*
  private static boolean typeParamList_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeParamList_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!typeParamListRest(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "typeParamList_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // ";" ConstrainedTypeParam
  static boolean typeParamListRest(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "typeParamListRest")) return false;
    if (!nextTokenIs(builder_, SEMI)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, SEMI);
    result_ = result_ && ConstrainedTypeParam(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  /* ********************************************************** */
  // "+" | "-" | "@" | NOT
  public static boolean unaryOp(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryOp")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, UNARY_OP, "<unary op>");
    result_ = consumeToken(builder_, PLUS);
    if (!result_) result_ = consumeToken(builder_, MINUS);
    if (!result_) result_ = consumeToken(builder_, AT);
    if (!result_) result_ = consumeToken(builder_, NOT);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // reservedWord | KeywordIdent | NAME
  static boolean unescapedIdent(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unescapedIdent")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null, "<Identifier>");
    result_ = reservedWord(builder_, level_ + 1);
    if (!result_) result_ = KeywordIdent(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, NAME);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  /* ********************************************************** */
  // [UnitInitialization] [UnitFinalization] END | CompoundStatement | END {}
  static boolean unitBlock(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unitBlock")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = unitBlock_0(builder_, level_ + 1);
    if (!result_) result_ = CompoundStatement(builder_, level_ + 1);
    if (!result_) result_ = unitBlock_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [UnitInitialization] [UnitFinalization] END
  private static boolean unitBlock_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unitBlock_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = unitBlock_0_0(builder_, level_ + 1);
    result_ = result_ && unitBlock_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, END);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [UnitInitialization]
  private static boolean unitBlock_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unitBlock_0_0")) return false;
    UnitInitialization(builder_, level_ + 1);
    return true;
  }

  // [UnitFinalization]
  private static boolean unitBlock_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unitBlock_0_1")) return false;
    UnitFinalization(builder_, level_ + 1);
    return true;
  }

  // END {}
  private static boolean unitBlock_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unitBlock_2")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeToken(builder_, END);
    result_ = result_ && unitBlock_2_1(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // {}
  private static boolean unitBlock_2_1(PsiBuilder builder_, int level_) {
    return true;
  }

  /* ********************************************************** */
  // IMPLEMENTATION
  static boolean unitImplementationKey(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unitImplementationKey")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, IMPLEMENTATION);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_sectionKey);
    return result_;
  }

  /* ********************************************************** */
  // INTERFACE
  static boolean unitInterfaceKey(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unitInterfaceKey")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = consumeToken(builder_, INTERFACE);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_sectionKey);
    return result_;
  }

  /* ********************************************************** */
  // VarDeclaration+
  static boolean varDeclarations(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varDeclarations")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = VarDeclaration(builder_, level_ + 1);
    while (result_) {
      int pos_ = current_position_(builder_);
      if (!VarDeclaration(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "varDeclarations", pos_)) break;
    }
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_block_local_end);
    return result_;
  }

  /* ********************************************************** */
  // VAR | THREADVAR
  static boolean varKey(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varKey")) return false;
    if (!nextTokenIs(builder_, "", THREADVAR, VAR)) return false;
    boolean result_;
    result_ = consumeToken(builder_, VAR);
    if (!result_) result_ = consumeToken(builder_, THREADVAR);
    return result_;
  }

  /* ********************************************************** */
  // [classParentWORec] structItem* [ClassField] [recordVariantSection]
  static boolean varRecDecl(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varRecDecl")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = varRecDecl_0(builder_, level_ + 1);
    result_ = result_ && varRecDecl_1(builder_, level_ + 1);
    result_ = result_ && varRecDecl_2(builder_, level_ + 1);
    result_ = result_ && varRecDecl_3(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_struct_field);
    return result_;
  }

  // [classParentWORec]
  private static boolean varRecDecl_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varRecDecl_0")) return false;
    classParentWORec(builder_, level_ + 1);
    return true;
  }

  // structItem*
  private static boolean varRecDecl_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varRecDecl_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!structItem(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "varRecDecl_1", pos_)) break;
    }
    return true;
  }

  // [ClassField]
  private static boolean varRecDecl_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varRecDecl_2")) return false;
    ClassField(builder_, level_ + 1);
    return true;
  }

  // [recordVariantSection]
  private static boolean varRecDecl_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varRecDecl_3")) return false;
    recordVariantSection(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // (ClassField ";")* [ClassField] [recordVariantSection]
  static boolean varRecDeclInner(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varRecDeclInner")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = varRecDeclInner_0(builder_, level_ + 1);
    result_ = result_ && varRecDeclInner_1(builder_, level_ + 1);
    result_ = result_ && varRecDeclInner_2(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_struct_field);
    return result_;
  }

  // (ClassField ";")*
  private static boolean varRecDeclInner_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varRecDeclInner_0")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!varRecDeclInner_0_0(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "varRecDeclInner_0", pos_)) break;
    }
    return true;
  }

  // ClassField ";"
  private static boolean varRecDeclInner_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varRecDeclInner_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = ClassField(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, SEMI);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [ClassField]
  private static boolean varRecDeclInner_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varRecDeclInner_1")) return false;
    ClassField(builder_, level_ + 1);
    return true;
  }

  // [recordVariantSection]
  private static boolean varRecDeclInner_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "varRecDeclInner_2")) return false;
    recordVariantSection(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // "varargs"
  static boolean varagrs(PsiBuilder builder_, int level_) {
    return consumeToken(builder_, "varargs");
  }

  /* ********************************************************** */
  // Expression
  static boolean whileExpression(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "whileExpression")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = Expression(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_statement_mid);
    return result_;
  }

  /* ********************************************************** */
  // Expression designatorsRest*
  static boolean withArgument(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "withArgument")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = Expression(builder_, level_ + 1);
    result_ = result_ && withArgument_1(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, PascalParser::rec_statement_mid);
    return result_;
  }

  // designatorsRest*
  private static boolean withArgument_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "withArgument_1")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!designatorsRest(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "withArgument_1", pos_)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // Expression root: Expr
  // Operator priority table:
  // 0: BINARY(sumExpr)
  // 1: BINARY(productExpr)
  // 2: BINARY(relationalExpr)
  // 3: PREFIX(unaryExpr)
  // 4: POSTFIX(referenceExpr)
  // 5: POSTFIX(callExpr) POSTFIX(indexExpr) POSTFIX(dereferenceExpr)
  // 6: ATOM(simpleRefExpr) ATOM(literalExpr) ATOM(parenExpr) ATOM(setExpr)
  //    ATOM(ClosureExpr)
  public static boolean Expr(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "Expr")) return false;
    addVariant(builder_, "<expr>");
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, "<expr>");
    result_ = unaryExpr(builder_, level_ + 1);
    if (!result_) result_ = simpleRefExpr(builder_, level_ + 1);
    if (!result_) result_ = literalExpr(builder_, level_ + 1);
    if (!result_) result_ = parenExpr(builder_, level_ + 1);
    if (!result_) result_ = setExpr(builder_, level_ + 1);
    if (!result_) result_ = ClosureExpr(builder_, level_ + 1);
    pinned_ = result_;
    result_ = result_ && Expr_0(builder_, level_ + 1, priority_);
    exit_section_(builder_, level_, marker_, null, result_, pinned_, null);
    return result_ || pinned_;
  }

  public static boolean Expr_0(PsiBuilder builder_, int level_, int priority_) {
    if (!recursion_guard_(builder_, level_, "Expr_0")) return false;
    boolean result_ = true;
    while (true) {
      Marker marker_ = enter_section_(builder_, level_, _LEFT_, null);
      if (priority_ < 0 && addOp(builder_, level_ + 1)) {
        result_ = Expr(builder_, level_, 0);
        exit_section_(builder_, level_, marker_, SUM_EXPR, result_, true, null);
      }
      else if (priority_ < 1 && mulOp(builder_, level_ + 1)) {
        result_ = Expr(builder_, level_, 1);
        exit_section_(builder_, level_, marker_, PRODUCT_EXPR, result_, true, null);
      }
      else if (priority_ < 2 && relOp(builder_, level_ + 1)) {
        result_ = Expr(builder_, level_, 2);
        exit_section_(builder_, level_, marker_, RELATIONAL_EXPR, result_, true, null);
      }
      else if (priority_ < 4 && referenceExpr_0(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, REFERENCE_EXPR, result_, true, null);
      }
      else if (priority_ < 5 && ArgumentList(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, CALL_EXPR, result_, true, null);
      }
      else if (priority_ < 5 && indexList(builder_, level_ + 1)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, INDEX_EXPR, result_, true, null);
      }
      else if (priority_ < 5 && consumeTokenSmart(builder_, DEREF)) {
        result_ = true;
        exit_section_(builder_, level_, marker_, DEREFERENCE_EXPR, result_, true, null);
      }
      else {
        exit_section_(builder_, level_, marker_, null, false, false, null);
        break;
      }
    }
    return result_;
  }

  public static boolean unaryExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unaryExpr")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, null);
    result_ = unaryOp(builder_, level_ + 1);
    pinned_ = result_;
    result_ = pinned_ && Expr(builder_, level_, 3);
    exit_section_(builder_, level_, marker_, UNARY_EXPR, result_, pinned_, null);
    return result_ || pinned_;
  }

  // '.' FullyQualifiedIdent [GenericPostfix]
  private static boolean referenceExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "referenceExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = consumeTokenSmart(builder_, DOT);
    result_ = result_ && FullyQualifiedIdent(builder_, level_ + 1);
    result_ = result_ && referenceExpr_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // [GenericPostfix]
  private static boolean referenceExpr_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "referenceExpr_0_2")) return false;
    GenericPostfix(builder_, level_ + 1);
    return true;
  }

  // ((InheritedCall | SPECIALIZE)? FullyQualifiedIdent [GenericPostfix]) | InheritedCall
  public static boolean simpleRefExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simpleRefExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, REFERENCE_EXPR, "<simple ref expr>");
    result_ = simpleRefExpr_0(builder_, level_ + 1);
    if (!result_) result_ = InheritedCall(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // (InheritedCall | SPECIALIZE)? FullyQualifiedIdent [GenericPostfix]
  private static boolean simpleRefExpr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simpleRefExpr_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = simpleRefExpr_0_0(builder_, level_ + 1);
    result_ = result_ && FullyQualifiedIdent(builder_, level_ + 1);
    result_ = result_ && simpleRefExpr_0_2(builder_, level_ + 1);
    exit_section_(builder_, marker_, null, result_);
    return result_;
  }

  // (InheritedCall | SPECIALIZE)?
  private static boolean simpleRefExpr_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simpleRefExpr_0_0")) return false;
    simpleRefExpr_0_0_0(builder_, level_ + 1);
    return true;
  }

  // InheritedCall | SPECIALIZE
  private static boolean simpleRefExpr_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simpleRefExpr_0_0_0")) return false;
    boolean result_;
    result_ = InheritedCall(builder_, level_ + 1);
    if (!result_) result_ = consumeTokenSmart(builder_, SPECIALIZE);
    return result_;
  }

  // [GenericPostfix]
  private static boolean simpleRefExpr_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simpleRefExpr_0_2")) return false;
    GenericPostfix(builder_, level_ + 1);
    return true;
  }

  // NUMBER_REAL | NUMBER_INT | NUMBER_HEX | NUMBER_OCT | NUMBER_BIN | TRUE | FALSE | NIL | StringFactor
  public static boolean literalExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literalExpr")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, LITERAL_EXPR, "<literal expr>");
    result_ = consumeTokenSmart(builder_, NUMBER_REAL);
    if (!result_) result_ = consumeTokenSmart(builder_, NUMBER_INT);
    if (!result_) result_ = consumeTokenSmart(builder_, NUMBER_HEX);
    if (!result_) result_ = consumeTokenSmart(builder_, NUMBER_OCT);
    if (!result_) result_ = consumeTokenSmart(builder_, NUMBER_BIN);
    if (!result_) result_ = consumeTokenSmart(builder_, TRUE);
    if (!result_) result_ = consumeTokenSmart(builder_, FALSE);
    if (!result_) result_ = consumeTokenSmart(builder_, NIL);
    if (!result_) result_ = StringFactor(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // parenConstruct
  public static boolean parenExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parenExpr")) return false;
    if (!nextTokenIsSmart(builder_, LPAREN)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_);
    result_ = parenConstruct(builder_, level_ + 1);
    exit_section_(builder_, marker_, PAREN_EXPR, result_);
    return result_;
  }

  // '[' [ !']' Expr setTail * ] ']'
  public static boolean setExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "setExpr")) return false;
    if (!nextTokenIsSmart(builder_, LBRACK)) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, SET_EXPR, null);
    result_ = consumeTokenSmart(builder_, LBRACK);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, setExpr_1(builder_, level_ + 1));
    result_ = pinned_ && consumeToken(builder_, RBRACK) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // [ !']' Expr setTail * ]
  private static boolean setExpr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "setExpr_1")) return false;
    setExpr_1_0(builder_, level_ + 1);
    return true;
  }

  // !']' Expr setTail *
  private static boolean setExpr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "setExpr_1_0")) return false;
    boolean result_, pinned_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_);
    result_ = setExpr_1_0_0(builder_, level_ + 1);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, Expr(builder_, level_ + 1, -1));
    result_ = pinned_ && setExpr_1_0_2(builder_, level_ + 1) && result_;
    exit_section_(builder_, level_, marker_, result_, pinned_, null);
    return result_ || pinned_;
  }

  // !']'
  private static boolean setExpr_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "setExpr_1_0_0")) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NOT_);
    result_ = !consumeTokenSmart(builder_, RBRACK);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

  // setTail *
  private static boolean setExpr_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "setExpr_1_0_2")) return false;
    while (true) {
      int pos_ = current_position_(builder_);
      if (!setTail(builder_, level_ + 1)) break;
      if (!empty_element_parsed_guard_(builder_, "setExpr_1_0_2", pos_)) break;
    }
    return true;
  }

  // ClosureRoutine
  public static boolean ClosureExpr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ClosureExpr")) return false;
    if (!nextTokenIsSmart(builder_, FUNCTION, PROCEDURE)) return false;
    boolean result_;
    Marker marker_ = enter_section_(builder_, level_, _NONE_, CLOSURE_EXPR, "<closure expr>");
    result_ = ClosureRoutine(builder_, level_ + 1);
    exit_section_(builder_, level_, marker_, result_, false, null);
    return result_;
  }

}
