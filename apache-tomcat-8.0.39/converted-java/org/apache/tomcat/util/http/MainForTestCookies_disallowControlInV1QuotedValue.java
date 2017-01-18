package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_disallowControlInV1QuotedValue {
	public static void main(String[] args) {
		try {
			new TestCookies().disallowControlInV1QuotedValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}