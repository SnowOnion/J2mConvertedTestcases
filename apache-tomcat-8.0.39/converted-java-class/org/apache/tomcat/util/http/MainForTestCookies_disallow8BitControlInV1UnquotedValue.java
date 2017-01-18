package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_disallow8BitControlInV1UnquotedValue {
	public static void main(String[] args) {
		try {
			new TestCookies().disallow8BitControlInV1UnquotedValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}