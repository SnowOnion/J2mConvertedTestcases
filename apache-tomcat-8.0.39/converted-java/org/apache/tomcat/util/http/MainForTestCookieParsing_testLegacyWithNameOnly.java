package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieParsing;

public class MainForTestCookieParsing_testLegacyWithNameOnly {
	public static void main(String[] args) {
		try {
			new TestCookieParsing().testLegacyWithNameOnly();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}