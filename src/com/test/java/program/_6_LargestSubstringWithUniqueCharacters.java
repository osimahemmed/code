package com.test.java.program;

import java.util.HashSet;

public class _6_LargestSubstringWithUniqueCharacters {

	public static void main(String[] args) {
		String str = "GEEKSFORGEEKS";
		//String str = "aaabcbdeaf";
		String subStr = subString(str);
		System.out.println("subString =" + subStr);
	}

	public static String subString(String input) {

		HashSet<Character> set = new HashSet<Character>();
		String longestOverAll = "";
		String longestTillNow = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (set.contains(ch)) {
				longestTillNow = "";
				set.clear();
			}
			longestTillNow += ch;
			set.add(ch);
			if (longestTillNow.length() > longestOverAll.length()) {
				longestOverAll = longestTillNow;
			}
		}
		return longestOverAll;
	}
}
