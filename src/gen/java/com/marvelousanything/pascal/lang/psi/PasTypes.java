// This is a generated file. Not intended for manual editing.
package com.marvelousanything.pascal.lang.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.marvelousanything.pascal.lang.stub.struct.PasClassHelperDeclStubElementType;
import com.marvelousanything.pascal.lang.stub.struct.PasClassDeclStubElementType;
import com.marvelousanything.pascal.lang.stub.PasExportedRoutineStubElementType;
import com.marvelousanything.pascal.lang.stub.struct.PasInterfaceDeclStubElementType;
import com.marvelousanything.pascal.lang.stub.PasModuleStubElementType;
import com.marvelousanything.pascal.lang.stub.PasIdentStubElementType;
import com.marvelousanything.pascal.lang.stub.struct.PasObjectDeclStubElementType;
import com.marvelousanything.pascal.lang.stub.struct.PasRecordDeclStubElementType;
import com.marvelousanything.pascal.lang.stub.struct.PasRecordHelperDeclStubElementType;
import com.marvelousanything.pascal.lang.lexer.PascalElementType;
import com.marvelousanything.pascal.lang.psi.impl.*;

public interface PasTypes {

  IElementType ADD_OP = new PascalPsiElementType("ADD_OP");
  IElementType ARGUMENT_LIST = new PascalPsiElementType("ARGUMENT_LIST");
  IElementType ARRAY_CONST_EXPR = new PascalPsiElementType("ARRAY_CONST_EXPR");
  IElementType ARRAY_INDEX = new PascalPsiElementType("ARRAY_INDEX");
  IElementType ARRAY_TYPE = new PascalPsiElementType("ARRAY_TYPE");
  IElementType ASSEMBLER_STATEMENT = new PascalPsiElementType("ASSEMBLER_STATEMENT");
  IElementType ASSIGN_OP = new PascalPsiElementType("ASSIGN_OP");
  IElementType ASSIGN_PART = new PascalPsiElementType("ASSIGN_PART");
  IElementType ATTRIBUTE_PARAM_LIST = new PascalPsiElementType("ATTRIBUTE_PARAM_LIST");
  IElementType BLOCK_BODY = new PascalPsiElementType("BLOCK_BODY");
  IElementType BLOCK_GLOBAL = new PascalPsiElementType("BLOCK_GLOBAL");
  IElementType BLOCK_LOCAL = new PascalPsiElementType("BLOCK_LOCAL");
  IElementType BLOCK_LOCAL_NESTED_1 = new PascalPsiElementType("BLOCK_LOCAL_NESTED_1");
  IElementType BLOCK_LOCAL_WO_NESTED = new PascalPsiElementType("BLOCK_LOCAL_WO_NESTED");
  IElementType BREAK_STATEMENT = new PascalPsiElementType("BREAK_STATEMENT");
  IElementType CALL_EXPR = new PascalPsiElementType("CALL_EXPR");
  IElementType CASE_ELSE = new PascalPsiElementType("CASE_ELSE");
  IElementType CASE_ITEM = new PascalPsiElementType("CASE_ITEM");
  IElementType CASE_STATEMENT = new PascalPsiElementType("CASE_STATEMENT");
  IElementType CLASS_FIELD = new PascalPsiElementType("CLASS_FIELD");
  IElementType CLASS_HELPER_DECL = new PasClassHelperDeclStubElementType("CLASS_HELPER_DECL");
  IElementType CLASS_METHOD_RESOLUTION = new PascalPsiElementType("CLASS_METHOD_RESOLUTION");
  IElementType CLASS_PARENT = new PascalPsiElementType("CLASS_PARENT");
  IElementType CLASS_PROPERTY = new PascalPsiElementType("CLASS_PROPERTY");
  IElementType CLASS_PROPERTY_ARRAY = new PascalPsiElementType("CLASS_PROPERTY_ARRAY");
  IElementType CLASS_PROPERTY_INDEX = new PascalPsiElementType("CLASS_PROPERTY_INDEX");
  IElementType CLASS_PROPERTY_SPECIFIER = new PascalPsiElementType("CLASS_PROPERTY_SPECIFIER");
  IElementType CLASS_QUALIFIED_IDENT = new PascalPsiElementType("CLASS_QUALIFIED_IDENT");
  IElementType CLASS_STATE = new PascalPsiElementType("CLASS_STATE");
  IElementType CLASS_TYPE_DECL = new PasClassDeclStubElementType("CLASS_TYPE_DECL");
  IElementType CLASS_TYPE_TYPE_DECL = new PascalPsiElementType("CLASS_TYPE_TYPE_DECL");
  IElementType CLOSURE_EXPR = new PascalPsiElementType("CLOSURE_EXPR");
  IElementType CLOSURE_ROUTINE = new PascalPsiElementType("CLOSURE_ROUTINE");
  IElementType COLON_CONSTRUCT = new PascalPsiElementType("COLON_CONSTRUCT");
  IElementType COMPOUND_STATEMENT = new PascalPsiElementType("COMPOUND_STATEMENT");
  IElementType CONSTRAINED_TYPE_PARAM = new PascalPsiElementType("CONSTRAINED_TYPE_PARAM");
  IElementType CONST_DECLARATION = new PascalPsiElementType("CONST_DECLARATION");
  IElementType CONST_EXPRESSION = new PascalPsiElementType("CONST_EXPRESSION");
  IElementType CONST_EXPRESSION_ORD = new PascalPsiElementType("CONST_EXPRESSION_ORD");
  IElementType CONST_SECTION = new PascalPsiElementType("CONST_SECTION");
  IElementType CONTAINS_CLAUSE = new PascalPsiElementType("CONTAINS_CLAUSE");
  IElementType CONTINUE_STATEMENT = new PascalPsiElementType("CONTINUE_STATEMENT");
  IElementType CUSTOM_ATTRIBUTE_DECL = new PascalPsiElementType("CUSTOM_ATTRIBUTE_DECL");
  IElementType DEREFERENCE_EXPR = new PascalPsiElementType("DEREFERENCE_EXPR");
  IElementType ENUM_TYPE = new PascalPsiElementType("ENUM_TYPE");
  IElementType ESCAPED_IDENT = new PascalPsiElementType("ESCAPED_IDENT");
  IElementType EXIT_STATEMENT = new PascalPsiElementType("EXIT_STATEMENT");
  IElementType EXPORTED_ROUTINE = new PasExportedRoutineStubElementType("EXPORTED_ROUTINE");
  IElementType EXPORTS_SECTION = new PascalPsiElementType("EXPORTS_SECTION");
  IElementType EXPR = new PascalPsiElementType("EXPR");
  IElementType EXPRESSION = new PascalPsiElementType("EXPRESSION");
  IElementType EXTERNAL_DIRECTIVE = new PascalPsiElementType("EXTERNAL_DIRECTIVE");
  IElementType FILE_TYPE = new PascalPsiElementType("FILE_TYPE");
  IElementType FORMAL_PARAMETER = new PascalPsiElementType("FORMAL_PARAMETER");
  IElementType FORMAL_PARAMETER_SECTION = new PascalPsiElementType("FORMAL_PARAMETER_SECTION");
  IElementType FOR_INLINE_DECLARATION = new PascalPsiElementType("FOR_INLINE_DECLARATION");
  IElementType FOR_STATEMENT = new PascalPsiElementType("FOR_STATEMENT");
  IElementType FROM_EXPRESSION = new PascalPsiElementType("FROM_EXPRESSION");
  IElementType FULLY_QUALIFIED_IDENT = new PascalPsiElementType("FULLY_QUALIFIED_IDENT");
  IElementType FUNCTION_DIRECTIVE = new PascalPsiElementType("FUNCTION_DIRECTIVE");
  IElementType GENERIC_CONSTRAINT = new PascalPsiElementType("GENERIC_CONSTRAINT");
  IElementType GENERIC_POSTFIX = new PascalPsiElementType("GENERIC_POSTFIX");
  IElementType GENERIC_TYPE_IDENT = new PascalPsiElementType("GENERIC_TYPE_IDENT");
  IElementType GOTO_STATEMENT = new PascalPsiElementType("GOTO_STATEMENT");
  IElementType HANDLER = new PascalPsiElementType("HANDLER");
  IElementType IF_ELSE_STATEMENT = new PascalPsiElementType("IF_ELSE_STATEMENT");
  IElementType IF_STATEMENT = new PascalPsiElementType("IF_STATEMENT");
  IElementType IF_THEN_STATEMENT = new PascalPsiElementType("IF_THEN_STATEMENT");
  IElementType IMPL_DECL_SECTION = new PascalPsiElementType("IMPL_DECL_SECTION");
  IElementType INDEX_EXPR = new PascalPsiElementType("INDEX_EXPR");
  IElementType INDEX_LIST = new PascalPsiElementType("INDEX_LIST");
  IElementType INHERITED_CALL = new PascalPsiElementType("INHERITED_CALL");
  IElementType INLINE_CONST_DECLARATION = new PascalPsiElementType("INLINE_CONST_DECLARATION");
  IElementType INLINE_VAR_DECLARATION = new PascalPsiElementType("INLINE_VAR_DECLARATION");
  IElementType INTERFACE_TYPE_DECL = new PasInterfaceDeclStubElementType("INTERFACE_TYPE_DECL");
  IElementType IN_OPERATOR_QUALIFIED_IDENT = new PascalPsiElementType("IN_OPERATOR_QUALIFIED_IDENT");
  IElementType KEYWORD_IDENT = new PascalPsiElementType("KEYWORD_IDENT");
  IElementType LABEL_DECL_SECTION = new PascalPsiElementType("LABEL_DECL_SECTION");
  IElementType LABEL_ID = new PascalPsiElementType("LABEL_ID");
  IElementType LIBRARY_MODULE_HEAD = new PascalPsiElementType("LIBRARY_MODULE_HEAD");
  IElementType LITERAL_EXPR = new PascalPsiElementType("LITERAL_EXPR");
  IElementType MODULE = new PasModuleStubElementType("MODULE");
  IElementType MUL_OP = new PascalPsiElementType("MUL_OP");
  IElementType NAMED_IDENT = new PascalPsiElementType("NAMED_IDENT");
  IElementType NAMED_IDENT_DECL = new PasIdentStubElementType("NAMED_IDENT_DECL");
  IElementType NAMESPACE_IDENT = new PascalPsiElementType("NAMESPACE_IDENT");
  IElementType NEW_STATEMENT = new PascalPsiElementType("NEW_STATEMENT");
  IElementType OBJECT_DECL = new PasObjectDeclStubElementType("OBJECT_DECL");
  IElementType OPERATOR_SUB_IDENT = new PascalPsiElementType("OPERATOR_SUB_IDENT");
  IElementType PACKAGE_MODULE_HEAD = new PascalPsiElementType("PACKAGE_MODULE_HEAD");
  IElementType PARAM_TYPE = new PascalPsiElementType("PARAM_TYPE");
  IElementType PAREN_EXPR = new PascalPsiElementType("PAREN_EXPR");
  IElementType POINTER_TYPE = new PascalPsiElementType("POINTER_TYPE");
  IElementType PROCEDURE_TYPE = new PascalPsiElementType("PROCEDURE_TYPE");
  IElementType PROC_BODY_BLOCK = new PascalPsiElementType("PROC_BODY_BLOCK");
  IElementType PROC_FORWARD_DECL = new PascalPsiElementType("PROC_FORWARD_DECL");
  IElementType PRODUCT_EXPR = new PascalPsiElementType("PRODUCT_EXPR");
  IElementType PROGRAM_MODULE_HEAD = new PascalPsiElementType("PROGRAM_MODULE_HEAD");
  IElementType PROGRAM_PARAM_LIST = new PascalPsiElementType("PROGRAM_PARAM_LIST");
  IElementType RAISE_STATEMENT = new PascalPsiElementType("RAISE_STATEMENT");
  IElementType RANGE_BOUND = new PascalPsiElementType("RANGE_BOUND");
  IElementType RECORD_CONST_EXPR = new PascalPsiElementType("RECORD_CONST_EXPR");
  IElementType RECORD_DECL = new PasRecordDeclStubElementType("RECORD_DECL");
  IElementType RECORD_HELPER_DECL = new PasRecordHelperDeclStubElementType("RECORD_HELPER_DECL");
  IElementType RECORD_VARIANT = new PascalPsiElementType("RECORD_VARIANT");
  IElementType REFERENCE_EXPR = new PascalPsiElementType("REFERENCE_EXPR");
  IElementType REF_NAMED_IDENT = new PascalPsiElementType("REF_NAMED_IDENT");
  IElementType RELATIONAL_EXPR = new PascalPsiElementType("RELATIONAL_EXPR");
  IElementType REL_OP = new PascalPsiElementType("REL_OP");
  IElementType REPEAT_STATEMENT = new PascalPsiElementType("REPEAT_STATEMENT");
  IElementType REQUIRES_CLAUSE = new PascalPsiElementType("REQUIRES_CLAUSE");
  IElementType ROUTINE_IMPL_DECL = new PascalPsiElementType("ROUTINE_IMPL_DECL");
  IElementType ROUTINE_IMPL_DECL_NESTED_1 = new PascalPsiElementType("ROUTINE_IMPL_DECL_NESTED_1");
  IElementType ROUTINE_IMPL_DECL_WO_NESTED = new PascalPsiElementType("ROUTINE_IMPL_DECL_WO_NESTED");
  IElementType SET_EXPR = new PascalPsiElementType("SET_EXPR");
  IElementType SET_TYPE = new PascalPsiElementType("SET_TYPE");
  IElementType STATEMENT = new PascalPsiElementType("STATEMENT");
  IElementType STMT_EMPTY = new PascalPsiElementType("STMT_EMPTY");
  IElementType STRING_FACTOR = new PascalPsiElementType("STRING_FACTOR");
  IElementType STRING_TYPE = new PascalPsiElementType("STRING_TYPE");
  IElementType SUB_IDENT = new PascalPsiElementType("SUB_IDENT");
  IElementType SUB_RANGE_TYPE = new PascalPsiElementType("SUB_RANGE_TYPE");
  IElementType SUM_EXPR = new PascalPsiElementType("SUM_EXPR");
  IElementType TRY_STATEMENT = new PascalPsiElementType("TRY_STATEMENT");
  IElementType TYPE_DECL = new PascalPsiElementType("TYPE_DECL");
  IElementType TYPE_DECLARATION = new PascalPsiElementType("TYPE_DECLARATION");
  IElementType TYPE_ID = new PascalPsiElementType("TYPE_ID");
  IElementType TYPE_SECTION = new PascalPsiElementType("TYPE_SECTION");
  IElementType UNARY_EXPR = new PascalPsiElementType("UNARY_EXPR");
  IElementType UNARY_OP = new PascalPsiElementType("UNARY_OP");
  IElementType UNIT_FINALIZATION = new PascalPsiElementType("UNIT_FINALIZATION");
  IElementType UNIT_IMPLEMENTATION = new PascalPsiElementType("UNIT_IMPLEMENTATION");
  IElementType UNIT_INITIALIZATION = new PascalPsiElementType("UNIT_INITIALIZATION");
  IElementType UNIT_INTERFACE = new PascalPsiElementType("UNIT_INTERFACE");
  IElementType UNIT_MODULE_HEAD = new PascalPsiElementType("UNIT_MODULE_HEAD");
  IElementType USES_CLAUSE = new PascalPsiElementType("USES_CLAUSE");
  IElementType VAR_DECLARATION = new PascalPsiElementType("VAR_DECLARATION");
  IElementType VAR_SECTION = new PascalPsiElementType("VAR_SECTION");
  IElementType VAR_VALUE_SPEC = new PascalPsiElementType("VAR_VALUE_SPEC");
  IElementType VISIBILITY = new PascalPsiElementType("VISIBILITY");
  IElementType WHILE_STATEMENT = new PascalPsiElementType("WHILE_STATEMENT");
  IElementType WITH_STATEMENT = new PascalPsiElementType("WITH_STATEMENT");

  IElementType ABSOLUTE = new PascalElementType("absolute");
  IElementType ABSOLUTE_ = new PascalElementType("&absolute");
  IElementType ABSTRACT = new PascalElementType("abstract");
  IElementType ABSTRACT_ = new PascalElementType("&abstract");
  IElementType AND = new PascalElementType("and");
  IElementType AND_ = new PascalElementType("&and");
  IElementType ARRAY = new PascalElementType("array");
  IElementType ARRAY_ = new PascalElementType("&array");
  IElementType AS = new PascalElementType("as");
  IElementType ASM = new PascalElementType("asm");
  IElementType ASM_ = new PascalElementType("&asm");
  IElementType ASSEMBLER = new PascalElementType("assembler");
  IElementType ASSEMBLER_ = new PascalElementType("&assembler");
  IElementType ASSIGN = new PascalElementType(":=");
  IElementType AS_ = new PascalElementType("&as");
  IElementType AT = new PascalElementType("@");
  IElementType AUTOMATED = new PascalElementType("automated");
  IElementType AUTOMATED_ = new PascalElementType("&automated");
  IElementType BEGIN = new PascalElementType("begin");
  IElementType BEGIN_ = new PascalElementType("&begin");
  IElementType BREAK = new PascalElementType("break");
  IElementType BREAK_ = new PascalElementType("&break");
  IElementType CASE = new PascalElementType("case");
  IElementType CASE_ = new PascalElementType("&case");
  IElementType CDECL = new PascalElementType("cdecl");
  IElementType CDECL_ = new PascalElementType("&cdecl");
  IElementType CHARNUM = new PascalElementType("#");
  IElementType CLASS = new PascalElementType("class");
  IElementType CLASS_ = new PascalElementType("&class");
  IElementType COLON = new PascalElementType(":");
  IElementType COMMA = new PascalElementType(",");
  IElementType COMMENT = new PascalElementType("COMMENT");
  IElementType COMP_OPTION = new PascalElementType("comp_option");
  IElementType CONST = new PascalElementType("const");
  IElementType CONSTREF = new PascalElementType("constref");
  IElementType CONSTREF_ = new PascalElementType("&constref");
  IElementType CONSTRUCTOR = new PascalElementType("constructor");
  IElementType CONSTRUCTOR_ = new PascalElementType("&constructor");
  IElementType CONST_ = new PascalElementType("&const");
  IElementType CONTAINS = new PascalElementType("contains");
  IElementType CONTAINS_ = new PascalElementType("&contains");
  IElementType CONTINUE = new PascalElementType("continue");
  IElementType CONTINUE_ = new PascalElementType("&continue");
  IElementType CT_DEFINE = new PascalElementType("ct_define");
  IElementType CT_ELSE = new PascalElementType("ct_else");
  IElementType CT_ENDIF = new PascalElementType("ct_endif");
  IElementType CT_IF = new PascalElementType("ct_if");
  IElementType CT_IFDEF = new PascalElementType("ct_ifdef");
  IElementType CT_IFNDEF = new PascalElementType("ct_ifndef");
  IElementType CT_IFOPT = new PascalElementType("ct_ifopt");
  IElementType CT_UNDEFINE = new PascalElementType("ct_undefine");
  IElementType DEFAULT = new PascalElementType("default");
  IElementType DEFAULT_ = new PascalElementType("&default");
  IElementType DEPRECATED = new PascalElementType("deprecated");
  IElementType DEPRECATED_ = new PascalElementType("&deprecated");
  IElementType DEREF = new PascalElementType("^");
  IElementType DESTRUCTOR = new PascalElementType("destructor");
  IElementType DESTRUCTOR_ = new PascalElementType("&destructor");
  IElementType DISPID = new PascalElementType("dispid");
  IElementType DISPID_ = new PascalElementType("&dispid");
  IElementType DISPINTERFACE = new PascalElementType("dispinterface");
  IElementType DISPINTERFACE_ = new PascalElementType("&dispinterface");
  IElementType DIV = new PascalElementType("/");
  IElementType DIV_ = new PascalElementType("DIV_");
  IElementType DIV_ASSIGN = new PascalElementType("/=");
  IElementType DO = new PascalElementType("do");
  IElementType DOT = new PascalElementType(".");
  IElementType DOWNTO = new PascalElementType("downto");
  IElementType DOWNTO_ = new PascalElementType("&downto");
  IElementType DO_ = new PascalElementType("&do");
  IElementType DYNAMIC = new PascalElementType("dynamic");
  IElementType DYNAMIC_ = new PascalElementType("&dynamic");
  IElementType ELSE = new PascalElementType("else");
  IElementType ELSE_ = new PascalElementType("&else");
  IElementType END = new PascalElementType("end");
  IElementType END_ = new PascalElementType("&end");
  IElementType EQ = new PascalElementType("=");
  IElementType EXCEPT = new PascalElementType("except");
  IElementType EXCEPT_ = new PascalElementType("&except");
  IElementType EXIT = new PascalElementType("exit");
  IElementType EXIT_ = new PascalElementType("&exit");
  IElementType EXPERIMENTAL = new PascalElementType("experimental");
  IElementType EXPERIMENTAL_ = new PascalElementType("&experimental");
  IElementType EXPORT = new PascalElementType("export");
  IElementType EXPORTS = new PascalElementType("exports");
  IElementType EXPORTS_ = new PascalElementType("&exports");
  IElementType EXPORT_ = new PascalElementType("&export");
  IElementType EXTERNAL = new PascalElementType("external");
  IElementType EXTERNAL_ = new PascalElementType("&external");
  IElementType FALSE = new PascalElementType("false");
  IElementType FALSE_ = new PascalElementType("&false");
  IElementType FILE = new PascalElementType("file");
  IElementType FILE_ = new PascalElementType("&file");
  IElementType FINAL = new PascalElementType("final");
  IElementType FINALIZATION = new PascalElementType("finalization");
  IElementType FINALIZATION_ = new PascalElementType("&finalization");
  IElementType FINALLY = new PascalElementType("finally");
  IElementType FINALLY_ = new PascalElementType("&finally");
  IElementType FINAL_ = new PascalElementType("&final");
  IElementType FOR = new PascalElementType("for");
  IElementType FORWARD = new PascalElementType("forward");
  IElementType FORWARD_ = new PascalElementType("&forward");
  IElementType FOR_ = new PascalElementType("&for");
  IElementType FUNCTION = new PascalElementType("function");
  IElementType FUNCTION_ = new PascalElementType("&function");
  IElementType GENERIC = new PascalElementType("GENERIC");
  IElementType GOTO = new PascalElementType("goto");
  IElementType GOTO_ = new PascalElementType("&goto");
  IElementType GT = new PascalElementType(">");
  IElementType HELPER = new PascalElementType("helper");
  IElementType HELPER_ = new PascalElementType("&helper");
  IElementType HEXNUM = new PascalElementType("$");
  IElementType IDIV = new PascalElementType("div");
  IElementType IDIV_ = new PascalElementType("&div");
  IElementType IF = new PascalElementType("if");
  IElementType IF_ = new PascalElementType("&if");
  IElementType IMPLEMENTATION = new PascalElementType("implementation");
  IElementType IMPLEMENTATION_ = new PascalElementType("&implementation");
  IElementType IMPLEMENTS = new PascalElementType("implements");
  IElementType IMPLEMENTS_ = new PascalElementType("&implements");
  IElementType IN = new PascalElementType("in");
  IElementType INCLUDE = new PascalElementType("include");
  IElementType INDEX = new PascalElementType("index");
  IElementType INDEX_ = new PascalElementType("&index");
  IElementType INHERITED = new PascalElementType("inherited");
  IElementType INHERITED_ = new PascalElementType("&inherited");
  IElementType INITIALIZATION = new PascalElementType("initialization");
  IElementType INITIALIZATION_ = new PascalElementType("&initialization");
  IElementType INLINE = new PascalElementType("inline");
  IElementType INLINE_ = new PascalElementType("&inline");
  IElementType INTERFACE = new PascalElementType("interface");
  IElementType INTERFACE_ = new PascalElementType("&interface");
  IElementType IN_ = new PascalElementType("&in");
  IElementType IS = new PascalElementType("is");
  IElementType IS_ = new PascalElementType("&is");
  IElementType LABEL = new PascalElementType("label");
  IElementType LABEL_ = new PascalElementType("&label");
  IElementType LBRACK = new PascalElementType("[");
  IElementType LIBRARY = new PascalElementType("library");
  IElementType LIBRARY_ = new PascalElementType("&library");
  IElementType LPAREN = new PascalElementType("(");
  IElementType LT = new PascalElementType("<");
  IElementType LTEQ = new PascalElementType("<=");
  IElementType MESSAGE = new PascalElementType("message");
  IElementType MESSAGE_ = new PascalElementType("&message");
  IElementType MINUS = new PascalElementType("-");
  IElementType MINUS_ASSIGN = new PascalElementType("-=");
  IElementType MOD = new PascalElementType("mod");
  IElementType MOD_ = new PascalElementType("&mod");
  IElementType MULT = new PascalElementType("*");
  IElementType MULT_ASSIGN = new PascalElementType("*=");
  IElementType NAME = new PascalElementType("NAME");
  IElementType NAME_ = new PascalElementType("NAME_");
  IElementType NE = new PascalElementType("<>");
  IElementType NEW = new PascalElementType("NEW");
  IElementType NEW_ = new PascalElementType("NEW_");
  IElementType NIL = new PascalElementType("nil");
  IElementType NIL_ = new PascalElementType("&nil");
  IElementType NOT = new PascalElementType("not");
  IElementType NOT_ = new PascalElementType("&not");
  IElementType NUMBER_BIN = new PascalElementType("NUMBER_BIN");
  IElementType NUMBER_HEX = new PascalElementType("NUMBER_HEX");
  IElementType NUMBER_INT = new PascalElementType("NUMBER_INT");
  IElementType NUMBER_OCT = new PascalElementType("NUMBER_OCT");
  IElementType NUMBER_REAL = new PascalElementType("NUMBER_REAL");
  IElementType OBJC_CATEGORY = new PascalElementType("objccategory");
  IElementType OBJC_CLASS = new PascalElementType("objcclass");
  IElementType OBJC_PROTOCOL = new PascalElementType("objcprotocol");
  IElementType OBJECT = new PascalElementType("object");
  IElementType OBJECT_ = new PascalElementType("&object");
  IElementType OF = new PascalElementType("of");
  IElementType OF_ = new PascalElementType("&of");
  IElementType ON = new PascalElementType("on");
  IElementType ON_ = new PascalElementType("&on");
  IElementType OPERATOR = new PascalElementType("operator");
  IElementType OPERATOR_ = new PascalElementType("&operator");
  IElementType OR = new PascalElementType("or");
  IElementType OR_ = new PascalElementType("&or");
  IElementType OUT = new PascalElementType("out");
  IElementType OUT_ = new PascalElementType("&out");
  IElementType OVERLOAD = new PascalElementType("overload");
  IElementType OVERLOAD_ = new PascalElementType("&overload");
  IElementType OVERRIDE = new PascalElementType("override");
  IElementType OVERRIDE_ = new PascalElementType("&override");
  IElementType PACKAGE = new PascalElementType("package");
  IElementType PACKAGE_ = new PascalElementType("&package");
  IElementType PACKED = new PascalElementType("packed");
  IElementType PACKED_ = new PascalElementType("&packed");
  IElementType PASCAL = new PascalElementType("pascal");
  IElementType PASCAL_ = new PascalElementType("&pascal");
  IElementType PLATFORM = new PascalElementType("platform");
  IElementType PLATFORM_ = new PascalElementType("&platform");
  IElementType PLUS = new PascalElementType("+");
  IElementType PLUS_ASSIGN = new PascalElementType("+=");
  IElementType POINTER = new PascalElementType("pointer");
  IElementType POINTER_ = new PascalElementType("&pointer");
  IElementType POWER = new PascalElementType("**");
  IElementType PRIVATE = new PascalElementType("private");
  IElementType PRIVATE_ = new PascalElementType("&private");
  IElementType PROCEDURE = new PascalElementType("procedure");
  IElementType PROCEDURE_ = new PascalElementType("&procedure");
  IElementType PROGRAM = new PascalElementType("program");
  IElementType PROGRAM_ = new PascalElementType("&program");
  IElementType PROPERTY = new PascalElementType("property");
  IElementType PROPERTY_ = new PascalElementType("&property");
  IElementType PROTECTED = new PascalElementType("protected");
  IElementType PROTECTED_ = new PascalElementType("&protected");
  IElementType PUBLIC = new PascalElementType("public");
  IElementType PUBLIC_ = new PascalElementType("&public");
  IElementType PUBLISHED = new PascalElementType("published");
  IElementType PUBLISHED_ = new PascalElementType("&published");
  IElementType RAISE = new PascalElementType("raise");
  IElementType RAISE_ = new PascalElementType("&raise");
  IElementType RANGE = new PascalElementType("RANGE");
  IElementType RBRACK = new PascalElementType("]");
  IElementType READ = new PascalElementType("read");
  IElementType READ_ = new PascalElementType("&read");
  IElementType RECORD = new PascalElementType("record");
  IElementType RECORD_ = new PascalElementType("&record");
  IElementType REFERENCE = new PascalElementType("reference");
  IElementType REFERENCE_ = new PascalElementType("&reference");
  IElementType REGISTER = new PascalElementType("register");
  IElementType REGISTER_ = new PascalElementType("&register");
  IElementType REINTRODUCE = new PascalElementType("reintroduce");
  IElementType REINTRODUCE_ = new PascalElementType("&reintroduce");
  IElementType REPEAT = new PascalElementType("repeat");
  IElementType REPEAT_ = new PascalElementType("&repeat");
  IElementType REQUIRES = new PascalElementType("requires");
  IElementType REQUIRES_ = new PascalElementType("&requires");
  IElementType RESOURCESTRING = new PascalElementType("resourcestring");
  IElementType RESOURCESTRING_ = new PascalElementType("&resourcestring");
  IElementType RPAREN = new PascalElementType(")");
  IElementType SAFECALL = new PascalElementType("safecall");
  IElementType SAFECALL_ = new PascalElementType("&safecall");
  IElementType SEALED = new PascalElementType("sealed");
  IElementType SEALED_ = new PascalElementType("&sealed");
  IElementType SELF = new PascalElementType("self");
  IElementType SELF_ = new PascalElementType("&self");
  IElementType SEMI = new PascalElementType(";");
  IElementType SET = new PascalElementType("set");
  IElementType SETTAIL_0_2_0 = new PascalElementType("setTail_0_2_0");
  IElementType SET_ = new PascalElementType("&set");
  IElementType SHL = new PascalElementType("shl");
  IElementType SHL_ = new PascalElementType("&shl");
  IElementType SHR = new PascalElementType("shr");
  IElementType SHR_ = new PascalElementType("&shr");
  IElementType SPECIALIZE = new PascalElementType("SPECIALIZE");
  IElementType STATIC = new PascalElementType("static");
  IElementType STATIC_ = new PascalElementType("&static");
  IElementType STDCALL = new PascalElementType("stdcall");
  IElementType STDCALL_ = new PascalElementType("&stdcall");
  IElementType STRICT = new PascalElementType("strict");
  IElementType STRICT_ = new PascalElementType("&strict");
  IElementType STRING_LITERAL = new PascalElementType("STRING_LITERAL");
  IElementType THEN = new PascalElementType("then");
  IElementType THEN_ = new PascalElementType("&then");
  IElementType THREADVAR = new PascalElementType("threadvar");
  IElementType THREADVAR_ = new PascalElementType("&threadvar");
  IElementType TO = new PascalElementType("to");
  IElementType TO_ = new PascalElementType("&to");
  IElementType TRUE = new PascalElementType("true");
  IElementType TRUE_ = new PascalElementType("&true");
  IElementType TRY = new PascalElementType("try");
  IElementType TRY_ = new PascalElementType("&try");
  IElementType TYPE = new PascalElementType("type");
  IElementType TYPE_ = new PascalElementType("&type");
  IElementType UNIT = new PascalElementType("unit");
  IElementType UNIT_ = new PascalElementType("&unit");
  IElementType UNTIL = new PascalElementType("until");
  IElementType UNTIL_ = new PascalElementType("&until");
  IElementType USES = new PascalElementType("uses");
  IElementType USES_ = new PascalElementType("&uses");
  IElementType VAR = new PascalElementType("var");
  IElementType VAR_ = new PascalElementType("&var");
  IElementType VIRTUAL = new PascalElementType("virtual");
  IElementType VIRTUAL_ = new PascalElementType("&virtual");
  IElementType WHILE = new PascalElementType("while");
  IElementType WHILE_ = new PascalElementType("&while");
  IElementType WITH = new PascalElementType("with");
  IElementType WITH_ = new PascalElementType("&with");
  IElementType WRITE = new PascalElementType("write");
  IElementType WRITE_ = new PascalElementType("&write");
  IElementType XOR = new PascalElementType("xor");
  IElementType XOR_ = new PascalElementType("&xor");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ADD_OP) {
        return new PasAddOpImpl(node);
      }
      else if (type == ARGUMENT_LIST) {
        return new PasArgumentListImpl(node);
      }
      else if (type == ARRAY_CONST_EXPR) {
        return new PasArrayConstExprImpl(node);
      }
      else if (type == ARRAY_INDEX) {
        return new PasArrayIndexImpl(node);
      }
      else if (type == ARRAY_TYPE) {
        return new PasArrayTypeImpl(node);
      }
      else if (type == ASSEMBLER_STATEMENT) {
        return new PasAssemblerStatementImpl(node);
      }
      else if (type == ASSIGN_OP) {
        return new PasAssignOpImpl(node);
      }
      else if (type == ASSIGN_PART) {
        return new PasAssignPartImpl(node);
      }
      else if (type == ATTRIBUTE_PARAM_LIST) {
        return new PasAttributeParamListImpl(node);
      }
      else if (type == BLOCK_BODY) {
        return new PasBlockBodyImpl(node);
      }
      else if (type == BLOCK_GLOBAL) {
        return new PasBlockGlobalImpl(node);
      }
      else if (type == BLOCK_LOCAL) {
        return new PasBlockLocalImpl(node);
      }
      else if (type == BLOCK_LOCAL_NESTED_1) {
        return new PasBlockLocalNested1Impl(node);
      }
      else if (type == BLOCK_LOCAL_WO_NESTED) {
        return new PasBlockLocalWONestedImpl(node);
      }
      else if (type == BREAK_STATEMENT) {
        return new PasBreakStatementImpl(node);
      }
      else if (type == CALL_EXPR) {
        return new PasCallExprImpl(node);
      }
      else if (type == CASE_ELSE) {
        return new PasCaseElseImpl(node);
      }
      else if (type == CASE_ITEM) {
        return new PasCaseItemImpl(node);
      }
      else if (type == CASE_STATEMENT) {
        return new PasCaseStatementImpl(node);
      }
      else if (type == CLASS_FIELD) {
        return new PasClassFieldImpl(node);
      }
      else if (type == CLASS_HELPER_DECL) {
        return new PasClassHelperDeclImpl(node);
      }
      else if (type == CLASS_METHOD_RESOLUTION) {
        return new PasClassMethodResolutionImpl(node);
      }
      else if (type == CLASS_PARENT) {
        return new PasClassParentImpl(node);
      }
      else if (type == CLASS_PROPERTY) {
        return new PasClassPropertyImpl(node);
      }
      else if (type == CLASS_PROPERTY_ARRAY) {
        return new PasClassPropertyArrayImpl(node);
      }
      else if (type == CLASS_PROPERTY_INDEX) {
        return new PasClassPropertyIndexImpl(node);
      }
      else if (type == CLASS_PROPERTY_SPECIFIER) {
        return new PasClassPropertySpecifierImpl(node);
      }
      else if (type == CLASS_QUALIFIED_IDENT) {
        return new PasClassQualifiedIdentImpl(node);
      }
      else if (type == CLASS_STATE) {
        return new PasClassStateImpl(node);
      }
      else if (type == CLASS_TYPE_DECL) {
        return new PasClassTypeDeclImpl(node);
      }
      else if (type == CLASS_TYPE_TYPE_DECL) {
        return new PasClassTypeTypeDeclImpl(node);
      }
      else if (type == CLOSURE_EXPR) {
        return new PasClosureExprImpl(node);
      }
      else if (type == CLOSURE_ROUTINE) {
        return new PasClosureRoutineImpl(node);
      }
      else if (type == COLON_CONSTRUCT) {
        return new PasColonConstructImpl(node);
      }
      else if (type == COMPOUND_STATEMENT) {
        return new PasCompoundStatementImpl(node);
      }
      else if (type == CONSTRAINED_TYPE_PARAM) {
        return new PasConstrainedTypeParamImpl(node);
      }
      else if (type == CONST_DECLARATION) {
        return new PasConstDeclarationImpl(node);
      }
      else if (type == CONST_EXPRESSION) {
        return new PasConstExpressionImpl(node);
      }
      else if (type == CONST_EXPRESSION_ORD) {
        return new PasConstExpressionOrdImpl(node);
      }
      else if (type == CONST_SECTION) {
        return new PasConstSectionImpl(node);
      }
      else if (type == CONTAINS_CLAUSE) {
        return new PasContainsClauseImpl(node);
      }
      else if (type == CONTINUE_STATEMENT) {
        return new PasContinueStatementImpl(node);
      }
      else if (type == CUSTOM_ATTRIBUTE_DECL) {
        return new PasCustomAttributeDeclImpl(node);
      }
      else if (type == DEREFERENCE_EXPR) {
        return new PasDereferenceExprImpl(node);
      }
      else if (type == ENUM_TYPE) {
        return new PasEnumTypeImpl(node);
      }
      else if (type == ESCAPED_IDENT) {
        return new PasEscapedIdentImpl(node);
      }
      else if (type == EXIT_STATEMENT) {
        return new PasExitStatementImpl(node);
      }
      else if (type == EXPORTED_ROUTINE) {
        return new PasExportedRoutineImpl(node);
      }
      else if (type == EXPORTS_SECTION) {
        return new PasExportsSectionImpl(node);
      }
      else if (type == EXPRESSION) {
        return new PasExpressionImpl(node);
      }
      else if (type == EXTERNAL_DIRECTIVE) {
        return new PasExternalDirectiveImpl(node);
      }
      else if (type == FILE_TYPE) {
        return new PasFileTypeImpl(node);
      }
      else if (type == FORMAL_PARAMETER) {
        return new PasFormalParameterImpl(node);
      }
      else if (type == FORMAL_PARAMETER_SECTION) {
        return new PasFormalParameterSectionImpl(node);
      }
      else if (type == FOR_INLINE_DECLARATION) {
        return new PasForInlineDeclarationImpl(node);
      }
      else if (type == FOR_STATEMENT) {
        return new PasForStatementImpl(node);
      }
      else if (type == FROM_EXPRESSION) {
        return new PasFromExpressionImpl(node);
      }
      else if (type == FULLY_QUALIFIED_IDENT) {
        return new PasFullyQualifiedIdentImpl(node);
      }
      else if (type == FUNCTION_DIRECTIVE) {
        return new PasFunctionDirectiveImpl(node);
      }
      else if (type == GENERIC_CONSTRAINT) {
        return new PasGenericConstraintImpl(node);
      }
      else if (type == GENERIC_POSTFIX) {
        return new PasGenericPostfixImpl(node);
      }
      else if (type == GENERIC_TYPE_IDENT) {
        return new PasGenericTypeIdentImpl(node);
      }
      else if (type == GOTO_STATEMENT) {
        return new PasGotoStatementImpl(node);
      }
      else if (type == HANDLER) {
        return new PasHandlerImpl(node);
      }
      else if (type == IF_ELSE_STATEMENT) {
        return new PasIfElseStatementImpl(node);
      }
      else if (type == IF_STATEMENT) {
        return new PasIfStatementImpl(node);
      }
      else if (type == IF_THEN_STATEMENT) {
        return new PasIfThenStatementImpl(node);
      }
      else if (type == IMPL_DECL_SECTION) {
        return new PasImplDeclSectionImpl(node);
      }
      else if (type == INDEX_EXPR) {
        return new PasIndexExprImpl(node);
      }
      else if (type == INDEX_LIST) {
        return new PasIndexListImpl(node);
      }
      else if (type == INHERITED_CALL) {
        return new PasInheritedCallImpl(node);
      }
      else if (type == INLINE_CONST_DECLARATION) {
        return new PasInlineConstDeclarationImpl(node);
      }
      else if (type == INLINE_VAR_DECLARATION) {
        return new PasInlineVarDeclarationImpl(node);
      }
      else if (type == INTERFACE_TYPE_DECL) {
        return new PasInterfaceTypeDeclImpl(node);
      }
      else if (type == IN_OPERATOR_QUALIFIED_IDENT) {
        return new PasInOperatorQualifiedIdentImpl(node);
      }
      else if (type == KEYWORD_IDENT) {
        return new PasKeywordIdentImpl(node);
      }
      else if (type == LABEL_DECL_SECTION) {
        return new PasLabelDeclSectionImpl(node);
      }
      else if (type == LABEL_ID) {
        return new PasLabelIdImpl(node);
      }
      else if (type == LIBRARY_MODULE_HEAD) {
        return new PasLibraryModuleHeadImpl(node);
      }
      else if (type == LITERAL_EXPR) {
        return new PasLiteralExprImpl(node);
      }
      else if (type == MODULE) {
        return new PasModuleImpl(node);
      }
      else if (type == MUL_OP) {
        return new PasMulOpImpl(node);
      }
      else if (type == NAMED_IDENT) {
        return new PasNamedIdentImpl(node);
      }
      else if (type == NAMED_IDENT_DECL) {
        return new PasNamedIdentDeclImpl(node);
      }
      else if (type == NAMESPACE_IDENT) {
        return new PasNamespaceIdentImpl(node);
      }
      else if (type == NEW_STATEMENT) {
        return new PasNewStatementImpl(node);
      }
      else if (type == OBJECT_DECL) {
        return new PasObjectDeclImpl(node);
      }
      else if (type == OPERATOR_SUB_IDENT) {
        return new PasOperatorSubIdentImpl(node);
      }
      else if (type == PACKAGE_MODULE_HEAD) {
        return new PasPackageModuleHeadImpl(node);
      }
      else if (type == PARAM_TYPE) {
        return new PasParamTypeImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new PasParenExprImpl(node);
      }
      else if (type == POINTER_TYPE) {
        return new PasPointerTypeImpl(node);
      }
      else if (type == PROCEDURE_TYPE) {
        return new PasProcedureTypeImpl(node);
      }
      else if (type == PROC_BODY_BLOCK) {
        return new PasProcBodyBlockImpl(node);
      }
      else if (type == PROC_FORWARD_DECL) {
        return new PasProcForwardDeclImpl(node);
      }
      else if (type == PRODUCT_EXPR) {
        return new PasProductExprImpl(node);
      }
      else if (type == PROGRAM_MODULE_HEAD) {
        return new PasProgramModuleHeadImpl(node);
      }
      else if (type == PROGRAM_PARAM_LIST) {
        return new PasProgramParamListImpl(node);
      }
      else if (type == RAISE_STATEMENT) {
        return new PasRaiseStatementImpl(node);
      }
      else if (type == RANGE_BOUND) {
        return new PasRangeBoundImpl(node);
      }
      else if (type == RECORD_CONST_EXPR) {
        return new PasRecordConstExprImpl(node);
      }
      else if (type == RECORD_DECL) {
        return new PasRecordDeclImpl(node);
      }
      else if (type == RECORD_HELPER_DECL) {
        return new PasRecordHelperDeclImpl(node);
      }
      else if (type == RECORD_VARIANT) {
        return new PasRecordVariantImpl(node);
      }
      else if (type == REFERENCE_EXPR) {
        return new PasReferenceExprImpl(node);
      }
      else if (type == REF_NAMED_IDENT) {
        return new PasRefNamedIdentImpl(node);
      }
      else if (type == RELATIONAL_EXPR) {
        return new PasRelationalExprImpl(node);
      }
      else if (type == REL_OP) {
        return new PasRelOpImpl(node);
      }
      else if (type == REPEAT_STATEMENT) {
        return new PasRepeatStatementImpl(node);
      }
      else if (type == REQUIRES_CLAUSE) {
        return new PasRequiresClauseImpl(node);
      }
      else if (type == ROUTINE_IMPL_DECL) {
        return new PasRoutineImplDeclImpl(node);
      }
      else if (type == ROUTINE_IMPL_DECL_NESTED_1) {
        return new PasRoutineImplDeclNested1Impl(node);
      }
      else if (type == ROUTINE_IMPL_DECL_WO_NESTED) {
        return new PasRoutineImplDeclWoNestedImpl(node);
      }
      else if (type == SET_EXPR) {
        return new PasSetExprImpl(node);
      }
      else if (type == SET_TYPE) {
        return new PasSetTypeImpl(node);
      }
      else if (type == STATEMENT) {
        return new PasStatementImpl(node);
      }
      else if (type == STMT_EMPTY) {
        return new PasStmtEmptyImpl(node);
      }
      else if (type == STRING_FACTOR) {
        return new PasStringFactorImpl(node);
      }
      else if (type == STRING_TYPE) {
        return new PasStringTypeImpl(node);
      }
      else if (type == SUB_IDENT) {
        return new PasSubIdentImpl(node);
      }
      else if (type == SUB_RANGE_TYPE) {
        return new PasSubRangeTypeImpl(node);
      }
      else if (type == SUM_EXPR) {
        return new PasSumExprImpl(node);
      }
      else if (type == TRY_STATEMENT) {
        return new PasTryStatementImpl(node);
      }
      else if (type == TYPE_DECL) {
        return new PasTypeDeclImpl(node);
      }
      else if (type == TYPE_DECLARATION) {
        return new PasTypeDeclarationImpl(node);
      }
      else if (type == TYPE_ID) {
        return new PasTypeIDImpl(node);
      }
      else if (type == TYPE_SECTION) {
        return new PasTypeSectionImpl(node);
      }
      else if (type == UNARY_EXPR) {
        return new PasUnaryExprImpl(node);
      }
      else if (type == UNARY_OP) {
        return new PasUnaryOpImpl(node);
      }
      else if (type == UNIT_FINALIZATION) {
        return new PasUnitFinalizationImpl(node);
      }
      else if (type == UNIT_IMPLEMENTATION) {
        return new PasUnitImplementationImpl(node);
      }
      else if (type == UNIT_INITIALIZATION) {
        return new PasUnitInitializationImpl(node);
      }
      else if (type == UNIT_INTERFACE) {
        return new PasUnitInterfaceImpl(node);
      }
      else if (type == UNIT_MODULE_HEAD) {
        return new PasUnitModuleHeadImpl(node);
      }
      else if (type == USES_CLAUSE) {
        return new PasUsesClauseImpl(node);
      }
      else if (type == VAR_DECLARATION) {
        return new PasVarDeclarationImpl(node);
      }
      else if (type == VAR_SECTION) {
        return new PasVarSectionImpl(node);
      }
      else if (type == VAR_VALUE_SPEC) {
        return new PasVarValueSpecImpl(node);
      }
      else if (type == VISIBILITY) {
        return new PasVisibilityImpl(node);
      }
      else if (type == WHILE_STATEMENT) {
        return new PasWhileStatementImpl(node);
      }
      else if (type == WITH_STATEMENT) {
        return new PasWithStatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
