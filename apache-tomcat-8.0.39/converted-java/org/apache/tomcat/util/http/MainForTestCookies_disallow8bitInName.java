package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_disallow8bitInName {
	public static void main(String[] args) {
		try {
			new TestCookies().disallow8bitInName();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}