package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testSimpleWithQuotedString {
	public static void main(String[] args) {
		try {
			new TestMediaType().testSimpleWithQuotedString();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}