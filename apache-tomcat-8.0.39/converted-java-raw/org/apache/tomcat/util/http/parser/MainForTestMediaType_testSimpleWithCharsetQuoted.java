package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testSimpleWithCharsetQuoted {
	public static void main(String[] args) {
		try {
			new TestMediaType().testSimpleWithCharsetQuoted();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}