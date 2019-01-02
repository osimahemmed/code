package com.test.java.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _3_SetofAnagrams {

	public static void main(String[] args) {
		String arr[] =  {"geeksquiz", "geeksforgeeks", "abcd", "forgeeksgeeks", "zuiqkeegs","geeksgeeksfor"};
		printAnagram(Arrays.asList(arr));
	}

	private static void printAnagram(List<String> anagrams) {
		Map<String, List<String>> map = new HashMap<>();
		
		List<String> list;
		for (String str : anagrams) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);

			String key = String.valueOf(chars);
			//System.out.println("key" + key);

			if (map.containsKey(key)) {
				list = map.get(key);
			} else {
				list = new ArrayList<>();
			}
			list.add(str);
			map.put(key, list);
		}
		
		System.out.println(map);
		for (String key : map.keySet()) {
			if((map.get(key)).size() > 1) {
				System.out.print(map.get(key) + ",");
			}
		}
		
		//for countng the number of maximum anagrams
		int size = Integer.MIN_VALUE ;
		for(String key : map.keySet()) {
			if(map.get(key).size() > size) {
				size = map.get(key).size();
			}
		}
		System.out.println(size);
	}
}
