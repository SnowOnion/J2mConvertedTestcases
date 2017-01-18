package org.apache.tomcat.util.http.parser;

import org.apache.tomcat.util.http.parser.TestMediaType;

public class MainForTestMediaType_testBug52811 {
	public static void main(String[] args) {
		try {
			new TestMediaType().testBug52811();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}