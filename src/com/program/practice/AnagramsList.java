package com.program.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Set of anagrams of list of words. The output should be words which are anagrams 
//from the list should be grouped together.//need input for test
public class AnagramsList {

	public static void main(String[] args) {
		List<String> list45 = new ArrayList<>();
		
		/*List<String> list = new ArrayList<>();//{“cat”, “dog”, “tac”, “god”, “act”}
		list.add("cat");
		list.add("dog");
		list.add("tac");
		list.add("god");
		list.add("act");
		printAnagram(list);*/
	}

	public static void printAnagram(List<String> anagrams) {
		Map<String, List<String>> map = new HashMap<>();
		List<String> list;
		for (String str : anagrams) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);

			String key = String.valueOf(chars);

			if (!map.containsKey(key)) {
				list = new ArrayList<>();
			} else {
				list = map.get(key);
			}
			list.add(str);
			map.put(key, list);
		}
		for (String key : map.keySet()) {
			System.out.print(map.get(key) + ",");
		}
	}

}
