package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testSimpleWithToken {
	public static void main(String[] args) {
		try {
			new TestMediaType().testSimpleWithToken();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}