package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieParsing;

public class MainForTestCookieParsing_testRfc6265V1 {
	public static void main(String[] args) {
		try {
			new TestCookieParsing().testRfc6265V1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}