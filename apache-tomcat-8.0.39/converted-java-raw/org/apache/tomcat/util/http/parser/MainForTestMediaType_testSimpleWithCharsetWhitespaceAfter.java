package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testSimpleWithCharsetWhitespaceAfter {
	public static void main(String[] args) {
		try {
			new TestMediaType().testSimpleWithCharsetWhitespaceAfter();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}