package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_allow8BitInV0Value {
	public static void main(String[] args) {
		try {
			new TestCookies().allow8BitInV0Value();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}