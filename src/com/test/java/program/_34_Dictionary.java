package com.test.java.program;

public class _34_Dictionary {

	public static void main(String[] args) {
		
		//String dictionary1[] = { "to", "toe", "toes", "doe", "dog", "god", "dogs", "book", "banana" };
		//String str1 = "dsetog";

		String[] dictionary2 = { "ale", "apple", "monkey", "plea" };
		String str2 = "abpcplea";

		String str = longestWordInDictionary(dictionary2, str2);
		System.out.println(str);
	}

	public static String longestWordInDictionary(String[] dic, String word) {
		String maxLenWord = "";
		for (String d : dic) {
			if (isContains(d, word)) {
				if (d.length() > maxLenWord.length()) {
					maxLenWord = d;
				} else if (d.length() == maxLenWord.length()) {
					maxLenWord = maxLenWord + "," + d;
				}
			}
		}
		return maxLenWord;
	}

	public static boolean isContains(String dicWord, String input) {
		for (int i = 0; i < dicWord.length(); i++) {
			if (!input.contains("" + dicWord.charAt(i))) {
				return false;
			}
		}
		return true;
	}
}
