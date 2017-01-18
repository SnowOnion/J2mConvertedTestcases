package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testCase {
	public static void main(String[] args) {
		try {
			new TestMediaType().testCase();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}