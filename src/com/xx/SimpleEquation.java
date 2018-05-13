package com.xx;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class SimpleEquation {

    private double x;
    private String expressionString;

    private Expression expression;

    SimpleEquation() {
        mainLoop();
    }

    private void mainLoop() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            expressionString = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        expression = new ExpressionBuilder(expressionString).variables("x").build();

        System.out.println("Answer: "+ equation(x));
    }

    private double equation(double x) {
        return expression.setVariable("x", x).evaluate();
    }
}
