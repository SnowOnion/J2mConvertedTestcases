package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_v1MismatchedQuotesOld {
	public static void main(String[] args) {
		try {
			new TestCookies().v1MismatchedQuotesOld();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}