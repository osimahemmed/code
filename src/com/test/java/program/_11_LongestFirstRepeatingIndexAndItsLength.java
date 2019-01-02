package com.test.java.program;

public class _11_LongestFirstRepeatingIndexAndItsLength {

	public static void main(String[] args) {
		String str = "aabbbbddccbb";
		// String str = "aabbbbddccasdadadffffffffffffffffaasasdfgdgfdre";
		longestRepeatingStr(str);
	}

	public static int[] longestRepeatingStr(String str) {
		char[] ch = str.toCharArray();

		int len = 0;
		int index = 0;

		for (int i = 0; i < ch.length;) {
			char c = ch[i];
			int count = 0;
			int ind = i;
			while (i < ch.length && c == ch[i]) {
				count++;
				i++;
			}
			if (count > len) {
				index = ind;
				len = count;
			}
		}

		int[] res = { index, len };
		System.out.println("res index= " + index);
		System.out.println("res len= " + len);
		return res;
	}
}
