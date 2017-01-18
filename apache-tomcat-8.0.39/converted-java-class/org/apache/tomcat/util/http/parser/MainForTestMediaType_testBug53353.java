package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testBug53353 {
	public static void main(String[] args) {
		try {
			new TestMediaType().testBug53353();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}