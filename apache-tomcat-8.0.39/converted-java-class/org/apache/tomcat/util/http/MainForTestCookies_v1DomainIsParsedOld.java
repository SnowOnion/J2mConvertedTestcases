package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_v1DomainIsParsedOld {
	public static void main(String[] args) {
		try {
			new TestCookies().v1DomainIsParsedOld();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}