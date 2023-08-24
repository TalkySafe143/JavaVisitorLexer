// Generated from ProgramGrammar.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProgramGrammarParser}.
 */
public interface ProgramGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProgramGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProgramGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#stringStatement}.
	 * @param ctx the parse tree
	 */
	void enterStringStatement(ProgramGrammarParser.StringStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#stringStatement}.
	 * @param ctx the parse tree
	 */
	void exitStringStatement(ProgramGrammarParser.StringStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(ProgramGrammarParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(ProgramGrammarParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#stringOperation}.
	 * @param ctx the parse tree
	 */
	void enterStringOperation(ProgramGrammarParser.StringOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#stringOperation}.
	 * @param ctx the parse tree
	 */
	void exitStringOperation(ProgramGrammarParser.StringOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#asignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAsignStatement(ProgramGrammarParser.AsignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#asignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAsignStatement(ProgramGrammarParser.AsignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#asign}.
	 * @param ctx the parse tree
	 */
	void enterAsign(ProgramGrammarParser.AsignContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#asign}.
	 * @param ctx the parse tree
	 */
	void exitAsign(ProgramGrammarParser.AsignContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#inputWriteStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputWriteStatement(ProgramGrammarParser.InputWriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#inputWriteStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputWriteStatement(ProgramGrammarParser.InputWriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#inputWrite}.
	 * @param ctx the parse tree
	 */
	void enterInputWrite(ProgramGrammarParser.InputWriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#inputWrite}.
	 * @param ctx the parse tree
	 */
	void exitInputWrite(ProgramGrammarParser.InputWriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(ProgramGrammarParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(ProgramGrammarParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ProgramGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ProgramGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#mientras}.
	 * @param ctx the parse tree
	 */
	void enterMientras(ProgramGrammarParser.MientrasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#mientras}.
	 * @param ctx the parse tree
	 */
	void exitMientras(ProgramGrammarParser.MientrasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#floatStatement}.
	 * @param ctx the parse tree
	 */
	void enterFloatStatement(ProgramGrammarParser.FloatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#floatStatement}.
	 * @param ctx the parse tree
	 */
	void exitFloatStatement(ProgramGrammarParser.FloatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(ProgramGrammarParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(ProgramGrammarParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#operationStatement}.
	 * @param ctx the parse tree
	 */
	void enterOperationStatement(ProgramGrammarParser.OperationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#operationStatement}.
	 * @param ctx the parse tree
	 */
	void exitOperationStatement(ProgramGrammarParser.OperationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(ProgramGrammarParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(ProgramGrammarParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#boolStatement}.
	 * @param ctx the parse tree
	 */
	void enterBoolStatement(ProgramGrammarParser.BoolStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#boolStatement}.
	 * @param ctx the parse tree
	 */
	void exitBoolStatement(ProgramGrammarParser.BoolStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(ProgramGrammarParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(ProgramGrammarParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ProgramGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ProgramGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpr(ProgramGrammarParser.InfixExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#infixExpr}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpr(ProgramGrammarParser.InfixExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveExpr(ProgramGrammarParser.AdditiveExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#additiveExpr}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveExpr(ProgramGrammarParser.AdditiveExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeExpr(ProgramGrammarParser.MultiplicativeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#multiplicativeExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeExpr(ProgramGrammarParser.MultiplicativeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProgramGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ProgramGrammarParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProgramGrammarParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ProgramGrammarParser.PrimaryContext ctx);
}