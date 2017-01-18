package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testSimple {
	public static void main(String[] args) {
		try {
			new TestMediaType().testSimple();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}