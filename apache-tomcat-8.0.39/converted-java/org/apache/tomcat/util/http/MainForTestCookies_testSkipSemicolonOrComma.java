package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_testSkipSemicolonOrComma {
	public static void main(String[] args) {
		try {
			new TestCookies().testSkipSemicolonOrComma();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}