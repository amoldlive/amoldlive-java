package com.stack;
import java.util.Stack;

public class BracketBalanced {
	public static void main(String[] args) {

		String expression = "{{[(123)]}}";
		String expression2 = "{{{[(123)]}}";
		String expression3 = "{{{[(123)]}}}}";
		String expression4 = "{}";
		System.out.println(isValidExpression(expression));
		System.out.println(isValidExpression(expression2));
		System.out.println(isValidExpression(expression3));
		System.out.println(isValidExpression(expression4));

		// isValidExpressionSolution2(expression3);
	}

	public static boolean isValidExpression(String expression) {

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < expression.length(); i++) {
			char bracket = expression.charAt(i);

			if (bracket == '{' || bracket == '[' || bracket == '(') {
				stack.push(bracket);
				continue;
			}

			char popBracket;

			if (stack.empty())
				return false;

			switch (bracket) {
			case '}':
				popBracket = stack.pop();
				if (popBracket != '{')
					return false;
				break;
			case ']':
				popBracket = stack.pop();
				if (popBracket != '[')
					return false;
				break;
			case ')':
				popBracket = stack.pop();
				if (popBracket != '(')
					return false;
				break;

			}

		}
		return stack.isEmpty();
	}
}
