package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieParsing;

public class MainForTestCookieParsing_testLegacyPreserveHeader {
	public static void main(String[] args) {
		try {
			new TestCookieParsing().testLegacyPreserveHeader();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}