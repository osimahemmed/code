package com.test.java.program;

public class _31_WalkingRobot {

	public static void main(String[] args) {
		int [] arr = {0,0};
		int[] initialPosition = getFinalCoordinates("UDDLRL",arr);
		System.out.println(initialPosition[0]+ ", " + initialPosition[1]);
	}

	private static int[] getFinalCoordinates(String move, int[] initialPosition) {
		
		for (int i = 0; i < move.length(); i++) {
			String c = String.valueOf(move.charAt(i));
			switch (c) {
			case "U":
				initialPosition[1] += 1;
				break;
			case "D":
				initialPosition[1] -= 1;
				break;
			case "L":
				initialPosition[0] -= 1;
				break;
			case "R":
				initialPosition[0] += 1;
				break;
			}
		}
		return initialPosition;
	}
}
