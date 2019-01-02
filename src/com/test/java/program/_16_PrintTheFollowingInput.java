package com.test.java.program;

import java.util.LinkedHashMap;
import java.util.Map;

public class _16_PrintTheFollowingInput {

	public static void main(String[] args) {
		String str = "SSssssSSSTTPPQqqqqqq";
		printCountOfChars(str);
	}

	private static String printCountOfChars(String input) {
		String patternToPrint = "";
		Map<String, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < input.length(); i++) {
			String key = String.valueOf(input.charAt(i));

			//Character c = new Character((char) 98);
			
			if (map.containsKey(key)) {
				int value = map.get(key);
				map.put(key, value + 1);
			} else {
				map.put(key, 1);
			}
		}

		for (String eachKey : map.keySet()) {
			patternToPrint += map.get(eachKey) + eachKey;
		}
		System.out.println("SSSSSTTPPQ = " + patternToPrint);
		return patternToPrint;
	}
	
}
