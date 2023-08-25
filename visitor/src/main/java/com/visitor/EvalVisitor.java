package com.visitor;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;

public class EvalVisitor extends ProgramGrammarBaseVisitor<String> {

    HashMap<String, Object> memory = new HashMap<>();

    @Override
    public String visitProgram(ProgramGrammarParser.ProgramContext ctx) {
        return visitChildren(ctx).equals("failed") ? "Failed Execution" : "Execution ended";
    }

    @Override
    public String visitStatement(ProgramGrammarParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitAsign(ProgramGrammarParser.AsignContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitAsignStatement(ProgramGrammarParser.AsignStatementContext ctx) {

        if (ctx.getChild(2) instanceof ProgramGrammarParser.StringContext) {
            memory.put(ctx.ID(0).getText(), visit(ctx.getChild(2)));
        } else if (ctx.ID().size() == 2) {
            if (memory.get(ctx.ID(1).getText()) == null) return "failed";
            memory.put(ctx.ID(0).getText(), memory.get(ctx.ID(1).getText()));
        } else if (ctx.INT() != null) {
            memory.put(ctx.ID(0).getText(), Integer.parseInt(ctx.INT().getText()));
        } else if (ctx.getChild(2) instanceof ProgramGrammarParser.BoolContext) {
            memory.put(ctx.ID(0).getText(), Integer.parseInt(visit(ctx.getChild(2))));
        } else if (ctx.getChild(2) instanceof ProgramGrammarParser.OperationContext) {
            memory.put(ctx.ID(0).getText(), Integer.parseInt(visit(ctx.getChild(2))));
        } else if (ctx.getChild(2) instanceof ProgramGrammarParser.StringOperationContext) {
            memory.put(ctx.ID(0).getText(), visit(ctx.getChild(2)));
        } else if (ctx.getChild(2) instanceof ProgramGrammarParser.InfixExprContext) {
            memory.put(ctx.ID(0).getText(), Integer.parseInt(visit(ctx.getChild(2))));
        }

        return "Assign";
    }

    @Override public String visitStringStatement(ProgramGrammarParser.StringStatementContext ctx)
    {
        String text = "";
        if (ctx.STRING() != null) text = ctx.STRING().getText().substring(1, ctx.STRING().getText().length()-1);
        else if (ctx.ID() != null) {
            text = String.valueOf(memory.get(ctx.ID().getText()));
        }
        return text;
    }
    @Override public String visitString(ProgramGrammarParser.StringContext ctx) {
        return visitChildren(ctx);
    }
    @Override public String visitStringOperation(ProgramGrammarParser.StringOperationContext ctx)
    {
        String left = visitString(ctx.string(0));
        String right = visitString(ctx.string(1));
        return left + right;
    }
    
    @Override public String visitInputWriteStatement(ProgramGrammarParser.InputWriteStatementContext ctx)
    {
        if (ctx.INT() != null) {
            return ctx.INT().getText();
        } else if (ctx.ID() != null) {
            return String.valueOf(memory.get(ctx.ID().getText()));
        }
        return visitChildren(ctx);
    }

    @Override public String visitInputWrite(ProgramGrammarParser.InputWriteContext ctx)
    {
        if (ctx.getChild(0) instanceof TerminalNode) {
            return visit(ctx.getChild(1));
        } else {
            return visitChildren(ctx);
        }
    }

    @Override public String visitWrite(ProgramGrammarParser.WriteContext ctx)
    {
        String content = visitInputWrite(ctx.inputWrite());
        System.out.println(content);
        return "write";
    }
    
    @Override public String visitMientras(ProgramGrammarParser.MientrasContext ctx) {
        int cond = 0;
        while (Integer.parseInt(visit(ctx.getChild(1))) != 0) {
            visitChildren(ctx);
        }

        return "While finish";
    }


    @Override public String visitBoolStatement(ProgramGrammarParser.BoolStatementContext ctx) {

        Object a = null,b = null;

        boolean iFound = false, idFound = false;
        if (ctx.getChild(0) instanceof ProgramGrammarParser.BoolContext) {
            a = Integer.parseInt(visit(ctx.getChild(0)));
        }
        else if (ctx.getChild(0) instanceof ProgramGrammarParser.OperationContext) {
            a = Integer.parseInt(visit(ctx.getChild(0)));
        } else if (ctx.getChild(0) instanceof ProgramGrammarParser.StringContext) {
            a = visit(ctx.getChild(0));
        } else if (ctx.getChild(0) instanceof TerminalNode) {
            if (((TerminalNode) ctx.getChild(0)).getSymbol().getType() == 31) { // Es INT
                iFound = true;
                a = Integer.parseInt(ctx.INT(0).getText());
            } else {
                idFound = true;
                a = memory.get(ctx.ID(0).getText());
            }
        }

        if (ctx.getChild(2) instanceof ProgramGrammarParser.BoolContext) {
            b = Integer.parseInt(visit(ctx.getChild(2)));
        }
        else if (ctx.getChild(2) instanceof ProgramGrammarParser.OperationContext) {
            b = Integer.valueOf(visit(ctx.getChild(2)));
        } else if (ctx.getChild(2) instanceof ProgramGrammarParser.StringContext) {
            b = visit(ctx.getChild(2));
        } else if (ctx.getChild(2) instanceof TerminalNode) {
            if (((TerminalNode) ctx.getChild(2)).getSymbol().getType() == 31) {
                if (iFound) b = Integer.parseInt(ctx.INT(1).getText());
                else b = Integer.parseInt(ctx.INT(0).getText());
            } else {
                if (idFound) b = memory.get(ctx.ID(1).getText());
                else b = memory.get(ctx.ID(0).getText());
            }
        }
        boolean res = false;
        switch (ctx.getChild(1).getText()) {
            case ">":
                res = (int)a > (int)b;
                break;
            case "<":
                res = (int)a < (int)b;
                break;
            case ">=":
                res = (int)a >= (int)b;
                break;
            case "<=":
                res = (int)a <= (int)b;
                break;
            case "==":
                if (a instanceof String && b instanceof String) res = a.equals(b);
                else res = a == b;
                break;
            case "!=":
                if (a instanceof String && b instanceof String) res = !a.equals(b);
                else res = a != b;
                break;
        }

        return (res ? "1": "0");
    }

    @Override public String visitBool(ProgramGrammarParser.BoolContext ctx) {
        if (ctx.FALSE() != null) {
            return "0";
        } else if (ctx.TRUE() != null) {
            return "1";
        }
        return visit(ctx.boolStatement());
    }

    @Override public String visitCondition(ProgramGrammarParser.ConditionContext ctx) {

        String boolAns = visit(ctx.bool());
        boolean conditionResult = boolAns != "0";
        int i = 3;
        if (conditionResult) {
            while (ctx.children.get(i) instanceof ProgramGrammarParser.StatementContext) {
                visit(ctx.children.get(i));
                i++;
            }
        } else {
            if (!ctx.ELSE().isEmpty()) {
                i = i + 4;
                while (ctx.children.get(i) instanceof ProgramGrammarParser.StatementContext) {
                    visit(ctx.children.get(i));
                    i++;
                }
            }
        };

        return "condition success";
    }
    @Override public String visitInfixExpr(ProgramGrammarParser.InfixExprContext ctx) {
        if (ctx.children.size() > 1) {
            int a = Integer.parseInt(visit(ctx.getChild(0)));
            int b = Integer.parseInt(visit(ctx.getChild(2)));
            double ans = Math.pow(a, b);
            int it;
            for (int i = 3; i < ctx.children.size(); i++) {
                if (ctx.getChild(i) instanceof ProgramGrammarParser) {
                    it = Integer.parseInt(visit(ctx.getChild(i)));
                    ans = Math.pow(ans, it);
                }
            }

            return String.valueOf(ans);
        } else {
            return visit(ctx.getChild(0));
        }
    }

    @Override public String visitAdditiveExpr(ProgramGrammarParser.AdditiveExprContext ctx) {
        if (ctx.children.size() > 1) {
            int left = Integer.parseInt(visit(ctx.getChild(0)));
            int right = Integer.parseInt(visit(ctx.getChild(2)));
            String operator = ctx.getChild(1).getText();

            int ans = 0;
            if(operator.equals("+")){
                ans = left + right;
            } else if (operator.equals("-")) {
                ans = left - right;
            }

            int it;
            for (int i = 3; i < ctx.children.size(); i++) {
                if (i % 2 == 0) {
                    it = Integer.parseInt(visit(ctx.getChild(i)));
                    if(operator.equals("+")){
                        ans = ans + it;
                    } else if (operator.equals("-")) {
                        ans = ans - it;
                    }
                } else {
                    operator = ctx.getChild(i).getText();
                }
            }

            return String.valueOf(ans);

        } else {
            return visit(ctx.getChild(0));
        }
    }

    @Override public String visitMultiplicativeExpr(ProgramGrammarParser.MultiplicativeExprContext ctx)
    {
        if (ctx.children.size() > 1) {
            int left = Integer.parseInt(visit(ctx.getChild(0)));
            int right = Integer.parseInt(visit(ctx.getChild(2)));
            String operator = ctx.getChild(1).getText();

            int ans = 0;
            if(operator.equals("*")){
                ans = left * right;
            } else if (operator.equals("/")) {
                if (right == 0) return "failed";
                ans = left / right;
            } else if (operator.equals("%")) {
                ans = left % right;
            }

            int it;
            for (int i = 3; i < ctx.children.size(); i++) {
                if (i % 2 == 0) {
                    it = Integer.parseInt(visit(ctx.getChild(i)));
                    if(operator.equals("*")){
                        ans = ans * it;
                    } else if (operator.equals("/")) {
                        if (it == 0) return "failed";
                        ans = ans / it;
                    } else if (operator.equals("%")) {
                        ans = ans % it;
                    }
                } else {
                    operator = ctx.getChild(i).getText();
                }
            }

            return String.valueOf(ans);

        } else {
            return visit(ctx.getChild(0));
        }
    }
    @Override public String visitPrimary(ProgramGrammarParser.PrimaryContext ctx)
    {
        if (ctx.INT() != null) {
            return ctx.INT().getText();
        } else if (ctx.FLOAT() != null) {
            return ctx.FLOAT().getText();
        } else if (ctx.infixExpr() != null) {
            return visitInfixExpr(ctx.infixExpr());
        }
        return "Primary";
    }

    @Override public String visitOperationStatement(ProgramGrammarParser.OperationStatementContext ctx) {
        int a = 0, b = 0;

        boolean iFound = false, idFound = false;
        if (((TerminalNode)ctx.getChild(0)).getSymbol().getType() == 31) { // INT
            iFound = true;
            a = Integer.valueOf(ctx.INT(0).getText());
        }else if (((TerminalNode)ctx.getChild(0)).getSymbol().getType() == 33) { // ID
            idFound = true;
            a = (int)memory.get(ctx.ID(0).getText());
        }

        String operator = ctx.getChild(1).getText();

        if (((TerminalNode)ctx.getChild(2)).getSymbol().getType() == 31) { // INT
            if (iFound) b = Integer.valueOf(ctx.INT(1).getText());
            else b = Integer.valueOf(ctx.INT(0).getText());
        } else if (((TerminalNode)ctx.getChild(2)).getSymbol().getType() == 33) { // ID
            if (idFound) b = (int)memory.get(ctx.ID(1).getText());
            else b = (int)memory.get(ctx.ID(0).getText());
        } else if (ctx.getChild(2) instanceof ProgramGrammarParser.OperationContext) {
            b = Integer.valueOf(visit(ctx.getChild(2)));
        }

        int ans = 0;

        switch (operator) {
            case "+":
                ans = a+b;
                break;
            case "-":
                ans = a-b;
                break;
            case "*":
                ans = a*b;
                break;
            case "/":
                ans = a/b;
                break;
            case "%":
                ans = a%b;
                break;
            case "^":
                ans = (int) Math.pow(a, b);
                break;
        }

        return String.valueOf(ans);
    }
    @Override public String visitOperation(ProgramGrammarParser.OperationContext ctx) { return visitChildren(ctx); }
}

