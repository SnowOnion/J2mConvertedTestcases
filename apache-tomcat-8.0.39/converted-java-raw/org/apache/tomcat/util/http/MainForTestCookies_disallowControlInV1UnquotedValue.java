package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_disallowControlInV1UnquotedValue {
	public static void main(String[] args) {
		try {
			new TestCookies().disallowControlInV1UnquotedValue();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}