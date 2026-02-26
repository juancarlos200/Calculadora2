package service;

import Stack.stack;

public class InfixToPostfixConverter {

    public String convert(String expression, stack<Character> stack) {

        StringBuilder result = new StringBuilder();

        for (char c : expression.toCharArray()) {

            if (Character.isDigit(c)) {
                result.append(c);
            }

            else if (c == '(') {
                stack.push(c);
            }

            else if (c == ')') {
                while (!stack.empty() && stack.peek() != '(') {
                    result.append(" ").append(stack.pop());
                }
                stack.pop();
            }

            else {
                result.append(" ");
                while (!stack.empty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop()).append(" ");
                }
                stack.push(c);
            }
        }

        while (!stack.empty()) {
            result.append(" ").append(stack.pop());
        }

        return result.toString();
    }

    private int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return 0;
    }
}