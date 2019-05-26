package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, Double::sum);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poem = new PoemBeautifier();
        poem.beautify("wierszyk", String::toUpperCase);
        poem.beautify("wierszyk", (tekst) -> "ABC" + tekst + "ABC");
        poem.beautify("WIERSZYK", tekst -> tekst.substring(4).toLowerCase());
        poem.beautify("wierszyk", (tekst) -> tekst.substring(0, 2).toUpperCase() + tekst.substring(2, 4) + tekst.substring(4).toUpperCase());
        poem.beautify("wierszyk", (tekst) -> tekst.substring(0, 2) + "___" + tekst.substring(5));
        poem.beautify("wierszyk", (tekst) -> tekst.concat("__"));
        poem.beautify("wierszyk", (tekst) -> tekst.replace('e','_'));

    }
}