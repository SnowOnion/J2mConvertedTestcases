package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_testNameOnlyAreDroppedOld {
	public static void main(String[] args) {
		try {
			new TestCookies().testNameOnlyAreDroppedOld();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}