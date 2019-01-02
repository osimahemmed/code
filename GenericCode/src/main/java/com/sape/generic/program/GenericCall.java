package com.sape.generic.program;

public class GenericCall {

	public static void main(String[] args) {
		
		String user = "osimah";
		String url = String.format("https://api.github.com/users/%s", user);
		System.out.println(url);

		Integer[] arr =  {1, 2, 3, 5, 6};
		GenericMethodTest.<Integer>printMiddleArr(arr);
		
		System.out.println(String.format("id=%08.2f", 423.147));
		int j = 0;
		
		outer:for(int i  =0; i < 10; i++) {
			while(j < 100) {
				if(j==3)
				break outer;
				j++;
			}
			System.out.println("osim" + j);
		}
		System.out.println("osim" + j);

	}

}
