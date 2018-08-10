package com.program.practice;

public class ConsecutiveRepeatingCharInString {

	public static void main(String[] args) {
		String str = "aaaabbaaccde";
		char ch = maxRepeating(str);
		System.out.println(ch);
			
	}

	private static char maxRepeating(String str)
	{
	    int n = str.length();
	    int count = 0;
	    char res = ' ';
	    int cur_count = 1;
	 
	    // Traverse string except last character
	    for (int i = 0; i < n - 1; i++)
	    {
	        // If current character matches with next
	        if (str.charAt(i) == str.charAt(i+1))
	            cur_count++;
	 
	        // If doesn't match, update result
	        // (if required) and reset count
	        else
	        {
	            if (cur_count > count)
	            {
	                count = cur_count;
	                res = str.charAt(i);
	            }
	            cur_count = 1;
	        }
	    }
	 
	    return res;
	}
}
