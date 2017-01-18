package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testCharset {
	public static void main(String[] args) {
		try {
			new TestMediaType().testCharset();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}