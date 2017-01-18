package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieParsing;

public class MainForTestCookieParsing_testLegacyWithoutNameOnly {
	public static void main(String[] args) {
		try {
			new TestCookieParsing().testLegacyWithoutNameOnly();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}