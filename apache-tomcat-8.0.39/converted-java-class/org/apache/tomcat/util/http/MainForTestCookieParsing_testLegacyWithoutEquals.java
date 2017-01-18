package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieParsing;

public class MainForTestCookieParsing_testLegacyWithoutEquals {
	public static void main(String[] args) {
		try {
			new TestCookieParsing().testLegacyWithoutEquals();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}