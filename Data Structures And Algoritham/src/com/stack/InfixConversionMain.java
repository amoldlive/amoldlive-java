package com.stack;

import java.util.Stack;

public class InfixConversionMain {

	public static void main(String[] args) {
		String infixExpression = "a*(b-c)/d+e";

		convertExpression(infixExpression);
	}

	private static void convertExpression(String infixExpression) {

		Stack<Character> operatorStack = new Stack<>();
		Stack<String> prefixStack = new Stack<>();
		Stack<String> postfixStack = new Stack<>();

		for (int i = 0; i < infixExpression.length(); i++) {
			char ch = infixExpression.charAt(i);

			if (ch == '(') {

				operatorStack.push(ch);

			} else if (Character.isDigit(ch) || Character.isAlphabetic(ch)) {

				prefixStack.push(ch + "");
				postfixStack.push(ch + "");

			} else if (ch == ')') {

				while (operatorStack.peek()!='(') { // pop till gets open brackets

					char operator = operatorStack.pop();

					String preVal2 = prefixStack.pop();
					String preVal1 = prefixStack.pop();

					String postVal2 = postfixStack.pop();
					String postVal1 = postfixStack.pop();

					String prefixStr = operator + preVal1 + preVal2;
					String postfixStr = postVal1 + postVal2 + operator;
					prefixStack.push(prefixStr);
					postfixStack.push(postfixStr);

				}

				operatorStack.pop(); // poping open bracket
			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

				while (operatorStack.size() > 0 && operatorStack.peek() != '('
						&& precedence(ch) <= precedence(operatorStack.peek()) ) {
						
					char operator = operatorStack.pop();

					String preVal2 = prefixStack.pop();
					String preVal1 = prefixStack.pop();

					String postVal2 = postfixStack.pop();
					String postVal1 = postfixStack.pop();

					String prefixStr = operator + preVal1 + preVal2;
					String postfixStr = postVal1 + postVal2 + operator;
					prefixStack.push(prefixStr);
					postfixStack.push(postfixStr);
					
				}
				
				operatorStack.push(ch);
			}
		}
		
		while (operatorStack.size()!=0) { // pop till gets open brackets

			char operator = operatorStack.pop();

			String preVal2 = prefixStack.pop();
			String preVal1 = prefixStack.pop();

			String postVal2 = postfixStack.pop();
			String postVal1 = postfixStack.pop();

			String prefixStr = operator + preVal1 + preVal2;
			String postfixStr = postVal1 + postVal2 + operator;
			prefixStack.push(prefixStr);
			postfixStack.push(postfixStr);

		}

		System.out.println("Prefix : "+prefixStack.peek());
		System.out.println("Prefix : "+postfixStack.peek());
	}

	private static int precedence(char ch) {

		if (ch == '+' || ch == '-')
			return 1;
		if (ch == '*' || ch == '/')
			return 2;

		return 0;
	}
}
