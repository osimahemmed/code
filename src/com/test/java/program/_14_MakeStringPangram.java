package com.test.java.program;

public class _14_MakeStringPangram {

	public static void main(String[] args) {
		System.out.println((int)'a');
		panagram("b");
	}
	
	public static String panagram(String str) {
		int[] arr = new int[26];
		
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char charr = str.charAt(i);
			
			if (charr - 'a' >= 0 && charr - 'a' <= 26) {
				arr[charr - 'a'] = 1;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 26; i++) {
			if (arr[i] == 0) {
				sb.append((char) ('a' + i));
			}
		}
		System.out.println(sb.toString());
		return sb.toString();
	}

}
