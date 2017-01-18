package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookieProcessorGeneration;

public class MainForTestCookieProcessorGeneration_v1simpleCookie {
	public static void main(String[] args) {
		try {
			new TestCookieProcessorGeneration().v1simpleCookie();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}