package com.oracle.xml;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareDates {

	public static void main(String[] args) throws ParseException {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date d1 = df.parse(args[0]);
		Date d2 = df.parse(args[1]);
		//String str1 = d2.getMonth();
		String relation;
		if(d1.equals(d2)){
			relation = "the same date as";
		}else if(d1.before(d2)){
			relation = "before";
		}else{
			relation = "after";
		}
		System.out.println(d1 + " is " + relation + ' ' +d2);

	}

}
