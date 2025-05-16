package com.example;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        test("MMMCMLXI", 3961);
        test("MCMXC", 1990);
        test("MMVIII", 2008);
        test("MCMLIV", 1954);
    }

    private static void test(String roman, int expected) {
        CharStream input = CharStreams.fromString(roman);
        RomanLexer lexer = new RomanLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        RomanParser parser = new RomanParser(tokens);
        ParseTree tree = parser.root();

        RomanDecoder visitor = new RomanDecoder();
        int result = visitor.visit(tree);

        System.out.println("Roman: " + roman + " = " + result );
    }
}
