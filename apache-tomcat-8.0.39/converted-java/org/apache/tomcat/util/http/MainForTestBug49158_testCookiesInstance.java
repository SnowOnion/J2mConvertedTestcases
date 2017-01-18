package org.apache.tomcat.util.http;

import org.apache.tomcat.util.http.TestBug49158;

public class MainForTestBug49158_testCookiesInstance {
	public static void main(String[] args) {
		try {
			new TestBug49158().testCookiesInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}