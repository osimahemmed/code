package com.test.java.program;

import java.util.HashMap;
import java.util.Map;

public class _30_MostRepeatedIP {

	public static void main(String[] args) {
		doTestPass();
	}

	static boolean doTestPass() {
		String str1 = "10.0.0.2 - frank [10/Oct/2000:13:55:36" + " -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 "
				+ "\"http://www.example.com/start.html\" \"Mozilla/4.08 " + "[en] (Win98; I ;Nav)\"";

		String str2 = "10.0.0.2- frank [10/Oct/2000:13:55" + ":36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 "
				+ "\"http://www.example.com/start.html\" \"Mozilla/4.08 " + "[en] (Win98; I ;Nav)\"";

		String str3 = "10.0.2.1 - frank [10/Oct/2000:13:55" + ":36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 "
				+ "\"http://www.example.com/start.html\" \"Mozilla/4.08 " + "[en] (Win98; I ;Nav)\"";
		
		String str4 = "10.0.2.1 - frank [10/Oct/2000:13:55" + ":36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 "
				+ "\"http://www.example.com/start.html\" \"Mozilla/4.08 " + "[en] (Win98; I ;Nav)\"";
		
		String str5 = "10.0.2.1 - frank [10/Oct/2000:13:55" + ":36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 "
				+ "\"http://www.example.com/start.html\" \"Mozilla/4.08 " + "[en] (Win98; I ;Nav)\"";
		
		String str6 = "10.0.2.1 - frank [10/Oct/2000:13:55" + ":36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 "
				+ "\"http://www.example.com/start.html\" \"Mozilla/4.08 " + "[en] (Win98; I ;Nav)\"";
		
		String str7 = "10.0.2.1 - frank [10/Oct/2000:13:55" + ":36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 "
				+ "\"http://www.example.com/start.html\" \"Mozilla/4.08 " + "[en] (Win98; I ;Nav)\"";

		String[] lines = { str1, str2, str3, str4, str5, str6, str7 };
		String result = getMostRepeatedIp(lines);

		if (result != null && result.equals("10.0.2.1")) {
			System.out.println("Test Passed");
			return true;
		} else {
			System.out.println("Test Failed");
			return false;
		}

	}

	private static String getMostRepeatedIp(String[] logs) {
		Map<String, Integer> map = new HashMap<>();
		for(String str : logs) {
			String ip = str.split("-")[0].trim();
			if (map.containsKey(ip)) {
				map.put(ip, map.get(ip)+1);
			} else {
				map.put(ip, 1);
			}
		}
	
		String mostRepeatedIp = "";
		int maxCount = Integer.MIN_VALUE;
		for(String curIp : map.keySet()) {
			int val = map.get(curIp);
			if(maxCount < val) {
				mostRepeatedIp = curIp;
				maxCount = val;
			}
		}
		/*String mostRepeatedIp = "";
		int maxCount = Integer.MIN_VALUE;
		for (String currentIp : map.keySet()) {
			int val = map.get(currentIp);
			if (maxCount < val ) {
				mostRepeatedIp = currentIp;
				maxCount = val;
			}
		}*/
		System.out.println("mostRepeatedIp = " + mostRepeatedIp + " Repeated " + maxCount + " times");
		return mostRepeatedIp;
	}
}