package com.program.practice;

public class FindMissingCharToMakePangram {

	public static void main(String[] args) {
		String str = panagram("AbX");
		System.out.println(str);

	}

	private static String panagram(String str) {
		//int[] arr1 = new int[26];
		int[] arr = new int[26];

		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch - 'a' >= 0 && ch - 'a' <= 26) {
				arr[ch - 'a'] = 1;
			}
		}
		/*str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch - 'a' >= 0 && ch - 'a' <= 26) {
				arr[ch - 'a'] = 1;
				
			}
		}*/

		StringBuilder sb = new StringBuilder();
		for(int i= 0; i < 26; i++) {
			if(arr[i] == 0) {
				sb.append((char)('a' + i));
			}
		}
		/*for (int i = 0; i < 26; i++) {
			if (arr[i] == 0) {
				sb.append((char) ('a' + i));
			}
		}*/
		return sb.toString();
	}


}
