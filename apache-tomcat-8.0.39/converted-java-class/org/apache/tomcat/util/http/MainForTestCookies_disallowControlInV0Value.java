package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_disallowControlInV0Value {
	public static void main(String[] args) {
		try {
			new TestCookies().disallowControlInV0Value();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}