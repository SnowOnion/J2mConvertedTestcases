package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestCookies;

public class MainForTestCookies_v1PortIsIgnoredOld {
	public static void main(String[] args) {
		try {
			new TestCookies().v1PortIsIgnoredOld();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}