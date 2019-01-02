package com.test.java.program;

import java.util.LinkedHashMap;
import java.util.Map;

public class _5_FirstUniqueCharacterString {

	public static void main(String[] args) {
		String str = "aabdcce";
		Character c = firstNonrepeatingChar(str);
	}

	private static Character firstNonrepeatingChar(String str) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				Integer count = map.get(str.charAt(i));
				count = count + 1;
				map.put(str.charAt(i), count);
			} else {
				map.put(str.charAt(i), 1);
			}
		}

		for (Character ch : map.keySet()) {
			if (map.get(ch) == 1) {
				System.out.println("First non repeating character is = " + ch);
				return ch;
			}
		}
		return null;
	}

}
