package com.program.practice;

public class CompressedString {

	public static void main(String[] args) {

		String str = "AAABBCCCDDDDAAZ";
		String compress = compressStrCount(str);
		System.out.println(compress);

	}

	private static String compressStrCount(String text) {
		String result = "";
		int index = 0;
		while (index < text.length()) {
			char c = text.charAt(index);
			int count = count(text, index);

			result += "" + count + c;
			index += count;
		}

		return result;
	}

	private static int count(String text, int index) {
		char c = text.charAt(index);
		int i = 1;
		while (index + i < text.length() && text.charAt(index + i) == c) {
			i++;
		}
		return i;
	}
}
