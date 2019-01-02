package com.test.java.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _10_PascalTraingle {

	public static void main(String[] args) {
		int a = 0; 
		a = generatePascal(5,2);
		System.out.println(a);
	}

	private static int generatePascal(int row, int col) {
		
		Map<Integer, ArrayList<Integer>> map = new HashMap<>();
		
		map.put(0, new ArrayList<>(Arrays.asList(1)));
		map.put(1, new ArrayList<>(Arrays.asList(1,1)));
		
		for (int i = 2; i <= row; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			list.add(1);
			ArrayList<Integer> preList = map.get(i - 1);
			for (int k = 1; k < preList.size(); k++) {
				int sum = preList.get(k - 1) + preList.get(k);
				list.add(sum);
			}
			//list.add(0, 1);
			list.add(1);
			map.put(i, list);
		}
		
		for(int i = 0; i < map.size(); i++) {
			List<Integer> list = map.get(i);
			for(Integer a : list) {
				System.out.print(a);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
		
		return (map.get(row).get(col));
	}
	
}
