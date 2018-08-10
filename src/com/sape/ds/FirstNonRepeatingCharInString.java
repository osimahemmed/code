package com.sape.ds;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharInString {
	
	static final int NO_OF_CHARS = 256;
	static Map<Character, CountIndex> hm = new HashMap<Character, CountIndex>(NO_OF_CHARS);
	
	static void getCharCountArray(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(hm.containsKey(str.charAt(i))) {
				hm.get(str.charAt(i)).incrementCount();
			} else {
				hm.put(str.charAt(i), new CountIndex(i));
			}
		}
	}
	
	/* The method returns index of first non-repeating
    character in a string. If all characters are repeating 
    then returns -1 */
	static int firstNonRepeating(String str) {
		getCharCountArray(str);
		int result = Integer.MAX_VALUE, i;
		
		for(i = 0; i < str.length(); i++) {
			// If this character occurs only once and appears
            // before the current result, then update the result
			
			if (hm.get(str.charAt(i)).count == 1 && result > hm.get(str.charAt(i)).index){
                result = hm.get(str.charAt(i)).index;
           }
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		String str = "geeksforgeeks";
        int index =  firstNonRepeating(str);
         
        System.out.println(index == Integer.MAX_VALUE ? "Either all characters are repeating " +
              " or string is empty" : "First non-repeating character is " +  str.charAt(index));
    }
}
