package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testSimpleWithAll {
	public static void main(String[] args) {
		try {
			new TestMediaType().testSimpleWithAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}