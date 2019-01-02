/*package com.test.program;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadCsvTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		String str1 = "osim";
		String str2 = "osim";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2);
		
		File file = new File("D:\\Osim\\test.txt");
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		 
		  String st;
		  try {
			while ((st = br.readLine()) != null) {
			    System.out.println(" Osim "+ st);
			  }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        Scanner scanner = new Scanner(new File("D:\\Osim\\test.txt"));
        //scanner.useDelimiter(",");
        while(scanner.hasNext()){
        	String line = scanner.nextLine();
        	System.out.println(line);
            //System.out.print(scanner.next()+"|");
        }
        scanner.close();
    }

}
*/