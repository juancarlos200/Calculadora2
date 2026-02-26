package service;

import Stack.stack;

public class PostfixEvaluator {

    public double evaluate(String expression, stack<Double> stack) {

        String[] tokens = expression.split(" ");

        for (String token : tokens) {

            if (token.matches("\\d+")) {
                stack.push(Double.parseDouble(token));
            }

            else if (!token.isEmpty()) {

                double b = stack.pop();
                double a = stack.pop();

                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            }
        }

        return stack.pop();
    }
}