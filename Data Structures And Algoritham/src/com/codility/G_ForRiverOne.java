package com.codility;

import java.util.HashSet;
import java.util.Set;

public class G_ForRiverOne {
	public static void main(String[] args) {
		System.out.println(solution(0, null));
	}

	public static  int solution(int x, int[] a) {
		Set<Integer> s = new HashSet<>();
		for (int n = 1; n <= x; n++) {
			s.add(n);
		}

		for (int i = 0; i < a.length; i++) {
			int n = a[i];
			if (s.contains(n)) {
				s.remove(n);
				if (s.isEmpty()) {
					return i;
				}
			}
		}

		return -1;
	}

}
