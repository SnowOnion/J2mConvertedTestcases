package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieParsing;

public class MainForTestCookieParsing_testLegacyWithoutSeps {
	public static void main(String[] args) {
		try {
			new TestCookieParsing().testLegacyWithoutSeps();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}