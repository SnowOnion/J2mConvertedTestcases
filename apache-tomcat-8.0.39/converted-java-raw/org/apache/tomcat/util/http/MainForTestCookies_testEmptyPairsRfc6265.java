package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_testEmptyPairsRfc6265 {
	public static void main(String[] args) {
		try {
			new TestCookies().testEmptyPairsRfc6265();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}