// Generated from Roman.g4 by ANTLR 4.13.0
package com.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link RomanParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface RomanVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link RomanParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(RomanParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanParser#units}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnits(RomanParser.UnitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanParser#tens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTens(RomanParser.TensContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanParser#hundreds}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHundreds(RomanParser.HundredsContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanParser#one}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOne(RomanParser.OneContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanParser#five}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFive(RomanParser.FiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanParser#ten}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTen(RomanParser.TenContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanParser#fifty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFifty(RomanParser.FiftyContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanParser#oneHundred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneHundred(RomanParser.OneHundredContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanParser#fiveHundred}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFiveHundred(RomanParser.FiveHundredContext ctx);
	/**
	 * Visit a parse tree produced by {@link RomanParser#oneThousand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneThousand(RomanParser.OneThousandContext ctx);
}