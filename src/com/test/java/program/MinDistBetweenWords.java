package com.test.java.program;

import java.util.StringTokenizer;

//Start time: 2:45 PM
public class MinDistBetweenWords {

	public static void main(String[] args) {
		String str1 = "ABC is a d XYZ and ABC   dffd   XYZ are two distinct words";
		String str2 = "ABC";
		String str3 = "XYZ";

		int distance = getDistance(str1, str2, str3);
		System.out.println(distance);
	}
	
	private static int getDistance(String input, String s1, String s2) {
		System.out.println("Input: " + input);
		System.out.println("Distance between " +s1 +" and " + s2);
		System.out.println();
		
		StringTokenizer st = new StringTokenizer(input, " ", true);
		int count=0;
		int s1Pos=0;
		int s2Pos=0;

		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			if (s.equals(s1)) {
				s1Pos = count;
			}
			if (s.equals(s2)) {
				s2Pos = count;
			}
			
			count+=s.length();
		}
		
		//System.out.println(s1Pos + " - "+ s2Pos );
		//System.out.println("distance: " + Math.abs(s1Pos-s2Pos) );
		return Math.abs(s1Pos-s2Pos);
		//return input.lastIndexOf(s2) - input.lastIndexOf(s1);
	}


}
