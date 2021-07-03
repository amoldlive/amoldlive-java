package com.string;

public class StringCompression {
	public static void main(String[] args) {
		String str = "aaaabbbbccaddbee"; // op - a b c a d b e
		compression1(str);

		System.out.println();
		
		str = "aaaabbbbccaddbee"; // op - a4 b4 c2 a d2 b e2
		compression2(str);
	}

	private static void compression1(String str) {
		char startingChar = str.charAt(0);
		System.out.print(startingChar + " ");

		for (int i = 1; i < str.length(); i++) {
			char currentCharacter = str.charAt(i);
			char prevCharacter = str.charAt(i - 1);
			if (currentCharacter != prevCharacter) { // if current not equal to previous then print current
				System.out.print(currentCharacter + " ");
			}

		}

	}

	private static void compression2(String str) {
		int count=1;
		
		char startingChar = str.charAt(0);
		System.out.print(startingChar);

		for (int i = 1; i < str.length(); i++) {
			char currentCharacter = str.charAt(i);
			char prevCharacter = str.charAt(i - 1);
			if (currentCharacter != prevCharacter) { // if current not equal to previous then print current
				if(count>1)
				System.out.print(count+" "+currentCharacter );
				else {
					System.out.print(" "+currentCharacter);
				}
				count=1;
			}else {
				count++;
			}

		}
		System.out.print(count);
	}
}
