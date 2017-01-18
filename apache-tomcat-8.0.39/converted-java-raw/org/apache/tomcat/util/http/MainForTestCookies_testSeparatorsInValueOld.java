package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_testSeparatorsInValueOld {
	public static void main(String[] args) {
		try {
			new TestCookies().testSeparatorsInValueOld();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}