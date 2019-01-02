package com.test.java.program;

public class _25_StairCase {

	public static void main(String[] args) {
		int stairs = 5;
		int s = staireCase(stairs);
		System.out.println(s);
		
		int a = countWays(5,2);
		System.out.println(a);
	}
	
///////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	// Returns number of ways to reach s'th stair
    static int countWays(int stairs, int stepsToclimb)
    {
        return countWaysUtil(stairs+1, stepsToclimb);
    }
    
	static int countWaysUtil(int stairs, int stepsToclimb)
    {
        if (stairs <= 1)
            return stairs;
        int ways = 0;
        for (int i = 1; i <= stairs && i <= stepsToclimb; i++) {
        	/*System.out.print("ways = " + ways);
        	System.out.print(" stairs = " + stairs);
        	System.out.print(" stepsToclimb = " + stepsToclimb);
        	System.out.println(" ");*/
            //ways = ways + countWaysUtil(stairs-i, stepsToclimb);
        	System.out.println(countWaysUtil(stairs-i, stepsToclimb));
        }
        return ways;
    }
	
////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public static int staireCase(int stairs) {
		return getStepCount(stairs + 1);
	}

	public static int getStepCount(int stairs) {
		if (stairs <= 1)
			return stairs;

		return getStepCount(stairs - 1) + getStepCount(stairs - 2);
	}
}
