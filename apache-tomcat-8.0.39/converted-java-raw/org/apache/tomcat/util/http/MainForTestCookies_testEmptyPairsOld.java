package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_testEmptyPairsOld {
	public static void main(String[] args) {
		try {
			new TestCookies().testEmptyPairsOld();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}