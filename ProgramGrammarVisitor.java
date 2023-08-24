// Generated from ProgramGrammar.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProgramGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProgramGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ProgramGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#stringStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringStatement(ProgramGrammarParser.StringStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(ProgramGrammarParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#stringOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringOperation(ProgramGrammarParser.StringOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#asignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignStatement(ProgramGrammarParser.AsignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#asign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsign(ProgramGrammarParser.AsignContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#inputWriteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputWriteStatement(ProgramGrammarParser.InputWriteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#inputWrite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputWrite(ProgramGrammarParser.InputWriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(ProgramGrammarParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ProgramGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#mientras}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMientras(ProgramGrammarParser.MientrasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#floatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatStatement(ProgramGrammarParser.FloatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#decimal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimal(ProgramGrammarParser.DecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#operationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperationStatement(ProgramGrammarParser.OperationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(ProgramGrammarParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#boolStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolStatement(ProgramGrammarParser.BoolStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ProgramGrammarParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ProgramGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#infixExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixExpr(ProgramGrammarParser.InfixExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#additiveExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditiveExpr(ProgramGrammarParser.AdditiveExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicativeExpr(ProgramGrammarParser.MultiplicativeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProgramGrammarParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ProgramGrammarParser.PrimaryContext ctx);
}