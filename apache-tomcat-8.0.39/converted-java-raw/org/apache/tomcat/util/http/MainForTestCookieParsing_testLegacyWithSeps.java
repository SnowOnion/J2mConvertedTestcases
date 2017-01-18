package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieParsing;

public class MainForTestCookieParsing_testLegacyWithSeps {
	public static void main(String[] args) {
		try {
			new TestCookieParsing().testLegacyWithSeps();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}