
//Average grade problem  input [ ["sobby",87], ["charles",80], ["arush", 37],["tony", 24],["charles",22]] , 
//here best grade is 87 which is output
package com.program.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AverageGrade {

	public static void main(String[] args) {
		String[][] input = { { "sobby", "45" }, { "charles", "100" }, { "arush", "37" }, { "tony", "24" },
				{ "charles", "22" } };
		Map<String, ArrayList<Integer>> map = new HashMap<>();

		ArrayList<Integer> list;
		for (String[] str : input) {
			String name = str[0];
			int val = Integer.parseInt(str[1]);
			if (map.containsKey(name)) {
				list = map.get(name);
				list.add(val);
				map.put(name, list);
			} else {
				list = new ArrayList<>(Arrays.asList(val));
				map.put(name, list);
			}
		}

		int bestAvg = 0;
		for (String name : map.keySet()) {
			list = map.get(name);
			int sum = 0;
			for (Integer val : list) {
				sum += val;
			}
			int avg = sum / list.size();

			if (avg > bestAvg)
				bestAvg = avg;
		}
		System.out.println("Best Grade is: " + bestAvg);
	}

}
