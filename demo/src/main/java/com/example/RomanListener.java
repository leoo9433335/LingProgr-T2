// Generated from Roman.g4 by ANTLR 4.13.0
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link RomanParser}.
 */
public interface RomanListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link RomanParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(RomanParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(RomanParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanParser#units}.
	 * @param ctx the parse tree
	 */
	void enterUnits(RomanParser.UnitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanParser#units}.
	 * @param ctx the parse tree
	 */
	void exitUnits(RomanParser.UnitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanParser#tens}.
	 * @param ctx the parse tree
	 */
	void enterTens(RomanParser.TensContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanParser#tens}.
	 * @param ctx the parse tree
	 */
	void exitTens(RomanParser.TensContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanParser#hundreds}.
	 * @param ctx the parse tree
	 */
	void enterHundreds(RomanParser.HundredsContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanParser#hundreds}.
	 * @param ctx the parse tree
	 */
	void exitHundreds(RomanParser.HundredsContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanParser#one}.
	 * @param ctx the parse tree
	 */
	void enterOne(RomanParser.OneContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanParser#one}.
	 * @param ctx the parse tree
	 */
	void exitOne(RomanParser.OneContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanParser#five}.
	 * @param ctx the parse tree
	 */
	void enterFive(RomanParser.FiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanParser#five}.
	 * @param ctx the parse tree
	 */
	void exitFive(RomanParser.FiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanParser#ten}.
	 * @param ctx the parse tree
	 */
	void enterTen(RomanParser.TenContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanParser#ten}.
	 * @param ctx the parse tree
	 */
	void exitTen(RomanParser.TenContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanParser#fifty}.
	 * @param ctx the parse tree
	 */
	void enterFifty(RomanParser.FiftyContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanParser#fifty}.
	 * @param ctx the parse tree
	 */
	void exitFifty(RomanParser.FiftyContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanParser#oneHundred}.
	 * @param ctx the parse tree
	 */
	void enterOneHundred(RomanParser.OneHundredContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanParser#oneHundred}.
	 * @param ctx the parse tree
	 */
	void exitOneHundred(RomanParser.OneHundredContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanParser#fiveHundred}.
	 * @param ctx the parse tree
	 */
	void enterFiveHundred(RomanParser.FiveHundredContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanParser#fiveHundred}.
	 * @param ctx the parse tree
	 */
	void exitFiveHundred(RomanParser.FiveHundredContext ctx);
	/**
	 * Enter a parse tree produced by {@link RomanParser#oneThousand}.
	 * @param ctx the parse tree
	 */
	void enterOneThousand(RomanParser.OneThousandContext ctx);
	/**
	 * Exit a parse tree produced by {@link RomanParser#oneThousand}.
	 * @param ctx the parse tree
	 */
	void exitOneThousand(RomanParser.OneThousandContext ctx);
}