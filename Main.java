package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.FileInputStream;
import java.io.InputStream;

public class Main {
    public static void main(String args[]) throws Exception {
        String inputFile = args[0];
        InputStream is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);
        ProgramGrammarLexer lexer = new ProgramGrammarLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ProgramGrammarParser parser = new ProgramGrammarParser(tokens);

        ParseTree tree = parser.program();

        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
    }
}
