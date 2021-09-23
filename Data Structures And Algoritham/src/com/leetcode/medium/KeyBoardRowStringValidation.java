package com.leetcode.medium;
import java.util.ArrayList;
import java.util.Set;

/*Find String generated from only single row of characters Ex : qwerty*/
public class KeyBoardRowStringValidation {
	public static void main(String[] args) {
		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
		String[] res = findWords(words);

		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

	public static String[] findWords(String[] words) {
		ArrayList<String> list = new ArrayList<String>();
		Set<Character> row1 = Set.of('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'Q', 'W', 'E', 'R', 'T', 'Y',
				'U', 'I', 'O', 'P');
		Set<Character> row2 = Set.of('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'A', 'S', 'D', 'F', 'G', 'H', 'J',
				'K', 'L');
		Set<Character> row3 = Set.of('z', 'x', 'c', 'v', 'b', 'n', 'm', 'Z', 'X', 'C', 'V', 'B', 'N', 'M');

		for (String word : words) {
			Set<Character> row;
			char firstChar = word.charAt(0);

			if (row1.contains(firstChar)) {
				row = row1;
			} else if (row2.contains(firstChar)) {
				row = row2;
			} else {
				row = row3;
			}

			boolean flag = true;

			for (int i = 0; i < word.length(); i++) {
				if (!row.contains(word.charAt(i))) {
					flag = false;
					break;
				}
			}

			if (!flag) {
				continue;
			}
			list.add(word);
		}

		String[] str = new String[list.size()];
		int i = 0;
		for (String word : list) {
			str[i] = word;
			i++;
		}

		return str;
	}
}
