package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieParsing;

public class MainForTestCookieParsing_testLegacyWithoutFwdSlash {
	public static void main(String[] args) {
		try {
			new TestCookieParsing().testLegacyWithoutFwdSlash();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}