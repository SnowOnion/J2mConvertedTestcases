package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_testQuotedValueOld {
	public static void main(String[] args) {
		try {
			new TestCookies().testQuotedValueOld();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}