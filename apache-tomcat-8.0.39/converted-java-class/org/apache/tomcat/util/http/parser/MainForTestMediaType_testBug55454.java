package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testBug55454 {
	public static void main(String[] args) {
		try {
			new TestMediaType().testBug55454();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}