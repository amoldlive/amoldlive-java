package com.leetcode.easy;

import java.util.Stack;

public class ValidParanthesis {
	public static void main(String[] args) {
		System.out.println(isValid("()"));
		System.out.println(isValid("(]"));
		System.out.println(isValid("()[]{}"));
		System.out.println(isValid("([)]"));
		System.out.println(isValid("{[]}"));
	}

	public static boolean isValid(String s) {
		boolean ans = false;
		Stack<Character> st = new Stack<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
				st.push(s.charAt(i));

			if(st.isEmpty()) 
				return false;
			
			char closeBracket = s.charAt(i);
			switch (closeBracket) {
			case ')':
				if (st.peek() == '(')
					st.pop();
				else
					return false;
				break;
			case ']':
				if (st.peek() == '[')
					st.pop();
				else
					return false;

				break;
			case '}':
				if (st.peek() == '{')
					st.pop();
				else
					return false;

				break;
			}

		}
		return st.isEmpty();

	}
}
