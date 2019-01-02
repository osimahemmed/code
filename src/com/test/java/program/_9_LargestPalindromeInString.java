package com.test.java.program;

public class _9_LargestPalindromeInString {

	public static void main(String[] args) {
		//System.out.println(largestPalindromeString("dabcxxxxcbanj"));
		System.out.println(largestPalindromeString("abbaz"));
	}

	private static String largestPalindromeString(String str) {
		int leftIndex = 0, rightIndex = 0;
		String longestPalindrome = "";

		for (int currIndex = 1; currIndex < str.length(); currIndex++) {

			leftIndex = currIndex - 1;
			rightIndex = currIndex + 1;

			// handle odd length palindrome
			while (leftIndex >= 0 && rightIndex < str.length()) {
				if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
					break;
				}
				String currentPalindrome = str.substring(leftIndex, rightIndex + 1);
				
				if (currentPalindrome.length() > longestPalindrome.length()) {
					longestPalindrome = currentPalindrome;
				}
				leftIndex--;
				rightIndex++;
			}
			// handle even length palindrome
			leftIndex = currIndex - 1;
			rightIndex = currIndex;
			while (leftIndex >= 0 && rightIndex < str.length() && str.charAt(leftIndex) == str.charAt(rightIndex)) {
				String pal = str.substring(leftIndex, rightIndex + 1);
				longestPalindrome = pal.length() > longestPalindrome.length() ? pal : longestPalindrome;
				leftIndex--;
				rightIndex++;
			}
		}

		return longestPalindrome;
	}

}
