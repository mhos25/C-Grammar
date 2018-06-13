// Generated from Additionrecursion.g4 by ANTLR 4.7.1
package src.de.letsbuildacompiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AdditionrecursionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AdditionrecursionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(AdditionrecursionParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(AdditionrecursionParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Div}
	 * labeled alternative in {@link AdditionrecursionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(AdditionrecursionParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link AdditionrecursionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(AdditionrecursionParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link AdditionrecursionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(AdditionrecursionParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link AdditionrecursionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(AdditionrecursionParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mult}
	 * labeled alternative in {@link AdditionrecursionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(AdditionrecursionParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link AdditionrecursionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(AdditionrecursionParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Relational}
	 * labeled alternative in {@link AdditionrecursionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(AdditionrecursionParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code String}
	 * labeled alternative in {@link AdditionrecursionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(AdditionrecursionParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link AdditionrecursionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(AdditionrecursionParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link AdditionrecursionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(AdditionrecursionParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StaticVarDeclaration}
	 * labeled alternative in {@link AdditionrecursionParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStaticVarDeclaration(AdditionrecursionParser.StaticVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarDeclarationAndAssignment}
	 * labeled alternative in {@link AdditionrecursionParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationAndAssignment(AdditionrecursionParser.VarDeclarationAndAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleVarDeclaration}
	 * labeled alternative in {@link AdditionrecursionParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleVarDeclaration(AdditionrecursionParser.SimpleVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListDeclaration}
	 * labeled alternative in {@link AdditionrecursionParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclaration(AdditionrecursionParser.ListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#varDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclarationList(AdditionrecursionParser.VarDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanVariableEvaluationAndAssignment}
	 * labeled alternative in {@link AdditionrecursionParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVariableEvaluationAndAssignment(AdditionrecursionParser.BooleanVariableEvaluationAndAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code directVarAssignment}
	 * labeled alternative in {@link AdditionrecursionParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectVarAssignment(AdditionrecursionParser.DirectVarAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code InputVar}
	 * labeled alternative in {@link AdditionrecursionParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputVar(AdditionrecursionParser.InputVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatementAndVariable}
	 * labeled alternative in {@link AdditionrecursionParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatementAndVariable(AdditionrecursionParser.PrintStatementAndVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print_Two_Variables}
	 * labeled alternative in {@link AdditionrecursionParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_Two_Variables(AdditionrecursionParser.Print_Two_VariablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Print_three}
	 * labeled alternative in {@link AdditionrecursionParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_three(AdditionrecursionParser.Print_threeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simplePrintStatement}
	 * labeled alternative in {@link AdditionrecursionParser#println}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimplePrintStatement(AdditionrecursionParser.SimplePrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(AdditionrecursionParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareStatements_if}
	 * labeled alternative in {@link AdditionrecursionParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareStatements_if(AdditionrecursionParser.CompareStatements_ifContext ctx);
	/**
	 * Visit a parse tree produced by the {@code If_statement_Or}
	 * labeled alternative in {@link AdditionrecursionParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement_Or(AdditionrecursionParser.If_statement_OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CheckforOne_If}
	 * labeled alternative in {@link AdditionrecursionParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckforOne_If(AdditionrecursionParser.CheckforOne_IfContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OtherIfStatements}
	 * labeled alternative in {@link AdditionrecursionParser#branch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOtherIfStatements(AdditionrecursionParser.OtherIfStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DoWhile_Or}
	 * labeled alternative in {@link AdditionrecursionParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhile_Or(AdditionrecursionParser.DoWhile_OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SimpleDoWhile}
	 * labeled alternative in {@link AdditionrecursionParser#do_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDoWhile(AdditionrecursionParser.SimpleDoWhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(AdditionrecursionParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(AdditionrecursionParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#incrementation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncrementation(AdditionrecursionParser.IncrementationContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#decrement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecrement(AdditionrecursionParser.DecrementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#forLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForLoop(AdditionrecursionParser.ForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclareVariable_For}
	 * labeled alternative in {@link AdditionrecursionParser#forInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVariable_For(AdditionrecursionParser.DeclareVariable_ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignVariable_For}
	 * labeled alternative in {@link AdditionrecursionParser#forInitialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVariable_For(AdditionrecursionParser.AssignVariable_ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#forChange}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForChange(AdditionrecursionParser.ForChangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#charArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharArray(AdditionrecursionParser.CharArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#arrayAssignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignment(AdditionrecursionParser.ArrayAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#arrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayElement(AdditionrecursionParser.ArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#comparingArrayElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparingArrayElements(AdditionrecursionParser.ComparingArrayElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#comparingBooleanAndArrayElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparingBooleanAndArrayElement(AdditionrecursionParser.ComparingBooleanAndArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link AdditionrecursionParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(AdditionrecursionParser.ReturnStatementContext ctx);
}