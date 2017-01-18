package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieParsing;

public class MainForTestCookieParsing_testLegacyWithFwdSlash {
	public static void main(String[] args) {
		try {
			new TestCookieParsing().testLegacyWithFwdSlash();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}