package org.example;

public class EvalVisitor extends ProgramGrammarBaseVisitor<String> {
    @Override
    public String visitProgram(ProgramGrammarParser.ProgramContext ctx) {
        return ctx.start.getText();
    };

    @Override
    public String visitAsign(ProgramGrammarParser.AsignContext ctx) {
        System.out.println("gola");
        return ctx.asignStatement().toString();
    }
}
