package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testSimpleWithEmptyQuotedString {
	public static void main(String[] args) {
		try {
			new TestMediaType().testSimpleWithEmptyQuotedString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}