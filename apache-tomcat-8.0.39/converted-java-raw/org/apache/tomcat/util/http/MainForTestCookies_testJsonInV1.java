package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_testJsonInV1 {
	public static void main(String[] args) {
		try {
			new TestCookies().testJsonInV1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}