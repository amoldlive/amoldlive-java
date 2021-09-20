package com.stack;

import java.util.Stack;

public class InfixExpressionSolver {
	public static void main(String[] args) {

		String expression = "2+6*4/8-3";

		int result = infixExpressionSolver(expression);
		System.out.println("Result : " + result);

	}

	private static int infixExpressionSolver(String expression) {

		Stack<Integer> operand = new Stack<>();
		Stack<Character> operator = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);

			/*
			 * character can be operator / operand(digit) / bracket [openinig / closing]
			 */

			if (ch == '(') {
				operator.push(ch);
			} else if (Character.isDigit(ch)) { // ch-'0' == actual number
				operand.push(ch - '0');
			} else if (ch == ')') {

				while (operator.peek() == '(') {
					// operator.pop();

					int v2 = operand.pop();
					int v1 = operand.pop();
					char oprtor = operator.pop();

					int result = solverExpression(v1, v2, oprtor);
					operand.push(result);
				}
				operator.pop();
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
				while (operator.size() > 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) {

					int v2 = operand.pop();
					int v1 = operand.pop();
					char oprtor = operator.pop();

					int result = solverExpression(v1, v2, oprtor);
					operand.push(result);

				}
				operator.push(ch);

			}

		}

		/*solve remaining data from operand & operator*/
		while (operator.size() != 0) {
			int v2 = operand.pop();
			int v1 = operand.pop();
			char oprtor = operator.pop();

			int result = solverExpression(v1, v2, oprtor);
			operand.push(result);
		}

		return operand.peek();
	}

	private static int precedence(char ch) {

		if (ch == '+' || ch == '-')
			return 1;
		if (ch == '*' || ch == '/')
			return 2;

		return 0;
	}

	private static int solverExpression(int v1, int v2, char oprtor) {
		int result = 0;

		if (oprtor == '+') {
			result = v1 + v2;
		} else if (oprtor == '-') {
			result = v1 - v2;
		} else if (oprtor == '*') {
			result = v1 * v2;
		} else if (oprtor == '/') {
			result = v1 / v2;
		}

		return result;
	}

}
