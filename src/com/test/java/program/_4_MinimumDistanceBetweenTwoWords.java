package com.test.java.program;

public class _4_MinimumDistanceBetweenTwoWords {

	public static void main(String[] args) {
		String str1 = "ABC is a d XYZ and ABC dffd XYZ are two distinct words";
		String str2 = "ABC";
		String str3 = "XYZ";
		
		int distance = getDistance(str1, str2, str3);
		System.out.println(distance);
	}

	public static int getDistance(String p, String str1, String str2) {
		String[] arr = p.split(" ");
		int i = 0;
		int min_dist = Integer.MAX_VALUE;
		int currentLength = 0;
		int prevIndex = 0;

		for (i = 0; i < arr.length; i++) {
			if (arr[i].equals(str1) || arr[i].equals(str2)) {
				prevIndex = i;
				i++;
				break;
			}
		}
//"ABC is a d XYZ and ABC dffd XYZ are two distinct words";
		for (; i < arr.length; i++) {
			if (arr[i].equals(str1) || arr[i].equals(str2)) {
				if (arr[prevIndex].equals(arr[i])) {
					prevIndex = i;
					currentLength = 0;
				} else {
					if (currentLength < min_dist) {
						min_dist = currentLength + 1;
						currentLength = 0;
					}
					prevIndex = i;
				}
			} else {
				currentLength = currentLength + arr[i].length() + 1;
			}
		}
		System.out.println("min_dist = " + min_dist);
		min_dist = min_dist + (str1.length() + 1) / 2 + (str2.length() + 1) / 2;
		return min_dist;
	}
}
