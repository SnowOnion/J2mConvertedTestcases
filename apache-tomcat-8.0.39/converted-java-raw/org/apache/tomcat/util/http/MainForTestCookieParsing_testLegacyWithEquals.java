package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieParsing;

public class MainForTestCookieParsing_testLegacyWithEquals {
	public static void main(String[] args) {
		try {
			new TestCookieParsing().testLegacyWithEquals();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}